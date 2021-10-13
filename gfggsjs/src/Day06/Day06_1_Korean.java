package Day06;

public class Day06_1_Korean {
	
	//1. 필드
	String nation = "대한민국";
	String name; // 이름 //
	String ssn; // 주민번호
	// 이름, 주민번호등 외부에서 제공되는 다양한 값들로 초기화되어야 한다면, 생성자에서 초기화를 해야한다.
	// 필드 값은 클래스를 작성할때 초기값을 줄수 없고 객체 생성 시점에 다양한 값을 가져야한다.
	
	//2. 생성자
	//빈생성자 //ctrl + space bar
	// 이건 무조건 정해져있는 경우나 한두개만 있는 경우 // 필수로 입력해야하는 필드 같은 경우
	public Day06_1_Korean() { // 오버라이딩 //p.208
		
	}
	
//	public Korean(String n, String s) { // 각 매개변수에 각각 박자바, 011225-1234567을 입력받음
//		name = n; // 입력받은 값이 들어옴 (name = 박자바) 그후 필드에 있는 name이 됨. 
//		필드	  매개변수		//그후 Day06_1 클래스의 korean.name에 들어가서
//						//korean1 name : 박자바가 출력됨
//		ssn = s; // 
////	필드  매개변수
//	}
		//객체 선언시 생성자로부터 n,s값을 입력받기
		// 생성자로부터 들어온 n을 현재 필드에 저장
	
	
	//입력받을 매개변수와 초기값이 같을때
	
	public Day06_1_Korean(String name, String ssn) { //매개변수 각각 name, ssn
					
		
		name = name; 
//		 필드   매개변수
		ssn = ssn;
//		/필드  매개변수
		this.name=name;
//		   필드	  매개변수		
		this.ssn=ssn; // 객체 자신의 참조		//객체가 객체 자신을 this라고 한다.
//		   필드   매개변수			
		//this.내부변수 = 외부로 부터 들어온 name(인수)과 기존에 내부에 있던 name이 다르기 때문에 // p.208
		
		//참고로 관례적으로 필드와 동일한 이름을 갖는 매개변수를 사용한다.
	}
	
}
