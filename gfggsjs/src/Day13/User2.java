package Day13;

public class User2 extends Thread{

	private Calculator calculator; //계산기 객체 생성
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50); // Caculator 
	}
}
