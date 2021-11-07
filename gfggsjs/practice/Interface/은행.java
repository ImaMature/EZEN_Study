package Interface;

public class 은행 implements ATM{

	@Override
	public ATM 계좌등록() {
		System.out.println("계좌등록합니다.");
		return null;
	}

	@Override
	public ATM 계좌이체() {
		System.out.println("계좌이체합니다.");
		return null;
	}

	@Override
	public ATM 예금() {
		System.out.println("예금합니다.");
		return null;
	}

	@Override
	public ATM 출금() {
		System.out.println("출금합니다.");
		return null;
	}

	@Override
	public ATM 계좌잔고() {
		System.out.println("계좌잔고는 ~~원 남았습니다.");
		return null;
	}

}
