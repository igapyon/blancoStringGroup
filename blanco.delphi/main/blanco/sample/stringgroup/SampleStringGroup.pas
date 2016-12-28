// ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
unit SampleStringGroup;

interface
    uses SysUtils;

type
    { ������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B }
    TSampleStringGroup = class(TObject)

        { No.1 ����:�A���t�@�x�b�g�̕������`�B }
        const ABCDEFG = 1;

        { No.2 ����:�S�p�̕������`�B }
        const AIUEO = 2;

        { No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B }
        const QUOTE = 3;

        { No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B }
        const DOUBLE_QUOTE = 4;

        { No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B }
        const BACK_SLASH = 5;

        { No.7  }
        const WITHOUT_DESC = 7;

        { No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B }
        const TEST_SPACE = 8;

        { No.9 ����:�~�}�[�N�B }
        const BATU = 9;

        { ����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B }
        const NOT_DEFINED = -1;

        function match(argCheck: String): boolean;

        function matchIgnoreCase(argCheck: String): boolean;

        function convertToInt(argCheck: String): Integer;
    end;
implementation

    function TSampleStringGroup.match(argCheck: String): boolean;
    begin
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' = argCheck then begin
            result := True;
            exit;
        end;
        // No.2
        // ����:�S�p�̕������`�B
        if '����������' = argCheck then begin
            result := True;
            exit;
        end;
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '''' = argCheck then begin
            result := True;
            exit;
        end;
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' = argCheck then begin
            result := True;
            exit;
        end;
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\' = argCheck then begin
            result := True;
            exit;
        end;
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if 'STRING ONLY' = argCheck then begin
            result := True;
            exit;
        end;
        // No.7
        if '�������ȗ�' = argCheck then begin
            result := True;
            exit;
        end;
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' = argCheck then begin
            result := True;
            exit;
        end;
        // No.9
        // ����:�~�}�[�N�B
        if '�~' = argCheck then begin
            result := True;
            exit;
        end;
        result := False;
        exit;
    end;

    function TSampleStringGroup.matchIgnoreCase(argCheck: String): boolean;
    begin
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if UpperCase('ABCDEFG') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.2
        // ����:�S�p�̕������`�B
        if UpperCase('����������') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if UpperCase('''') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if UpperCase('"') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if UpperCase('\') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.6
        // ����:�萔���ȗ����ꂽ��`�B
        if UpperCase('STRING ONLY') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.7
        if UpperCase('�������ȗ�') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if UpperCase('ABC DEF') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        // No.9
        // ����:�~�}�[�N�B
        if UpperCase('�~') = UpperCase(argCheck) then begin
            result := True;
            exit;
        end;
        result := False;
        exit;
    end;

    function TSampleStringGroup.convertToInt(argCheck: String): Integer;
    begin
        // No.1
        // ����:�A���t�@�x�b�g�̕������`�B
        if 'ABCDEFG' = argCheck then begin
            result := ABCDEFG;
            exit;
        end;
        // No.2
        // ����:�S�p�̕������`�B
        if '����������' = argCheck then begin
            result := AIUEO;
            exit;
        end;
        // No.3
        // ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '''' = argCheck then begin
            result := QUOTE;
            exit;
        end;
        // No.4
        // ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
        if '"' = argCheck then begin
            result := DOUBLE_QUOTE;
            exit;
        end;
        // No.5
        // ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
        if '\' = argCheck then begin
            result := BACK_SLASH;
            exit;
        end;
        // No.7
        if '�������ȗ�' = argCheck then begin
            result := WITHOUT_DESC;
            exit;
        end;
        // No.8
        // ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
        if 'ABC DEF' = argCheck then begin
            result := TEST_SPACE;
            exit;
        end;
        // No.9
        // ����:�~�}�[�N�B
        if '�~' = argCheck then begin
            result := BATU;
            exit;
        end;

        // �Y������萔��������܂���ł����B
        result := NOT_DEFINED;
        exit;
    end;
end.

