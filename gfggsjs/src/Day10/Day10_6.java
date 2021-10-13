package Day10;

public class Day10_6 {

	//p.417 확인문제
		// 1. 답) 4 [정적 멤버 클래스 내부에는 바깥 클래스의 정적 변수만 사용가능]
			//정적 static [ static 멤버 기리만 접근 가능 ]
	
		// 2. 답) 3 [로컬 클래스는 static(정적) 사용 불가, 메소드 안에 있기 때문에 불가]
			// 로컬 클래스 : 메소드 안에서 설계된 클래스
			// 인스턴스 클래스 && 로컬 클래스는 바깥 클래스의 멤버 사용 가능, static은 안됨
			// final 특성을 가진 매개 변수나 로컬 변수만 로컬 클래스 내부에서 사용할 수 있음
	
		// 3. 답 3) [익명 객체는 일회성이라서 생성자 선언할 수 없다. 하나의 객체 생성 때문에]
			// 익명 객체는 일회성
		
		// 4. 
			// static 있으면 정적 없으면 인스턴스
			// Tire : 인스턴스 클래스		Car.Tire tire = myCar.new Tire(); 객체를 통한 인스턴스 생성
			// Engine : 정적 클래스			Car.Engine engine = new Car.Engine();
	
		//5.
	public static void main(String[] args) {
		Anonymous2 anonymous2 = new Anonymous2();
		anonymous2.field.run();
		anonymous2.method1();
		anonymous2.method2(new Vehicle(){
			public void run() {
				System.out.println();
				}
			}
		);
	}
	
		//6. Chatting 클래스
}
