package Day01;

import java.util.Scanner; // import : �ٸ� ��Ű������ Ŭ���� ��������

public class Day01_5 { // c s

	public static void main(String[] args) { // m s
		
		// �Է°� ��� ���� 2
		/*
		 * �л� 1���� ȸ������ ǥ �����
		 * [�Էº���]
		 * 
		 * ���̵�, ��й�ȣ, ����, �̸��� �Է¹޾� ����ϱ�
		 * 
		 * [��� ��]
		 * >>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ���� �ּ��� >>>>>>>>>
		 * ���̵�		��й�ȣ		����			�̸���
		 * qwe		1234		���缮		itdanjak@naver.com
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է��� �ּ��� : ");		String id = sc.next();
		System.out.print("��й�ȣ�� �Է��� �ּ��� : ");	String password = sc.next();
		System.out.print("������ �Է��� �ּ��� : ");		String user_name = sc.next();
		System.out.print("�̸����� �Է��� �ּ��� : ");		String email = sc.next();
		
		System.out.println("\n>>>>>>>>>>>>>>>>>>> ȸ������ �Ϸ�! �Ʒ� ������ Ȯ���� �ּ��� >>>>>>>>>>>>>>>>>>>");
		System.out.println("���̵�\t\t��й�ȣ\t\t����\t\t�̸���");
		System.out.println(id + "\t\t" + password + "\t\t" + user_name + "\t\t" + email);
		
		sc.close();
	} // m e

} // c e
