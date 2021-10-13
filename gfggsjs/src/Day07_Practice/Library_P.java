package Day07_Practice;

import java.util.Scanner;

public class Library_P {
	
	public static L_Member [] l_members = new L_Member[100];
	public static L_Book [] l_Books = new L_Book[100];
	public static Scanner sc = new Scanner(System.in);	
		
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1. �α��� | 2. ȸ������ | 3. ���̵� ã�� | 4. ��й�ȣ ã��");
			System.out.println("------------------------------------------------");
			System.out.print("���� > : ");  int ch = sc.nextInt();
			
			//1.�α���
			if(ch==1) {
			String loginInfo = L_Member.login();
			// �α��ν���
			if 		(loginInfo == null) 		
			{System.out.println("[[�˸�]] : ���� �����Դϴ�.");}
			// ������ ���� �α��� ����
			else if (loginInfo.equals("admin")) 
			{System.out.println("\t         [[�α��� ����]]"); 
			 System.out.println("\t    [[������ �޴��� �����մϴ�.]]"); admin_menu();}
			// �Ϲ� ���� �α��� ����
			else	
			{System.out.println("[[�˸�]] : �α��� ����"); user_menu(loginInfo);}
			}
			
			//2.ȸ������
			if(ch==2) {L_Member.signup();}
			//3.���̵�ã��
			if(ch==3) {
				String L_find_id = L_Member.L_find_id();
				if(L_find_id==null) {System.out.println("[[������ ȸ�������� �����ϴ�.]]");}
				else {System.out.println("[[ȸ������ ���̵�� "+ L_find_id +"�Դϴ�.]]");}
			}
			//4.���ã��
			if(ch==4) {
				String L_find_pw = L_Member.L_find_pw();
				if(L_find_pw==null) {
					System.out.println("[[������ ȸ�������� �����ϴ�.]]");
				}
				else {System.out.println("[[ȸ������ ���̵�� "+L_find_pw+"�Դϴ�.]]");}
			}
		}
	}
			
	// ���� �޴� �޼ҵ�
	private static void user_menu(String loginInfo) {
		L_Book l_Book = new L_Book();
		
		while(true) {
		System.out.println("-------------User Menu-------------");
		System.out.println("|1.������� | 2.�뿩 | 3.�ݳ� | 4.�α׾ƿ�|");
		System.out.println("-----------------------------------");
		System.out.println("���� > : ");		int ch = sc.nextInt();
		// �������
		if(ch == 1) {l_Book.b_list();}
		// �뿩
		if(ch == 2) {l_Book.b_borrow(loginInfo);}
		// �ݳ�
		if(ch == 3) {l_Book.b_back(loginInfo);}
		// �α׾ƿ�
		if(ch == 4) {System.out.println("[[����� �α׾ƿ� �Ϸ�.]]"); return;}
		}
	}
	// ������ �޴� �޼ҵ�
	private static void admin_menu() {
		L_Book l_Book = new L_Book();
		
		while(true) {
		System.out.println("\t----------Admin Menu----------");
		System.out.println("\t|1.������� | 2.������� | 3.�α׾ƿ�|");
		System.out.println("\t------------------------------");
		System.out.println("���� > : ");		int ch = sc.nextInt();
		if(ch == 1) {l_Book.b_reg();}
		if(ch == 2) {l_Book.b_list();}
		if(ch == 3) {System.out.println("[[������ ���� �α׾ƿ� �Ϸ�.]]"); return;}
		
		}
	}
	

	

}
