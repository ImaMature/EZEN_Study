package Day09;


//계좌프로그램 메인
public class Day09_5 {
	
		//1. 계좌 프로그램 [ 상속, 인터페이스 ]
			// ATM [인터페이스]
				// 추상메소드 : 계좌등록, 예금, 출금, 이체, 잔고
			//1. 은행 [슈퍼클래스]
				// 필드(속성) : 계좌번호, 예금액
				// 메소드(행동) : 계좌등록, 예금, 출금, 이체, 잔고
			//2. 국민은행 [서브클래스]
		
			//3. 신한은행 [서브클래스]
		
		//ATM implement 은행 (하위에 국민, 신한은행) 국민, 신한 extends 은행
	public static Bank[] banklist = new Bank[100];
	public static void main(String[] args) {
		//1. 인터페이스 생성
		
		ATM atm;
		//2. 인터페이스 클래스 연결
		atm = new 국민은행();
		//3. 언터페이스로부터 클래스 조작
		atm.계좌등록();
		atm.예금();
		atm.출금();
		atm.잔고();
		
		//4. 인터페이스 클래스연결
		atm = new 신한은행();
		atm.계좌등록();
		atm.예금();
		atm.출금();
		atm.잔고();
		
		//5. 슈퍼클래스와 서브클래스의 객체를 담을 수 있는 배열
			// 슈퍼클래스로 배열 선언
		Bank account1 = new Bank();	
		banklist[0] = account1;
		
		국민은행 account2 = new 국민은행();
		banklist[1] = account2;
		
		신한은행 account3 = new 신한은행();
		banklist[2] = account3;
	}

}
