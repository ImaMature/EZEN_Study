package study_ing;

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
							//1�̶�� ������ ����? �޷��� 1�� ���� �����ϴϱ�?
														
							int firstday = calendar.get(Calendar.DAY_OF_WEEK); 
							//�Է¹��� ��(calendar��ü)�� ���� ������ �����ͼ� ��üȭ
							//DAY_OF_WEEK : Ư�� ������ �˱� ���� ���(1~7)
							//����) �Ͽ���: 1, ������ : 2, ȭ���� : 3...
							//�ش� ����, �ش� ���� ù���� ���� ���ϱ�
							
							
							int endday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
							//�Է¹��� ���� �ִ�(����) ���ϱ�.
							
							System.out.println( "\t\t"+year+"�� " + month  + "��" );
							System.out.println("=================================================");
							System.out.println("��\t��\tȭ\t��\t��\t��\t��");
							
							//ù���� ��ġ �տ� \t�ٿ��� ���� ���߱�
							for(int i = 1; i<firstday; i++){ //ù���� /t �����ʵ��� �ʰ��� ���� 
								System.out.print("\t");
							}		
							
							//������������ �ݺ��� ����
							//i�� 1���� �����ؾ� 1���� ����
							for(int i =1; i<=endday; i++) {
								System.out.print(i+"\t");
								//��¥�� ���̿� ������ �ֱ� ���� i�ڿ� \t�� ����
								
								//������ 7�� ������ �� 0 = �����(7) �̶�� �ڿ� �����߰�
								if(firstday % 7 == 0)   
								
									{System.out.println("\n");}
									firstday++;
									//firstday % 7==0 �� �ƴ϶�� firstday�� 1�� ����
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
