package CarTire;


	public class Tire {
	
		/*
		 * Day09_2, Tire, KumhoTire, hanKookTire, car Ŭ����Ŭ ����
		 *  ���
		 * 
		 * 
		 * 
		 * 
		 */
	int maxWheel; // �ִ� ȸ�� ��
	int acWheel; // ���� ȸ�� ��
	String location; // Ÿ�̾� ��ġ

	public Tire(int maxWheel, String location) { 
		// �����ڸ� ���鶧 �ٸ������ �˾ƺ��� �ֵ��� �ʵ尪�� ���� �Ű��������� �����ؾ���.
		// �׸��� ��� ���� ���� ����غ��ߵ�.
		super();
		this.maxWheel = maxWheel;
		this.location = location;
	}

	public boolean roll() {
	acWheel++;
		if(acWheel<maxWheel) {
			System.out.println(location + "Ÿ�̾� ����" + (maxWheel - acWheel) + "ȸ");
			//�ִ�ȸ���� - ����ȸ���� = ���� ȸ����
			return true;
		}else { //����ȸ������ �ִ�ȸ������ �Ѿ������
			System.out.println("[����]" + location + "Ÿ�̾� ��ũ��");
			return false;
		}
	}
}
