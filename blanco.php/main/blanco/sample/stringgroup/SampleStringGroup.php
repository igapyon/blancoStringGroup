<?php
/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
/*. DOC <@package blanco.sample.stringgroup;>.*/

/*. require_module 'standard'; .*/;

/**
 * ������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 */
class SampleStringGroup {
    /**
     * No.1 ����:�A���t�@�x�b�g�̕������`�B
     */
    const ABCDEFG = 1;

    /**
     * No.2 ����:�S�p�̕������`�B
     */
    const AIUEO = 2;

    /**
     * No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
     */
    const QUOTE = 3;

    /**
     * No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
     */
    const DOUBLE_QUOTE = 4;

    /**
     * No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
     */
    const BACK_SLASH = 5;

    /**
     * No.7
     */
    const WITHOUT_DESC = 7;

    /**
     * No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
     */
    const TEST_SPACE = 8;

    /**
     * No.9 ����:�~�}�[�N�B
     */
    const BATU = 9;

    /**
     * ����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B
     */
    const NOT_DEFINED = -1;

    /**
     * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B
     *
     * @param string $argCheck �`�F�b�N���s������������B
     * @return boolean ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
     */
    public /*.boolean.*/ function match(/*.string.*/ $argCheck) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: SampleStringGroup.match �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($argCheck) !== 'string' && gettype($argCheck) !== 'NULL') {
            throw new Exception('[ArgumentException]: SampleStringGroup.match ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($argCheck) . ']�^���^�����܂����B');
        }

        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if ('ABCDEFG' === $argCheck) {
            return true;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if ('����������' === $argCheck) {
            return true;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ('\'' === $argCheck) {
            return true;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ('"' === $argCheck) {
            return true;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if ('\\' === $argCheck) {
            return true;
        }
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if ('STRING ONLY' === $argCheck) {
            return true;
        }
        // No.7
        if ('�������ȗ�' === $argCheck) {
            return true;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if ('ABC DEF' === $argCheck) {
            return true;
        }
        // No.9
        // ����:�~�}�[�N�B
        if ('�~' === $argCheck) {
            return true;
        }
        return false;
    }

    /**
     * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B
     *
     * @param string $argCheck �`�F�b�N���s������������B
     * @return boolean ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
     */
    public /*.boolean.*/ function matchIgnoreCase(/*.string.*/ $argCheck) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: SampleStringGroup.matchIgnoreCase �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($argCheck) !== 'string' && gettype($argCheck) !== 'NULL') {
            throw new Exception('[ArgumentException]: SampleStringGroup.matchIgnoreCase ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($argCheck) . ']�^���^�����܂����B');
        }

        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if (strtoupper('ABCDEFG') === strtoupper($argCheck)) {
            return true;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if (strtoupper('����������') === strtoupper($argCheck)) {
            return true;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if (strtoupper('\'') === strtoupper($argCheck)) {
            return true;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if (strtoupper('"') === strtoupper($argCheck)) {
            return true;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if (strtoupper('\\') === strtoupper($argCheck)) {
            return true;
        }
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if (strtoupper('STRING ONLY') === strtoupper($argCheck)) {
            return true;
        }
        // No.7
        if (strtoupper('�������ȗ�') === strtoupper($argCheck)) {
            return true;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if (strtoupper('ABC DEF') === strtoupper($argCheck)) {
            return true;
        }
        // No.9
        // ����:�~�}�[�N�B
        if (strtoupper('�~') === strtoupper($argCheck)) {
            return true;
        }
        return false;
    }

    /**
     * �����񂩂�萔�ɕϊ����܂��B
     *
     * �萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B
     *
     * @param string $argCheck �ϊ����s������������B
     * @return integer �萔�ɕϊ���̒l�B
     */
    public /*.int.*/ function convertToInt(/*.string.*/ $argCheck) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: SampleStringGroup.convertToInt �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($argCheck) !== 'string' && gettype($argCheck) !== 'NULL') {
            throw new Exception('[ArgumentException]: SampleStringGroup.convertToInt ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($argCheck) . ']�^���^�����܂����B');
        }

        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if ('ABCDEFG' === $argCheck) {
            return self::ABCDEFG;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if ('����������' === $argCheck) {
            return self::AIUEO;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ('\'' === $argCheck) {
            return self::QUOTE;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ('"' === $argCheck) {
            return self::DOUBLE_QUOTE;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if ('\\' === $argCheck) {
            return self::BACK_SLASH;
        }
        // No.7
        if ('�������ȗ�' === $argCheck) {
            return self::WITHOUT_DESC;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if ('ABC DEF' === $argCheck) {
            return self::TEST_SPACE;
        }
        // No.9
        // ����:�~�}�[�N�B
        if ('�~' === $argCheck) {
            return self::BATU;
        }

        // �Y������萔��������܂���ł����B
        return self::NOT_DEFINED;
    }
}
?>
