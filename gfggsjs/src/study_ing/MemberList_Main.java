package study_ing;

import java.util.Scanner;

public class MemberList_Main {

	//�α���/ȸ������ [ ����ó��]

		//[����1] : ȸ������ ���Ͽ� ����
		//[ȸ��Ŭ����] ���̵�, ��й�ȣ, ����, ����ó
		//[����2] : �α��ν� ���ϳ� ȸ�������� �����ϸ� �α���
	public static Scanner scanner = new Scanner(System.in);
	//�Է°�ü static�������� �ٸ� Ŭ���������� ��� ����
	public static MemberList_Member [] memarr = new MemberList_Member[1000]; 
	//ȸ�� ���� �迭
	//��������(static) �������� �ٸ� Ŭ���������� ��� ����
	
		public static void main(String[] args) {
			MemberList_Member.signup();
		}
}
