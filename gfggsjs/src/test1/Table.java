package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import test.Students2;

public class Table {

	public static void main(String[] args) {
	ArrayList<Students> array = new ArrayList<>();
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. ���� ��� | 2. ����ǥ ��� | 3. ���α׷� ����.");
				System.out.print("���� > : "); int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("-----------------------[������ �Է����ּ���.]-----------------------");
					System.out.print("�̸� : ");	String name = scanner.next();
					System.out.print("���� : ");	int kor = scanner.nextInt();
					System.out.print("���� : ");	int eng = scanner.nextInt();
					System.out.print("���� : ");	int math = scanner.nextInt();
				
					int sum = ( kor + eng + math );
					double avg = sum/3;
					Students students = new Students(name, kor, eng, math, sum, avg);
					array.add(students);
					
				}else if (ch == 2) {
					System.out.println("--------------------------------------------------------------");
					System.out.println("\t\t\t��      ��      ǥ");
					System.out.println("--------------------------------------------------------------");
					System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
					System.out.println("--------------------------------------------------------------");
					int i = 1;
					Collections.sort(array);
					
					for(Students z : array) {
						System.out.printf(i + "\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d", z.getName(), z.getKor(), z.getEng(), z.getMath(), z.getSum(), z.getAvg(), i);
						System.out.println(); i++;}
						
					System.out.println("--------------------------------------------------------------");
					
				}else if (ch == 3) {System.out.println("���α׷��� �����մϴ�."); break;
					
				}else { System.out.println("�߸��� �Է��Դϴ�.");}
				
			}catch(Exception e) {
				System.out.println("[�ý��� ����] �����ڿ��� �����ϼ���. [" + e + "]");
			}
		}
	}

}
