package Day09;
// Tv Ŭ����
public class Television implements RemoteControl{
						// extends = Ŭ���� ����
						// implements : (�߻�޼ҵ� ����) �����ϴ�.
	//1. �ʵ�
	private int volume;
	//2. ������
	
	//3. �޼ҵ�
	public void turnOn() { // 11��° �� ���� ���� ���� �ﰢ�� ������. 
							// ���� �ﰢ�� : ����� �������̽��� �߻�޼ҵ� �����ϱ�
		System.out.println("TV�� �մϴ�."); 
	}
	
	//ctrl + space : ������ �߻�޼ҵ� ��� �ҷ�����
	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	//@Override // @Override ��������
	public void turnOff() {
	System.out.println("TV�� ���ϴ�.");	
	}
	
	//setVolume() �߻�޼ҵ��� ��ü �޼ҵ� (p.352)
	//@Override
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//���� ������ �ִ� �������� Ŀ����
			this.volume = RemoteControl.MAX_VOLUME;
			// �ִ� �������� �����ϱ� [ ���� ������ �ִ� �������� Ŀ�� �� ���� ]
		} else if (volume<RemoteControl.MIN_VOLUME) {
			// ���� ������ �ּҼ���[0]���� ������
			this.volume = RemoteControl.MIN_VOLUME;
			// �ּ� �������� �����ϱ� [ ���� ������ ������ �� �� ����]
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);	
	}
	
}
