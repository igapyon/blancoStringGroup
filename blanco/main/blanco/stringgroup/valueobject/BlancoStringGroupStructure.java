/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.stringgroup.valueobject;

import java.util.List;

/**
 * BlancoStringGroup�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoStringGroupStructure {
    /**
     * �t�B�[���h [name]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�vID���w�肵�܂��B�K�{���ڂł��B
     */
    private String fName;

    /**
     * �t�B�[���h [package]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     */
    private String fPackage;

    /**
     * �t�B�[���h [description]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�v�̐������L�ڂ��܂��B
     */
    private String fDescription;

    /**
     * �t�B�[���h [suffix]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̌���ɕt�^�����T�t�B�b�N�X�B
     */
    private String fSuffix;

    /**
     * �t�B�[���h [fieldList]
     *
     * ���ڂ̌^ [java.util.List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>]<br>
     * �K��l   [new java.util.ArrayList<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>()]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     */
    private List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure> fFieldList = new java.util.ArrayList<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>();

    /**
     * �t�B�[���h [name]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�vID���w�肵�܂��B�K�{���ڂł��B
     *
     * @param argName �t�B�[���h[name]�Ɋi�[�������l
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h[name]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�vID���w�肵�܂��B�K�{���ڂł��B
     *
     * @return �t�B�[���h[name]�Ɋi�[����Ă���l
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [package]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * @param argPackage �t�B�[���h[package]�Ɋi�[�������l
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h[package]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * @return �t�B�[���h[package]�Ɋi�[����Ă���l
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�v�̐������L�ڂ��܂��B
     *
     * @param argDescription �t�B�[���h[description]�Ɋi�[�������l
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h[description]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������O���[�v�̐������L�ڂ��܂��B
     *
     * @return �t�B�[���h[description]�Ɋi�[����Ă���l
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [suffix]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̌���ɕt�^�����T�t�B�b�N�X�B
     *
     * @param argSuffix �t�B�[���h[suffix]�Ɋi�[�������l
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * �t�B�[���h[suffix]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̌���ɕt�^�����T�t�B�b�N�X�B
     *
     * @return �t�B�[���h[suffix]�Ɋi�[����Ă���l
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * �t�B�[���h [fieldList]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.util.List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     *
     * @param argFieldList �t�B�[���h[fieldList]�Ɋi�[�������l
     */
    public void setFieldList(final List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * �t�B�[���h[fieldList]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.util.List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>]<br>
     * �K��l   [new java.util.ArrayList<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure>()]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     *
     * @return �t�B�[���h[fieldList]�Ɋi�[����Ă���l
     */
    public List<blanco.stringgroup.valueobject.BlancoStringGroupFieldStructure> getFieldList() {
        return fFieldList;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * �I�u�W�F�N�g�̃V�����[�͈͂ł���toString����Ȃ��_�ɒ��ӂ��ė��p���Ă��������B
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.stringgroup.valueobject.BlancoStringGroupStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
