//���(���ǹ�, �ݺ���)

package Day03;

public class Day03_1 { // c s

	
		
		
		//��� : if(�� ����), switch(������ ����) // ����ϴ� �ڵ忡 ���� �뵵�� �ٸ�
	
		//��ǻ�ʹ� ��� ����Ѵ�. �̷� ��ǻ�͸� �� �� �ȶ��ϰ� ������ִ� ��ɾ �ٷ� ���
	
		//���� [ ����� ���� ���� �ڵ� ó�� ]
			// ����) �л����� 1000�� �ְ� �ݶ� �ɺθ�
				// 1) ���� ����� ������ => �ݶ� X => false
				// 2) ���� ����� ������ => �ݶ� ���� ��δٸ�? => false
				// 3) ���� ����� ������ => �ݶ� ���� => true
						// if (A ������ == �ݶ� && �ݶ󰡰� <= 1000 )	{ ���� }
						// else if (B ������ == �ݶ� && �ݶ󰡰� <= 1000 ) { ���� }
						// else if (C ������ == �ݶ� && �ݶ󰡰� <= 1000 ) { ���� }
						// else { ���� }
	
			// ����2) ���������� ��ư [ if(���࿡ ��� ��ư�� �����ٸ�) ]
		
		
		//p108. if��
		// if�� true, false�� ���� ����		// �񱳿����ڳ� ���迬����		// ��ǻ�Ͱ� � �Ǵ��� �� �� ����� ���� ó���ϴ� ��ɹ�
		// ���๮ 2�� �̻��� ���� �߰�ȣ{} ���
	
			// ����1 : if(��) true ���๮
					//���⼭ �� : true�� false
			// ����2 : if(��) true ���๮
			// 		  else false ���๮
			
			// ����3 : if(��) {���๮; ���๮;}	
	
			// ����4 :	if ( �� ) {		}
			//			else if ( ��2 )	 {		}
			//			else if ( ��3 )	 {		}
			//			else if ( ��4 )	 {		}
			// 			else { �� }
	
	
		public static void main(String[] args) { // m s
			
			
			//����1) true �̸� ���๮ ����
				if( 3 > 1 )  System.out.println("3�� 1���� ũ��."); // true
				// if ���� �ϳ��� ��(�ڵ尡 �� ���� ��)�� if���ǹ� �������� �����ݷ�(;)�� �־ ������, 
				// ���� ���ǽ��� ���� �����ݷ��� ������ ���� ������ �ȵ�
			
			//����2) false�̸� ���๮ ���� X
				if( 3 > 5 )  System.out.println("3�� 1���� ũ��."); // false ��� �ȵ�
		
			//����3) true false �̸� ���๮ ����
				if( 3 > 5 )  System.out.println("3�� 1���� ũ��."); // false
				else System.out.println("��3) 3�� 5���� �۴�"); // ���
		
			//����4) { }�� ���Ǵ� ��� => ���๮ 2�� �̻��� ��
				if( 3 > 2 )  { // if start
					System.out.println("true�̸� ����Ǵ� �ڸ�"); // false
					System.out.println("��3) 3�� 2���� ũ��"); // ���
				} // if end
				else { // if start
					System.out.println("false�̸� ����Ǵ� �ڸ�");
					System.out.println("3�� 2���� �۴�");
				} // if end
				
			//����5) �پ��� ����� ���� ���� ����
				if( 3 > 5 )  System.out.println("3�� 5���� ũ��."); // false 	// �ϳ��� true���� ����Ҷ� else if ���
				else if( 3 > 4 )System.out.println("��5)3�� 4���� ũ��"); // false
				else if( 3 > 3 )System.out.println("��5)3�� 3���� ũ��"); // false
				else if( 3 > 2 )System.out.println("��5)3�� 2���� ũ��"); // true ���
				else System.out.println("true�� ����");
		
			//����5_2)
				if( 3 > 5 )  System.out.println("3�� 5���� ũ��."); // false 	// �پ��� ����� ���� ������ �������� if if if if
				if( 3 > 4 )System.out.println("��5)3�� 4���� ũ��"); // false
				if( 3 > 3 )System.out.println("��5)3�� 3���� ũ��"); // false
				if( 3 > 2 )System.out.println("��5_2)3�� 2���� ũ��"); // true ���
				else System.out.println("true�� ����");
		
		
		
		// p.109 ~ 112, 115 �׸� üũ
		// p.109 ����
			int score = 93;
			// ������ 90���� ũ�� ������ ����
			if( score >= 90 ) { System.out.println("������ 90���� Ů�ϴ�."); System.out.println("����� A �Դϴ�."); }
			// ������ 90�̸��� �ƴϱ� ������ ���� X
			if( score < 90 ) { System.out.println("������ 90���� �۽��ϴ�."); System.out.println("����� B �Դϴ�."); }	
			
		// p.111 ����  �� ������ ���� �������� �� �ٸ��� = ȿ���� �� ����
			int score2 = 85;
			if( score2 >= 90 ) { System.out.println("������ 90���� Ů�ϴ�."); System.out.println("����� A �Դϴ�."); }
			else { System.out.println("������ 90���� �۽��ϴ�."); System.out.println("����� B �Դϴ�."); }
			
		// p.112 ���� 
			int score3 = 75;
			if( score3 >= 90 ) 		{ System.out.println("������ 100~90 �Դϴ�."); System.out.println("����� A �Դϴ�."); }
			else if( score3 >=80 )  { System.out.println("������ 80~89 �Դϴ�.");  System.out.println("����� B �Դϴ�."); }
			else if( score3 >=70 )  { System.out.println("������ 70~79 �Դϴ�.");  System.out.println("����� C �Դϴ�."); }
			else 					{ System.out.println("������ 70 �̸� �Դϴ�.");  System.out.println("����� D �Դϴ�."); }
		
		
		
		
	} // m e

} // c e
