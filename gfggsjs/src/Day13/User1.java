package Day13;

public class User1 extends Thread{

	private Calculator calculator; //계산기 객체 생성
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
