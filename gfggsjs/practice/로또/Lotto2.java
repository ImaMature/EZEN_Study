package �ζ�;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

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
	
	int [] number = new int [6];
	int [] randomN = new int [6];
	
					for(int i =0; i<6; i++) {
						System.out.println("[1 ~ 45 ������ ���ڸ� �Է����ּ���.]");
						int input = scanner.nextInt();
						
						if(input < 1 || input > 45) {
							System.out.println("[1 ~ 45 ������ ���ڸ� �Է����ּ���.] ���Է� : ");
							i--;
							continue;
							
						}
						boolean check = true;
						for(int j =0; j<6; j++) { 
							if(number[j] == input) {
								System.out.println("[�ߺ��� �� �����մϴ�.] ���Է� : ");
								check = false; // false���ϸ� ���� �̵�??
								i--; //j--���� �ȵ� ������??
								break;
							}
							
						}
						
						if(check) {
							number[i] = input;
							System.out.println(number[i]);
						}else {
							continue;
						}
					}
						
						//������������
						for(int i2 = 0; i2<6; i2++) {
							Random random = new Random(); 
							int rand = random.nextInt(45)+1;
							
							boolean check2 = true;
							for(int j = 0; j < 6; j++) {
								if(rand == randomN[j]) {
									System.out.println("�����ߺ�");
									check2= false;
									i2--;
								}
							}
							if(check2) {
								randomN[i2] = rand;
								System.out.println(randomN[i2]);
							}else {
								continue;
							}
						}
					
		
	}
}