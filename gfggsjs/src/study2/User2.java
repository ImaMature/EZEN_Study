package study2;

public class User2 extends Thread{

	//�ʵ�
	private Calculator calculator;
	
	//������
	public User2(Calculator calculator) {
		this.setName("user2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
