package Day09;

public class 국민은행 extends Bank { //국민은행 상속 bank -> 국민은행도 ATM사용 가능
	
	final String 은행코드 = "02";
	
	
	@Override
	public void 계좌등록 () {
	 System.out.println("국민은행 계좌등록");
 }
}
