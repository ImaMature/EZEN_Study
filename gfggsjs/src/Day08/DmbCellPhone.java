package Day08;
//p.291
			//자식클래스명				//부모클래스명
public class DmbCellPhone extends CellPhone {
						//extends; 연장하다	//상속 1개
	
	//핸드폰 기본기능 => CellPhone 상속
	//1. 필드
	int channel;	//본인 클래스 변수 channel 선언
	//2. 생성자
	public DmbCellPhone(String model, String color, int channel) { 
//		//this : 현재 클래스내 멤버
//		//현재 클래스에는 model이 없지만 외부클래스에서 상속받아와서 자유롭게 사용 가능. (extends 기능)
//		this.model = model; // 부모 클래스내 멤버 사용
//		this.color = color; // 부모 클래스내 멤버 사용
//		this.channel = channel;	//본인 클래스 멤버 사용
		
		//p293~4
		// 생성자 호출
		// 부모 클래스가 생성자 있을 때 => super() 키워드를 이용한 부모클래스(CellPhone) 생성자 호출
		super(model,color); 		// 부모 클래스내의 생성자가 소괄호 안에 2개 인수를 선언했으면 2개 인수를 맞춰줘야한다.
		 							
	}
	//3. 메소드
	void turnOnDmb() {
		System.out.println("채널 :" + channel + "번 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널  "+ channel + "번으로 바꿉니다.");
		//this.channel : 하늘색(혹은 파랑색) => 현재 클래스내 멤버
		//channel : 연보라(빨간색) => 메소드에 외부로 들어온 변수
	}
	void turnOffdmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	// 오버라이딩 [ 부모 클래스 내 메소드 재정의 ] : 자동완성 가능
	@Override //  @: 어노테이션 
			// 안써도됨 자동으로 들어가서
	void powerOn() {	
		//super.멤버  => 멤버호출
		super.powerOn();
		System.out.println("전원 메소드 재정의 : DMB를 켭니다.");
		
	}
	// [동일한 {} 안에서] 
	//필드, 메소드 : 동일한 이름 못가짐
	// 오버라이딩 : 동일한 이름을 가진 메소드 재정의
	// 오버로딩 : 동일한 생성자의 이름을 가진 생성자 구분
	
	
	
	
}
