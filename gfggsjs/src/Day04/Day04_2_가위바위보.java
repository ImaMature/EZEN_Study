package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2_���������� { // class start // �Ⱥ��� © �� �ִ� ? ��� �����Ѱ�

	public static void main(String[] args) { // main start
		// ����������
			// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է� �ޱ�
			// 2. ��ǻ�ʹ� ������ ���������� �� �ϳ� ����
			// 3. �¸��� �÷��̾� ȣ��
				// + : ���࿡ ���Ḧ �Է�[3]�ϸ� ���� ����
				// + : ��������� ���� ���� �����¸� [ ���� ���� �̱� �÷��̾� ȣ��]
		
		
		Scanner scanner = new Scanner(System.in);
		
		int player; int computer; int ���Ӽ�=0;
		int �÷��̾�¸��� = 0; int ��ǻ�ͽ¸��� = 0;
		
		while(true ) { //while start
			// 1. ����ڷκ��� �Է� �ޱ�
			System.out.print("\n����[0] ����[1] ��[2] ����[3] �� �ϳ��� �Է��� �ּ��� : ");	
			player = scanner.nextInt();
			
			//. 4 3�� �Է� �� ���� ����
			if (player == 3) { // if start
				System.out.println("\n--- ���α׷� ���� --- ");
				System.out.println("\n�� ���Ӽ� > " + ���Ӽ�);
				
				if (�÷��̾�¸��� > ��ǻ�ͽ¸���) {
					System.out.println("\n���� �¸��� : �÷��̾�, �÷��̾� �̱� Ƚ�� : " + �÷��̾�¸���);
				} else if (�÷��̾�¸��� < ��ǻ�ͽ¸���) {
					System.out.println("\n���� �¸��� : ��ǻ��, ��ǻ�� �̱� Ƚ�� : " + ��ǻ�ͽ¸���);
				} else {
					System.out.println("\n���� �¸��� : ���º�");
					
					} break;	//���� ����� �ݺ��� Ż��
				} // if end
				
			
			
			//5. 0~3�� ���� �Է½�
			if( player<0 || player>3) {
				System.out.println(" >>> [�� �� ���� ��ȣ�Դϴ�. �ٽ��Է��ϱ�.]");
				continue; //���� ����� �ݺ������� �̵�
			}
						
			// 2. ��ǻ�ͷκ��� ���� ����
			
			Random random = new Random(); // ���� ��ü
			computer = random.nextInt(3); // 0 ~ 2 ������ ����
			System.out.println("\n��ǻ�Ͱ� ���� : " + computer);
			
			
			// 3. �¸��� �Ǵ� �� = 0(����) && �� = ��(2) �̰ų� �� = ����(1) && �� = 0 �̰ų� �� = 2 && �� = 1) 
			if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1))	{  
				System.out.println("\n>>>>> �÷��̾� �¸�");
				�÷��̾�¸���++;
			}
			
			// ���º� �Ǵ�
			else if ((player == 0 && computer == 0) || (player == 1 && computer == 1) || (player == 2 && computer == 2))	{  
				System.out.println("\n>>>>> ���º�");
			}
			
			
			else {  // ��ǻ�� �¸�
				System.out.println("\n>>>>> ��ǻ�� �¸�");	
				��ǻ�ͽ¸���++;
			}
			
			���Ӽ�++; // ���Ӽ� ����
			
		} //while end
		
		scanner.close();
	} // main end

} // class end
