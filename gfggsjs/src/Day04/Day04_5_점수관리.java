package Day04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5_�������� {//class start

	// �迭�� �̿��� �������� ���α׷�
		//1. �л����� �Է¹޾� �л�����ŭ �迭�� �����Ҵ�
		//2. �޴� [ 1. �л��� 2. �����Է� 3. �м�[���, ���] 4. ����]
	
	public static void main(String[] args) {//main start
		
		Scanner scanner = new Scanner(System.in);
		
		int[] �л�������� = null; //null => �迭 ���� �� ����	//0�� ���� �� �� �ֱ� ������ null ����ؼ� �ʱ�ȭ
		
		while(true) {//while start
			System.out.println("1.�л��� 2.�����Է� 3.�м� 4.����");
			System.out.print("���� : "); int ch = scanner.nextInt();
			if ( ch==1 ) {
				System.out.println("�л� �� �Է�[�迭����] : "); int size = scanner.nextInt();
				// �迭�� �޸� �Ҵ�
				�л�������� = new int[size]; //�Է¹��� �� ��ŭ �޸� �Ҵ�
				System.out.println(size + "��ŭ �л���� ����");
			}
			if ( ch==2 ) {
				//�л� ����ŭ ���� �Է� �ޱ�		//�迭��.length => �迭�� ���� 
											// length�� �迭�� ũ�⸦ ���� ���ִ� �Ӽ�
											// �迭�� ũ�Ⱑ ����ǵ� �ڵ������� �迭�� ũ�⸦ ���� ���ش�.
											// �迭�� ũ�Ⱑ �ٲ�� ���(�Է°��� �ִ´ٴ���) ����Ѵ�.
				for(int i=0; i<�л��������.length; i++) {
					System.out.println(i + "��° �л��� ���� �Է�  : ");
					�л��������[i] = scanner.nextInt();
				}
			}
			if ( ch==3 ) {
				//1-1.�������� (�ڵ� �Ⱥ��� ĥ �� �־�ߵ�)
//				for(int i =0; i<�л��������.length; i++) {
//					for(int j = i+1; j<�л��������.length; j++) {
//						if (�л��������[i] < �л��������[j]) {
//							//���� [��ü]
//							int temp = �л��������[j];
//							�л��������[j] = �л��������[i];
//							�л��������[i] = temp;
//						}
//					}
//				}
				// ���� ������ 
				// i = 0 		j = 1 		j = 1 2 3 
				// i = 1 		j = 2 		j = 2 3 
				// i = 2		j = 3		j = 3 
				// i = 3		j = 4		����x
				
				//1-2. Ŭ������ �̿��� ����		// Arrays Ŭ���� ���
//				Arrays.sort(�л��������);	// ��������, ���ϴ�
				//Arrays.sort(�л��������, Collections.reverseOrder()); 
				// ���� ������ // �⺻�ڷ���(int)�� �Ұ�, ��ü�� ����
				// Ŭ���� (intgeral)
				
				
				//2.���
				int sum = 0;
				for(int i =0; i<�л��������.length; i++) {
					System.out.println((i+1) + "�� ���� :" + �л��������[i]);
					sum += �л��������[i];
					
				}
				System.out.println("��� �л����� ���� ��� : " + sum/�л��������.length);
			}
			if ( ch==4 ) {
				System.out.println("���α׷� ����"); break;
			}
		}//while end
	}//main end
	
}//class end
