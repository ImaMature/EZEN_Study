package study2;

public class User1 extends Thread {
	private Calculator calculator;
	//클래스 자체를 객체화??

	public User1(Calculator calculator) {
		this.setName("user1");
		//이름을 정해주는 생성자?
		this.calculator = calculator;
	}//쓰레드 상속하면 setName메소드를 따로 안만들어도 되는 이유는 무엇인가요??ㅠㅠ

	@Override
	public void run() {
		calculator.setMemory(100);
		//Calculator클래스의 해당 메소드에 100을 인수로 전달합니다.
	}
	
}
