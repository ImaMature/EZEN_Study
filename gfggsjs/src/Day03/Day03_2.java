package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		// ����1 : 2���� ������ �Է¹޾� �� ū �� ���
		
		Scanner sf = new Scanner(System.in);
		/*System.out.println("<����1> ����1 �Է� : ");		int number1 = sf.nextInt();
		System.out.println("<����1> ����2 �Է� : ");		int number2 = sf.nextInt();
		
		if 		(number1>number2) 			System.out.println("�� ū���� : " + number1);
		else if (number1 < number2) 		System.out.println("�� ū���� : " + number2);
		else 								System.out.println("�� ���� ����.");
				
		// ����2 : 3���� ������ �Է¹޾� ���� ū �� ���
		
		System.out.println("<����2> ����1 �Է� : ");		int number3 = sf.nextInt();
		System.out.println("<����2> ����2 �Է� : ");		int number4 = sf.nextInt();
		System.out.println("<����2> ����3 �Է� : ");		int number5 = sf.nextInt();
		
		if 		(number3>number4 && number3>number5) 	{System.out.println("���� ū ���� : " + number3);}
		else if (number4>number3 && number4>number5) 	{System.out.println("���� ū ���� : " + number4);}
		else if	(number5>number3 && number5>number4)	{System.out.println("���� ū ���� : " + number5);} 
		else											 System.out.println("�� ������ ����.");
		*/
		
		
		// ����3 : 4���� ������ �Է¹޾� ���� ū �� ���
		/*
		System.out.println("<����3> ����1 �Է� : ");		int num1 = sf.nextInt();
		System.out.println("<����3> ����2 �Է� : ");		int num2 = sf.nextInt();
		System.out.println("<����3> ����3 �Է� : ");		int num3 = sf.nextInt();
		System.out.println("<����3> ����4 �Է� : ");		int num4 = sf.nextInt();
		
		/*if      (num1>num2 && num1>num3 & num1>num4) {System.out.println("���� ū ���� : " + num1);}
		else if (num2>num1 && num2>num3 & num2>num4) {System.out.println("���� ū ���� : " + num2);}
		else if (num3>num1 && num3>num2 & num3>num4) {System.out.println("���� ū ���� : " + num3);}
		else 										 {System.out.println("���� ū ���� : " + num4);}
		*/
		
		//�ٸ� ������ ���			// ���ҹ�� (�ӽú����� ����(Temp))�� ����� ����ϴ� ���
		/*
		int maxim = num1; 
		// maxim ������ ù���� �� �ֱ�
		
		if( maxim < num2 ) maxim = num2;
		if( maxim < num3 ) maxim = num3;
		if( maxim < num4 ) maxim = num4;
		System.out.println("���� ū ���� : " + maxim);
			
		// ����4 : 4���� ������ �Է¹޾� �������� ����
		
		System.out.println("<����4> ����1 �Է� : ");		int n1 = sf.nextInt();
		System.out.println("<����4> ����2 �Է� : ");		int n2 = sf.nextInt();
		System.out.println("<����4> ����3 �Է� : ");		int n3 = sf.nextInt();
		System.out.println("<����4> ����4 �Է� : ");		int n4 = sf.nextInt();
		
		int temp; // ��ȯ��(Swap) ���Ǵ� �ӽú���
		
		 // 1) 1��° ������ 2,3,4��° ������ �� = 3��
		if( n1 > n2 ) { temp = n1 ; n1 = n2; n2 = temp; }		
		if( n1 > n3 ) { temp = n1 ; n1 = n3; n3 = temp; }
		if( n1 > n4 ) { temp = n1 ; n1 = n4; n4 = temp; }
		
		 // 2) 2��° ������ 3,4��° ������ �� = 2��
		if( n2 > n3 ) { temp = n2 ; n2 = n3; n3 = temp; }
		if( n2 > n4 ) { temp = n2 ; n2 = n4; n4 = temp; }
		 // 3) 3���� ������ 4��° ������ �� = 1��
		if( n3 > n4 ) { temp = n3 ; n3 = n4; n4 = temp; }
		 // 4) 4���� ������ �񱳸� 3�� �޾ұ� ������ �� X
		
		System.out.printf("�������� : %d %d %d %d \n", n1, n2, n3, n4);
		 //printf ����ϸ� %d�� ���� ������� ����
		*/
		
//========================= ũ�� �ڷ� ���� �� => �������� =====================================
		
		// ����5 : 4���� ������ �Է¹޾� �������� ����		// ���������� �ε�ȣ�� �ݴ��
		/*
		 // 1) 1��° ������ 2,3,4��° ������ �� = 3��
		if( n1 < n2 ) { temp = n1 ; n1 = n2; n2 = temp; }
		if( n1 < n3 ) { temp = n1 ; n1 = n3; n3 = temp; }
		if( n1 < n4 ) { temp = n1 ; n1 = n4; n4 = temp; }
				
		 // 2) 2��° ������ 3,4��° ������ �� = 2��
		if( n2 < n3 ) { temp = n2 ; n2 = n3; n3 = temp; }
		if( n2 < n4 ) { temp = n2 ; n2 = n4; n4 = temp; }
		 // 3) 3���� ������ 4��° ������ �� = 1��
		if( n3 < n4 ) { temp = n3 ; n3 = n4; n4 = temp; }
		 // 4) 4���� ������ �񱳸� 3�� �޾ұ� ������ �� X
				
		System.out.printf("�������� : %d %d %d %d \n", n1, n2, n3, n4);
		*/	
				
				
		// ����6 : �α���������
			// �Է� : ���̵�� ��й�ȣ �Է¹ޱ�
			// ���� : ȸ�����̵� admin, ��� 1234�϶� �α��� ����, �ƴ� ���� ���
		
		System.out.println("================�α��� ������================");
		System.out.print("���̵� : "); 		String id = sf.next();
		System.out.print("��й�ȣ : "); 	int password = sf.nextInt();
		
		//if( id == "admin") //admin�� ��� �ȵ�
		if (id.equals("admin")) {
			// String �񱳽� equals �޼ҵ� ���		// id�� admin�̸�
			
			if (password == 1234) {	
				System.out.println(" >>>>>> �α��� ���� <<<<<<");
				// return; // ���� ����� �޼ҵ�(�Լ�) ����		// main �Լ� ����	 //	return�Լ��� ���߿� ���������� �˷���
			}else { 
				System.out.println("[�α��� ����] �н����尡 Ʋ�Ƚ��ϴ�.");
			}
			
		}	
		else { 
			System.out.println("[�α��� ����] �������� �ʴ� ���̵��Դϴ�.");
			
		}
		
		//p. 115 �ѹ� ������ �غ���
		
		
	}
}
