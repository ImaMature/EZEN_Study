package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner (System.in);
	// ���ѷ��� => while �̿��� ���ѹݺ�
		// Ű���带 �̿��� ��������
		// ���ѷ��� ���� ��� : 1. ������ false 2.break
		
			while(true) {
//				System.out.println("���ѷ���");
//				int ���� = scanner.nextInt();
//				if(���� == 4) break;
			//}
		
	// ����[����] ����
		// 1. ���� Ŭ����		// Math Ŭ����
			// Random ��ü
				// .nextInt() : int�� ǥ���� �� ������ŭ ���� ����
				// .nextInt(����) : 0~���������� ����
				// .nextInt(10) + �ʱⰪ
		Random random =	new Random(); // ���� ��ü ���� Scanneró�� ���
			System.out.println(random.nextInt(10));
			// 0~9���� ���� ����, 10�� �ȳ���
			//System.out.println(random.nextInt(10) + 1); // 1~10���� ���� ����
			//System.out.println(random.nextInt(10) + 4); // 4~13���� ���� ����
		
//		System.out.println(random.nextInt());
//		System.out.println(random.nextDouble()); //�Ҽ����ڸ����� ����
//		System.out.println(random.nextBoolean()); //�� ����
			
			
			
			
			
			
			
			}
			
	}
}
