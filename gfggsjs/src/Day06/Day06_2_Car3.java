package Day06;

public class Day06_2_Car3 {
// Car3.java의 설계도를 Day06_2.java클래스에 출력해보기
//p. 213	
	//1. 필드
	String company = "현대자동차";
	String model;	String color;	int maxSpeed;		
	
	//2. 생성자 : 서로 다른 인수를 갖는 생성자 여러개 선언 가능	//인수 : 외부로부터 들어오는 변수
		//1) 빈 생성자(깡통) : 필드를 받지 않음
		public Day06_2_Car3() {
			
		} // car1과 같음
		
		//2) 생성자 : 하나의 필드를 받는 생성자
		public Day06_2_Car3(String model)  {//인수 1개
			this.model = model; 
			//내부인수      //외부이눗
		} // car2와 같음
		
		//3) 두개의 필드를 받는 생성자
		public Day06_2_Car3(String model, String color) {//인수 2개
			this.model = model;
			this.color = color;
		} //car3와 같음
		
		//4) 세개의 필드를 받는 생성자
		public Day06_2_Car3(String model, String color, int maxSpeed) {//인수 3개
			this.model=model;
			this.color=color;
			this.maxSpeed=maxSpeed;
		} //car4와 같음
		
	//3. 메소드
		//public static void main(String[] args) {
//				}
		//일반적인 변수는 {}안에서만 실행가능 밖으로 못나옴
		// 그것이 바로 지역변수
		
}
