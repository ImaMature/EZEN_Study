package works;

import java.util.Random;

//������ȣ �������� 0000~9999 ������ ���� 10�� ����
//
//����	1. ��� ������ �迭�� ����
//	* ���� ���ڸ� ��ȣ�� Ȧ��/¦��
//	2. ���� ���ڸ� ��ȣ�� Ȧ�� �迭 ����
//	3. ���� ���ڸ� ��ȣ�� ¦�� �迭 ����
	// [���] 3���� �迭 ��� ��� 
		// ���� => ���� 0~9999 ������ ���� ����
		// ���� -> 4�ڸ��� ���ڿ� ��ȯ

public class ���� {

	public static void main(String[] args) {
		int[] car = new int [10];	// ��� ������ ���� �迭. ������ 10�� �̹Ƿ� 10���� ����
		int car2 [] = new int [10]; // ���� ���ڸ� ��ȣ�� Ȧ���� �迭
		int car3 [] = new int [10]; // ���� ���ڸ� ��ȣ�� ¦���� �迭
		
		Random rand = new Random(); // ���� ��ü ����

			for(int i =0; i<car.length; i++) { 	//��� ������ �迭 ��ŭ �ݺ�
				
				car[i] = rand.nextInt(10000);	//0~9999 ���� ���� �迭�� ����
			
				//�ߺ�üũ �ϴ� ���� �𸣰ڽ��ϴ�.
				
				String strnum = String.format("%04d", car[i]); 	//������ ���� ��Ʈ��ȭ
				//3�ڸ� �� �ȳ����� String.formatȭ 04d�� �ؾ� 0�� �پ� 4�ڸ����� �ȴ�.
				car[i] = Integer.parseInt(strnum); 				//Stringȭ �� ���� int�� ���� ����ȯ �� i��° �ε����� ����
															
				if(car[i] % 2 == 0 && car2[i] == 0) {	
						// ¦�� => 2�� ������ �� �������� 0 	//�׸��� car2�迭�� ��������� X
					car2[i] = car[i];					
				}
				else if(car[i] % 2 ==1 && car3[i] == 0) { 
						// Ȧ�� => 2�� ������ �� �������� 1		//�׸��� car3�迭�� ��������� X
					car3[i] = car[i];
				}	
			}
		System.out.println("��� ����"); 		
		for(int i=0; i<car.length; i++) { 	// car2 �迭���̸�ƴ �ݺ�
			System.out.print(car[i]+" ");	// car�迭�� �� + �������� ���� ���ϰ�
		}
		System.out.println("\n===================================================");
		
		System.out.println("¦�� ����");
		for(int i = 0; i<car2.length; i++) {
			if(car2[i] !=0) {		//car2 �迭�� 0�� ������ ������ �ʰ� �ϱ�
				System.out.print(car2[i] + " ");					
			}
		}
		System.out.println("\n===================================================");
		
		System.out.println("Ȧ�� ����");
		for(int i = 0; i<car3.length; i++) {
			if(car3[i] !=0) { 		//car3 �迭�� 0�� ������ ������ �ʰ� �ϱ�
				System.out.print(car3[i] + " ");					
			}
		}
	}
}	
