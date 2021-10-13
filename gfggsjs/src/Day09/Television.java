package Day09;
// Tv 클래스
public class Television implements RemoteControl{
						// extends = 클래스 연장
						// implements : (추상메소드 정의) 구현하다.
	//1. 필드
	private int volume;
	//2. 생성자
	
	//3. 메소드
	public void turnOn() { // 11번째 줄 숫자 옆에 작은 삼각형 생성됨. 
							// 작은 삼각형 : 연결된 인터페이스의 추상메소드 정의하기
		System.out.println("TV를 켭니다."); 
	}
	
	//ctrl + space : 구현할 추상메소드 목록 불러오기
	
	//turnOff() 추상 메소드의 실체 메소드
	//@Override // @Override 생략가능
	public void turnOff() {
	System.out.println("TV를 끕니다.");	
	}
	
	//setVolume() 추상메소드의 실체 메소드 (p.352)
	//@Override
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//현재 소음이 최대 소음보다 커지면
			this.volume = RemoteControl.MAX_VOLUME;
			// 최대 소음으로 대입하기 [ 현재 소음은 최대 소음보다 커질 수 없음 ]
		} else if (volume<RemoteControl.MIN_VOLUME) {
			// 현재 소음이 최소소음[0]보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;
			// 최소 소음으로 대입하기 [ 현재 소음은 음수가 될 수 없음]
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);	
	}
	
}
