/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 * Apache Ant�^�X�N [BlancoStringGroup]�̃N���X
 */
package blanco.stringgroup.task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.stringgroup.task.valueobject.BlancoStringGroupProcessInput;

/**
 * Apache Ant�^�X�N [BlancoStringGroup]�̃N���X�B
 *
 * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B<br>
 * ���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B
 * ���ۂ̏����� �p�b�P�[�W[blanco.stringgroup.task]��BlancoStringGroupBatchProcess�N���X���쐬���ċL�q���Ă��������B<br>
 * <br>
 * Ant�^�X�N�ւ̑g�ݍ��ݗ�<br>
 * <pre>
 * &lt;taskdef name=&quot;blancostringgroup&quot; classname=&quot;blanco.stringgroup.task.BlancoStringGroupTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoStringGroupTask extends Task {
    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected BlancoStringGroupProcessInput fInput = new BlancoStringGroupProcessInput();

    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected boolean fIsFieldMetadirProcessed = false;

    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected boolean fIsFieldTargetdirProcessed = false;

    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected boolean fIsFieldTmpdirProcessed = false;

    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected boolean fIsFieldEncodingProcessed = false;

    /**
     * ������O���[�v��`������萔�N���X�������������邽�߂�AntTask�ł��B
     */
    protected boolean fIsFieldTargetlangProcessed = false;

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @param arg verbose���[�h�œ��삳���邩�ǂ����B
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @return verbose���[�h�œ��삳���邩�ǂ����B
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setMetadir(final String arg) {
        fInput.setMetadir(arg);
        fIsFieldMetadirProcessed = true;
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getMetadir() {
        return fInput.getMetadir();
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTargetdir(final String arg) {
        fInput.setTargetdir(arg);
        fIsFieldTargetdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B<br>
     * �f�t�H���g�l[blanco]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTargetdir() {
        return fInput.getTargetdir();
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTmpdir(final String arg) {
        fInput.setTmpdir(arg);
        fIsFieldTmpdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B<br>
     * �f�t�H���g�l[tmp]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTmpdir() {
        return fInput.getTmpdir();
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setEncoding(final String arg) {
        fInput.setEncoding(arg);
        fIsFieldEncodingProcessed = true;
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getEncoding() {
        return fInput.getEncoding();
    }

    /**
     * Ant�^�X�N��[targetlang]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js,vb,php,ruby,python���I���\<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTargetlang(final String arg) {
        fInput.setTargetlang(arg);
        fIsFieldTargetlangProcessed = true;
    }

    /**
     * Ant�^�X�N��[targetlang]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js,vb,php,ruby,python���I���\<br>
     * �f�t�H���g�l[java]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTargetlang() {
        return fInput.getTargetlang();
    }

    /**
     * Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B
     *
     * @throws BuildException �^�X�N�Ƃ��Ă̗�O�����������ꍇ�B
     */
    public final void execute() throws BuildException {
        System.out.println("BlancoStringGroupTask begin.");

        // ���ڔԍ�[1]�A�A�g���r���[�g[metadir]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldMetadirProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[metadir]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- metadir:[" + getMetadir() + "]");
            System.out.println("- targetdir:[" + getTargetdir() + "]");
            System.out.println("- tmpdir:[" + getTmpdir() + "]");
            System.out.println("- encoding:[" + getEncoding() + "]");
            System.out.println("- targetlang:[" + getTargetlang() + "]");
        }

        try {
            // ���ۂ�Ant�^�X�N�̎又�������s���܂��B
            // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoStringGroupProcess�C���^�t�F�[�X���������� blanco.stringgroup.task�p�b�P�[�W�� BlancoStringGroupProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
            final BlancoStringGroupProcess proc = new BlancoStringGroupProcessImpl();
            if (proc.execute(fInput) != BlancoStringGroupBatchProcess.END_SUCCESS) {
                throw new BuildException("�^�X�N�ُ͈�I�����܂����B");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B" + e.toString());
        }
    }
}