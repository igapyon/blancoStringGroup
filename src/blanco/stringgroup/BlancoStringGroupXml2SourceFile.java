/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.stringgroup;

import java.io.File;
import java.io.IOException;
import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.BlancoCgSupportedLang;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.util.BlancoCgLineUtil;
import blanco.cg.util.BlancoCgSourceUtil;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.stringgroup.message.BlancoStringGroupMessage;
import blanco.stringgroup.resourcebundle.BlancoStringGroupResourceBundle;
import blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure;
import blanco.stringgroup.valueobject.BlancoStringGroupStructure;

/**
 * �u������O���[�v��`���vExcel�l�����當����O���[�v����������N���X�E�\�[�X�R�[�h�𐶐��B
 * 
 * ���̃N���X�́A����XML�t�@�C������\�[�X�R�[�h��������������@�\��S���܂��B
 * 
 * @author IGA Tosiki
 */
public class BlancoStringGroupXml2SourceFile {
    /**
     * ���b�Z�[�W��`�B
     */
    private final BlancoStringGroupMessage fMsg = new BlancoStringGroupMessage();

    /**
     * ���̃v���_�N�g�̃��\�[�X�o���h���ւ̃A�N�Z�X�I�u�W�F�N�g�B
     */
    private final BlancoStringGroupResourceBundle fBundle = new BlancoStringGroupResourceBundle();

    /**
     * �o�͑ΏۂƂȂ�v���O���~���O����B
     */
    private int fTargetLang = BlancoCgSupportedLang.NOT_DEFINED;

    /**
     * �����I�ɗ��p����blancoCg�p�t�@�N�g���B
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * �����I�ɗ��p����blancoCg�p�\�[�X�t�@�C�����B
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * �����I�ɗ��p����blancoCg�p�N���X���B
     */
    private BlancoCgClass fCgClass = null;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * ����XML�t�@�C������\�[�X�R�[�h�������������܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ���^��񂪊܂܂�Ă���XML�t�@�C���B
     * @param argTargetLang
     *            �o�͑ΏۂƂȂ�v���O���~���O����B
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h������f�B���N�g�� (/main�������������w�肵�܂�)�B
     * @throws IOException
     *             ���o�͗�O�����������ꍇ�B
     */
    public void process(final File argMetaXmlSourceFile,
            final String argTargetLang, final File argDirectoryTarget)
            throws IOException {

        fTargetLang = new BlancoCgSupportedLang().convertToInt(argTargetLang);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.JS:
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.PHP:
        case BlancoCgSupportedLang.RUBY:
        case BlancoCgSupportedLang.PYTHON:
        case BlancoCgSupportedLang.DELPHI:
            break;
        default:
            throw new IllegalArgumentException(fMsg.getMbsgi002(argTargetLang));
        }

        final BlancoStringGroupStructure[] structures = new BlancoStringGroupXmlParser()
                .parse(argMetaXmlSourceFile);

        for (int index = 0; index < structures.length; index++) {
            // ���^���̉�͌��ʂ����ƂɃ\�[�X�R�[�h�������������s���܂��B
            structure2Source(structures[index], argDirectoryTarget);
        }
    }

    /**
     * ���W���ꂽ�������ɁA�\�[�X�R�[�h�������������܂��B
     * 
     * @param argStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h�̏o�͐�t�H���_�B
     */
    public void structure2Source(final BlancoStringGroupStructure argStructure,
            final File argDirectoryTarget) {
        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(argDirectoryTarget
                .getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(argStructure.getPackage(),
                null);
        fCgSourceFile.setName(argStructure.getName()
                + BlancoStringUtil.null2Blank(argStructure.getSuffix()));
        fCgSourceFile.setEncoding(fEncoding);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.DELPHI:
            // Delphi����ł́AUnit���Ƃ̖��O�Փ˂�����邽�߁A����ɏ]���N���X���ɋ����I��T�����܂��B
            fCgClass = fCgFactory.createClass("T" + argStructure.getName()
                    + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        default:
            fCgClass = fCgFactory.createClass(argStructure.getName()
                    + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        }
        fCgSourceFile.getClassList().add(fCgClass);

        expandField(argStructure);
        expandMethodMatch(argStructure);
        expandMethodMatchIgnoreCase(argStructure);
        expandMethodConvertToInt(argStructure);

        // TODO ���� Java����ɂ����Ή����Ă��܂���B
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
            expandMethodConvertToString(argStructure);
            break;
        }

        BlancoCgTransformerFactory.getSourceTransformer(fTargetLang).transform(
                fCgSourceFile, fileBlancoMain);
    }

    /**
     * �萔�t�B�[���h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    private void expandField(
            final BlancoStringGroupStructure argProcessStructure) {

        boolean isProcessed = false;
        for (int indexField = 0; indexField < argProcessStructure
                .getFieldList().size(); indexField++) {
            final BlancoStringGroupFieldStructure fieldLook = (BlancoStringGroupFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);
            if (BlancoStringUtil.null2Blank(fieldLook.getConstant()).length() == 0) {
                continue;
            }

            String description = "";
            // ��������ʂ̕����ɑ΂��鏈�����L�q���܂��B
            if (fieldLook.getNo() != null) {
                description += fBundle.getXml2sourceFileFieldNo(fieldLook
                        .getNo()
                        + " ");
            }
            if (fieldLook.getDescription() != null) {
                description += fBundle.getXml2sourceFileDescription(fieldLook
                        .getDescription());
            }

            final BlancoCgField cgField = fCgFactory.createField(fieldLook
                    .getConstant().toUpperCase(), getTypeInt(), description);
            fCgClass.getFieldList().add(cgField);

            cgField.setAccess("public");
            cgField.setStatic(true);
            cgField.setFinal(true);
            cgField.setDefault(Integer.toString(indexField + 1));
            isProcessed = true;
        }

        if (isProcessed) {
            final BlancoCgField cgField = fCgFactory.createField("NOT_DEFINED",
                    getTypeInt(), "����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B");
            fCgClass.getFieldList().add(cgField);

            cgField.setAccess("public");
            cgField.setStatic(true);
            cgField.setFinal(true);
            cgField.setDefault("-1");
        }
    }

    /**
     * match���\�b�h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    private void expandMethodMatch(
            final BlancoStringGroupStructure argProcessStructure) {

        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                getMethodName("match"), "������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B");
        fCgClass.getMethodList().add(cgMethod);
        cgMethod.getParameterList().add(
                fCgFactory.createParameter("argCheck", getTypeString(),
                        "�`�F�b�N���s������������B"));
        cgMethod.setReturn(fCgFactory.createReturn(getTypeBoolean(),
                "������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B"));

        final List<java.lang.String> lineList = cgMethod.getLineList();

        for (int indexField = 0; indexField < argProcessStructure
                .getFieldList().size(); indexField++) {
            final BlancoStringGroupFieldStructure fieldLook = (BlancoStringGroupFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            // ��������ʂ̕����ɑ΂��鏈�����L�q���܂��B
            if (fieldLook.getNo() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileDescription(fieldLook
                                .getDescription()));
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.JAVA:
            case BlancoCgSupportedLang.CS:
                lineList
                        .add(BlancoCgLineUtil
                                .getIfBegin(
                                        fTargetLang,
                                        BlancoCgLineUtil
                                                .getStringLiteralEnclosure(fTargetLang)
                                                + BlancoCgSourceUtil
                                                        .escapeStringAsSource(
                                                                fTargetLang,
                                                                fieldLook
                                                                        .getValue())
                                                + BlancoCgLineUtil
                                                        .getStringLiteralEnclosure(fTargetLang)
                                                + "."
                                                + getMethodName("equals")
                                                + "(argCheck)"));
                break;
            case BlancoCgSupportedLang.JS:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                break;
            case BlancoCgSupportedLang.VB:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " = argCheck"));
                break;
            case BlancoCgSupportedLang.PHP:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " === $argCheck"));
                break;
            case BlancoCgSupportedLang.RUBY:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                break;
            case BlancoCgSupportedLang.PYTHON:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                break;
            case BlancoCgSupportedLang.DELPHI:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " = argCheck"));
                break;
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.PYTHON:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "True")
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.DELPHI:
                lineList.add("result := True"
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                lineList.add("exit"
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            default:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "true")
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            }
            lineList.add(BlancoCgLineUtil.getIfEnd(fTargetLang));
        }
        switch (fTargetLang) {
        case BlancoCgSupportedLang.PYTHON:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "False")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.DELPHI:
            lineList.add("result := False"
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            lineList.add("exit" + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        default:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "false")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        }
    }

    /**
     * matchIgnoreCase���\�b�h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    private void expandMethodMatchIgnoreCase(
            final BlancoStringGroupStructure argProcessStructure) {

        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                getMethodName("matchIgnoreCase"),
                "������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B");
        fCgClass.getMethodList().add(cgMethod);
        cgMethod.getParameterList().add(
                fCgFactory.createParameter("argCheck", getTypeString(),
                        "�`�F�b�N���s������������B"));
        cgMethod.setReturn(fCgFactory.createReturn(getTypeBoolean(),
                "������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B"));

        final List<java.lang.String> lineList = cgMethod.getLineList();

        for (int indexField = 0; indexField < argProcessStructure
                .getFieldList().size(); indexField++) {
            final BlancoStringGroupFieldStructure fieldLook = (BlancoStringGroupFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            // ��������ʂ̕����ɑ΂��鏈�����L�q���܂��B
            if (fieldLook.getNo() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileDescription(fieldLook
                                .getDescription()));
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.JAVA:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + "." + getMethodName("equalsIgnoreCase")
                                + "(argCheck)"));
                break;
            case BlancoCgSupportedLang.CS:
                lineList
                        .add(BlancoCgLineUtil
                                .getIfBegin(
                                        fTargetLang,
                                        BlancoCgLineUtil
                                                .getStringLiteralEnclosure(fTargetLang)
                                                + BlancoCgSourceUtil
                                                        .escapeStringAsSource(
                                                                fTargetLang,
                                                                fieldLook
                                                                        .getValue())
                                                + BlancoCgLineUtil
                                                        .getStringLiteralEnclosure(fTargetLang)
                                                + "."
                                                + getMethodName("equals")
                                                + "(argCheck, StringComparison.CurrentCultureIgnoreCase)"));
                fCgSourceFile.getImportList().add("System.StringComparison");
                break;
            case BlancoCgSupportedLang.JS:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ".toUpperCase() == argCheck.toUpperCase()"));
                break;
            case BlancoCgSupportedLang.VB:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ".ToUpper() = argCheck.ToUpper()"));
                break;
            case BlancoCgSupportedLang.PHP:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        "strtoupper("
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ") === strtoupper($argCheck)"));
                break;
            case BlancoCgSupportedLang.RUBY:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ".upcase() == argCheck.upcase()"));
                break;
            case BlancoCgSupportedLang.PYTHON:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ".upper() == argCheck.upper()"));
                break;
            case BlancoCgSupportedLang.DELPHI:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        "UpperCase("
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + ") = UpperCase(argCheck)"));
                fCgSourceFile.getImportList().add("SysUtils");
                break;
            }
            switch (fTargetLang) {
            case BlancoCgSupportedLang.PYTHON:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "True")
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.DELPHI:
                lineList.add("result := True"
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                lineList.add("exit"
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            default:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "true")
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            }
            lineList.add(BlancoCgLineUtil.getIfEnd(fTargetLang));
        }
        switch (fTargetLang) {
        case BlancoCgSupportedLang.PYTHON:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "False")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.DELPHI:
            lineList.add("result := False"
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            lineList.add("exit" + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        default:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "false")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        }
    }

    /**
     * convertToInt���\�b�h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    private void expandMethodConvertToInt(
            final BlancoStringGroupStructure argProcessStructure) {

        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                getMethodName("convertToInt"), "�����񂩂�萔�ɕϊ����܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getLangDoc().getDescriptionList().add(
                "�萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B");
        cgMethod.getParameterList().add(
                fCgFactory.createParameter("argCheck", getTypeString(),
                        "�ϊ����s������������B"));
        cgMethod.setReturn(fCgFactory.createReturn(getTypeInt(), "�萔�ɕϊ���̒l�B"));

        final List<java.lang.String> lineList = cgMethod.getLineList();

        for (int indexField = 0; indexField < argProcessStructure
                .getFieldList().size(); indexField++) {
            final BlancoStringGroupFieldStructure fieldLook = (BlancoStringGroupFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (BlancoStringUtil.null2Blank(fieldLook.getConstant()).length() == 0) {
                // �萔������`�̂��̂̓X�L�b�v���܂��B
                continue;
            }

            // ��������ʂ̕����ɑ΂��鏈�����L�q���܂��B
            if (fieldLook.getNo() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileDescription(fieldLook
                                .getDescription()));
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.JAVA:
            case BlancoCgSupportedLang.CS:
                lineList
                        .add(BlancoCgLineUtil
                                .getIfBegin(
                                        fTargetLang,
                                        BlancoCgLineUtil
                                                .getStringLiteralEnclosure(fTargetLang)
                                                + BlancoCgSourceUtil
                                                        .escapeStringAsSource(
                                                                fTargetLang,
                                                                fieldLook
                                                                        .getValue())
                                                + BlancoCgLineUtil
                                                        .getStringLiteralEnclosure(fTargetLang)
                                                + "."
                                                + getMethodName("equals")
                                                + "(argCheck)"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, fieldLook
                        .getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.JS:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, fCgClass
                        .getName()
                        + "." + fieldLook.getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.VB:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " = argCheck"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, fieldLook
                        .getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.PHP:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " === $argCheck"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "self::"
                        + fieldLook.getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.RUBY:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, fieldLook
                        .getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.PYTHON:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " == argCheck"));
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "self."
                        + fieldLook.getConstant().toUpperCase())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            case BlancoCgSupportedLang.DELPHI:
                lineList.add(BlancoCgLineUtil.getIfBegin(fTargetLang,
                        BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                                + BlancoCgSourceUtil.escapeStringAsSource(
                                        fTargetLang, fieldLook.getValue())
                                + BlancoCgLineUtil
                                        .getStringLiteralEnclosure(fTargetLang)
                                + " = argCheck"));
                lineList.add("result := "
                        + fieldLook.getConstant().toUpperCase()
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                lineList.add("exit"
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            }
            lineList.add(BlancoCgLineUtil.getIfEnd(fTargetLang));
        }

        lineList.add("");
        lineList.add(BlancoCgLineUtil.getSingleLineCommentPrefix(fTargetLang)
                + "�Y������萔��������܂���ł����B");

        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.RUBY:
        default:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, "NOT_DEFINED")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.JS:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, fCgClass
                    .getName()
                    + ".NOT_DEFINED")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.PHP:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang,
                    "self::NOT_DEFINED")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.PYTHON:
            lineList.add(BlancoCgLineUtil.getReturn(fTargetLang,
                    "self.NOT_DEFINED")
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        case BlancoCgSupportedLang.DELPHI:
            lineList.add("result := NOT_DEFINED"
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            lineList.add("exit" + BlancoCgLineUtil.getTerminator(fTargetLang));
            break;
        }
    }

    /**
     * convertToString���\�b�h��W�J���܂��B
     * 
     * TODO Java����ɂ̂ݑΉ����Ă��܂��B���̌���ɂ͑Ή����Ă��܂���B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    private void expandMethodConvertToString(
            final BlancoStringGroupStructure argProcessStructure) {

        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                getMethodName("convertToString"), "�萔���當����ɕϊ����܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getLangDoc().getDescriptionList().add("�萔�ƑΉ��Â�������ɕϊ����܂��B");
        cgMethod.getParameterList().add(
                fCgFactory.createParameter("argCheck", getTypeInt(),
                        "�ϊ����s�����������萔�B"));
        cgMethod.setReturn(fCgFactory.createReturn(getTypeString(),
                "������ɕϊ���̒l�BNOT_DEFINED�̏ꍇ�ɂ͒���0�̕�����B"));

        final List<java.lang.String> lineList = cgMethod.getLineList();

        for (int indexField = 0; indexField < argProcessStructure
                .getFieldList().size(); indexField++) {
            final BlancoStringGroupFieldStructure fieldLook = (BlancoStringGroupFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (BlancoStringUtil.null2Blank(fieldLook.getConstant()).length() == 0) {
                continue;
            }

            if (fieldLook.getNo() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                lineList.add(BlancoCgLineUtil
                        .getSingleLineCommentPrefix(fTargetLang)
                        + fBundle.getXml2sourceFileDescription(fieldLook
                                .getDescription()));
            }

            lineList.add("if (argCheck == "
                    + fieldLook.getConstant().toUpperCase() + ") {");
            lineList.add("return "
                    + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                    + BlancoCgSourceUtil.escapeStringAsSource(fTargetLang,
                            fieldLook.getValue())
                    + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                    + BlancoCgLineUtil.getTerminator(fTargetLang));
            lineList.add("}");
        }

        lineList.add(BlancoCgLineUtil.getSingleLineCommentPrefix(fTargetLang)
                + "����`�B");
        lineList.add("if (argCheck == NOT_DEFINED) {");
        lineList.add("return "
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                + BlancoCgLineUtil.getTerminator(fTargetLang));
        lineList.add("}");

        lineList.add("");
        lineList.add(BlancoCgLineUtil.getSingleLineCommentPrefix(fTargetLang)
                + "������ɂ��Y�����܂���ł����B");
        lineList.add("throw new IllegalArgumentException("
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                + "�^����ꂽ�l("
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                + " + argCheck + "
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                + ")�͕�����O���[�v[" + argProcessStructure.getName()
                + "]�ł͒�`����Ȃ��l�ł��B"
                + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang) + ")"
                + BlancoCgLineUtil.getTerminator(fTargetLang));
    }

    /**
     * �v���O���~���O���ꏈ���n�ɍ����� boolean �^�̖��̂��擾���܂��B
     * 
     * �^�̓ǂݑւ��B
     * 
     * @return
     */
    private final String getTypeBoolean() {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return "boolean";
        case BlancoCgSupportedLang.CS:
            return "bool";
        case BlancoCgSupportedLang.JS:
            return "boolean";
        case BlancoCgSupportedLang.VB:
            return "Boolean";
        }
    }

    /**
     * �v���O���~���O���ꏈ���n�ɍ����� String �^�̖��̂��擾���܂��B
     * 
     * �^�̓ǂݑւ��B
     * 
     * @return
     */
    private final String getTypeString() {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return "java.lang.String";
        case BlancoCgSupportedLang.CS:
            return "string";
        case BlancoCgSupportedLang.JS:
            return "string";
        case BlancoCgSupportedLang.VB:
            return "String";
        case BlancoCgSupportedLang.PHP:
            return "string";
        }
    }

    private final String getTypeInt() {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.JS:
        default:
            return "int";
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.DELPHI:
            return "Integer";
        case BlancoCgSupportedLang.PHP:
            return "integer";
        }
    }

    /**
     * �v���O���~���O���ꏈ���n�ɍ����� ���\�b�h�̖��O�ό`�������Ȃ��܂��B
     * 
     * ���\�b�h���̓ǂݑւ��B
     * 
     * @param argMethodName
     *            ���\�b�h���B
     * @return
     */
    private final String getMethodName(final String argMethodName) {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return argMethodName;
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.VB:
            return BlancoNameAdjuster.toUpperCaseTitle(argMethodName);
        case BlancoCgSupportedLang.JS:
            return argMethodName;
        }
    }
}
