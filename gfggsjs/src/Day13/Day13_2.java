package Day13;

public class Day13_2 {
	
	public static void main(String[] args) {
		//������ �켱����
		//p.590
		
		//1. 10���� ��Ƽ������ ����
		for(int i = 1; i<10; i++) {
		
			//2. ��Ƽ������ ���� [ �̸� �ο� ]
			Thread thread = new CalcThread("������" + i);
			System.out.println(i+"��° ������ ����");
			//3. �켱���� ����
			if(i!=10) {	//������ ��ȣ�� 10�� �ƴϸ�	// 1~9 ���� ���� �켱����
				// �ش� �����带 ���� �켱������ ����
				thread.setPriority(Thread.MIN_PRIORITY); 
			}else { //���� ������ ��ȣ�� 10�̸�
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			//4.������ ����
			thread.start(); //start�� �־�� int = 0 �ݺ��� ����
		}
		//������ �޼ҵ� ����ȭ 
		
	}
}
