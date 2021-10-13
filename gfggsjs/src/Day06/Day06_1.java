package Day06;
	
	//Day06_1이라는 클래스의 main메소드에서 Student 객체 생성
public class Day06_1 {
// public class = 키워드
// public 접근 제한자
	
//p.195 클래스로부터 객체 선언
	
	
	// 1. 객체 만들기 : 클래스를 이용한 메모리 할당
	//만드는 이유? A클래스에서 B클래스에 정의된 변수와 메소드를 쓰기 위해서
	public static void main(String[] args) {
		
		
		
		Day06_1_Student student = new Day06_1_Student(); //책에서는 s1이라고 나와있지만 student로 바꿈 	// Student 클래스의 인스턴스화
		//클래스명 객체(변수)명 = new 생성자 ();		//new 라는 키워드를 사용	 //new는 클래스로부터 객체를 생성하는 연산자
		//클래스명 == 생성자명				// new 연산자로 생성된 메모리는	 힙의 영역에 생성됨
		
		
		
		System.out.println("student 변수가 Student 객체를 참조합니다.");
		System.out.println("객체이름 출력 : " + student);
		
		Day06_1_Student student2 = new Day06_1_Student();
		System.out.println("student2 변수가 Student 객체를 참조합니다.");
		
		System.out.println("객체이름 출력 : " + student2); // 해당 객체 메모리의 주소값이 나옴. // 주소 = 16진수
		// Student 클래스는 1개이지만, new연산자를 사용한 만큼 객체가 메모리에 생성됨. 
		// 이러한 객체들은 Student 클래스의 인스턴스다. 
		
		
		//p.201
		//객체 생성
		Day06_1_Car car = new Day06_1_Car();
		
		//객체 내 멤버[필드] 호출
		System.out.println("제작회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed); //speed 클래스를 선언 안해서 값은 0
		
		//객체 내 멤버[필드] 값 변경
		car.speed = 60;
		System.out.println("수정된 속도 : " + car.speed); // speed 가 60으로 바뀜
		
		
		//p.205 생성자를 이용한 객체 생성
		Day06_1_Car2 car2 = new Day06_1_Car2("검정", 3000); 
		
		
		//p.207 : 생성자 = > 필드 초기화
		Day06_1_Korean k1 = new Day06_1_Korean();
		System.out.println("k1 : " + k1.nation);
		
		Day06_1_Korean korean = new Day06_1_Korean("박자바", "011225-1234567"); // Korean 클래스의 String n, String s에 각각 입력됨
		System.out.println("korean1 name : " + korean.name);
		System.out.println("korean1 ssn : " + korean.ssn);
		
		Day06_1_Korean korean2 = new Day06_1_Korean("김진로", "930101-2234567");
		System.out.println("korean2 name : " + korean2.name);
		System.out.println("korean2 ssn : " + korean2.ssn);
		
		// 비어있는 객체 [빈생성자]
		Day06_1_Korean korean3 = new Day06_1_Korean();
		korean3.name = "박자바"; // 직접 선언해야됨
		korean3.ssn = "930101-2234567";
		System.out.println("korean3 name : " + korean3.name);
		System.out.println("korean3 ssn : " + korean3.ssn);
		
	}
}
