package Day09;

public class Car {
	//p.315 //tire클래스의 maxRotation생성자와 location 생성자 위치가 교재와 다르므로, 밑에 나와있는 필드의 입력값의 위치도 다름
	
	//필드 [ 변수, 배열, 객체 등 ]
	Tire frontLeftTire = new Tire ( 6, "앞왼쪽");
	Tire frontRightTire = new Tire ( 2, "앞오른쪽");
	Tire backLeftTire = new Tire ( 3, "뒤왼쪽");
	Tire backRightTire = new Tire ( 4, "뒤오른쪽");
	//생성자
	
	//메소드
	int run() {
	// 접근제한자 생략시 => 기본값 : default
		System.out.println("[자동차가 달립니다]");
		//roll이 false이면 최대 회전수가 작다는 것
		//true인 경우 if문을 나와서 return으로 갑니다.
		if(frontLeftTire.roll() == false) 	{stop(); return 1;} 
		if(frontRightTire.roll() == false) 	{stop(); return 2;} //Main 의 case2
		if(backLeftTire.roll() == false) 	{stop(); return 3;}
		if(backRightTire.roll() == false ) 	{stop(); return 4;}
		return 0;
	}

	private void stop() {
		System.out.println("[자동차가 멈춥니다]");
		
	}
}
