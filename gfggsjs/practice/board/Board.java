<<<<<<< HEAD
package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
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
	
		Scanner scanner = new Scanner(System.in);
		String [][] array = new String [100][5]; 
		String viewCount = "1";
		//String index = "1";
		//int index = 1; 
		//String strIndex = Integer.toString(index); //�迭�� String Ÿ���̶� ������ int�� ���� �� ����.
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("\t\t   [�Խ���]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "����", "����", "�ۼ���","�ۼ���", "��ȸ��");
			
		
			
			for(int i=0; i<array.length; i++) {
				if(array[i][0]!=null) {
				System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i][0], array[i][2], array[i][3], array[i][4]);
				
				//System.out.printf("%s\t%s\t%s\t%s\t%s\n", array[i][0], array[i][1], array[i][2], array[i][3], array[i][4], array[i][5]);
				//index++;
				//������ �ø��� ����� i�� �߰��ϴ� �� �ۿ� ����
				//���� : i�� ������ 0���� ���� -> �ٸ� ��ü�� 1�� �����ؼ� ����ְ� 1�� �����ϰ� �����
				}
			}
			System.out.println("=======================================================");
			System.out.println("1. �۾��� | 2. �� �� ������");
			System.out.print("���� > : ");	int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("<<< �۾��� �޴� >>>");
				scanner.nextLine();
				System.out.print("���� : ");		String title = scanner.nextLine();
				System.out.print("���� : ");		String contents = scanner.nextLine();
				System.out.print("�ۼ��� : ");	String writer = scanner.nextLine();
				
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String writeDate = dateFormat.format(date);
				
				
				for(int i =0; i<array.length; i++) {
					if(array[i][0] == null) { 
						array[i][0] = title; array[i][1] = contents; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						
						//array[i][0] = strIndex; array[i][1] = title; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						//�迭�� ������ �־ Integer.toString(index)�� ��ȯ�ؼ� �迭�� ����־�������� �ȵ�. ������ 1�� ���� X
						// ��¿��� ������ i�� �����ؼ� i++�ϴ� ��� ���� ���� �迭�� �ѹ��� �־ ������Ű�� ����� ������..
						break;
					}
				}
				
			}
			
			if(ch == 2) {
				
				while(true) {
				System.out.println("<<< �� �� ������ �޴� >>>");
				System.out.println("1. �Խù� ���� | 2. �ڷΰ���"); 
				int ch2 = scanner.nextInt(); 
					if (ch2 == 1) {
						System.out.println("���� > : ");	int ch3 = scanner.nextInt();
						int count = Integer.parseInt(array[ch3][4]);
						count++;
						System.out.println("��ȸ�� ���� Ȯ�� : " + count);
						array[ch3][4] = Integer.toString(ch3);
						
						System.out.println(">> ���� : " + array[ch3][0]);
						System.out.println(">> �ۼ��� : " + array[ch3][2] + "\t>> �ۼ��� : " + array[ch3][3] + "\t>> ��ȸ�� : " + array[ch3][4]);
						System.out.println(">> ���� : " + array[ch3][1]);
					}
					else if (ch == 2) {
						break;
					}
					else {
						System.out.println("�߸��� �����Դϴ�."); 
						continue;
					}
					
				}
				
			}
			scanner.close();
		}//while end
	}//main end
}//class end
=======
package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
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
	
		Scanner scanner = new Scanner(System.in);
		String [][] array = new String [100][5]; 
		String viewCount = "1";
		//String index = "1";
		//int index = 1; 
		//String strIndex = Integer.toString(index); //�迭�� String Ÿ���̶� ������ int�� ���� �� ����.
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("\t\t   [�Խ���]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "����", "����", "�ۼ���","�ۼ���", "��ȸ��");
			
		
			
			for(int i=0; i<array.length; i++) {
				if(array[i][0]!=null) {
				System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i][0], array[i][2], array[i][3], array[i][4]);
				
				//System.out.printf("%s\t%s\t%s\t%s\t%s\n", array[i][0], array[i][1], array[i][2], array[i][3], array[i][4], array[i][5]);
				//index++;
				//������ �ø��� ����� i�� �߰��ϴ� �� �ۿ� ����
				//���� : i�� ������ 0���� ���� -> �ٸ� ��ü�� 1�� �����ؼ� ����ְ� 1�� �����ϰ� �����
				}
			}
			System.out.println("=======================================================");
			System.out.println("1. �۾��� | 2. �� �� ������");
			System.out.print("���� > : ");	int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("<<< �۾��� �޴� >>>");
				scanner.nextLine();
				System.out.print("���� : ");		String title = scanner.nextLine();
				System.out.print("���� : ");		String contents = scanner.nextLine();
				System.out.print("�ۼ��� : ");	String writer = scanner.nextLine();
				
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String writeDate = dateFormat.format(date);
				
				
				for(int i =0; i<array.length; i++) {
					if(array[i][0] == null) { 
						array[i][0] = title; array[i][1] = contents; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						
						//array[i][0] = strIndex; array[i][1] = title; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						//�迭�� ������ �־ Integer.toString(index)�� ��ȯ�ؼ� �迭�� ����־�������� �ȵ�. ������ 1�� ���� X
						// ��¿��� ������ i�� �����ؼ� i++�ϴ� ��� ���� ���� �迭�� �ѹ��� �־ ������Ű�� ����� ������..
						break;
					}
				}
				
			}
			
			if(ch == 2) {
				
				while(true) {
				System.out.println("<<< �� �� ������ �޴� >>>");
				System.out.println("1. �Խù� ���� | 2. �ڷΰ���"); 
				int ch2 = scanner.nextInt(); 
					if (ch2 == 1) {
						System.out.println("���� > : ");	int ch3 = scanner.nextInt();
						int count = Integer.parseInt(array[ch3][4]);
						count++;
						System.out.println("��ȸ�� ���� Ȯ�� : " + count);
						array[ch3][4] = Integer.toString(ch3);
						
						System.out.println(">> ���� : " + array[ch3][0]);
						System.out.println(">> �ۼ��� : " + array[ch3][2] + "\t>> �ۼ��� : " + array[ch3][3] + "\t>> ��ȸ�� : " + array[ch3][4]);
						System.out.println(">> ���� : " + array[ch3][1]);
					}
					else if (ch == 2) {
						break;
					}
					else {
						System.out.println("�߸��� �����Դϴ�."); 
						continue;
					}
					
				}
				
			}
			scanner.close();
		}//while end
	}//main end
}//class end
>>>>>>> branch 'master' of https://github.com/ImaMature/EZEN_Study
