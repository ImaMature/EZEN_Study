package Day03;

import java.util.Scanner;

public class Day03_8 {

	//p.135 ~ 136 Ȯ�ι��� 7�� : ATM ���α׷�
	
	public static void main(String[] args) {
		
		// �����ư ������ ������ 24�ð� �������� ���α׷� => while(true)
		boolean ���� = true; //���ѷ��� �����ϴ� ����
		int ���ݾ� = 0; //���ݾ�
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		while( ���� ) { // [ ���ຯ�� true ���ѷ��� ���� // ���ຯ���� false�̸� ���ѷ��� ���� ]
			System.out.println("---------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------------");
			System.out.print("����> "); int ���� = scanner.nextInt();
			
			if (���� == 1) { // ���࿡ 1�� �Է����� ��
				System.out.println("\n���ݾ�> ");			���ݾ� += scanner.nextInt(); //�Է¹��� ���� �ٷ� ���� ����
			}
			else if (���� == 2) { // ���࿡ 2�� �Է����� ��
				System.out.println("\n��ݾ�> ");		int ��ݾ� = scanner.nextInt();
				
				if(���ݾ� < ��ݾ�) 	{ System.out.println("[[ �˸� ]] �ܰ� �����մϴ�."); }
				else { ���ݾ� -= ��ݾ�;  System.out.println("[[ �˸� ]] ��� �Ϸ�"); }
				
			}		
			else if (���� == 3) { // ���࿡ 3�� �Է����� ��
				System.out.println("\n�ܰ�> " + ���ݾ�);
			}
			else if (���� == 4) { // ���࿡ 4�� �Է����� ��
				���� = false; // ���ຯ���� false�� �־ ���ѷ��� [while��] �����Ŵ. //break�� �ᵵ ��
				System.out.println("\n[[ �̿����ּż� �����մϴ�. ]]");
			}	
			else {
				System.out.println("\n [[���]] : �� �� ���� ��ȣ�Դϴ�.");
			}
			
		}

		
	}
}
