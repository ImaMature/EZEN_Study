package Day12;

import java.util.Random;

public class Day12_2 {

	public static void main(String[] args) {
		//p527. ����Ŭ����
			//Wrapper Ŭ���� : �⺻�ڷ��� -> ��üȭ
		
		//���ڿ� -> �⺻Ÿ��
			//1) Integer.parseInt("���ڿ�")
			//2) Double.parseDouble("���ڿ�")
			//3) Boolean.parseBoolean("���ڿ�")
			// * Byte.parseInt(), Short.parseInt(), Long.parseInt(), Float.parseInt()
		
		//�⺻Ÿ�� -> ���ڿ�
			// String.valueOf(�⺻�ڷ���)
		
		//����Ʈ�迭 -> ���ڿ� 
			// new ������ (����Ʈ�迭) ���̾��ϴ�!
		
		
		//p.531 
		int value1 = Integer.parseInt("10"); //"10" (���ڿ� 10) - > 10 (���� 10) ���� ��ȯ
		double value2 = Double.parseDouble("3.14"); //"3.14" (���ڿ� 3.14) - > 3.14 (�Ǽ� 3.14) ���� ��ȯ
		boolean value3 = Boolean.parseBoolean("true"); //"true" (���ڿ� true) - > true
		
		//p.531 math Ŭ���� -> ���� ���� �޼ҵ� ����
			//1. ���밪 : Mat.abs()
		System.out.println("���밪 : " + Math.abs(-5)); //5
		System.out.println("���밪 : " + Math.abs(-3.14)); //3.14
		
			//2. �ø� : Math.cell()
		System.out.println("�ø��� : " + Math.ceil(5.3)); //6.0
		System.out.println("�ø��� : " + Math.ceil(-5.3)); //-5.0 �����ϱ�
		
			//3. ���� : Math.floor()
		System.out.println("������ : " + Math.floor(5.3)); //5
		System.out.println("������ : " + Math.floor(-5.3)); //-6.0
		
			//4. �ִ� : Math.max()
		System.out.println("�ִ� : " + Math.max(5, 9)); //9
		System.out.println("�ִ� : " + Math.max(5.3, 2.5)); //5.3
		
			//5. �ּҰ� : Math.min()
		System.out.println("�ּҰ� : " + Math.min(5, 9)); //5
		System.out.println("�ּҰ� : " + Math.min(5.3, 2.5)); //2.5
		
			//6. ������ Math.random() : 0~1������ ����
		System.out.println("���� : " + Math.random());
			
			//7. ����� ������ �Ǽ� �� Math.round
		System.out.println("����� ������ �Ǽ� �� : " + Math.rint(5.3)); //5.0
		System.out.println("����� ������ �Ǽ� �� : " + Math.rint(5.7)); //6.0
		
			//8. �ݿø� Math.round
		System.out.println("�ݿø�: " + Math.round(5.3)); //5
		System.out.println("�ݿø� : " + Math.round(5.7)); //6
		
			//** �Ҽ��� ��° �ڸ����� �ݿø� [�ڸ����� �ø��� �ݿø� �ڸ��� ����]
		double value = 12.3456;
		double rvalue = (Math.round(value*100))/100.0;
							//������ �켱����
							//1. value*100
							//2.Math.round(1)
							//3.(2)/100.0;
							//4.����
		System.out.println("�Ҽ��� ��°�ڸ� �ݿø� : " + rvalue);
		
		//p.536 : �ֻ���
			int num = (int)Math.random(); // 0 ~ 1 (1������)\
			System.out.println(num);
			int num2 =(int) (Math.random()*6); //0*6 ~ 1*6
			System.out.println(num2);
			int num3 =(int) (Math.random()*6)+1; // 0*6+1 ~ 1*6+1 : 1~7
			System.out.println(num3);
			
		//p.537 : Random Ŭ����
			Random random = new Random(); // Random Ŭ������ static Ŭ������ �������� �ʾƼ� ��ü�� ����
			int number = random.nextInt();	// int�� ǥ���� �� �ִ� ������ŭ ����(0 ~ 20��)
			int number2 = random.nextInt(6)+1; // 1 ~ 6(�ε���)
			System.out.println("number2 : "+number2);
	}
}
