package Day03;

import java.util.Scanner;

public class Day03_3 {

	//p.116 switch ����ġ 
	// switch�� if�� ������ 
		/*
		  ***switch�� if�� ó�� ���ǽ��� true�� ��쿡 ��� ������ ���๮�� �����ϴ� ���� �ƴ϶�, ������ ���� ���� ���๮�� ���õ�
		 
		 	if = �� ���� / switch = ������ ����
		 	����� ���� ������ �ִ� ��� 		=> 		switch�� �ӵ� �� ����
		 	����� ���� ������ ���� ���� ��� 	=> 		<if>
		 */
	/* switch�� ���� : switch ( key:�˻��� ) {
					 case �˻� : ���๮;
					 case �˻� : ���๮; 
					 case �˻� : ���๮; 
					 default : ���๮;
					 }
	*/
		// break : switch Ȥ�� �ݺ����� Ż��� ���Ǵ� Ű���� { ���� ����� �߰�ȣ Ż�� }
		// �ݺ����� ������ ������ break�� ������ ��ߵ�
		// switch�� String Ÿ�Ե� �� �� �ִ�. (���� p. 119)
		// char Ÿ�Ե� ���� (p.118)
	
	public static void main(String[] args) {

		//����1)
		int ���� = 80;
		switch( ���� ) { //������ �˻�!!!!
			//������ 90�̸�
		case 90 : System.out.println("A��� �Դϴ�.");					break;
			//������ 80�̸�
		case 80 : System.out.println("B��� �Դϴ�."); 					break;
		// ����ġ�� if ó�� ������ �ȳ��� 
		// [�� ����� ������ �����Ǹ� �˻�� case������ �� �Ʒ����� �� ������]
		
			//������ 70�̸�
		case 70 : System.out.println("C��� �Դϴ�.");					break;
			//�׿�
		default : System.out.println("Ż�� �Դϴ�.");
				
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

			
			
			
			
		//����2)	���������� �̵�
			int ��ư = 3;
			switch( ��ư ) {//switch start
				case 1 : 	System.out.println("1������ �̵� "); break;
				case 2 :	System.out.println("2������ �̵� "); break;
				case 3 : 	System.out.println("3������ �̵� "); break;
				default : 	System.out.println("����");
			}//switch end
			
			
		// p.118 char switch ��
		char grade = 'B';
		switch( grade ) {	//switch start	// ��ҹ��� ������� �Ȱ��� ���ĺ��̶�� �����ϰ� ó���ϱ� 	// char�̶� ��������ǥ ����
			case 'A' :
			case 'a' :	
				System.out.println("��� ȸ�� �Դϴ�.");	break;
			case 'B' :
			case 'b' :
				System.out.println("�Ϲ� ȸ�� �Դϴ�.");	break;
			default :
				System.out.println("�մ� �Դϴ�.");
		} //switch end
		
		// p.119 String switch
		String position = "����";	
		switch(position)	{ //switch start
				case "����" : System.out.println("700����"); break;
				case "����" : System.out.println("500����"); break;
				default : System.out.println("300����");
		} // switch end
		
		//����1 [switch] ����, ����, ���� ������ �Է¹޾� ����� 90�� �̻��̸� "A���" 80�� �̻��̸� "B���" ������ "Ż��"
		
		Scanner xx = new Scanner(System.in);
		System.out.print("���� ������ �Է��� �ּ��� : "); int score1 = xx.nextInt();
		System.out.print("���� ������ �Է��� �ּ��� : "); int score2 = xx.nextInt();
		System.out.print("���� ������ �Է��� �ּ��� : "); int score3 = xx.nextInt();
		
		int theAverage = (score1 + score2 + score3)/3;
				
		switch (theAverage/10) { //switch start
				// 1�� �ڸ��� ����
		
			case 10 :
			case 9 : System.out.println("A���");		break;
			case 8 : System.out.println("B���");		break;
			default : System.out.println("Ż��");
		 
		
		
		
		
		} //switch end
	} // m e
} // c e
