//package Day12;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Day12_�α���test {
//	//�α���/ȸ������ [ ����ó��]
//
//			//[����1] : ȸ������ ���Ͽ� ����
//			//[ȸ��Ŭ����] ���̵�, ��й�ȣ, ����, ����ó
//			//[����2] : �α��ν� ���ϳ� ȸ�������� �����ϸ� �α���
//	public static void main(String[] args) throws IOException {//main start
//		Scanner scanner = new Scanner(System.in);
//		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/test.txt");
//		String [] ȸ����� = new String[100];
//		
//		//�ݺ��� ����
//		while(true) { //while start
//			
//			System.out.println("1.ȸ�������ϱ� 2.�α���"); int ch = scanner.nextInt();
//			
//			if(ch==1) {
//			//ȸ�������� �� ������� �Է¹ޱ�
//				for(int i =0; i<ȸ�����.length; i++) {
//				System.out.println("���̵�"); String = scanner.next();
//				System.out.println("��й�ȣ"); String pw = scanner.next();
//				System.out.println("����"); String name = scanner.next();
//				System.out.println("����ó"); String phoneNumber = scanner.next();
//				
//				
//				
//				//�ش� ��ü ���� ����
//				id = "���̵� : " + id + "\n";
//				pw = "��й�ȣ : " + pw + "\n";
//				name = "�̸� : " + name + "\n";
//				phoneNumber = "����ó : " + phoneNumber+ "\n";
//				
//				//����Ʈ�� �ٲ� ������ �����ϱ�
//				fileOutputStream.write(id.getBytes());
//				fileOutputStream.write(pw.getBytes());
//				fileOutputStream.write(name.getBytes());
//				fileOutputStream.write(phoneNumber.getBytes()); 
//				System.out.println("ȸ������ �Ϸ�."); break;
//				}
//			}
//			else if (ch==2) {
//				FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/test.txt");
//				//�о�� ����Ʈ�� ������ �迭
//				
//				fileInputStream.read(ȸ�����);
//				//���ڿ� ����ȯ
//				String custormers = new String(ȸ�����);
//				
//				System.out.println("���̵� �Է����ּ��� : "); String input_Id = scanner.next();
//				System.out.println("��й�ȣ�� �Է����ּ��� : "); String input_Pw = scanner.next();
//				if(input_Id.equals(custormers)) {
//					System.out.println("�α��� �Ǿ����ϴ�."); 
//					break;
//				} 
//				System.out.println("�߸��� ����Դϴ�.");
//				
//			}
//		}//while end
//	}//main end
//}//class end
