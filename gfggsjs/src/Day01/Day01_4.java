package Day01;

import java.util.Scanner;

public class Day01_4 { //c s

	public static void main(String[] args) { //m s
		
		// 1. �Է°�ü ���� [ Ű����κ��� �Է� ���� �����ϴ� ��ü]
		Scanner �Է°�ü = new Scanner(System.in);
			// ��ü���� : Ŭ������(Scanner) + ��ü��[����](�Է°�ü) = new ������();
		
		
		// 2. �Է¹��� �� �����ͼ� ����(�������)�� ����
			// ������ ���� ������ �� �ִ� �޸� [ �����ġ ] 
//		System.out.print("ù��° �Է� : ");
//		String ù��°�Է� = �Է°�ü.next();
//			// String : ���ڿ� Ŭ���� : ���ڿ��� �����ϴ� ��ü
//		
//		System.out.print("�ι�° �Է� : ");
//		int �ι�°�Է� = �Է°�ü.nextInt();
//			//int : ������[����] �ڷ��� : ������ �����ϴ� ���� ����
//			//double : �Ǽ���[����] �ڷ��� : �Ҽ� �� �Ǽ� 
//		
//		// 3. ���� ���
//		System.out.println("ù��° �Է� ���� : " + ù��°�Է�);
//		System.out.println("�ι�° �Է� ���� : " + �ι�°�Է�);
//		
//		�Է°�ü.close();
		
		
		// ����1
		/*
		 * 
		 * �л� 1���� �̸��� 1~3������ ��� ���θ� �Է¹޾� �Է¹��� ���� �Ʒ��� ���� ���
		 *  					[[ �⼮�� ]]
		 * -----------------------------------------------
		 * �̸�		1����		2����		3����		���
		 * ��ȣ��		�⼮		�Ἦ		�⼮
		 * -----------------------------------------------
		 * 
		 */
		System.out.print(" �л��� �Է� : ");	String name = �Է°�ü.next();
		System.out.print(" 1���� �⼮ : ");	String class_1 = �Է°�ü.next();
		System.out.print(" 2���� �⼮ : ");	String class_2 = �Է°�ü.next();
		System.out.print(" 3���� �⼮ : ");	String class_3 = �Է°�ü.next();
		
		System.out.println("\t\t [[ �⼮�� ]]");
		System.out.println("--------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println(name + "\t" + class_1 + "\t" + class_2 + "\t" + class_3);
						// ���� + ����� + ���� + ����� + ���� + ����� + ����
		System.out.println("--------------------------------------");
		// ���� (name, class_1���� ��) ���� ""�� �ٿ����� �ȵȴ�
		�Է°�ü.close();
	}//m e
	
}//c e
