package Day06;

public class Day06_3_Calculator {

	//p.217 //Day06_3
	// 객체를 통한 메소드 호출하기
	//필드
	
	//생성자
	
	//[메소드]
	// 인수X 반환(return)X [void]
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 인수O [int, int] 반환O [int]
	int plus(int x, int y) { //5와 6을 받음
		int result = x+y; //11을 result에 저장
		return result;	
		//그 값을 result에 저장, 어디로 돌려주는게 아니라 11의 값을 도출했다는 뜻
		//주의할점!! return문 뒤에 실행문(system.out.print~~)이오면 안된다.
	}
	//int 인 메소드에서  byte, short, int타입의 값이 리턴되도 괜찮음.
	// byte short는 int로 자동 형변환되어 리턴되기 때문.
	
	//인수 O [byte, byte] 반환 O [double]
	double divide( int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	//인수X 반환X[void]
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
