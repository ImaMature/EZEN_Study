package Day09;
// 볼륨조절 클래스
public class Audio implements RemoteControl{
				//implements : 클래스에 인터페이스 연결
	//1. 필드
	private int volume;
	private boolean mute; //디폴트 메소드 사용(p.361)
	//2. 생성자
	//3. 메소드 (추상메소드는 ctrl space bar로 쉽게 만들기)
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void SetVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { // RemoteControl의 MAX_VOLUM가져옴 (10)
			this.volume = RemoteControl.MAX_VOLUME; //volume객체에 10을 저장
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
	
}
