package Day06;

public class Day06_3 {

	public static void main(String[] args) {
		//p.217		//Calculator.java
		
		//객체만들기	[생성자 정의 선언이 없을 경우 빈 생성자]
		Day06_3_Calculator calculator = new Day06_3_Calculator();
		
		
		//객체를 통한 메소드 호출
		calculator.powerOn();
		
		//객체를 통한 메소드 호출 [ 인수도 전달해서 리턴 값을 변수에 저장 ] // 인수 = 5와 6
		int result1 = calculator.plus(5, 6); //return result에서 도출된 값을 result1에 저장
		System.out.println("함수 결과물 : " + result1);
		
		byte x =10; byte y=4;//초기값 선언시
		double result2 = calculator.divide(x, y);
		System.out.println("함수 결과물 : " + result2);
		
		calculator.powerOff(); //전원을 끕니다.
		
		
		//p.223
		
		Day06_3_Car4 car4; // 객체
		car4 = new Day06_3_Car4(); // 인스턴스화
			//1. 객체내 필드에 값을 초기화할 수 있는 방법
				//1) 객체명.필드명 = 10
				//2) new 클래스명(10)
				//3) 객체명.set메소드(10)
		
		car4.setGas(5); //setGas 메소드 호출 [ 인수로 5 넣기 ] 1. 5넣기
		
		boolean gasState = car4.isLeftGas(); //9. return 값받아서 boolean gasState가 true이기 때문에 실행
		if(gasState) { //10. true
			System.out.println("출발"); //11. 출발 출력
			car4.run();//12. run 호출
		}
		
		if(car4.isLeftGas()) { // true이면 if값 false이면 else값
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요."); //19. false 반환값 받아서 else 출력
		}
	}
}
