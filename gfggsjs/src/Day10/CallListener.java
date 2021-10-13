package Day10;

import Day10.Button; //Button 클래스 가져오기

public class CallListener implements Button.OnClickListener{
									//클래스명.내부인터페이스(이걸 써야 Button class의 Onclick~인터페이스로 가서 onClick메소드정의가능
	@Override //onClick에대해 추상메소드 정의
	public void onClick() { 
		// TODO Auto-generated method stub
		System.out.println("전화를 켭니다.");
	}
}
