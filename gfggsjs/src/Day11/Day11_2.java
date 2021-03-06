package Day11;

//p.459 객체 동등 비교 메소드
public class Day11_2 {

	public static void main(String[] args) {
		
		//API
			//라이브러리 : 만들어진 클래스, 인터페이스
		//Object 클래스
			//1. equals() :
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) { //객체 동등 비교 메소드
			System.out.println("두 객체는 동등합니다.");
		}else {
			System.out.println("두 객체는 다릅니다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("두 객체는 동등합니다.");
		}else {
			System.out.println("두 객체는 다릅니다.");
		}
		
		//2. toString() : 객체정보
			// 객체의 주소값 [ 자료형 = 값 호출 ]
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		//3. clone() : 객체 복제
				//얕은 복제 : 배열 객체는 복제 불가 [주소값만 복사]
				//깊은 복제 : 배열 객체도 복제 가능
		
			//3-1. 객체 생성
			Member2 original = new Member2("blue", "홍길동", "12345", 25, true);
			
			//3-2. 객체 복제
				//설계도(클래스)를 통해서 메소드가 만들어지면 둘이 이름이 같더라도 다른 메소드
			Member2 cloned = original.getMember2(); //해당 메소드를 호출한 객체 = original
			cloned.password="67890";  //복사된 password에 덮어쓰기
			
			System.out.println("-------------복제된 객체 정보");
			cloned.toString();
			
			System.out.println("-------------원본 객체 정보");
			original.toString(); 
			//원본 객체와 복사된 객체가 똑같더라도 그 주소값은 다르다.
			
			//3-3. 깊은 복제
				//1) 객체 생성
				Member3 original2 = new Member3("홍길동", 25, new int [] {90, 90}, new Car("소나타"));
					// original에는"blue", "홍길동", "12345", 25, true 값이 각각 들어있음
				//2)깊은 복제
				Member3 cloned2 = original2.getMember3();
				cloned2.scores[0] = 100;
				cloned2.car.model = "그랜저";
				
				System.out.println(" ----- 원본 객체 ");
				original2.toString();
				System.out.println(" ----- 깊은 복제 객체");
				cloned2.toString();
				
				// finalize() : 객체 소멸자 
				cloned2 = null; // 해당 객체가 null
				System.gc(); // 자동실행	//gc = 쓰레기 수집기 -> 쓰레기 객체의 정보를 얻을때 사용 p.482~483
					// null 객체는 힙 메모리
						// 스택 : 변수명,주소값  
						// 힙 : 값 
							// int 변수명 = 10;
								// 스택 : 변수명 , 변수의 힙 주소값
								// 힙 : [주소를 가지고있는 메모리] : 값
				cloned2 = original2.getMember3(); // 메모리 할당 
	}
}
