package Day03;

import java.util.Scanner;

public class Day03_7 { //c s

	//p.127:
		// 1. ���ѷ����� �Է��� ��� �ޱ�
			// ���ѷ��� ����ϴ� ���
				//1) while(true)
				//2) while(boolean ����)
		// 2. ���� ����
	
	
	
	public static void main(String[] args) { //m s
		
		boolean run = true;	// boolean : true Ȥ�� false�� �����ϴ� �⺻ �ڷ���
		int keyCode = 0;	//�Է� ����
		int speed = 0;		//�ӵ� ����
		
		// ���ѷ��� [ ������ false �϶����� ��� �ݺ����� ]
		while( run ) { // while s		//������ true ����, false ����X
			
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("1.���� 2.���� 3.����");
				System.out.print("���� : ");		
				keyCode = scanner.nextInt(); // Ű����κ��� �Է¹ޱ�
				
				// 1 �Է½� [ speed ���� 1 ���� ]
				if( keyCode == 1) {	speed++; System.out.println("=== ����ӵ� :"+ speed); }
				
				// 2 �Է½� [ speed ���� 1 ���� ]
				if( keyCode == 2) {	speed--; System.out.println("=== ����ӵ� :"+ speed); }
				
				// 3 �Է½� ���ѷ��� ����
				if( keyCode == 3) { // if s
					run=false; System.out.println("=== [[ ���α׷� ���� ] ===");
			} // if e
		} // while e
	} // m e

} // c e
