/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.stringgroup.task;

import java.io.IOException;

import blanco.stringgroup.task.valueobject.BlancoStringGroupProcessInput;

/**
 * ���� [BlancoStringGroupProcess]�C���^�t�F�[�X�B
 *
 * ���̃C���^�t�F�[�X���p������ [blanco.stringgroup.task]�p�b�P�[�W��[BlancoStringGroupProcess]�N���X���쐬���Ď��ۂ̃o�b�`�������������Ă��������B<br>
 */
interface BlancoStringGroupProcess {
    /**
     * �N���X���C���X�^���X�����ď��������s����ۂ̃G���g���|�C���g�ł��B
     *
     * @param input �����̓��̓p�����[�^�B
     * @return �����̎��s���ʁB
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    int execute(final BlancoStringGroupProcessInput input) throws IOException, IllegalArgumentException;
}
