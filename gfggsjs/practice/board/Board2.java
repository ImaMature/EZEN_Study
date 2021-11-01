package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Board2 {
	// Ŭ������� Database Ŭ������ ���̺���
	public static void main(String[] args) {
		
		Database [] array = new Database[100];
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("==============================================================");
			System.out.println("\t\t  [�Խ���]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "����", "����", "�ۼ���", "�ۼ���", "��ȸ��");
			
				for(int i =0; i<array.length; i++) {
					if(array[i] != null) {
						System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i].getTitle(), array[i].getWriter(), array[i].date, array[i].viewCount);
					}
				}
			System.out.println("==============================================================");
			System.out.println("���� : 1. �۾��� | 2. �� �� ������");
			try{
				int ch = scanner.nextInt();
				System.out.println();
					if(ch == 1) {
						scanner.nextLine();
						System.out.println("------------------------[ �۾��� �޴� ]--------------------------");
						System.out.println("���� : ");		String title = scanner.nextLine();
						System.out.println("���� : ");		String contents = scanner.nextLine();
						System.out.println("�ۼ��� : ");		String writer = scanner.nextLine();
						
						Date date = new Date();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String strDate = dateFormat.format(date);
						int view = 0; // ��ȸ��

						Database data = new Database(title, contents, writer, strDate, view);
						
						//set�޼ҵ带 ���ٸ�?
						for(int i = 0; i< array.length; i++) {
							if(array[i] == null) {
								array[i] = data;
								break;
							}
						}
					}
					else if (ch == 2) {
						while(true) {
						System.out.println("------------------------[ �ۻ� ������ ]-------------------------");
						System.out.println("1. �Խù� ��ȣ ���� | 2. �ڷΰ���"); int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("�Խù� ��ȣ�� �������ּ���. > :"); int ch3 = scanner.nextInt();
								array[ch3].viewCount++;
								
								System.out.println("==============================================================");
								System.out.println(">>���� : " + array[ch3].getTitle());
								System.out.println(">>�ۼ��� : " + array[ch3].getWriter() + "\t�ۼ��� : " + array[ch3].date + "\t��ȸ�� : " + array[ch3].viewCount);
								System.out.println(">>���� : " + array[ch3].getContents()); // get�� ���� ���� private �ʵ� ��ü������
							}
							else if (ch2 == 2) {
								break;
							}else System.out.println(" �߸��� �����Դϴ�. �ٽ� �������ּ���.");
							
						}
					}else System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
					
			}catch (Exception e) {
				System.out.println("==============================================================");
				System.out.println("[�ý��� ���� �߻�] [�������� : " + e + " ]");
				
			}	
			
		}//while end
	}//main end
}//class end
