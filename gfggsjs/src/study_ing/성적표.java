package study_ing;

import java.util.Scanner;

public class ����ǥ {
	/*
	 * 1. �����ʹ� Ű����� �Է¹޾� �迭������
	 * 2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ���
	 * 3. ��ȣ, �̸�, ����, ����, ���� �Է�, ���� ��ձ��ؼ� ���
	 * 4. ����� �Ҽ��� ���� 2�ڸ�����
	 * 5. ������ �̿��� ������ ���ϱ�
	 * 6. �Է� ������ ���� ���ܹ߻� ��Ȳ�� ���� ó���ϱ�
	 */
	static Scanner scanner = new Scanner(System.in);
	static �л���� [] arr = new �л���� [5];
	
	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			try {
				�л���� �л���� = new �л����();
				
				System.out.println("1. �����Է� | 2. ��� | 3. ���α׷� ����.");	int ch = scanner.nextInt();
				switch ( ch ) {
				case 1:
					System.out.println("������ �Է��ϴ� ȭ�� �Դϴ�.");;
					�л����.inputGrade();
					break;
				case 2:
					System.out.println("�Էµ� ������ ����ϴ� ȭ�� �Դϴ�.");
					�л����.outputGrade();
					break;
				case 3:
					System.out.println("���α׷� ����.");
					run = false;
					break;
				}
				
				
			} catch(Exception e){ 
				System.out.println("���� �߻�! �����ڿ��� ������ �ּ���." +"\n[��������: "+ e +"]");
				break;
			}
		}//while end
	}//main end
}//class end
