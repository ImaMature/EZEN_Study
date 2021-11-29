package study2;

public class Calculator_Main {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
		// 스레드 10개 생성
		
			Thread thread = new Calc_Thread("스레드" + i);
			//Calc_Thread클래스의 생성자 실행하는 것인가요?
			
			System.out.println(i+"번째 스레드 생성");
			//순위에 관계없이 i번 만큼 출력
			
			
		if(i!=10) { //i가 10이 아니라면
			thread.setPriority(Thread.MIN_PRIORITY);
			//가장 낮은 순위로 설정
			
		}else {
			thread.setPriority(Thread.MAX_PRIORITY);
			//10이라면 가장 높은 순위로 설정
		}
		thread.start();
		//쓰레드는 선언만 가능하기 때문에 
		//반드시 .start()로 호출해야 실행된다.
		}
		
		Calculator calculator = new Calculator();
		User1 user1 = new User1(calculator);
		user1.start();//user1 쓰레드 호출
		
		User2 user2 = new User2(calculator);
		//user2 클래스의 생성자에 calculator를 매개변수로 전달
		//이름이 user2가 됩니다.
		user2.start();
	}
}
