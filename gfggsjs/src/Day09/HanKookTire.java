package Day09;

public class HanKookTire extends Tire{
	
	// 필드
	// 생성자
	public HanKookTire(int maxRotation, String location) {
		super(maxRotation, location);
		//마우스 오른클릭-> source -> generate constructor from superclass
	}

	
	
	// 메소드
	// 오버라이딩 : 메소드 재정의 [ 메소드 내용 바꾸기 ] ctrl space bar -> roll -> enter
	@Override
	public boolean roll() {
		++accumulatedRotation;	//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {	//누적 회전수 < 최대 회전수
			System.out.println(location + "HankookTire 수명" + (maxRotation-accumulatedRotation) + "회"); //남은 회전 수 출력
			return true; // 수명이 남았다는 반환값
		}else { // 누적 회전수 > 최대 회전수
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false; // 수명이 다되었음을 표시하는 반환
		}
	}	
}
