package Day05;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {
		// p.181 Ȯ�ι���
		
		// 1�� ���� �� : 2��
			//�� : ���� �� ���� ��, ���� Ÿ�� ������ �޸� ���� ��ġ
			// 3) ==, != ��ü �ּҰ� �� 	[ ��ü ���빰 �� X ]
			// 		.equals 			[ ��ü ���빰 �� O ]
			// ���� : ���� �̸� ����
				//int name = 100 : ����, 100: ��
		
		// 2�� ���� �� : 3��
			// 1) ���α׷� ����� �޸� �ʱ�ȭ
			// 3) �������� �ʴ� ��ü�� �ڵ� �Ҹ�
		
		// 3�� ���� �� : 2��
			// 2) ���ڿ�(String) �񱳽ÿ��� ==�� �ƴ϶� .equals()����ؾߵ�
				// ���ڿ��� �����ص� ��ü�� �ٸ� �� �ֱ� ������ == �� ��� X
		
		// 4�� ���� �� : 2�� // ";"���� ������ȱ� ����
						// int array = {1, 2, 3}; �̷��� ���ľߵ�
						// (����)			(�� ����)
						// �迭�� ����� ���ÿ� ������ ����, ���� ���� ���� ���� �ȵ�
		
		// 5�� ���� �� : 3��
			// 3) boolean Ÿ�� �迭�� �ʱⰪ�� false
			// ���� = 0, �Ǽ� = 0.0, �� = false, ���ڿ�[��ü] = null
			// String Ÿ�� �迭�� �ʱⰪ�� null
		
		// 6�� ����
			// �迭��.length : �����
			// �迭��[��].length : �ش� ���� �� ����
		
			// �� :array.length = 3, array[2].length = 5
				
		// 7�� ����
		
//		int max = 0;
//		int[] array = {1,5,3,8,2}; // 1���� �迭 array�� ���� ���̴�(array.length) 5
//		 for (int i =0; i<array.length; i++) { // i�� �ε��� 0~4���� 1�� �����ϸ鼭 �ݺ�
//			 if(array[i]>max) {	// i��° �ε��� ���� max���� ũ�� max�� i���� �ε��� �� ����
//				 max = array[i];
//			 }
//		 }
//		
//		System.out.println("max : " + max);
//		
//		// 8�� ����
//		
//		int[][] array2 = {						
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		System.out.println(array2.length); // array2�� ���� ���̴� 3
		/*		j=0	j=1	j=2	j=3	j=4
		 * 	i=0	95	86		
		 * 	i=1	83	92	96
		 * 	i=2	78	83	93	87	88
		 */
		
//		int sum=0;
//		double avg=0.0;
//		int count = 0; // ���� ����
//		
//		// �� �ݺ�
//		for (int i =0; i<array2.length; i++) {
//			// �� �ݺ�
//			for(int j=0; j<array2[i].length; j++) { //[0,0] [0,1] [0,2] ������ �����ٰ� [1,0] [1,1]������
//				// �ش��ε��� �� �����ͼ� sum �����հ� ���ϱ�
//				sum += array2[i][j];
//			}
//			count += array2[i].length; // 2+3+5 
//		}
//		System.out.println("�迭�� ���� : " + sum);
//		avg = (double)sum/count; // sum�� count�� int�ε� avg�� double�� �ʱ�ȭ�ؼ� ���� ����ȯ
//		System.out.println("�迭�� ��� : " + avg);
		
		
		// 9�� ����
		
		boolean run = true;	// while ���ѷ����� ���� ���� ����, ���� ? =
		int studentNum = 0; //�л� �� => �迭�� ���� 
		int[] scores = null; // �л� ���� �迭[ �ʱⰪ null ]
		Scanner scanner = new Scanner(System.in);	// �Է°�ü
		//���� ���� �ڷ������� �ѹ��� ����
		
		while(run) { // while(true) : ��� (�� �ȹٲ�)  while(run) : ���� (�� �ٲ�)
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3.��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("����> : ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л� ���� �Է��� �ּ���."); studentNum = scanner.nextInt();
				scores = new int [studentNum]; //�Է¹��� ������ŭ �迭���� �Ҵ�.
				//if(studentNum >0) {
				//for (int i = 0; i<studentNum; i++) {
					//System.out.printf("�л��� : %d��\n", studentNum);
					//break;
					//}
				//}else {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");}
			}
			
			else if (selectNo == 2) {
				System.out.println("������ �Է����ּ���."); 
				//�迭 �� �Ҵ�� ��� �ε����� �� �ֱ� => for
				for (int i = 0; i<studentNum; i++) {
					System.out.println(" scores[" + i + "] : ");
					scores[i] = scanner.nextInt();
					
				}	
			}
			else if (selectNo == 3) {
				for( int i = 0; i<studentNum; i++) {
					System.out.println("scores["+ i + "] : " + scores[i]); // i ���� �ε��� �� ���
				}
				
			}else if (selectNo == 4) {
				int max = 0; int sum = 0; double avg = 0.0;
				for (int i =0; i<studentNum; i++) {
					if(scores[i] > max ) max = scores[i]; // i���� �ε��� ���� max ���� ũ�� max�� i��° �ε��� �� �ֱ�
					
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("�ְ����� : " + max);
				System.out.println("������� : " + avg);
				
			}else if (selectNo == 5) {
			run = false; // break �Ƚᵵ ��
			
			}
			
		}
		
		System.out.println("���α׷� ����");	
	}

}
