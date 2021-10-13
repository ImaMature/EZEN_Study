package Day09;
//p.346
// 인터페이스 만들기 :오른 클릭후 Interface 생성

// 상수 필드 선언
public interface RemoteControl {
	// class : 클래스 선언시 사용되는 키워드
	// interface : 인터페이스 선언시 사용되는 키워드
	
	//1. 상수(인터페이스) 필드	(p.348)	[반드시 초기값 존재, 수정 불가, static 블록으로 초기화 불가능]
	public int MAX_VOLUME = 10;	//최대소음
	public int MIN_VOLUME = 0;	//최소소음
	
	//2. 추상 메소드	[메소드 선언 O, 실행코드 정의 X] 
	// 중괄호X
	public void turnOn(); // 선언O 중괄호(실행코드) X
	public void turnOff(); // 선언O 중괄호 X
	public void SetVolume(int volume);// 선언O 중괄호 X
	//선언만 하는 걸 추상메소드라고 한다.
	
	//3. 디폴트 메소드	[메소드 선언 O, 실행코드 정의 O]
	default void setMute(boolean mute) {
		if(mute) {//실행내용(코드) //setMute값이 true일시
			System.out.println("무음 처리합니다.");
		} else { //setMute값이 false일시
			System.out.println("무음 해제합니다.");
		}
	}
	//4. 정적 메소드(p.350)	[객체 선언없이 사용되는 메소드]
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
}
