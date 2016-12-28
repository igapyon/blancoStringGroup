/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.stringgroup.message;

/**
 * blancoStringGroup�̂Ȃ��ŗ��p����郁�b�Z�[�W�ł��B
 */
public class BlancoStringGroupMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final BlancoStringGroupMessageResourceBundle fBundle = new BlancoStringGroupMessageResourceBundle();

    /**
     * ���b�Z�[�W��`ID[BlancoStringGroup]�A�L�[[MBSGI001]�̕�������擾���܂��B
     *
     * No.2:
     * ������[������O���[�v��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbsgi001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbsgi001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBSGI001] " + fBundle.getMbsgi001(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoStringGroup]�A�L�[[MBSGI002]�̕�������擾���܂��B
     *
     * No.3:
     * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbsgi002(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbsgi002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBSGI002] " + fBundle.getMbsgi002(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoStringGroup]�A�L�[[MBSGI003]�̕�������擾���܂��B
     *
     * No.4:
     * ������[������O���[�v��`ID[{0}]�ɂ����āA������[{1}]��2��ȏ゠����܂����B�����l��2��ȏ�w��ł��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbsgi003(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbsgi003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbsgi003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBSGI003] " + fBundle.getMbsgi003(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoStringGroup]�A�L�[[MBSGA001]�̕�������擾���܂��B
     *
     * No.7:
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbsga001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbsga001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBSGA001] " + fBundle.getMbsga001(arg0);
    }
}
