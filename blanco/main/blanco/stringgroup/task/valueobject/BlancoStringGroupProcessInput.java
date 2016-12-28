/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.stringgroup.task.valueobject;

/**
 * �����N���X [BlancoStringGroupProcess]�̓��̓o�����[�I�u�W�F�N�g�N���X�ł��B
 */
public class BlancoStringGroupProcessInput {
    /**
     * �t�B�[���h [verbose]
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [false]<br>
     * verbose���[�h�œ��삳���邩�ǂ����B
     */
    private boolean fVerbose = false;

    /**
     * �t�B�[���h [metadir]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B
     */
    private String fMetadir;

    /**
     * �t�B�[���h [targetdir]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [blanco]<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B
     */
    private String fTargetdir = "blanco";

    /**
     * �t�B�[���h [tmpdir]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [tmp]<br>
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B
     */
    private String fTmpdir = "tmp";

    /**
     * �t�B�[���h [encoding]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     */
    private String fEncoding;

    /**
     * �t�B�[���h [targetlang]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [java]<br>
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js,vb,php,ruby,python���I���\
     */
    private String fTargetlang = "java";

    /**
     * �t�B�[���h [verbose]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @param argVerbose �t�B�[���h[verbose]�Ɋi�[�������l
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * �t�B�[���h[verbose]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [false]<br>
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @return �t�B�[���h[verbose]�Ɋi�[����Ă���l
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * �t�B�[���h [metadir]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B
     *
     * @param argMetadir �t�B�[���h[metadir]�Ɋi�[�������l
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * �t�B�[���h[metadir]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B
     *
     * @return �t�B�[���h[metadir]�Ɋi�[����Ă���l
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * �t�B�[���h [targetdir]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B
     *
     * @param argTargetdir �t�B�[���h[targetdir]�Ɋi�[�������l
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * �t�B�[���h[targetdir]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [blanco]<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B
     *
     * @return �t�B�[���h[targetdir]�Ɋi�[����Ă���l
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * �t�B�[���h [tmpdir]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B
     *
     * @param argTmpdir �t�B�[���h[tmpdir]�Ɋi�[�������l
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * �t�B�[���h[tmpdir]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [tmp]<br>
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B
     *
     * @return �t�B�[���h[tmpdir]�Ɋi�[����Ă���l
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * �t�B�[���h [encoding]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     *
     * @param argEncoding �t�B�[���h[encoding]�Ɋi�[�������l
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �t�B�[���h[encoding]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     *
     * @return �t�B�[���h[encoding]�Ɋi�[����Ă���l
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * �t�B�[���h [targetlang]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js,vb,php,ruby,python���I���\
     *
     * @param argTargetlang �t�B�[���h[targetlang]�Ɋi�[�������l
     */
    public void setTargetlang(final String argTargetlang) {
        fTargetlang = argTargetlang;
    }

    /**
     * �t�B�[���h[targetlang]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   [java]<br>
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js,vb,php,ruby,python���I���\
     *
     * @return �t�B�[���h[targetlang]�Ɋi�[����Ă���l
     */
    public String getTargetlang() {
        return fTargetlang;
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
        buf.append("blanco.stringgroup.task.valueobject.BlancoStringGroupProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",metadir=" + fMetadir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",encoding=" + fEncoding);
        buf.append(",targetlang=" + fTargetlang);
        buf.append("]");
        return buf.toString();
    }
}
