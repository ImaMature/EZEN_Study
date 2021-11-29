package Day13;

public class Day13_2 {
	
	public static void main(String[] args) {
		//스레드 우선순위
		//p.590
		
		//1. 10개의 멀티스레드 생성
		for(int i = 1; i<=10; i++) {
		
			//2. 멀티스레드 생성 [ 이름 부여 ]
			Thread thread = new CalcThread("스레드" + i);
			System.out.println(i+"번째 스레드 생성");
			//3. 우선순위 설정
			if(i!=10) {	//스레드 번호가 10이 아니면	// 1~9 까지 낮은 우선순위
				// 해당 스레드를 낮은 우선순위로 설정
				thread.setPriority(Thread.MIN_PRIORITY); 
			}else { //만약 스레드 번호가 10이면
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			//4.스레드 시작
			thread.start(); //start가 있어야 int = 0 반복문 가능
		}
		//p.592
		//스레드 메소드 동기화
			// 동기화는 : 여러 스레드가 동일한 메소드에 접근할 때 먼저 접근한 메소드부터 처리
			//			나머지는 대기
			// 동기화 안하면? 엉터리값을 이용하게 되어 의도와 다른 값이 나올 수 있음.
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
