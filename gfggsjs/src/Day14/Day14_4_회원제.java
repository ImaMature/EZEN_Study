package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ���� {
	//ȸ���� ���α׷�
		//1. ����Ʈ�� �̿��� ȸ������, �α���, ȸ������, ȸ��Ż��
	public static void main(String[] args) {
	
		//0. ���� [�Է°�ü]
		Scanner scanner = new Scanner(System.in);
		//0-1. ���� [����Ʈ ����] User Ŭ������ ���� �� �ִ� Ŭ���� (User Ŭ������ ������ ����)
		ArrayList<User> users = new ArrayList<>();
		
		//1.�޴�
		while(true) {
			System.out.println("1. ȸ������ | 2. �α���");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				System.out.println("���� : ");		String name = scanner.next();
				
				//2. �Է¹��� �����͸� ��üȭ [user ��ü �ε��� �ϳ��� id, pw, name �� ���� ] 
											//[3���� �������� �ϳ���]
				User user = new User(id, pw, name);
				
				//3. ����Ʈ�� ����
				users.add(user);
				
			}else if(ch==2) {
				
			}
		}
	}
}
