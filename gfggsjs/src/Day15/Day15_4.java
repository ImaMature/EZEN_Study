package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	public static void main(String[] args) {
		
		//p.747 �Ƶ� ��� �˻�
		//Hashtable //ȸ������ //�α���
		// 0. ����
		Scanner scanner = new Scanner(System.in);
		
		// 0.map �÷��� ����
		Hashtable <String, String> hashtable = new Hashtable<>();
			//���̵�(Ű), ��й�ȣ(��)		//Ű : �ߺ� �Ұ�
		
		//�޴�
		while(true) {
			System.out.println("1.ȸ������ 2.�α���");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				
					//*
					if(hashtable.containsKey(id)) { // Ű���� �����ϸ� true // �ƴϸ� false
						System.out.println("**�̹� ������� ���̵��Դϴ�.");
					}else {
						//1. map�� ��ü �ֱ�
						hashtable.put(id, pw); System.out.println("[[���� ����]]");
					}
			}
			if(ch==2) {
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				
				if(hashtable.containsKey(id)) {
					if(hashtable.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					
				}else {
					System.out.println("�н����尡 �ٸ��ϴ�.");
				}
			}else {
				System.out.println("���̵� �ٸ��ϴ�.");
			}
			}
		}
	}
}
