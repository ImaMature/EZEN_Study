package study_ing.����������;

import java.util.Random;
import java.util.Scanner;

public class ����������2 {
	// ����������
				// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է� �ޱ�
				// 2. ��ǻ�ʹ� ������ ���������� �� �ϳ� ����
				// 3. �¸��� �÷��̾� ȣ��
					// + : ���࿡ ���Ḧ �Է�[3]�ϸ� ���� ����
					// + : ��������� ���� ���� �����¸� [ ���� ���� �̱� �÷��̾� ȣ��]
	//Ŭ�������������� �����Ϸ��� �ڵ����� �ʱⰪ�� �������ش�.
	//�ʵ�
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int cpuWin = 0; int playerWin = 0; int gameCount = 0;
	int cpu = 0;;
	//�޼ҵ� �������� �ڵ����� �ʱⰪ�� �Ҵ���� �ʱ� ������ �ʱ�ȭ�� �Ѵ�.
	//int a = 0; -> ����� ���ÿ� �ʱ�ȭ
		while(true) {
		System.out.println("-------------------------------");
		System.out.println("����[0] ����[1] ��[2] ���α׷� ����[3]");
		System.out.print("���� > :");		int playerCh = scanner.nextInt();
		System.out.println("-------------------------------");
		
			if(playerCh == 3) {
				System.out.println("���α׷� ����. �� ���� �� : " + gameCount);
				if 		(cpuWin < playerWin) {System.out.println("�¸��� : �÷��̾�");}
				else if (cpuWin > playerWin) {System.out.println("�¸��� : ��ǻ��");}
				else 	{System.out.println("���º�");}
				break;
			}
			
			else if(playerCh<0 && playerCh>3) {
				System.out.println("�߸��� �Է��Դϴ�. 0~3 ������ ���� �Է����ּ���.");
			}
			
			Random random = new Random();
			cpu = random.nextInt(3);
			//System.out.println("��ǻ�Ͱ� ���� : " + cpu);
			
			if((playerCh == 0 && cpu == 1) || (playerCh == 1 && cpu == 2) || (playerCh == 2 && cpu == 0)) {
				System.out.println("��ǻ���� �¸��Դϴ�."); cpuWin++;}
			
			else if((playerCh == 0 && cpu == 2) || (playerCh == 1 && cpu == 0) || (playerCh == 2 && cpu == 1)) {
				System.out.println("�÷��̾��� �¸��Դϴ�."); playerWin++;}
			
			else {System.out.println("���º��Դϴ�.");}
			gameCount++;
		}// while end
	}// main end
}// class end
