package study_ing;

import java.io.IOException;

public class Library_Main {

//	�����˻� ���α׷�
//	1. ���� ���� ��� �迭 ����
// 		[4���� ������ �迭�� ���]
// 		1. �ȴ�! ���̹� ��α� & ����Ʈ
// 		2. ������ ��Ʈ ���� Ȱ�� ������
// 		3. Tucker�� Go ��� ���α׷���
// 		4. ȥ�� �����ϴ� C���
// 	1-1. scanner ��ſ� System.in.read() ���
// 	2. �˻���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ�
// 	3. ������� : ������ ������ �Է¹޾� ���� �� ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü
// 
// String [] ������� = {"�ȴ�! ���̹� ��α� & ����Ʈ" , "������ ��Ʈ ����Ȱ�� ������" , "Tucker�� Go ��� ���α׷���", "ȥ�� �����ϴ� C���"};
	
	public static void main(String[] args) throws IOException {
		
		String[] ������� =  {"�ȴ�! ���̹� ��α� & ����Ʈ", "������ ��Ʈ ����Ȱ�� ������", "Tucker�� Go ��� ���α׷���", "ȥ�� �����ϴ� C���"};
		
		while(true) {
		System.out.println("���� �˻� ���α׷� ����ȭ�� �Դϴ�.");
		System.out.println("1. �˻��ϱ�\t2. �����ϱ�");
		System.out.print("���� > : "); 
		
		byte[] arr = new byte [100]; // �ڲ� Ŭ���� ������ �򰥸� Ŭ���� �ۼ� ��Ģ ���� ���� (https://devuna.tistory.com/4)
		int a = System.in.read(arr);	//����Ʈ -> ����
		String ch = new String(arr, 0, a-2); //���� -> ���ڿ�
		
			//1. ���� �˻��ϱ� ���
			if (ch.equals("1")) {
				System.out.print("���� �˻� : ");
				int a2 = System.in.read(arr);
				String book = new String(arr, 0, a2-2);
				for(int i = 0; i<�������.length; i++) {
					if(�������[i].contains(book)) {
						System.out.println("------- ��� --------");
						System.out.println(i+"�� "+�������[i]);
						System.out.println("--------------------");
					}
				}
			}
			//2. ���� �����ϱ� ���
			else if (ch.equals("2")) {
				System.out.println("������ ���� �˻� :"); // ���ڿ� -> ����
			
				int a2 = System.in.read(arr);
				String book2 = new String(arr, 0, a2-2);
				for(int i =0; i<�������.length; i++) {
					if(�������[i].contains(book2)) {
						System.out.println(i+"�� " +�������[i]);
					}
				}
				System.out.println("������ ������ ��ȣ �Է� : ");	//����Ʈ -> ��
				int a3 = System.in.read(arr);
				int index = Integer.parseInt(new String(arr, 0, a3-2));
				
				System.out.println("�ٲٰ� ���� ���� �Է� : ");
				a3 = System.in.read(arr);
				String old = new String(arr,0,a3-2);
				
				System.out.println("���Ӱ� �ٲ� ���� �Է� : ");
				a3 = System.in.read(arr);
				String news = new String(arr, 0, a3-2);
				
				�������[index] = �������[index].replace(old, news);
				
			}	
		}
	}
}
