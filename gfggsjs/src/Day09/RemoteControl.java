package Day09;
//p.346
// �������̽� ����� :���� Ŭ���� Interface ����

// ��� �ʵ� ����
public interface RemoteControl {
	// class : Ŭ���� ����� ���Ǵ� Ű����
	// interface : �������̽� ����� ���Ǵ� Ű����
	
	//1. ���(�������̽�) �ʵ�	(p.348)	[�ݵ�� �ʱⰪ ����, ���� �Ұ�, static ������� �ʱ�ȭ �Ұ���]
	public int MAX_VOLUME = 10;	//�ִ����
	public int MIN_VOLUME = 0;	//�ּҼ���
	
	//2. �߻� �޼ҵ�	[�޼ҵ� ���� O, �����ڵ� ���� X] 
	// �߰�ȣX
	public void turnOn(); // ����O �߰�ȣ(�����ڵ�) X
	public void turnOff(); // ����O �߰�ȣ X
	public void SetVolume(int volume);// ����O �߰�ȣ X
	//���� �ϴ� �� �߻�޼ҵ��� �Ѵ�.
	
	//3. ����Ʈ �޼ҵ�	[�޼ҵ� ���� O, �����ڵ� ���� O]
	default void setMute(boolean mute) {
		if(mute) {//���೻��(�ڵ�) //setMute���� true�Ͻ�
			System.out.println("���� ó���մϴ�.");
		} else { //setMute���� false�Ͻ�
			System.out.println("���� �����մϴ�.");
		}
	}
	//4. ���� �޼ҵ�(p.350)	[��ü ������� ���Ǵ� �޼ҵ�]
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
		
	}
}
