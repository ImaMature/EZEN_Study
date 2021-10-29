package CarTire;


	public class Tire {
	
		/*
		 * Day09_2, Tire, KumhoTire, hanKookTire, car 클래스클 연습
		 *  상속
		 * 
		 * 
		 * 
		 * 
		 */
	int maxWheel; // 최대 회전 수
	int acWheel; // 누적 회전 수
	String location; // 타이어 위치

	public Tire(int maxWheel, String location) { 
		// 생성자를 만들때 다른사람이 알아볼수 있도록 필드값과 받을 매개변수명을 통일해야함.
		// 그리고 어떤걸 받을 건지 고심해봐야됨.
		super();
		this.maxWheel = maxWheel;
		this.location = location;
	}

	public boolean roll() {
	acWheel++;
		if(acWheel<maxWheel) {
			System.out.println(location + "타이어 수명" + (maxWheel - acWheel) + "회");
			//최대회전수 - 누적회전수 = 남은 회전수
			return true;
		}else { //누적회전수가 최대회전수를 넘어가버리면
			System.out.println("[주의]" + location + "타이어 펑크남");
			return false;
		}
	}
}
