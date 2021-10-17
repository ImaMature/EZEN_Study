package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_Board_Class {

	public static void main(String[] args) {
		// 1. ���� �ٸ� �ڷ����� �ϳ��� ����
		
		Board[] boards = new Board [100];	
		// ���� Board.javaŬ������ ���� Board �迭 Ŭ����
		Scanner scanner = new Scanner(System.in);
		
		// 2. ����ڰ� ���Ƿ� �ۼ��� Ŭ������ �迭 ����
		while(true) { // while start
			System.out.println("------------------------- [�Խ���] -----------------------------");
			System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", "����", "����", "�ۼ���", "�ۼ���", "��ȸ��" );
			//�迭�� ��� �ε��� ���
			
			for (int i = 0; i<boards.length; i++) { // for start
				if(boards[i] != null) { // �Խù� ��ü�� �����ϸ�
					System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", 
							i, boards[i].title, boards[i].writer, 
							boards[i].date, boards[i].count ); // �������
					}
				} // for end
				System.out.println("====================================================================");
				System.out.println("���� : 1. �۾��� 2. �� �� ������"); int ch = scanner.nextInt();
				
				if ( ch == 1) { // if 1 start
					System.out.println(" >>>>> �Խù� ���� >>>>>");
						scanner.nextLine(); // ���� ���� nextLine ���� ����
					System.out.print("���� : ");	String title = scanner.nextLine();
					System.out.print("���� : ");	String contents = scanner.nextLine();
					System.out.print("�ۼ��� : ");	String writer = scanner.nextLine();
					
					// ���� ��¥ ����غ���
					Date now = new Date (); // ��¥ ��ü
					
						//��¥ ���� Ŭ����
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String date = dateFormat.format(now);
					
					// ��ȸ��
					//String count = "1"; // ���⼭�� �ʿ� ����
					
					// ��� ������ �� ���� �迭�� ����
					for(int i=0; i<boards.length; i++) {// for2 start
						
						if( boards[i] == null) {
							
							Board board = new Board();// �ش� �ε����� ��ü�� ������
							board.title = title; 	board.contents = contents; //�Է¹��� contents�� board Ŭ������ contents�� ����(�޸𸮿� ����)
							board.writer = writer;	board.date = date; 		
							board.count = 1;
							
							boards[i] = board;
							break;
							
						}
					} // for2 end
				} // if 1 end
				
				if ( ch == 2) { //if 2 start
					System.out.println(" >>>>> �� �� ������ >>>>>");
					System.out.println(" >>> �Խù� ��ȣ ���� : "); int ch2 = scanner.nextInt();
						
						//�ش� �Խù��� ��ȸ�� 1 ����
					//int count = Integer.parseInt(boards[ch2][4]);	//[��ȸ��(String) -> int ��ȯ]
					//count++;	boards[ch2][4] = count+""; 	//=(boards[ch2][4] = Integer.toString(++count); (��ȸ�� ������ -> String ��ȯ)
					boards[ch2].count++;
					
					System.out.println("----------------------------- �Խù� �������� -------------------------------");
					System.out.println(" >>> ���� : " + boards[ch2].title);
					System.out.println(" >>> �ۼ��� : " + boards[ch2].writer + 
							"\t�ۼ��� : " + boards[ch2].date + "\t��ȸ�� : " + boards[ch2].count);
					System.out.println(" >>> ���� : " + boards[ch2].contents);
					System.out.println("--------------------------------------------------------------------------");			
						
				
			}// if2 end
		} // while end
	}

}
