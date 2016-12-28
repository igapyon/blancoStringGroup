// ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
using System;

namespace blanco.sample.stringgroup
{
    /// <summary>������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B</summary>
    public class SampleStringGroup
    {
        /// <summary>No.1 ����:�A���t�@�x�b�g�̕������`�B</summary>
        public static readonly int ABCDEFG = 1;

        /// <summary>No.2 ����:�S�p�̕������`�B</summary>
        public static readonly int AIUEO = 2;

        /// <summary>No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B</summary>
        public static readonly int QUOTE = 3;

        /// <summary>No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B</summary>
        public static readonly int DOUBLE_QUOTE = 4;

        /// <summary>No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B</summary>
        public static readonly int BACK_SLASH = 5;

        /// <summary>No.7 </summary>
        public static readonly int WITHOUT_DESC = 7;

        /// <summary>No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B</summary>
        public static readonly int TEST_SPACE = 8;

        /// <summary>No.9 ����:�~�}�[�N�B</summary>
        public static readonly int BATU = 9;

        /// <summary>����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B</summary>
        public static readonly int NOT_DEFINED = -1;

        /// <summary>������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B</summary>
        /// <param name="argCheck">�`�F�b�N���s������������B</param>
        /// <returns>������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B</returns>
        public virtual bool Match(string argCheck)
        {
            // No.1
            // ����:�A���t�@�x�b�g�̕������`�B
            if ("ABCDEFG".Equals(argCheck)) {
                return true;
            }
            // No.2
            // ����:�S�p�̕������`�B
            if ("����������".Equals(argCheck)) {
                return true;
            }
            // No.3
            // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("'".Equals(argCheck)) {
                return true;
            }
            // No.4
            // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("\"".Equals(argCheck)) {
                return true;
            }
            // No.5
            // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            if ("\\".Equals(argCheck)) {
                return true;
            }
            // No.6
            // ����:�萔���ȗ����ꂽ��`�B
            if ("STRING ONLY".Equals(argCheck)) {
                return true;
            }
            // No.7
            if ("�������ȗ�".Equals(argCheck)) {
                return true;
            }
            // No.8
            // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            if ("ABC DEF".Equals(argCheck)) {
                return true;
            }
            // No.9
            // ����:�~�}�[�N�B
            if ("�~".Equals(argCheck)) {
                return true;
            }
            return false;
        }

        /// <summary>������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B</summary>
        /// <param name="argCheck">�`�F�b�N���s������������B</param>
        /// <returns>������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B</returns>
        public virtual bool MatchIgnoreCase(string argCheck)
        {
            // No.1
            // ����:�A���t�@�x�b�g�̕������`�B
            if ("ABCDEFG".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.2
            // ����:�S�p�̕������`�B
            if ("����������".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.3
            // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("'".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.4
            // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("\"".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.5
            // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            if ("\\".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.6
            // ����:�萔���ȗ����ꂽ��`�B
            if ("STRING ONLY".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.7
            if ("�������ȗ�".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.8
            // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            if ("ABC DEF".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            // No.9
            // ����:�~�}�[�N�B
            if ("�~".Equals(argCheck, StringComparison.CurrentCultureIgnoreCase)) {
                return true;
            }
            return false;
        }

        /// <summary>�����񂩂�萔�ɕϊ����܂��B</summary>
        /// <remarks>
        /// <newpara>�萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B</newpara>
        /// </remarks>
        /// <param name="argCheck">�ϊ����s������������B</param>
        /// <returns>�萔�ɕϊ���̒l�B</returns>
        public virtual int ConvertToInt(string argCheck)
        {
            // No.1
            // ����:�A���t�@�x�b�g�̕������`�B
            if ("ABCDEFG".Equals(argCheck)) {
                return ABCDEFG;
            }
            // No.2
            // ����:�S�p�̕������`�B
            if ("����������".Equals(argCheck)) {
                return AIUEO;
            }
            // No.3
            // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("'".Equals(argCheck)) {
                return QUOTE;
            }
            // No.4
            // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            if ("\"".Equals(argCheck)) {
                return DOUBLE_QUOTE;
            }
            // No.5
            // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            if ("\\".Equals(argCheck)) {
                return BACK_SLASH;
            }
            // No.7
            if ("�������ȗ�".Equals(argCheck)) {
                return WITHOUT_DESC;
            }
            // No.8
            // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            if ("ABC DEF".Equals(argCheck)) {
                return TEST_SPACE;
            }
            // No.9
            // ����:�~�}�[�N�B
            if ("�~".Equals(argCheck)) {
                return BATU;
            }

            // �Y������萔��������܂���ł����B
            return NOT_DEFINED;
        }
    }
}
