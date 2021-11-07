package Interface;

public class 은행 implements ATM{
	//인터페이스를 실행할 클래스 (구현(implements) 클래스)
	//인터페이스에 있는 추상메소드들을 실행.

	//필드
	String 계좌번호;
	int 예금액;
	@Override
	public void 계좌등록() {
		System.out.println("계좌등록");
	}
	@Override
	public void 계좌이체() {
		System.out.println("계좌이체");
		
	}
	@Override
	public void 예금() {
		System.out.println("예금");
		
	}
	@Override
	public ATM 출금() {
		System.out.println("출금");
		return null;
	}
	@Override
	public ATM 계좌잔고() {
		System.out.println("잔고");
		return null;
	}
	
	
}
