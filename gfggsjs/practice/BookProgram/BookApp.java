package BookProgram;

import java.util.Scanner;

public class BookApp {

	public static Scanner sc = new Scanner(System.in);
	public static Member [] m_arr = new Member [100]; // ȸ�� �迭
	public static Book [] b_arr = new Book [100]; // ���� �迭
	
	public static void main(String[] args) {
		BookApp.start();
	}//main end	
	
	private static void start() {
			// TODO Auto-generated method stub
		Member member = new Member();
		while (true) {
			try {
				//���θ޴�
				BookApp.sc = new Scanner(System.in);
				System.out.println("------------������ ���� ���α׷�--------------");
				System.out.println("1. �α��� | 2. ȸ������ | 3. ���α׷� ����");
				System.out.println("-----------------------------------------");
				int ch = sc.nextInt();
				if( ch == 1 ) {
					member.login();
				}else if (ch == 2) {
					member.signup();
				}else if ( ch == 3 ) {
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			} catch (Exception e) {
				System.out.println("����" + e.getMessage());
			} 
		}//while end	
	}//start �޼ҵ� end
}//class end
