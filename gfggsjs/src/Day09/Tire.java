package Day09;

public class Tire {
	//p.314
	//필드
	public int maxRotation; //최대 회전 수 [타이어 수명]
	public int accumulatedRotation; //누적 회전 수
	public String location; // 타이어 위치
	
	
	//생성자
	
	public Tire(int maxRotation, String location) { // 책과 다름 maxRotation먼저 했음
		// 생성자를 만들때 다른사람이 알아볼수 있도록 필드값과 받을 매개변수명을 통일해야함.
		// 그리고 어떤걸 받을 건지 고심해봐야됨.
		this.maxRotation = maxRotation; // 최대 회전수 초기화
		this.location = location; // 타이어 위치 회전수
	}


	
	//메소드
	
	public boolean roll() {	//타이어 회전 메소드
		++accumulatedRotation;	//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {	//누적 회전수 < 최대 회전수
			System.out.println(location + "Tire 수명" + (maxRotation-accumulatedRotation) + "회"); //남은 회전 수 출력(최대 회전수 - 누적 회전수)
			return true; // 수명이 남았다는 반환값
		}else { // 누적 회전수 > 최대 회전수 (누적 회전수가 최대 회전수를 넘어가면)
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false; // 수명이 다되었음을 표시하는 반환
		}
	}
}
