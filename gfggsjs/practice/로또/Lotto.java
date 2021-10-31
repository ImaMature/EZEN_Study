package �ζ�;


import java.util.Random;
import java.util.Scanner;



public class Lotto {

	//1. �ζ� �Ǻ���
	// [����1] : 1 ~ 45 ������ ���� 6�� �Է¹޾� �迭�� ����
			//�� �ߺ��Ұ�, 1~45������ ���ڸ� ����
	// [����2] : ��÷��ȣ�� �������� 1 ~ 45 ������ ���� 6�� �����Ͽ� �迭�� ����		
	// [����3] : �� �迭 �� ������ ���ڰ� � �ִ��� üũ�Ͽ� ��� ���
	// [���] : ��� �������� ����ϰ� ��� ���
//			6�� ��� �����ϸ� 1��
//			5�� �����ϸ� 2��
//			4�� 3��
//			3�� 4��
//			�׿� ��
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int [] number = new int [6]; // ���� �Է¹��� �迭
		int [] rand = new int [6]; // ���� ���� �迭
		int count = 0; // �� �迭 �� ������ ���� üũ�ϴ� ��ü
		
		try{
			for(int i=0; i<6; i++) {
			
				System.out.println("[1~45 ������ ���ڸ� �Է����ּ���.]");	
				int inputNumber = scanner.nextInt();
				if(inputNumber < 1 || inputNumber > 45) {
					System.out.println("[�߸��� �����Դϴ�. 1 ~ 45 ������ ���ڸ� �Է����ּ���.]");
					i--;
					continue;
				}
				else {
					boolean check = true;
					for(int j = 0; j<6; j++) {
						if(number[j] == inputNumber) {
							System.out.println("[�ߺ��� ���ڰ� �̹� �����մϴ�. �ٽ� �Է����ּ���.]");
							i--;
							check = false;
							break;
							}
						}
					if(check) {
						number[i] = inputNumber;
						//System.out.println(number[i]);
					}else {
						continue;
					}
				}
				
			}//�����Է� for�� ��
			
			//�������� ����, �ߺ��� üũ
			for(int i = 0; i<6; i++) {
			Random random = new Random();
			int randNumber = random.nextInt(45)+1;
				
				boolean check2 = true;
				for(int j =0; j< 6; j++) {
					if(randNumber == rand[j]) {
						i--;
						check2 = false;					
					}
				}
				
				if(check2) {
					rand[i] =randNumber;
				}else {
					continue;
				}
			}//�������� for�� ��
			
			System.out.println("�̹��� ��÷��ȣ");
			for(int i =0; i<6; i++) {
				System.out.print(rand[i]+ " ");
			}
			
			for(int i =0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(number[i] == rand[j]) {
						count++;
					}
				}
			}
			System.out.println();
			System.out.println("������ ���� ���� : " + count);
			if(count == 3) {
				System.out.println("���ϵ帳�ϴ�! 4� ��÷�ǿ����ϴ�!");
			}
			else if(count == 4) {
				System.out.println("���ϵ帳�ϴ�! 3� ��÷�ǿ����ϴ�!");
			}
			else if(count == 5) {
				System.out.println("���ϵ帳�ϴ�! 2� ��÷�ǿ����ϴ�!");
			}
			else if(count == 6) {
				System.out.println("���ϵ帳�ϴ�! 1� ��÷�ǿ����ϴ�!");
			}
			else {
				System.out.println("���Դϴ�! ���� ��ȸ��...");
			}
		}catch (Exception e) {
			System.out.println("�ý��� �����Դϴ�. �����ڿ��� �����ϼ���." + e);
		}
		scanner.close();
	}//main end
}//class end
