package study_ing.����������;

import java.util.Random;
import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		// ����������
					// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է� �ޱ�
					// 2. ��ǻ�ʹ� ������ ���������� �� �ϳ� ����
					// 3. �¸��� �÷��̾� ȣ��
						// + : ���࿡ ���Ḧ �Է�[3]�ϸ� ���� ����
						// + : ��������� ���� ���� �����¸� [ ���� ���� �̱� �÷��̾� ȣ��]
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int cpu; int gameCount = 0; int playerWin = 0; int cpuWin = 0;
		
		while(true) {
		System.out.println("-------------------------");
		System.out.println("���������� ���� ���� ȭ���Դϴ�.");
		System.out.println("����[0] ����[1] ��[2] ����[3]");
		System.out.print("�ϳ��� �������ּ��� > ");	int playerCh = scanner.nextInt();
		System.out.println("-------------------------");
			
			if (playerCh == 3) {
				System.out.println("���α׷� ����.");
				System.out.println("�� ���Ӽ� : " + gameCount);
				if (playerWin > cpuWin) {
					System.out.println("�����¸��� : " + playerWin);
				}else if (playerWin < cpuWin) {
					System.out.println("�����¸��� : " + cpuWin);
				}else {System.out.println("���º� �Դϴ�.");}
			break;	
			}//if end
			
			if (playerCh < 0 && playerCh > 3) {
				System.out.println("�� �� ���� ��ȣ �Դϴ�.");
			}
			
			cpu = random.nextInt(3);
			System.out.println("��ǻ�Ͱ� �� �� : " + cpu);
			
			if((playerCh == 0 && cpu == 1) || (playerCh == 1 && cpu == 2) || (playerCh == 2 && cpu == 0)) {
				System.out.println("��ǻ���� �¸�");
				cpuWin++;
			}
			
			if((playerCh == 0 && cpu == 2) || (playerCh == 1 && cpu == 0) || (playerCh == 2 && cpu == 1)) {
				System.out.println("��ǻ���� �¸�");
				cpuWin++;
			}else {
				System.out.println("���º�");
			}
			gameCount++;
		}//while end
	}//main end
}//class end
