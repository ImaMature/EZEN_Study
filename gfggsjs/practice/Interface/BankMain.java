package Interface;



public class BankMain {


	//1. 계좌 프로그램 [ 상속, 인터페이스 ]
		// ATM [인터페이스]
			// 추상메소드 : 계좌등록, 예금, 출금, 이체, 잔고
		//1. 은행 [슈퍼클래스]
			// 필드(속성) : 계좌번호, 예금액
			// 메소드(행동) : 계좌등록, 예금, 출금, 이체, 잔고
		//2. 국민은행 [서브클래스]
	
		//3. 신한은행 [서브클래스]
	public static 은행 [] arr = new 은행 [100];
	public static void main(String[] args) {
		ATM a = new 국민은행();
		a.계좌등록();
		a.계좌이체();
		a.계좌잔고();
		a.디폴트();
		
		System.out.println();
		
		ATM b = new 신한은행();
		b.계좌등록();
		b.계좌이체();
		b.계좌잔고();
		b.디폴트();
		b.예금();
		b.출금();
		
		
		
		//5. 슈퍼클래스와 서브클래스의 객체를 담을 수 있는 배열
		// 슈퍼클래스로 배열 선언
		은행 temp = new 은행();
		arr[0] = temp;
		국민은행 temp2 = new 국민은행();
		arr[1] = temp2;
		신한은행 temp3 = new 신한은행();
		arr[2] = temp3;
		
		arr[0] = new 은행();
		arr[1] = new 국민은행();
		arr[2] = new 신한은행();
	
	}
}
