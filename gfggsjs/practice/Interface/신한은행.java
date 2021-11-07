package Interface;

public class 신한은행 extends 은행{
	
	@Override
	public void 계좌등록() {
		System.out.println("신한은행 계좌등록");
	}
	@Override
	public void 계좌이체() {
		System.out.println("신한은행 계좌이체");
	}
	@Override
	public ATM 계좌잔고() {
		System.out.println("신한은행 계좌잔고");
		return null;
		
	}
	@Override
	public void 디폴트() {
		System.out.println("신한은행 디폴트");
	}
	@Override
	public void 예금() {
		System.out.println("신한은행 예금");
	}
	@Override
	public ATM 출금() {
		System.out.println("신한은행 출금");
		return null;
	}
}
