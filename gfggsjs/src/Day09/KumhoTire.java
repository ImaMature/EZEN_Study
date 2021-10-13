package Day09;

public class KumhoTire extends Tire{

	
	
	//필드
	
	//생성자
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	@Override
	public boolean roll() {
			++accumulatedRotation;	//누적 회전수 1증가
			if(accumulatedRotation<maxRotation) {	//누적 회전수 < 최대 회전수
				System.out.println(location + "KumhoTire 수명" + (maxRotation-accumulatedRotation) + "회"); //남은 회전 수 출력
				return true; // 수명이 남았다는 반환값
			}else { // 누적 회전수 > 최대 회전수
				System.out.println("*** " + location + " KumhoTire 펑크 ***");
				return false; // 수명이 다되었음을 표시하는 반환
			
		}	
	}
}
