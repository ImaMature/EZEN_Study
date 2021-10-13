package Day06;

public class Day06_4 {
	//p.235
	public static void main(String[] args) {
		
	
	//1. 객체만들기
	Day06_4_Car5 myCar = new Day06_4_Car5("포르테");
	Day06_4_Car5 yourCar = new Day06_4_Car5("벤츠");
	
	//2. 객체를 통한 메소드 호출
	myCar.run();
	yourCar.run();
	
	// p.277 : 확인문제 
			// 1. 하나의 클래스로부터 여러개 객체생성 가능 
			// 2. 4
			// 3. 4 [ 반드시x ]
			// 4. 3 [ 동일한 괄호내 존재 ] 
			// 5. 1
				//this.내부변수명
				//this() : 내부의 빈생성자 호출
				//this( 데이터 , 데이터 )
			// 6. 4 
				// 메소드명은 중복가능 [ 오버로딩 ] 
				// 3 : 인수에 ··· 넣으면 자동으로 배열로 생성 
			// 7. 2
			// 8~11 : 
			// 12 : 필드 , 생성자 , 메소드 
	
	// p.283 확인문제 20번
	
	}
}