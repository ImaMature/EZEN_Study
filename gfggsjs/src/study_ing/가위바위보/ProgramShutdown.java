package study_ing.����������;

public class ProgramShutdown extends Main_menu{

	public static void userChoice() { // ���� ���� �޼ҵ� ������ ���� y�� n�� ��Ƽ�
		//��ü���� �� �𸣰���.			// y�϶� "���α׷� ����." ��� n�϶� "��� �����ϰڽ��ϴ�." ���
		
		// String y or n�� ���� ������ �ʿ� ���µ� �ؼ� �ʵ� ����
		
		boolean flag2 = true; //boolean �Ⱦ����� break;�� Ż��, �׷� boolean�� � �� ���? 
		while(flag2) {
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�?");
		System.out.println("��[y] / �ƴϿ�[n]");	String ch2 = Main_����������.sc.next();
		if (ch2.equals("y")) {
			System.out.println("���α׷� ����."); flag2 = false; Main_����������.flag = false; 
			// ��� main_������������ �ִ� boolean flag = false�� �ٲ���
			// ���࿡ �Է°�ü ch2�� main_������������ �ִٸ�
		}
		else if (ch2.equals("n")) {
			System.out.println("������ ��� �����մϴ�.");
			System.out.println("----------------\n"); flag2 = false;
			 // return�� �������̴��� = void�϶�
			}
		else {System.out.println("�߸��� �Է��Դϴ�.");}
		}
	}
}
