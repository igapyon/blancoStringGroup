/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.sample.stringgroup;

/**
 * ������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 */
public class SampleStringGroup {
    /**
     * No.1 ����:�A���t�@�x�b�g�̕������`�B
     */
    public static final int ABCDEFG = 1;

    /**
     * No.2 ����:�S�p�̕������`�B
     */
    public static final int AIUEO = 2;

    /**
     * No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
     */
    public static final int QUOTE = 3;

    /**
     * No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
     */
    public static final int DOUBLE_QUOTE = 4;

    /**
     * No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
     */
    public static final int BACK_SLASH = 5;

    /**
     * No.7
     */
    public static final int WITHOUT_DESC = 7;

    /**
     * No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
     */
    public static final int TEST_SPACE = 8;

    /**
     * No.9 ����:�~�}�[�N�B
     */
    public static final int BATU = 9;

    /**
     * ����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B
     */
    public static final int NOT_DEFINED = -1;

    /**
     * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B
     *
     * @param argCheck �`�F�b�N���s������������B
     * @return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
     */
    public boolean match(final String argCheck) {
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if ("ABCDEFG".equals(argCheck)) {
            return true;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if ("����������".equals(argCheck)) {
            return true;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("'".equals(argCheck)) {
            return true;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("\"".equals(argCheck)) {
            return true;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if ("\\".equals(argCheck)) {
            return true;
        }
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if ("STRING ONLY".equals(argCheck)) {
            return true;
        }
        // No.7
        if ("�������ȗ�".equals(argCheck)) {
            return true;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if ("ABC DEF".equals(argCheck)) {
            return true;
        }
        // No.9
        // ����:�~�}�[�N�B
        if ("�~".equals(argCheck)) {
            return true;
        }
        return false;
    }

    /**
     * ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B
     *
     * @param argCheck �`�F�b�N���s������������B
     * @return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
     */
    public boolean matchIgnoreCase(final String argCheck) {
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if ("ABCDEFG".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if ("����������".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("'".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("\"".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if ("\\".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if ("STRING ONLY".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.7
        if ("�������ȗ�".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if ("ABC DEF".equalsIgnoreCase(argCheck)) {
            return true;
        }
        // No.9
        // ����:�~�}�[�N�B
        if ("�~".equalsIgnoreCase(argCheck)) {
            return true;
        }
        return false;
    }

    /**
     * �����񂩂�萔�ɕϊ����܂��B
     *
     * �萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B
     *
     * @param argCheck �ϊ����s������������B
     * @return �萔�ɕϊ���̒l�B
     */
    public int convertToInt(final String argCheck) {
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if ("ABCDEFG".equals(argCheck)) {
            return ABCDEFG;
        }
        // No.2
        // ����:�S�p�̕������`�B
        if ("����������".equals(argCheck)) {
            return AIUEO;
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("'".equals(argCheck)) {
            return QUOTE;
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if ("\"".equals(argCheck)) {
            return DOUBLE_QUOTE;
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if ("\\".equals(argCheck)) {
            return BACK_SLASH;
        }
        // No.7
        if ("�������ȗ�".equals(argCheck)) {
            return WITHOUT_DESC;
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if ("ABC DEF".equals(argCheck)) {
            return TEST_SPACE;
        }
        // No.9
        // ����:�~�}�[�N�B
        if ("�~".equals(argCheck)) {
            return BATU;
        }

        // �Y������萔��������܂���ł����B
        return NOT_DEFINED;
    }

    /**
     * �萔���當����ɕϊ����܂��B
     *
     * �萔�ƑΉ��Â�������ɕϊ����܂��B
     *
     * @param argCheck �ϊ����s�����������萔�B
     * @return ������ɕϊ���̒l�BNOT_DEFINED�̏ꍇ�ɂ͒���0�̕�����B
     */
    public String convertToString(final int argCheck) {
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if (argCheck == ABCDEFG) {
            return "ABCDEFG";
        }
        // No.2
        // ����:�S�p�̕������`�B
        if (argCheck == AIUEO) {
            return "����������";
        }
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if (argCheck == QUOTE) {
            return "'";
        }
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if (argCheck == DOUBLE_QUOTE) {
            return "\"";
        }
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if (argCheck == BACK_SLASH) {
            return "\\";
        }
        // No.7
        if (argCheck == WITHOUT_DESC) {
            return "�������ȗ�";
        }
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if (argCheck == TEST_SPACE) {
            return "ABC DEF";
        }
        // No.9
        // ����:�~�}�[�N�B
        if (argCheck == BATU) {
            return "�~";
        }
        // ����`�B
        if (argCheck == NOT_DEFINED) {
            return "";
        }

        // ������ɂ��Y�����܂���ł����B
        throw new IllegalArgumentException("�^����ꂽ�l(" + argCheck + ")�͕�����O���[�v[Sample]�ł͒�`����Ȃ��l�ł��B");
    }
}
