/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */

/**
 * �f�t�H���g�R���X�g���N�^
 * @fileoverview ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 * @class ������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 * @constructor
 */
function SampleStringGroup() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleStringGroup.SampleStringGroup �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

}

/**
 * No.1 ����:�A���t�@�x�b�g�̕������`�B
 * @type int
 */
SampleStringGroup.ABCDEFG = 1;

/**
 * No.2 ����:�S�p�̕������`�B
 * @type int
 */
SampleStringGroup.AIUEO = 2;

/**
 * No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
 * @type int
 */
SampleStringGroup.QUOTE = 3;

/**
 * No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
 * @type int
 */
SampleStringGroup.DOUBLE_QUOTE = 4;

/**
 * No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
 * @type int
 */
SampleStringGroup.BACK_SLASH = 5;

/**
 * No.7
 * @type int
 */
SampleStringGroup.WITHOUT_DESC = 7;

/**
 * No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
 * @type int
 */
SampleStringGroup.TEST_SPACE = 8;

/**
 * No.9 ����:�~�}�[�N�B
 * @type int
 */
SampleStringGroup.BATU = 9;

/**
 * ����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B
 * @type int
 */
SampleStringGroup.NOT_DEFINED = -1;

/**
 * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B
 * @addon
 * @param {string} argCheck �`�F�b�N���s������������B
 * @return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
 * @type boolean
 */
SampleStringGroup.prototype.match = function(/* string */ argCheck) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleStringGroup.match �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(argCheck) != "string") {
        throw new Error("[ArgumentException]: SampleStringGroup.match ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(argCheck) + "]�^���^�����܂����B");
    }

    // No.1
    // ����:�A���t�@�x�b�g�̕������`�B
    if ("ABCDEFG" == argCheck) {
        return true;
    }
    // No.2
    // ����:�S�p�̕������`�B
    if ("����������" == argCheck) {
        return true;
    }
    // No.3
    // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("'" == argCheck) {
        return true;
    }
    // No.4
    // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("\"" == argCheck) {
        return true;
    }
    // No.5
    // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
    if ("\\" == argCheck) {
        return true;
    }
    // No.6
    // ����:�萔���ȗ����ꂽ��`�B
    if ("STRING ONLY" == argCheck) {
        return true;
    }
    // No.7
    if ("�������ȗ�" == argCheck) {
        return true;
    }
    // No.8
    // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
    if ("ABC DEF" == argCheck) {
        return true;
    }
    // No.9
    // ����:�~�}�[�N�B
    if ("�~" == argCheck) {
        return true;
    }
    return false;
};

/**
 * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B
 * @addon
 * @param {string} argCheck �`�F�b�N���s������������B
 * @return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
 * @type boolean
 */
SampleStringGroup.prototype.matchIgnoreCase = function(/* string */ argCheck) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleStringGroup.matchIgnoreCase �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(argCheck) != "string") {
        throw new Error("[ArgumentException]: SampleStringGroup.matchIgnoreCase ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(argCheck) + "]�^���^�����܂����B");
    }

    // No.1
    // ����:�A���t�@�x�b�g�̕������`�B
    if ("ABCDEFG".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.2
    // ����:�S�p�̕������`�B
    if ("����������".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.3
    // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("'".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.4
    // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("\"".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.5
    // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
    if ("\\".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.6
    // ����:�萔���ȗ����ꂽ��`�B
    if ("STRING ONLY".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.7
    if ("�������ȗ�".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.8
    // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
    if ("ABC DEF".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    // No.9
    // ����:�~�}�[�N�B
    if ("�~".toUpperCase() == argCheck.toUpperCase()) {
        return true;
    }
    return false;
};

/**
 * �����񂩂�萔�ɕϊ����܂��B
 * @addon
 * @param {string} argCheck �ϊ����s������������B
 * @return �萔�ɕϊ���̒l�B
 * @type int
 * �萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B
 */
SampleStringGroup.prototype.convertToInt = function(/* string */ argCheck) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleStringGroup.convertToInt �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(argCheck) != "string") {
        throw new Error("[ArgumentException]: SampleStringGroup.convertToInt ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(argCheck) + "]�^���^�����܂����B");
    }

    // No.1
    // ����:�A���t�@�x�b�g�̕������`�B
    if ("ABCDEFG" == argCheck) {
        return SampleStringGroup.ABCDEFG;
    }
    // No.2
    // ����:�S�p�̕������`�B
    if ("����������" == argCheck) {
        return SampleStringGroup.AIUEO;
    }
    // No.3
    // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("'" == argCheck) {
        return SampleStringGroup.QUOTE;
    }
    // No.4
    // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    if ("\"" == argCheck) {
        return SampleStringGroup.DOUBLE_QUOTE;
    }
    // No.5
    // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
    if ("\\" == argCheck) {
        return SampleStringGroup.BACK_SLASH;
    }
    // No.7
    if ("�������ȗ�" == argCheck) {
        return SampleStringGroup.WITHOUT_DESC;
    }
    // No.8
    // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
    if ("ABC DEF" == argCheck) {
        return SampleStringGroup.TEST_SPACE;
    }
    // No.9
    // ����:�~�}�[�N�B
    if ("�~" == argCheck) {
        return SampleStringGroup.BATU;
    }

    // �Y������萔��������܂���ł����B
    return SampleStringGroup.NOT_DEFINED;
};
/* �N���X[SampleStringGroup]�錾�̏I���B */
