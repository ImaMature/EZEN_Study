package study_ing.calender;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {

	public static void main(String[] args) {
      
	    
		while(true) {
			try {
				Scanner sc2 = new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);		//�Է¹ޱ⸦ ���� Scanner Ŭ���� ����
				System.out.print("�����ϴ� ������ �Է����ּ���. : ");		int year = sc2.nextInt(); //������ �Է¹޴� ��ü ����
				
				while(true) {	//while���� �߰��ؼ� �Է¹޴� ���� 1�̸� 13�̻��� �� �ٽ� ���� �Է¹޵��� ��.
					
					System.out.print("�����ϴ� ���� �Է����ּ��� : ");			int month = sc2.nextInt(); // ���� �Է¹޴� ��ü ����
						if(month>12 || month<1) {	
							//�������� ��(1�� ~ 12��)�� �ƴ϶��
							System.out.println("�߸��� �Է��Դϴ�. ���� �Է��Ͻ� �� 1���� 12 ������ ���ڸ� �Է����ּ���."); 
							// �ٽ� �Է¹޵���
							
						}else { // �������� �޷��� �� �������
						//Calendar calendar = new Calendar(); //new ������ ���� �Ұ�
						
							Calendar calendar = Calendar.getInstance();	
							//Calendar Ŭ������ getInstance�� ��ü �����ؾ��Ѵ�
							
							calendar.set(year, month-1, 1); 
							//calendar��ü�� �Է¹��� ����, �Է¹��� ��, ��¥ �����ϱ� 
							//���� -1�� ������� 0���� ������ ����
														
							int weekday = calendar.get(Calendar.DAY_OF_WEEK); 
							//�Է¹��� ��(calendar��ü)�� ���� ������ �����ͼ� ��üȭ
							//�ε��� ���� ���´�. ex) �Ͽ���: 1, ������ : 2, ȭ���� : 3...
							
							int endday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
							//�Է¹��� ���� �ִ� ���ϱ�.
							
							System.out.println( "\t\t"+year+"�� " + month  + "��" );
							System.out.println("=================================================");
							System.out.println("��\t��\tȭ\t��\t��\t��\t��");
							
							for(int i = 0; i<weekday; i++){
							
								System.out.print(" \t");
							}		
							
							for(int i =0; i<=endday; i++) {
								System.out.print(i+"\t");
								if(weekday % 7 == 0) {
									System.out.println();
									weekday++;
								}
							}
							
							break;
						}
				}//while2 end
				break;// �ݺ��� Ż��
	
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}//try-catch end
		}//while end
	}//main end
}//class end
