package Day13;

public class User2 extends Thread{

	private Calculator calculator; //���� ��ü ����
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50); // Caculator 
	}
}
