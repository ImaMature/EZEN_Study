package study_ing;

import java.util.Scanner;

public class CheckDay03 {

	public static void main(String[] args) {
	
		
		//����1 p.119 String switch
		
		//����2 [switch] ����, ����, ���� ������ �Է¹޾� ����� 90�� �̻��̸� "A���" 80�� �̻��̸� "B���" ������ "Ż��"
		
		//p.124 ��7) 2~15�� *9�ϴ� ������
	// �ܼ� : 2~15[����]			�� : 1~9[����]
	
/* ������3 : �Է¹��� �� ��ŭ ���
		
		*
		**
		***
		****
		*****
		
		*/ 
		
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		
		System.out.print("����� ���� ���� : ");	int x1 = scanner.nextInt(); //�� �� �ޱ�
		 for (int i = 1; i<=x1; i++) { //�� ����� ����
			 for (int j = 1; j<=i; j++) {System.out.print("*");} //�� ���
		 
		System.out.println(); //�ٹٲ�
	
		 }
	
		 /*System.out.print("����� ���� ���� : ");	int x2 = scanner.nextInt(); //�ټ� �ޱ�
		 for (int i = 1; i<=x2; i++) {
			 for (int j = 1; ; j++)
		 }*/
		 
		 //p. 134 3�� for���� �̿��� 1~100���� ������ 3�� ����� ����
		 int a =0;
		 for(int i = 0; i<=100; i++)
		 {if(i%3==0) a += i;}
		 System.out.println(a); //1683
		 
		 // 5��
		 for(int x = 1; x<=10; x++) { 
			 
			 for (int y = 1; y<=10; y++) {
			 if( (4*x) + (5*y) == 60) {
				 System.out.printf("\n(%d, %d)", x, y);
			}
		  }
			  
		}
		 
		 // 6��
		System.out.println("\n");
		 for(int i =1; i<=5; i++) {
			 for(int s=1; s<=i; s++) { System.out.print("*");
			 }
		 System.out.println(); 
		 }
	}		
	
}
