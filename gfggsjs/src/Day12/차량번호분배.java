package Day12;

import java.util.Random;
import java.util.Scanner;

// ������ȣ ���� ��������
public class ������ȣ�й� {
	public static void main(String[] args) {
		
	//1. ���ѷ�������ϱ�
		Random random = new Random();
		for(int i =0; i<10; i++) {
			int carNumber1 = random.nextInt(10)+1;
			int carNumber2 = random.nextInt(10);
			int carNumber3 = random.nextInt(10);
			int carNumber4 = random.nextInt(10);
			System.out.println("�������� : " + carNumber1*1000);
		}
		
	}
}
