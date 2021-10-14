package Day11;

public class NotExistIDException extends Exception {
	//예외 클래스 만들기 extends 상속을 받아야 해당 클래스를 예외 클래스로 사용 가능

//p.487 7번	
	//필드
	//생성자 : 클래스명과 동일한 메소드
		// 빈생성자
	public NotExistIDException() {}
	
		//인수가 있는 생성자
	public NotExistIDException(String message) {
		super(message); //에외클래스에게 메시지 보내기'
		//super() : 부모의 생성자		부모의 생성자는 괄호로
		//super.필드	//super.메소드	부모의 필드나 메소드는 .으로 불러내기
	}
	
	//메소드

}
