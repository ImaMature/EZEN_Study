package study_ing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class check_Day04 { // c s

	public static void main(String[] args) { // m s
		Scanner scsc = new Scanner(System.in);
		//1. �ζ� �Ǻ���
		// [����1] : 1 ~ 45 ������ ���� 6�� �Է¹޾� �迭�� ����
			//	�� �ߺ��Ұ�, 1~45������ ���ڸ� ����
		// [����2] : ��÷��ȣ�� �������� 1 ~ 45 ������ ���� 6�� �����Ͽ� �迭�� ����		
		// [����3] : �� �迭 �� ������ ���ڰ� � �ִ��� üũ�Ͽ� ��� ���
		// [���] : ��� �������� ����ϰ� ��� ���
//				6�� ��� �����ϸ� 1��
//				5�� �����ϸ� 2��
//				4�� 3��
//				3�� 4��
//				�׿� ��
		//[���� 1] 1.
		int[] number = new int [6]; // int�� 6�� ������ ������ �� �ִ� �迭
		int[] random = new int [6];
		
		
		for(int i=0; i<6; i++) { 
		  System.out.print( i+"��° ��ȣ[1~45] ���� :"); 
		  
		  int num = scsc.nextInt();
		  if( num < 1 || num >45) { // 0 ~ 45�� �ƴ� ���
			  System.out.println(" [[ �˸� ]] : 0 ~ 45 ���̸� �Է� �����մϴ�.");
			  i--; // �������� �Է��� �ƴϱ� ������ i ����
			  continue;
		  }
		 //[���� 2]
		  Boolean check = true;
		  // �ߺ�üũ !!! : ���࿡ �Է��� ���� �迭�� ������ ���� �����Ѵٸ� �ٽ� �Է��ϱ�
		  for( int j = 0; j<6; j++) { 
			  if(num == number[j]) { // �ߺ�ã�� ����
				  System.out.println("[[ �˸� ]] : ������ ���� �̹� �����մϴ� : �ٽ� �Է�");
				  i--; // �������� �Է��� �ƴϱ� ������ i ����
				  check = false;
				  break; //���⼭ continue�ϸ� for�� �ٽ� �ö�
			  }
		   } 
		  
		  // 2. 1~45 ������ �� �̸鼭 �ߺ����� �ƴϸ� i��° �迭�� ����
		  number[i] = num;
		}
		//[����3] ���
		System.out.print(" ����ڰ� ������ �� : ");
		for(int i = 0; i<6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// 3. 6�� ���� �����ؼ� �迭�� ���� [�ߺ�üũ����]
		for(int i=0; i<6; i++) {
			Random random2 = new Random();
			int num = random2.nextInt(45)+1; // ���� ��ü���� 1~45 ������ ���� ��������
			
			Boolean check = true;	// �ߺ����� Ȯ�� üũ
			for ( int j = 0; j<6; j++) {	// �ݺ��ϸ鼭 �迭�� �ߺ� �� ã��
				if(num==random[j]) {	// ���࿡ ������ ���� �迭 �� ���� �����ϸ�
					i--;
					check = false;
					break;
				}
			}
			if (check) number[i] = num;	// �ߺ����� ���� ��� i��°�� ���� �ֱ�
				
		}
		
		// 4. 6���� ����(��÷��ȣ) ���
		
		System.out.print(" �̹��� ��÷ ��ȣ �� : ");
		for(int i = 0; i<6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		
		// 5. �� �迭 �� ������ �� üũ
		int count = 0;
		for ( int i = 0; i<6; i++) { // i�� number �迭�� �ε���
			for ( int j=0; j<6; j++) { // j�� random �迭�� �ε��� => 36�� �� [ i 1���� j�� 6���� ��]
				if(number[i] == random[j]){
					count++;
				}
			}
		}
		
		System.out.println("��÷ ��� : " + count);
	} // m e

} // c e
