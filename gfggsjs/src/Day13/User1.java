package Day13;

public class User1 extends Thread{

	private Calculator calculator; //���� ��ü ����
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
