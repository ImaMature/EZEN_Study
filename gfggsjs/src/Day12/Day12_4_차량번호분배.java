package Day12;

import java.util.Random;
import java.util.Scanner;

// ������ȣ ���� ��������
public class Day12_4_������ȣ�й� {
	public static void main(String[] args) {
		
	//0. ���� [�ʱⰪ 1�� ������ ����]
		Scanner scanner = new Scanner(System.in); // new�� ���ų� �޸��Ҵ�Ǵ� �� �޸𸮿� �����ؾߵ�
		String [] carNumbers = new String[10]; // String 10�� ������ �� �ִ� �迭 ����
		String [] carNumbers_odd = new String[10]; // Ȧ�� ������
		String [] carNumbers_even = new String[10]; // ¦�� ������
		Random random = new Random(); // ���� ��ü ����
		
		while(true) { // �ݺ������� �ʼ�
			System.out.print("1. ���� ����  : ");
			int ch = scanner.nextInt();
			if(ch==1) {
				int intnum = random.nextInt(10000); //0~9999�� ���� ����
				// ���� -> 4�ڸ��� ���ڿ��� ��ȯ
				String strnum = String.format("%04d", intnum); 
						// String.format(����, ������) : ���ڿ� ���� �޼ҵ�
							//%4d�� 4�ڸ� ���� �ٵ� 3�ڸ����̸� ������ �߰��� �׷��� %04d�� ����ؼ� ������ 0���� �޲�
								//���� : %d -> ���� ����� �����Ͱ� ����
									//%4d : 4�ڸ���
									//%04d : ����ִ� �ڸ����� 0���� ���
				System.out.println(intnum); // ��°��� 3�ڸ��� -> "����"347 
				System.out.println(strnum); // ��°��� 3�ڸ��� -> 0347 
				
				//������ȣ ���� [����ִ� �迭�� ���� = for��]
				for(int i = 0 ; i<carNumbers.length; i++) {
					if(carNumbers[i] == null) { // �ش� �ε����� ����ִٸ�
						carNumbers[i] = strnum; // �ش� �ε����� strnum���� ���� (���� ���ڿ���)
							//Ȧ¦ ����	[��%2 == 0 �������� 0�̸� ¦��, 1�̸� Ȧ��]
								//1. ���ڿ� -> ���� ��ȯ		2. Ȧ¦ ����1
						
						if(Integer.parseInt(strnum) %2 == 0) {	//���ڿ� -> ������ ��ȯ�� ���ÿ� 2�� ������ �������� 0�̸�
								// ������ ( ������ȣ ) %2 == 0 �̸� ¦��
							for(int j = 0; j<carNumbers_even.length; j++) {
								if (carNumbers_even[j] == null) {
									carNumbers_even[j] = strnum; break;
								}
							}
							
						}else {for(int j = 0; j<carNumbers_odd.length; j++) {
								 //¦���� �ƴ϶�� Ȧ��
							if (carNumbers_odd[j] == null) {
								carNumbers_odd[j] = strnum; break; 
							}
						}
					}
						break; // ������ȣ �����ϴ� for�� Ż��
				}
			}
////////////////////////////////// ���� ��� ���� ////////////////////////////////////////////////////////////
				System.out.println("****** ���� ���� ���� ���� ******");
				for(String num : carNumbers) {//�ε��� ��ȣ�� �ʿ���� �ݺ��� ���
					//for(�ڷ��� �ӽú��� : �迭��) -> �迭�� 0�� �ε������� ������ �ε������� �ӽú����� ����
					if(num != null) 
					System.out.println(num);
					
					
					}
				System.out.println("****** ���� ���� ���� Ȧ�� ���� ******");
				for(String num : carNumbers_odd) {//�ε��� ��ȣ�� �ʿ���� �ݺ��� ���
					//for(�ڷ��� �ӽú��� : �迭��) -> �迭�� 0�� �ε������� ������ �ε������� �ӽú����� ����
					if(num != null) 
					System.out.println(num);
					
					
				}
				System.out.println("****** ���� ���� ���� ¦�� ���� ******");
				for(String num : carNumbers_even) {//�ε��� ��ȣ�� �ʿ���� �ݺ��� ���
					//for(�ڷ��� �ӽú��� : �迭��) -> �迭�� 0�� �ε������� ������ �ε������� �ӽú����� ����
					if(num != null) 
					System.out.println(num);
				}	
			}
			
				// ������ȣ ���� [����ִ� �迭�� ����]
//		int carNumbers [] = new int [10]
//		Random random = new Random();
//		for(int i =0; i<10; i++) {
//			int carNumber1[i] = random.nextInt(10); 0~9 *1000 = 9000
//			int carNumber2[i] = random.nextInt(10);
//			int carNumber3[i] = random.nextInt(10);
//			int carNumber4[i] = random.nextInt(10);
//			System.out.println("�������� : " + carNumber1*1000);
		}
		
	}
}
