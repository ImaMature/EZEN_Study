package CarTire;

public class Car {

	Tire frontLeftTire = new Tire (10, "앞왼쪽");
	Tire frontRightTire = new Tire(5, "앞오른쪽");
	Tire backLeftTire = new Tire(7, "뒤왼쪽");
	Tire backRightTire = new Tire(8, "뒤오른쪽");
	// Tire클래스의 생성자에 인수값을 넘겨준다.
	// 그럴려면 Tire 클래스에 해당 객체가 들어갈만한 생성자를 만들고 해야된다.
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			System.out.println("앞왼쪽타이어 펑크");
		}else if(frontRightTire.roll() == false) {
			System.out.println("앞오른쪽타이어 펑크");
		}else if(backLeftTire.roll() == false) {
			System.out.println("뒤왼쪽타이어 펑크");
		}else if(backRightTire.roll() == false) {
			System.out.println("뒤오른쪽타이어 펑크");
		}
		
		return 0;
	}

	private void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
