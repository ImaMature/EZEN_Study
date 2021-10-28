package noob1;


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
	int acWheel; //현재 회전 수
	String location; // 타이어 위치
		
	

	public Tire(int maxWheel, int acWheel, String location) {
		super();
		this.maxWheel = maxWheel;
		this.acWheel = acWheel;
		this.location = location;
	}
	
	

	

	public Tire(int Wheel, String location) { 
		// 생성자를 만들때 다른사람이 알아볼수 있도록 필드값과 받을 매개변수명을 통일해야함.
		// 그리고 어떤걸 받을 건지 고심해봐야됨.
		super();
		this.acWheel = acWheel;
		this.location = location;
	}





	public void roll() {
		
	}
	
}
