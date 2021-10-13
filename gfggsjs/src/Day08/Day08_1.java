package Day08;

//p.292
public class Day08_1 {
	//실행 클래스 => main메소드 [ 스레드 ]
	
	//[요약]
	// 상속 :
		// 1. extends : 연장하다 [설계도 연장]
			//public class 자식클래스명 extends 부모클래스명 { }
	
		// 2. super : 부모클래스내 멤버 접근
			//1) super() : 부모클래스내 생성자 호출
			//2) super.필드명/메소드명 : 부모클래스 내 필드나 메소드 호출
	
		// 3. @Override : 부모클래스 내 메소드 재정의 
			
		// 4. final  p.300 ~ 302
			//1) 클래스 앞에 붙었을 시, 부모클래스로 사용 불가 (상속 X, 수정 X)
				// final class CellPhone
			//2) 메소드에 붙일 시, 오버라이딩 불가
				// final void powerOn()
		
	public static void main(String[] args) {
	
		//서브 클래스를 이용한 객체 생성 DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);  // DmbCellPhon 클래스의 10번째줄에 해당.
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model); // private 변수가 아닐 경우 멤버 접근 가능	//dmbCellPhone클래스의 model을 빌려옴(부모멤버)
		System.out.println("색상 : " + dmbCellPhone.color); // 부모 멤버
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCellPhone.channel); 
		
		
		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn(); // 부모 메소드 호출
		dmbCellPhone.powerOff(); // 부모 메소드 호출
		dmbCellPhone.sendVoice("안녕하세요.");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동 입니다.");
		dmbCellPhone.sendVoice("반갑습니다.");
		dmbCellPhone.hangUp();
		
		
		// DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffdmb();
	}
}
