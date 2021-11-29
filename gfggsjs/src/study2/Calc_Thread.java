package study2;

public class Calc_Thread extends Thread{
			//스레드 상속
	public Calc_Thread(String name) {
		super.setName(name);
		//이름을 바꿔주는 생성자
		//super.메소드 : 부모 클래스내 메소드에 접근하기
	}
	
	@Override
	public void run() { //run을 하면 run이먼저 실행되는 것인가요? 아님 
		for(int i =0; i<200000000; i++) {}
			System.out.println("반복문 종료 : " + getName());
			//반복문 종료 + 이름 바꿔주기인 것 같습니다.
			//위 생성자에서 바뀐 이름을 가져오는 것 같습니다.
		
	}
	
}
