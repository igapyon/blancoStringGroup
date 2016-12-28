#
# ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
#

#
# ������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
#
class SampleStringGroup

    #
    # No.1 ����:�A���t�@�x�b�g�̕������`�B
    #
    ABCDEFG = 1

    #
    # No.2 ����:�S�p�̕������`�B
    #
    AIUEO = 2

    #
    # No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    #
    QUOTE = 3

    #
    # No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    #
    DOUBLE_QUOTE = 4

    #
    # No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
    #
    BACK_SLASH = 5

    #
    # No.7
    #
    WITHOUT_DESC = 7

    #
    # No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
    #
    TEST_SPACE = 8

    #
    # No.9 ����:�~�}�[�N�B
    #
    BATU = 9

    #
    # ����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B
    #
    NOT_DEFINED = -1

    #
    # ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B
    #
    # param argCheck �`�F�b�N���s������������B
    # return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
    #
    def match(argCheck)
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' == argCheck
            return true
        end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������' == argCheck
            return true
        end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\'' == argCheck
            return true
        end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' == argCheck
            return true
        end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\' == argCheck
            return true
        end
        # No.6
        # ����:�萔���ȗ����ꂽ��`�B
        if 'STRING ONLY' == argCheck
            return true
        end
        # No.7
        if '�������ȗ�' == argCheck
            return true
        end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' == argCheck
            return true
        end
        # No.9
        # ����:�~�}�[�N�B
        if '�~' == argCheck
            return true
        end
        return false
    end

    #
    # ������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B
    #
    # param argCheck �`�F�b�N���s������������B
    # return ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
    #
    def matchIgnoreCase(argCheck)
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG'.upcase() == argCheck.upcase()
            return true
        end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������'.upcase() == argCheck.upcase()
            return true
        end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\''.upcase() == argCheck.upcase()
            return true
        end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"'.upcase() == argCheck.upcase()
            return true
        end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\'.upcase() == argCheck.upcase()
            return true
        end
        # No.6
        # ����:�萔���ȗ����ꂽ��`�B
        if 'STRING ONLY'.upcase() == argCheck.upcase()
            return true
        end
        # No.7
        if '�������ȗ�'.upcase() == argCheck.upcase()
            return true
        end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF'.upcase() == argCheck.upcase()
            return true
        end
        # No.9
        # ����:�~�}�[�N�B
        if '�~'.upcase() == argCheck.upcase()
            return true
        end
        return false
    end

    #
    # �����񂩂�萔�ɕϊ����܂��B
    #
    # �萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B
    #
    # param argCheck �ϊ����s������������B
    # return �萔�ɕϊ���̒l�B
    #
    def convertToInt(argCheck)
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' == argCheck
            return ABCDEFG
        end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������' == argCheck
            return AIUEO
        end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\'' == argCheck
            return QUOTE
        end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' == argCheck
            return DOUBLE_QUOTE
        end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\' == argCheck
            return BACK_SLASH
        end
        # No.7
        if '�������ȗ�' == argCheck
            return WITHOUT_DESC
        end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' == argCheck
            return TEST_SPACE
        end
        # No.9
        # ����:�~�}�[�N�B
        if '�~' == argCheck
            return BATU
        end

        # �Y������萔��������܂���ł����B
        return NOT_DEFINED
    end
end
