package Day12;

import java.util.Calendar;
import java.util.Scanner;

public class Day12_5_�޷� {

	//�޷� �����
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println("������ ���� �Է��� �ּ���.");
		System.out.println("���� : "); int year = sc.nextInt(); 
		System.out.println("�� : "); int month = sc.nextInt(); 
		
		//�޼ҵ� ȣ��
		�޷º��� (year, month);
	}
		//�޼ҵ� ���� : ���������� Ű���� ��ȯŸ�� �޼ҵ�� (�μ�1, �μ�2 ~~~){}
		public static void �޷º��� (int year, int month) {
			//1. Ķ���� ��ü => new ��� X, Ŭ�������� �̹� ��ü�� �־ �̰� ȣ��
			//Ŭ������ ��ü�� ���� �� new ����ؼ� ��ü ����
			Calendar calendar = Calendar.getInstance();
			
			//2. ����, ��, ��
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1; // 0:1�� ~11 : 12�� �׳�����ϸ� �����-1�� ����
			//int day = calendar.get(Calendar.DAY_OF_MONTH);
				
				// ����� ���� Ķ����
				calendar.set(year, month-1, 1); //�Է¹��� ����, �Է¹��� ��-1, �Է¹��� ��¥
				//�ش� ���� 1�� ���� ã��
				int sweek = calendar.get(Calendar.DAY_OF_WEEK); // �������(��), 6
				//�ش� ���� ������ �� ã�� [.getActualMaximum(�ʵ�) -> �ش� �ʵ��� �ִ� ���ϱ� ]
				int endDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); //�ش� ���� �ִ�
				
			//3. �޷�
			System.out.println(" ****************** " +year+"�� "+month+"�� ******************");
			System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");
							//1:�Ͽ��� 2:������ 3:ȭ���� 4:������ 5:����� 6:�ݿ��� 7:����� �̰� �׳� �ܿ�� Day_of_Month Day_of_week�� ������ ����
			
			//4. ���� �� 1���� ��ġ �տ� ���� ä���
			for (int i = 1; i<sweek; i++) { //�������(��)�� ������ ������ �ȵǴϱ� <=���� �ȵ�
				System.out.print(" \t");
			}
			
			//5. 1�Ϻ��� ������ ������ ���
			for (int i = 1; i<=endDay; i++) {
				System.out.print(i+"\t");
				if(sweek % 7 == 0) 
					//������ ����ϸ��� �ٹٲ� [sweek�� 7�� ��� ����]
					System.out.println();
					sweek++; //���� ����
			
		}
		
			
		//+ ���� �ָ��� �غ����� �غ��� �ƴ� ����
			// ���� : �޷� ���� ���
			// ���۳�¥�� ����¥�� �Է¹޾� �޷� ����ϱ�
			
			/*���� ����/�� �Է¹ޱ�
			 * �� ����/�� �Է¹ޱ�
			 * 		//���� ��¥���� ����¥������ ��� �޷� ���
			 * 		// 2021 08 ~ 2022 10
			 */
		
	}
}
