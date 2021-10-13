package Day02;

public class Day02_5 { //c s

	public static void main(String[] args) { //m s
		
		//문자 : char
		//문자열 : 자료형 없음 => String 클래스
		
		char 문자1 = 'a'; System.out.println("문자1 : " + 문자1);
		//char 문자2 = 'abc'; //불가 왜냐하면 char는 2바이트라서 하나의 문자만 저장 가능하기 때문.
		// 해결법 1. String을 이용한 문자열 저장
		String 문자열1 = "abc"; System.out.println("문자열1 : " + 문자열1);  //문자열 저장가능 하지만 큰따옴표써야됨
		
		// 해결법 2. 배열을 이용한 문자열 저장 
		char[] 문자열2 = {'a', 'b', 'c'};
		System.out.println(문자열2);
		System.out.println("문자열2 : " + 문자열2); //***이상하게 출력되는 이유?
		
		// String : 문자열 관리 해주는 클래스
			// 객체들은 비교 연산자를 사용하지 못한다. 
			// 객체들을 비교할 때는 .equals(문자열) 메소드를 사용
		
		String 이름 = "유재석"; //영문 : 1바이트 , 한글 : 2바이트
		String 이름2 = new String("유재석"); 
		System.out.println(이름 + 이름2);
		// new를 써도 되고 안 써도됨 이유는 문자열 자체에 메모리가 들어가있기 때문
		// Scanner에는 new를 써야됨 할당된 것이 뭔지 모르기 때문
		
		System.out.println(이름 == 이름2); //false, ==연산자는 주소를 비교한다
		System.out.println(이름.equals(이름2) ); //true, equals()는 내용을 비교한다.
	} //m e
}//c e
