package Interface;

public interface ATM {
	//필드는 무조건 상수
	//상수 : 절대바뀌지 않는 값 (public static final을 안써도 자바 컴파일러에서 자동으로 컴파일 해준다.)
	//추상메소드 : 선언 O,  정의X , 
	public ATM 계좌등록();
	public ATM 계좌이체();
	public ATM 예금();
	public ATM 출금(); 
	public ATM 계좌잔고();
}
