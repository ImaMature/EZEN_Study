package Day10;

public class Day10_7 {
	public static void main(String[] args) {
		
	
	//예외처리 : 1. 일반 예외 2. 실행 예외
			// 목적 : 다양한 오류 발생시 => 프로그램 정상화
			//*try {}안에서 예외가 발생하면 catch내 예외 클래스 객체에 오류 발생 정보를 저장하고 catch실행
			//* 단 예외가 없을 경우 try{} 정상실행 후 catch{}는 실행 안함.
			// try { 예외가 발생 가능 코드 }
			// catch { 예외클래스명 변수명 객체명 등등 아무거나 } { 예외 발생시 실행되는 코드 }
			// finally {무조건 실행되는 클래스}
		
			//예외 클래스
				//*Exception : 예외 슈퍼클래스
				//1. NullPointerException
				//2. ArrayIndexOutOfBoundsException
				//3. NumberFormatException
				//4. -------------------------------등등...
		
			//예외 던지기
				//목적 : 메소드 내에서 발생한 예외를 호출한 곳으로 이동 [ 예외 통일성을 위함 ]
		
	//예외 만들기	
	//예1) p.423
//	String data = "유재석";		
//	//String data = null; 		//String 객체에 null 대입 , 객체가 없는 상태에서 객체를 사용하려 해서 예외발생 오류!!
//	System.out.println(data.toString()); // toString() 객체 정보 반환
	try {
		String data = null;		//String 객체에 null 대입
		System.out.println(data.toString());	//toString() : 객체 정보 반환
	}catch (NullPointerException e) {
		System.out.println("예외가 발생했습니다. [관리자에게 문의]");
	}finally {
		System.out.println("** 예외가 있던 없던 무조건 실행되는 위치");
	}
	
	//예2) p.424 	ArrayIndexOutOfBoundsException 예외 (외울필요 없음)
//	String [] 문자열배열 = new String [2];
//	문자열배열[0] = "유재석"; 문자열배열[1] = "강호동";	문자열배열[2] = "신동엽";	//오류발생, 2개선언했는데 3개를 집어넣어서.
	try {
		String [] 문자열배열 = new String [2];
		문자열배열[0] = "유재석"; 문자열배열[1] = "강호동";	문자열배열[2] = "신동엽";	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열내 자리가 부족합니다. [관리자에게 문의]");
		System.out.println("예외정보 : " + e); //예외가 발생시 코드정보의 흐름 변경 catch로 이동
	}
	
	
	//예3) p.426
	try {
	String data1 = "100";		// "100" => 100 [가능]
	String data2 = "a100";		// "a100" => 100 [불가능, a를 어떻게 할건지 정의해줘야됨]
	System.out.println(Integer.parseInt(data1));
	System.out.println(Integer.parseInt(data2));
	}
	catch(NumberFormatException e) {
		System.out.println("문자가 포함된 문자열은 정수로 변환이 불가. [관리자에게 문의]");
		System.out.println("예외정보 : " + e);
	}
//	String data1 = "100";		// "100" => 100 [가능]
//	String data2 = "a100";		// "a100" => 100 [불가능, a를 어떻게 할건지 정의해줘야됨]
//	System.out.println(Integer.parseInt(data1));
//	System.out.println(Integer.parseInt(data2));
		// Integer : 정수 관련 클래스
				// .parseInt(문자) : 문자를 정수형으로 변환해주는 메소드
	}
}
