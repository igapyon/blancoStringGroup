' ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
Namespace blanco.sample.stringgroup
    ''' <summary>������O���[�v�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B</summary>
    Public Class SampleStringGroup

        ''' <summary>No.1 ����:�A���t�@�x�b�g�̕������`�B</summary>
        Public Const ABCDEFG As Integer = 1

        ''' <summary>No.2 ����:�S�p�̕������`�B</summary>
        Public Const AIUEO As Integer = 2

        ''' <summary>No.3 ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B</summary>
        Public Const QUOTE As Integer = 3

        ''' <summary>No.4 ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B</summary>
        Public Const DOUBLE_QUOTE As Integer = 4

        ''' <summary>No.5 ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B</summary>
        Public Const BACK_SLASH As Integer = 5

        ''' <summary>No.7 </summary>
        Public Const WITHOUT_DESC As Integer = 7

        ''' <summary>No.8 ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B</summary>
        Public Const TEST_SPACE As Integer = 8

        ''' <summary>No.9 ����:�~�}�[�N�B</summary>
        Public Const BATU As Integer = 9

        ''' <summary>����`�B������O���[�v�ȊO�̕�����܂��͒萔������`�̂��́B</summary>
        Public Const NOT_DEFINED As Integer = -1

        ''' <summary>������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ����𔻒肵�܂��B</summary>
        ''' <param name="argCheck">�`�F�b�N���s������������B</param>
        ''' <returns>������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B</returns>
        Public Function Match(argCheck As String) As Boolean
            ' No.1
            ' ����:�A���t�@�x�b�g�̕������`�B
            If ("ABCDEFG" = argCheck) Then
                Return true
            End If
            ' No.2
            ' ����:�S�p�̕������`�B
            If ("����������" = argCheck) Then
                Return true
            End If
            ' No.3
            ' ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("'" = argCheck) Then
                Return true
            End If
            ' No.4
            ' ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("""" = argCheck) Then
                Return true
            End If
            ' No.5
            ' ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            If ("\\" = argCheck) Then
                Return true
            End If
            ' No.6
            ' ����:�萔���ȗ����ꂽ��`�B
            If ("STRING ONLY" = argCheck) Then
                Return true
            End If
            ' No.7
            If ("�������ȗ�" = argCheck) Then
                Return true
            End If
            ' No.8
            ' ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            If ("ABC DEF" = argCheck) Then
                Return true
            End If
            ' No.9
            ' ����:�~�}�[�N�B
            If ("�~" = argCheck) Then
                Return true
            End If
            Return false
        End Function

        ''' <summary>������O���[�v�Ɋ܂܂�镶����ł��邩�ǂ������A�啶������������ʂ������肵�܂��B</summary>
        ''' <param name="argCheck">�`�F�b�N���s������������B</param>
        ''' <returns>������O���[�v�Ɋ܂܂�Ă����ture�B�O���[�v�Ɋ܂܂�Ȃ�������ł����false�B</returns>
        Public Function MatchIgnoreCase(argCheck As String) As Boolean
            ' No.1
            ' ����:�A���t�@�x�b�g�̕������`�B
            If ("ABCDEFG".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.2
            ' ����:�S�p�̕������`�B
            If ("����������".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.3
            ' ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("'".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.4
            ' ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("""".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.5
            ' ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            If ("\\".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.6
            ' ����:�萔���ȗ����ꂽ��`�B
            If ("STRING ONLY".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.7
            If ("�������ȗ�".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.8
            ' ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            If ("ABC DEF".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            ' No.9
            ' ����:�~�}�[�N�B
            If ("�~".ToUpper() = argCheck.ToUpper()) Then
                Return true
            End If
            Return false
        End Function

        ''' <summary>�����񂩂�萔�ɕϊ����܂��B</summary>
        ''' <remarks>
        ''' <newpara>�萔������`�̏ꍇ�� �^����ꂽ�����񂪕�����O���[�v�O�̏ꍇ�ɂ� NOT_DEFINED ��߂��܂��B</newpara>
        ''' </remarks>
        ''' <param name="argCheck">�ϊ����s������������B</param>
        ''' <returns>�萔�ɕϊ���̒l�B</returns>
        Public Function ConvertToInt(argCheck As String) As Integer
            ' No.1
            ' ����:�A���t�@�x�b�g�̕������`�B
            If ("ABCDEFG" = argCheck) Then
                Return ABCDEFG
            End If
            ' No.2
            ' ����:�S�p�̕������`�B
            If ("����������" = argCheck) Then
                Return AIUEO
            End If
            ' No.3
            ' ����:�V���O���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("'" = argCheck) Then
                Return QUOTE
            End If
            ' No.4
            ' ����:�_�u���N�I�[�g���W�J����邱�Ƃ̊m�F�B
            If ("""" = argCheck) Then
                Return DOUBLE_QUOTE
            End If
            ' No.5
            ' ����:�o�b�N�X���b�V�����W�J����邱�Ƃ̊m�F�B
            If ("\\" = argCheck) Then
                Return BACK_SLASH
            End If
            ' No.7
            If ("�������ȗ�" = argCheck) Then
                Return WITHOUT_DESC
            End If
            ' No.8
            ' ����:�r���̋󔒂��K�؂ɏ�������邱�Ƃ̊m�F�B
            If ("ABC DEF" = argCheck) Then
                Return TEST_SPACE
            End If
            ' No.9
            ' ����:�~�}�[�N�B
            If ("�~" = argCheck) Then
                Return BATU
            End If

            ' �Y������萔��������܂���ł����B
            Return NOT_DEFINED
        End Function
    End Class
End Namespace
