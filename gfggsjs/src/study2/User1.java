package study2;

public class User1 extends Thread {
	private Calculator calculator;
	//Ŭ���� ��ü�� ��üȭ??

	public User1(Calculator calculator) {
		this.setName("user1");
		//�̸��� �����ִ� ������?
		this.calculator = calculator;
	}//������ ����ϸ� setName�޼ҵ带 ���� �ȸ��� �Ǵ� ������ �����ΰ���??�Ф�

	@Override
	public void run() {
		calculator.setMemory(100);
		//CalculatorŬ������ �ش� �޼ҵ忡 100�� �μ��� �����մϴ�.
	}
	
}
