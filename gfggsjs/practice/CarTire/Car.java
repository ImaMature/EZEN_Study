package CarTire;

public class Car {

	Tire frontLeftTire = new Tire ("앞왼쪽", 6);
	Tire frontRightTire = new Tire ("앞오른쪽", 2);
	Tire BackLeftTire = new Tire ("뒤왼쪽", 3);
	Tire BackRightTire = new Tire ("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(BackLeftTire.roll()==false) {stop(); return 3;}
		if(BackRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}

	private void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
