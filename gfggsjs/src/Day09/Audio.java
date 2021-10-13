package Day09;
// �������� Ŭ����
public class Audio implements RemoteControl{
				//implements : Ŭ������ �������̽� ����
	//1. �ʵ�
	private int volume;
	private boolean mute; //����Ʈ �޼ҵ� ���(p.361)
	//2. ������
	//3. �޼ҵ� (�߻�޼ҵ�� ctrl space bar�� ���� �����)
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void SetVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { // RemoteControl�� MAX_VOLUM������ (10)
			this.volume = RemoteControl.MAX_VOLUME; //volume��ü�� 10�� ����
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
	
}
