package study_ing;

import java.util.ArrayList;
import java.util.Scanner;

public class ����ǥ {
	/*
	 * 1. �����ʹ� Ű����� �Է¹޾� �迭������
	 * 2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ���
	 * 3. ��ȣ, �̸�, ����, ����, ���� �Է�, ���� ��ձ��ؼ� ���
	 * 4. ����� �Ҽ��� ���� 2�ڸ�����
	 * 5. ������ �̿��� ������ ���ϱ�
	 * 6. �Է� ������ ���� ���ܹ߻� ��Ȳ�� ���� ó���ϱ�
	 */
	public static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
	ArrayList<Students> studentList = new ArrayList<>();

		while(true) {
			System.out.println("-------����ǥ ���α׷� �Դϴ�.-------");
			System.out.println("1. �Է��ϱ� 2. ���� ��� 3. ����"); int ch = scanner.nextInt();
			if(ch == 1 ) {
				
				boolean flag = true;
				for(int i =0; i<5; i++) {
				System.out.print("��ȣ �Է��ϱ� >"); int num = scanner.nextInt();
				System.out.print("�̸� �Է��ϱ� >"); String name = scanner.next();
				System.out.print("���� ���� �Է��ϱ� >"); int kor = scanner.nextInt();
				System.out.print("���� ���� �Է��ϱ� >"); int eng = scanner.nextInt();
				System.out.print("���� ���� �Է��ϱ� >"); int math = scanner.nextInt();
				Students stu = new Students(num, name, kor, eng, math);
				if(studentList.equals(null)) {
						for(Students c : studentList) {
							
						}
				}
			}
			if(ch==2) {
				System.out.println("[��������ϱ�]");
				if(!studentList.equals(null)) {
						for(int i = 0; i<5; i++) {
							System.out.println(studentList.get(i));
						}	
				}
				System.out.println();
			}
			}
		}//while end
	}//main end
}//class end
