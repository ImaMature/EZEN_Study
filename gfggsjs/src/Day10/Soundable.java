package Day10;

public interface Soundable {
	//p.386 3번 
	
	// 1. 상수 (=고정값) 필드 (학번, 군번, 주민번호 등등)
	
	// 2. 추상메소드 [ 선언만, 정의는 클래스에서 ]
	
	String sound();
		//디폴트 값이 자동적으로 들어가 있음
	
	// 3. 디폴트메소드 [ 선언O, 정의O]
	
	// 4. 정적메소드 [ 선언, 정의, 객체 없이 사용가능]
	
	
	// **메소드 선언방식
	// 접근 제한자	반환타입 메소드명(인수1, 인수2); {return}
}
