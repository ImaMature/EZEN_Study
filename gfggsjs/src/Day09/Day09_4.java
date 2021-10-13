package Day09;

public class Day09_4 {
	//인터페이스 : 객체의 사용방법을 정의하는 타입 
		//혼자서 객체 생성X , 게임 프로그램 없이 오락실 버튼만으로 게임을 할 수 있나? 불가능. 게임 프로그램(클래스)이 있어야됨
		// 반드시 선언과 동시에 초기값을 지정해야됨!!
		// 최종적으로 객체에서 실행되기때문에 인터페이스의 메소드는 추상메소드로 선언하기!!!
	
		//1)목적 : 클래스들이 구현해야하는 동작을 지정하는데 사용되는 추상자료
		//2)추상??? 사물을 정확하게 이해하기위해 측면만을 가려내어 포획하는것
		//ex) : 게임기
			// 인터페이스[버튼] : 이동버튼, 공격버튼, 방어버튼
			// 클래스[게임들] : 사냥게임, RPG게임 등등
			// RPG게임 -> 공격버튼 -> 마법나간다(클래스)
			// 사냥게임 -> 공격버튼 -> 창 던진다(클래스)	
				// 결국 인터페이스는 <동일한 목적 하>의 서로 다른 클래스들을 조작
		
		// implements : 구현하다
			// 추상메소드 : 선언만 있는 메소드 => 연결된 클래스 내에서 구현
			// 추상메소드 구현
		
		// 인터페이스 사용
			//1. 인터페이스 인터페이스명 = new 클래스();
					// 인터페이스 = (클래스) 객체
			//2. 익명 구현 객체
					// 인터페이스 인터페이스명 = new 인터페이스명 (){추상메소드 오버라이딩};
		// extends : 다중 상속 X [상속은 한번만 가능]
		// implements : 다중 상속 O [인터페이스는 구현이 여러번 가능]
	
	
	// 리모컨 메인 클래스
	public static void main(String[] args) {
		//p.347 ~ 354
			//1. 인터페이스 설계 : RemoteControl
			//2. 클래스 설계 : Television implements RemoteControl
			//3. 클래스 설계 : Audio implements RemoteControl
		
		//1. 리모컨 생성 [ 메모리 할당 X ]
		RemoteControl rc; // 
		//2. 리모컨에 텔레비전 클래스 연결하기
		rc = new Television(); // 해당 리모컨으로(rc) 텔레비전을 사용
			//텔레비전 리모컨 사용하기
			rc.turnOn(); 
			rc.turnOff();
			rc.SetVolume(5);
			
		//3. [중요] 텔레비전 리모컨을 오디오 리모컨으로 변경
		System.out.println(" ** 리모컨을 오디오 전용으로 변경합니다!! ");
		rc = new Audio(); //audio 클래스의 메소드 대입 rc안에  볼륨, 뮤트가있고, min,max볼륨을 remotecontrol에서 받아온다.
			//오디오 리모컨 사용하기
			rc.turnOn(); //rc클래스의 turnOn출력
			rc.turnOff();
			rc.SetVolume(15); // 15가 최대음량인 10보다 크므로 volume에 10이 저장되어 10 출력
			// volume = 15가 나오려면 Audio.java의 23번째 줄에 this.volume = volume으로 선언하면됨
		
		//360.	
			 // 디폴트 메소드 재정의
			rc.setMute(true); // audio디폴트 메소드 구현객체
		RemoteControl.changeBattery(); // static(정적메소드)는 객체 없이 사용(메모리가 없어도 됨)
		
		//p.355
		//익명 구현 객체 : 일회성 코드 //중괄호 안애는 모든 추상 메소드들의 실체 메소드를 작성해야함
		
		RemoteControl rc2 = new RemoteControl() {
			
		//p.360		
			@Override
			public void turnOn() {}
				
			@Override
			public void turnOff() {}
				
			@Override
			public void SetVolume(int volume) {}
			
		};
		
 	}
}
