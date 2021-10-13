package Day09;

public interface ATM {
	//1. 상수필드
	//2. 추상메소드 [ 선언만 하고 실행코드 정의X]
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	//3. 디폴드 메소드
	default void 실행 () {System.out.println("ATM");}
	//4. 정적메소드
	
} 
