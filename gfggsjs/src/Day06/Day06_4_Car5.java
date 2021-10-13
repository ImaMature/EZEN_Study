package Day06;

public class Day06_4_Car5 {
	//p.235 //Day06_4
	
	// 기억할 거
	//클래스는 필드 생성자 메소드로 이루어짐
	
	//1.필드 [ 데이터 저장 ]
	String model;
	int speed;
	//2.생성자 [ 데이터 초기값 ] : 객체 선언시
	public Day06_4_Car5(String model) {
		// 외부로부터 들어온 데이터 [인수]를 내부 변수에 저장하기 위해서 this.를 사용하는것
		//model = model;	// [ 인수 == 내부 변수 ] : 충돌!! -> this 사용
		this.model = model;	// [ this.내부변수(필드) = 인수(외부에서 들어온)변수 혹은 매개변수 ]
//			필드		 매개변수
			// 인수는 내부변수와 이름을 <동일>하게 선언 
			//이유? 다른 사람이 봤을때 보기 편하게 하기 위하여 !!중요함!!
		
	}
	//3.메소드 [ 데이터 행동 ] : 객체가 생성되고 나서
	void setSpeed (int speed) { //2번처럼 위 내부 변수에 저장가능	//setSpeed 웹페이지 만들때 많이씀
		this.speed = speed;		
		// 다른 클래스에서 다른 클래스 필드로 다이렉트 접근은 보안문제 때문에 안하고
		// 일반적으로 생성자나 메소드로 필드에 우회접근하게 만듦
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i); //내부클래스에서는 메소드 바로 호출 가능
			System.out.println(this.model + "가 달립니다.(시속 : "+this.speed+"km/h)");
						// this.model이 아닌 model도 가능
		}
	}
}
