package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
	
	public static void main(String[] args) { // m s
		
		// ���� 3 : �湮�� �Է¹޾� ����ϱ�
		/* [�Է¹ޱ�] : �ۼ���, ����, ��¥
		 * [ ��� ]
		 * ----------------- �湮�� ----------------
		 * 	|  ����	| �ۼ��� |	����		| ��¥	|
		 * 	| 	1	| ��ȣ�� |	�ȳ��ϼ���	| 09-28 |
		 * ---------------------------------------
		 */
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.print("�ۼ��� : ");		String your_name = sc2.next();
			sc2.nextLine();
		System.out.print("���� : ");		String text = sc2.nextLine(); //���� O
		// scanner.nextLin(); //next �������� nextLine�̸� ������ ����
				// �ذ�� next�� nextLine ���̿� ����.nextLine();�� �ϳ� �� ����
		System.out.print("��¥ : ");		String date = sc2.next();
		
		System.out.println("----------------- �湮�� ----------------");
		System.out.println("| ���� |  �ۼ���  |  ���� \t |  ��¥  |");
		System.out.println("|  1  |  " + your_name + "  |  "+ text + "  | " + date + " |");
		System.out.println("---------------------------------------");
		
		sc2.close();
	} // m e
} // c e
