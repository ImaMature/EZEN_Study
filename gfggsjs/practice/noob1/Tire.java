package noob1;


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
	int acWheel; //���� ȸ�� ��
	String location; // Ÿ�̾� ��ġ
		
	

	public Tire(int maxWheel, int acWheel, String location) {
		super();
		this.maxWheel = maxWheel;
		this.acWheel = acWheel;
		this.location = location;
	}
	
	

	

	public Tire(int Wheel, String location) { 
		// �����ڸ� ���鶧 �ٸ������ �˾ƺ��� �ֵ��� �ʵ尪�� ���� �Ű��������� �����ؾ���.
		// �׸��� ��� ���� ���� ����غ��ߵ�.
		super();
		this.acWheel = acWheel;
		this.location = location;
	}





	public void roll() {
		
	}
	
}
