package Day04;

import java.util.Scanner;

public class Day04_3_Ű����ũ { // class start

	
	//console Ű����ũ [ ���Ǳ� ] ����
	
		// 1. �޴��� [ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ]
			// �޴��� �Ʒ��� ������ ��ǰ�� ��� [ ��ǰ ���� / �� ���� ���� �ݾ� ��� ]
		// 2. �ʱ� ��� [10����] �ȷ����� ��� ���� 	// ��� ������ ���� �Ұ�
		// 3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ���� �� �ܵ� ���
	
	public static void main(String[] args) { // main start
		
		
		boolean run = true;
		Scanner sc =  new Scanner(System.in);
		
		// ��� ���� [ �������� : ����� ��ȣ �ȿ����� ��� �����ϴ�.]
		// while �ȿ� ������ �����ϸ� ��� ���� ����
		
		
		// ��� ����
		int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� = 10; 
		
		
		// ��ٱ��� ����
		int �ݶ󱸸ż� = 0;		int ȯŸ���ż� = 0;		 int ���̴ٱ��ż� = 0;
		
		//1. ���ѷ���
		while(run) { // while start
			
			
			System.out.println("--------------------------- �޴� ----------------------------");
			System.out.println("------ [ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ] ------");
			System.out.print("[����] > "); int choice = sc.nextInt();
			System.out.println();
			
				
				// 1�� �ݶ� ����������
			if 	(choice == 1) {	
			// ��� ���� ��� ���� �Ұ�
				if ( �ݶ���� == 0) { System.out.println(" [[ �ݶ� ��� �����ϴ�. : ��ǰ �غ��� ]]");}
				else {
					System.out.println(" [[ �ݶ� ��ҽ��ϴ�. ]]");
					�ݶ󱸸ż�++;
					�ݶ����--;
			}
		}
			
			
				//2�� ȯŸ �������� ��
			if (choice == 2) {
				// ��� ���� ��� ���� �Ұ�
				if ( ȯŸ��� == 0) { System.out.println(" [[ ȯŸ ��� �����ϴ�. : ��ǰ �غ��� ]]");}
				else {
				System.out.println(" [[ ȯŸ�� ��ҽ��ϴ�. ]]");
				ȯŸ���ż�++;
				ȯŸ���--;
			}
		}
			
			if (choice == 3) {
				if ( ���̴���� == 0) { System.out.println(" [[ ���̴� ��� �����ϴ�. : ��ǰ �غ��� ]]");}
				else {
				System.out.println(" [[ ���̴ٸ� ��ҽ��ϴ�. ]]");
				���̴ٱ��ż�++;
				���̴����--;
			}
		}
			
			
			//////////////////////////////��ٱ��� ���////////////////////////////////////
			System.out.println("----------- ��ٱ��� -------------");			
			System.out.println("��ǰ��\t��ǰ����\t������");
			if ( �ݶ󱸸ż� > 0 )  { System.out.println( "�ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż� * 300);}
			if ( ȯŸ���ż� > 0 )  { System.out.println( "ȯŸ\t"+ȯŸ���ż�+"\t"+ȯŸ���ż� * 200);}
			if ( ���̴ٱ��ż� > 0 ) { System.out.println( "���̴�\t"+���̴ٱ��ż�+"\t"+���̴ٱ��ż� * 100);}
			System.out.println(">>>>>>> �Ѱ����� : " + ((�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100)));
			System.out.println("-------------------------------\n");	
			
			
			if (choice == 4) { //���� ��ư ���������� ���� ����
				// ��ǰ�� ������ ��Ÿ���� ����
				if( �ݶ󱸸ż� == 0 && ȯŸ���ż� == 0 && ���̴ٱ��ż� == 0) {	System.out.println("[�˸�] ������ ��ǰ�� �����ϴ�.");} 
				//������ ���� ����
				else {
					while(true) {
						System.out.print(">>>�����Ͻðڽ��ϱ� [y] [n] : "); String ch2 = sc.next();
						if(ch2.equals("y")) { 
								
							while(true ) {	
							System.out.print(">>> �ݾ� ���� :"); int money = sc.nextInt();
								int totalpay = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100);
								// �ݾ��� �ִ��� �������� ���� ����
								if (money < totalpay) { 
									System.out.println("[�˸�] �ݾ��� �����մϴ�.");
								}
								// �ݾ��� ������ ������ ���� ����
								else {
									System.out.println("[�����Ϸ�] �ܵ� : " + (money-totalpay));
									//��ٱ����ʱ�ȭ
									�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż�=0; break;								
								
								}
							}
							break;
							
						 // ���� �źο� ���� ����
						}else if (ch2.equals("n")) {
							//��ٱ��� �ʱ�ȭ
							�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż�=0;
							break;
						}else {
							System.out.println("[�˸�] : �� �� ���� �ൿ�Դϴ�.");
					  }
				   }
				}	
			} 
			
				
			
			
			
		} // while end

	} // main end
} // class end
