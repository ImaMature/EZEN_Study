package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ���� {
	//ȸ���� ���α׷� //�ݿ�� //list
	
		//1. ����Ʈ(list)�� �̿��� ȸ������, �α���, ȸ������, ȸ��Ż��
	public static void main(String[] args) {
	
		//0. ���� [�Է°�ü]
		Scanner scanner = new Scanner(System.in);
		//0-1. ���� [����Ʈ ����] User Ŭ������ ���� �� �ִ� Ŭ���� (User Ŭ������ ������ ����)
		ArrayList<User> users = new ArrayList<>(); //Ŭ���� ������ ���� users �ӽð�ü ����
		
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
			
				//*���̵� �ߺ�üũ [����Ʈ �� ��ü �ϳ��� temp�� ���� ]
				boolean idcheck = true;
				for(User temp : users) { //temp �ӽð�ü ����
					if(temp.getId().equals(id)) {
						System.out.println("[[�ߺ��� ���̵� �Դϴ�.]]");
						idcheck = false; break;
					}
				}
				//3. ����Ʈ�� ���� [ ���࿡ �ߺ����� ������ ]
				if(idcheck) {users.add(user); System.out.println("[[ȸ������ ����]]");}// if �ȿ� �����ݷ� �ϳ��� �׷��� {}��ŵ����, �ΰ� �̻��̸� {} �ʼ�
				
			}else if(ch==2) {
				//1. �Է¹ޱ�
				System.out.println("���̵� : ");		String id = scanner.next(); 
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				
				//2. ����Ʈ�� ��ü�� ���ϱ�
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPassword().equals(pw)) { //getID, getPassword : ��Ŭ������ �ִ� �޼ҵ�
						System.out.println("�α��� ����");
						logincheck = false; break;
					}
				}
				if(logincheck) {System.out.println("[[������ ȸ�� ������ �����ϴ�.]]");}
			}
		}//while end
	}//main end
}//class end
