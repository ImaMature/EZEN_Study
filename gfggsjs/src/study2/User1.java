package study2;

public class User1 extends Thread {
	private Calculator calculator;
	//Ŭ���� ��üȭ

	public User1(Calculator calculator) {
		this.setName("user1");
		//�̸��� �����ִ� ������, Thread�� ��ӹ���.
		//�θ�Ŭ������ Thread
		this.calculator = calculator;
	}//������ ����ϸ� setName�޼ҵ带 ���� �ȸ��� �Ǵ� ������ user1�� �������� �Ű������� �ʿ��ϱ� ����

	@Override
	public void run() {
		calculator.setMemory(100);
		//CalculatorŬ������ �ش� �޼ҵ忡 100�� �μ��� �����մϴ�.
	}
	
}
