// �Է��ϴ� ��

package Day01;

import java.util.Scanner;

public class Day01_3 { // c s

	public static void main(String[] args) { // m s
	
		
		// ��� Ŭ���� : System
		System.out.println("�Է� : "); // ��� �޼ҵ� ȣ��
		
		
		// scan + ctrl + �����̽� �� 
				// Scanner java.util ����
		// �Է� Ŭ���� : Scanner (�빮��)
			// 1. Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ����
			// 2. �ٸ� ������ �Է� �� �ű��
			// 3. ���ο� �Է� �� �ޱ�
		// ��ü : scanner (�ҹ���)
		Scanner scanner = new Scanner(System.in);
			// ��ü : Ŭ���� ������� ������ �޸� ����
				// ��ü ���� : Ŭ������, ��ü��[����] = new ������( );
					// new : �޸𸮸� �Ҵ��ϴ� ������ 
					// System.out : ���
					// System.in : Ű����κ��� �Է� ���� ������
					// new ���� Scanner Ŭ���� : Ű����� ���� �Է¹��� ���� �޸�[������ġ, ���⼭�� new] ��ü ����
			// ��ü���� ��������
				// .next() : ��ü �� ����� ���ڿ� ȣ�� [ ���� X ]
				// .nextInt() : ��ü �� ����� ���� ȣ��
				// .nextLine() : ��ü �� ����� ���ڿ� ȣ�� [ ���� O ]
				// ���
			
			// ��ü���� ��������
		String string1 = scanner.next();
			// ��ü �� ����� �Է� ���� ������ ����
			// ���ڿ��� �������� ������ next
		System.out.println("�Էµ� ���ڿ��� : " + string1);
		
			// �ι�° �Է� �� ��������
		String string2 = scanner.next();
			// ���
		System.out.println("�Էµ� �ι�° ���ڿ��� : " + string2);

		scanner.close(); //scanner ��ü ������
 }// m e

}// c e