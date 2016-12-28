# -*- coding: cp932 -*-
"""���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
"""
class SampleStringGroup:
    """������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
    """

    """No.1 ����:�A���t�@�x�b�g�̕������`�B
    """
    ABCDEFG = 1

    """No.2 ����:�S�p�̕������`�B
    """
    AIUEO = 2

    """No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    """
    QUOTE = 3

    """No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
    """
    DOUBLE_QUOTE = 4

    """No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
    """
    BACK_SLASH = 5

    """No.7
    """
    WITHOUT_DESC = 7

    """No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
    """
    TEST_SPACE = 8

    """No.9 ����:�~�}�[�N�B
    """
    BATU = 9

    """����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B
    """
    NOT_DEFINED = -1

    def match(self, argCheck):
        """������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B

        self -- ���̃��\�b�h���܂ރN���X���g�B
        argCheck -- �`�F�b�N���s������������B
        return -- ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
        """
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' == argCheck:
            return True
        #end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������' == argCheck:
            return True
        #end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\'' == argCheck:
            return True
        #end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' == argCheck:
            return True
        #end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\' == argCheck:
            return True
        #end
        # No.6
        # ����:�萔���ȗ����ꂽ��`�B
        if 'STRING ONLY' == argCheck:
            return True
        #end
        # No.7
        if '�������ȗ�' == argCheck:
            return True
        #end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' == argCheck:
            return True
        #end
        # No.9
        # ����:�~�}�[�N�B
        if '�~' == argCheck:
            return True
        #end
        return False
    #end

    def matchIgnoreCase(self, argCheck):
        """������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B

        self -- ���̃��\�b�h���܂ރN���X���g�B
        argCheck -- �`�F�b�N���s������������B
        return -- ������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B
        """
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG'.upper() == argCheck.upper():
            return True
        #end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������'.upper() == argCheck.upper():
            return True
        #end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\''.upper() == argCheck.upper():
            return True
        #end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"'.upper() == argCheck.upper():
            return True
        #end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\'.upper() == argCheck.upper():
            return True
        #end
        # No.6
        # ����:�萔���ȗ����ꂽ��`�B
        if 'STRING ONLY'.upper() == argCheck.upper():
            return True
        #end
        # No.7
        if '�������ȗ�'.upper() == argCheck.upper():
            return True
        #end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF'.upper() == argCheck.upper():
            return True
        #end
        # No.9
        # ����:�~�}�[�N�B
        if '�~'.upper() == argCheck.upper():
            return True
        #end
        return False
    #end

    def convertToInt(self, argCheck):
        """�����񂩂�萔�ɕϊ����܂��B

        �萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B

        self -- ���̃��\�b�h���܂ރN���X���g�B
        argCheck -- �ϊ����s������������B
        return -- �萔�ɕϊ���̒l�B
        """
        # No.1
        # ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' == argCheck:
            return self.ABCDEFG
        #end
        # No.2
        # ����:�S�p�̕������`�B
        if '����������' == argCheck:
            return self.AIUEO
        #end
        # No.3
        # ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '\'' == argCheck:
            return self.QUOTE
        #end
        # No.4
        # ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' == argCheck:
            return self.DOUBLE_QUOTE
        #end
        # No.5
        # ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\\' == argCheck:
            return self.BACK_SLASH
        #end
        # No.7
        if '�������ȗ�' == argCheck:
            return self.WITHOUT_DESC
        #end
        # No.8
        # ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' == argCheck:
            return self.TEST_SPACE
        #end
        # No.9
        # ����:�~�}�[�N�B
        if '�~' == argCheck:
            return self.BATU
        #end

        # �Y������萔��������܂���ł����B
        return self.NOT_DEFINED
    #end
#end
