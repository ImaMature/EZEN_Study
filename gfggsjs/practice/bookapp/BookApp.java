package bookapp;


import java.util.Scanner;


public class BookApp {

//	------------------- ȸ���� ������ ���α׷� ---------------------
//	// [����1] : ��ü���� [ ȸ�� Ŭ���� , ���� Ŭ����  ]
//		���� : �ʵ� , ������ , �޼ҵ�
//	// [����2] : ��ü�� �迭�� ����
//	// [����3] : ȸ���� ���α׷� �̿�
//		[ �α����� ] : �α��� , ȸ������ , ���̵�/��й�ȣ ã��   
//		[ �α��ν� ] : 1.������� ,2. �뿩 , 3.�ݳ�  , 4.�α׾ƿ�
//	// [����4] : ������[ ID:admin ] �� ���� ��� ���� 
//		[ ������ �α��ν� ] : 1.������� ,2.������� 3. �α׾ƿ� 
	
	
	public static Member [] arr = new Member[100];
	public static Book [] b_arr = new Book[100];
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BookApp.start();
	}
	
	public static void start() {	
			Member member = new Member();
			
				while(true) {
				try{
					Scanner scanner = new Scanner(System.in);
					System.out.println("----------------ȸ���� ������ ���α׷�-----------------");
					System.out.println("1. �α��� | 2. ȸ������ | 3. ���̵�ã�� | 4. ��й�ȣã��");
					System.out.println("------------------------------------------------");
					int ch = scanner.nextInt();
					if(ch == 1) {
						member.login();
					}
					else if(ch == 2) {
						member.signup();
					}
					else if(ch == 3) {
						member.findid();
					}
					else if(ch == 4) {
						member.findpw();
					}
					else { System.out.println("[�߸��� ���ڸ� �Է��ϼ̽��ϴ�.]");}
				}catch(Exception e) {System.out.println("[�����߻�] �����ڿ��� �����ϼ���." + e);}
			
		}//while end
	}//main end
}//BookApp class end
