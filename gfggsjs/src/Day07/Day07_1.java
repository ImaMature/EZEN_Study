package Day07;	// 현재 클래스의 위치

//다른 패키지로부터 클래스 가져오기
import java.util.Scanner;
import Day06.Day06_1_Student; // 형식 : import 패키지명.클래스;

public class Day07_1 {

	
	//day06 : 클래스 (설계도 : 자료형 만들기)
		//1. 멤버 ( 필드, 생성자, 메소드)
			//1. 멤버 (선택사항 필수 X)
				//1) 필드 : 데이터 저장 [ 메모리 할당 ]
				//2) 생성자 : 객체 필드 초기값
				//3) 메소드 : 데이터 동작
					//반환타입 메소드명 ( 인수1, 인수2, 인수3~~~) { return 반환값 } //문자는 return안됨.
		//2. 객체 생성 (클래스의 인스턴스) 생성
			// 클래스명 객체명
				// 객체명 = new 생성자(); <-----인스턴스
			// 객체가 멤버 접근 [ 객체명.멤버 접근연산자 ] 
	// static을 갖고 있는 애들 부터 읽어온다( 다른 클래스에 있는 것 까지) -> 그후 main읽어옴
	// static의 역할 : 어떤 위치든 호출이 가능하게 만든다.
	
	public static void main(String[] args) { 
		//p.236
		/*
		 * static 은 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다. --> 생성자X
		 * (정적)
		 */
		
		
		//p.238
		//double result1 = 10*10*Calculator.pi; 	// 해당 클래스 객체를 생성 안했을시(메모리 할당을 안했을시) 오류
							
		double result1 = 10*10*Day07_1_Calculator.pi; // class Day07_1_Calculator의 double pi = 3.14159; 맨앞에 static을 붙여줘야 인식됨.
			// 해당 클래스의 멤버 접근방법	
				// 1. 객체 생성 [ 해당 클래스로부터 메모리 할당 ]
				// 2. static [정적변수] : 프로그램 시작시 메모리 할당
		int result2 = Day07_1_Calculator.plus(10, 5);
		int result3 = Day07_1_Calculator.plus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result1);
		System.out.println("result3 : " + result1);
		
		
		
		//p.245
		Day07_1_Person p1 = new Day07_1_Person("123456-1234567", "계백");
		
		//필드 호출
		System.out.println(p1.nation + " " +p1.ssn+" "+p1.name);
		
		//필드 수정 [final 필드 = 수정 불가 => 상수 만들기]
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		
		//p. 253 
		//[import] : 다른 패키로부터 클래스 가져오기 키워드 
		// ex) Scanner 클래스 <import java.util.scanner;>
			//1. 형식 : import 패키지명.클래스명;		[클래스 외부에 작성]
			//2. 두번째 형식 : 패키지명.클래스명 객체명;	[클래스 내부에 작성]		
				//ex) Day06.Account account = new Account();
	}
}
