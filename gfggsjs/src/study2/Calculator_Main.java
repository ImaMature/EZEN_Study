package study2;

public class Calculator_Main {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
		// ������ 10�� ����
		
			Thread thread = new Calc_Thread("������" + i);
			//Calc_ThreadŬ������ ������ �����ϴ� ���ΰ���?
			
			System.out.println(i+"��° ������ ����");
			//������ ������� i�� ��ŭ ���
			
			
		if(i!=10) { //i�� 10�� �ƴ϶��
			thread.setPriority(Thread.MIN_PRIORITY);
			//���� ���� ������ ����
			
		}else {
			thread.setPriority(Thread.MAX_PRIORITY);
			//10�̶�� ���� ���� ������ ����
		}
		thread.start();
		//������� ���� �����ϱ� ������ 
		//�ݵ�� .start()�� ȣ���ؾ� ����ȴ�.
		}
		
		Calculator calculator = new Calculator();
		User1 user1 = new User1(calculator);
		user1.start();//user1 ������ ȣ��
		
		User2 user2 = new User2(calculator);
		//user2 Ŭ������ �����ڿ� calculator�� �Ű������� ����
		//�̸��� user2�� �˴ϴ�.
		user2.start();
	}
}
