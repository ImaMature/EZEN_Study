package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReportCard {
	/*
	 * 1. �����ʹ� Ű����� �Է¹޾� �迭������
	 * 2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ���
	 * 3. ��ȣ, �̸�, ����, ����, ���� �Է�, ���� ��ձ��ؼ� ���
	 * 4. ����� �Ҽ��� ���� 2�ڸ�����
	 * 5. ������ �̿��� ������ ���ϱ�
	 * 6. �Է� ������ ���� ���ܹ߻� ��Ȳ�� ���� ó���ϱ�
	 */
	
	public static void main(String[] args) {
	ArrayList<Students> array = new ArrayList<>();
		
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. ��� | 2. ���"); int ch = scanner.nextInt();
				if(ch==1) {
					
					System.out.println("���ȭ���Դϴ�. ������ �Է��� �ּ���.");
					System.out.print("�̸� : "); String name = scanner.next();
					System.out.print("���� : "); int kor_Grade = scanner.nextInt();
					System.out.print("���� : "); int eng_Grade = scanner.nextInt();
					System.out.print("���� : "); int math_Grade = scanner.nextInt();
	
					int sum = (kor_Grade+eng_Grade+math_Grade);
					double average = sum/3;
					Students a = new Students(name, kor_Grade, eng_Grade, math_Grade, sum, average);
					
					array.add(a);				
		
					System.out.println(a);
	
				}else if (ch==2) {
					System.out.println("��� ȭ���Դϴ�.");
					System.out.println("----------------------------------------------------");
					System.out.println("\t\t  ��    ��    ǥ");
					System.out.println("----------------------------1------------------------");
					System.out.println("��ȣ\t�̸�\t����\t����\t1����\t����\t���\t����");
					System.out.println("----------------------------------------------------");
					int i = 1;
					Collections.sort(array);
						for(Students c : array) {
							System.out.printf(i+"\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d", c.getName(), c.getKor(),
									c.getEng(),c.getMath(),c.getSum(),c.getAverage(),i);
							System.out.println(); i++;
						}
					System.out.println("----------------------------------------------------");
					}
			}catch(Exception e) {System.out.println("�߸��� �Է��Դϴ�. ���������� ���� ��������.");}
		}//while end
	}//main end
}//class end
