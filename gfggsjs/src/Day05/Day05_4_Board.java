package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	/*	�迭�� ���� 
	 *   1. ���� �ٸ� �ڷ����� ������ �迭�� ������ �� ����
	    	���� �ٸ� �ڷ��� => �ϳ��� �ڷ��� ����� => Ŭ����
	   			�ڷ��� ����
	 *   2. �迭 ����� ���ÿ� �޸� �Ҵ� -> ���α׷� ����� �޸� ���� �Ұ�
	 *   Day05_Board_Class ����
	 */

public class Day05_4_Board { // �Ⱥ��� ¥�� �Խ��� �ۼ� ���� -> �迭,�ݺ��� ����
	
	// ����1 : �Խ��� ���α׷�
				// 0. ���� : 2���� �迭 ���	//�Խù� ��ȣ�� �ε��� �������
				// 1. �Խ��� [ ����(String), ����(String), �ۼ���(String), �ۼ���[Date], ��ȸ��(int) ]
				// 2. ���� �޴�
				 
				// 2-1. 
				/*	�ʱ�޴�
				 * 			[�Խ���]
				 * ����	����		�ۼ���	�ۼ���	��ȸ��
				 * 1	�ȳ�		������	10-05	3
				 * 2	�ȳ�2		������	10-05	3	 
				 * 3	�ȳ�3		��ȣ��	10-04	2
				 * ���� : 1. �۾���	2.�� �� ������		
				 */
			
			/*2-2. ���θ޴�
			 *  [�۾��� ���� ��]
			 * 1) ����, ���� �ۼ��� �ۼ���[Date] �Է¹޾� �迭�� ����
			 * 
			 * [�� �� ������ ��������]
			 * 
			 * 1) �� �������� �� �Խù� ��ȣ ���� ( �ε��� �������)
			 * 2) ������ �Խù��� �� ������ ���
			 * 
			 *2-3. �� ������ ���� 
			 *
			 * >> ���� : �ȳ�
			 * >> �ۼ��� : ������			�ۼ��� : 10-05	��ȸ�� : 3
			 * >> ���� : �ȳ��ϼ��� �ڹ��Դϴ�.
			 * 
			 * >>���� : 1. �ڷΰ���
			 */

	public static void main(String[] args) {
		//0. ����
		Scanner scann = new Scanner(System.in);
		String [][] boards = new String[100][5];	//�Խù� 100���� ������ �� �ִ� �迭 ���� [�Խù��� 5��]
	
		
		//1. ���ѷ���
		while(true) { // while start
			System.out.println("------------------------- [�Խ���] -----------------------------");
			System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", "����", "����", "�ۼ���", "�ۼ���", "��ȸ��" );
			//�迭�� ��� �ε��� ���
			
			for (int i = 0; i<boards.length; i++) { // for start
				if(boards[i][0] != null) {
					System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", 
							i, boards[i][0], boards[i][2], boards[i][3], boards[i][4] ); // �������
					}
				} // for end
				System.out.println("====================================================================");
				System.out.println("���� : 1. �۾��� 2. �� �� ������"); int ch = scann.nextInt();
				
				if ( ch == 1) { // if 1 start
					System.out.println(" >>>>> �Խù� ���� >>>>>");
						scann.nextLine(); // ���� ���� nextLine ���� ����
					System.out.print("���� : ");	String title = scann.nextLine();
					System.out.print("���� : ");	String contents = scann.nextLine();
					System.out.print("�ۼ��� : ");String writer = scann.nextLine();
					
					// ���� ��¥ ����غ���
					Date now = new Date (); // ��¥ ��ü
					
						//��¥ ���� Ŭ����
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String date = dateFormat.format(now);
					
					// ��ȸ��
					String count = "1";
					
					// ��� ������ �� ���� �迭�� ����
					for(int i=0; i<boards.length; i++) { // for2 start
						if(boards[i][0] == null) {
							boards[i][0] = title; boards[i][1] = contents; boards[i][2] = writer;
							boards[i][3] = date; boards[i][4] = count;	break;
					
							}
						} // for2 end
					} // if 1 end
				
				if ( ch == 2) { //if 2 start
					System.out.println(" >>>>> �� �� ������ >>>>>");
					System.out.println(" >>> �Խù� ��ȣ ���� : "); int ch2 = scann.nextInt();
						
						//�ش� �Խù��� ��ȸ�� 1 ����
					int count = Integer.parseInt(boards[ch2][4]);	//[��ȸ��(String) -> int ��ȯ]
					//count++;	boards[ch2][4] = count+""; 	
					boards[ch2][4] = Integer.toString(++count); //(��ȸ�� ������ -> String ��ȯ)
						
					System.out.println("----------------------------- �Խù� �������� -------------------------------");
					System.out.println(" >>> ���� : " + boards[ch2][0]);
					System.out.println(" >>> �ۼ��� : " + boards[ch2][2] + "\t�ۼ��� : " + boards[ch2][3] + "\t��ȸ�� : " + boards[ch2][4]);
					System.out.println(" >>> ���� : " + boards[ch2][1]);
					System.out.println("--------------------------------------------------------------------------");			
						
				
			}// if2 end
		} // while end
	} // main end
} // class end
