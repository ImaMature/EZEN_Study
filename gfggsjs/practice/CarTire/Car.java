package CarTire;

public class Car {

	Tire frontLeftTire = new Tire (10, "�տ���");
	Tire frontRightTire = new Tire(5, "�տ�����");
	Tire backLeftTire = new Tire(7, "�ڿ���");
	Tire backRightTire = new Tire(8, "�ڿ�����");
	// TireŬ������ �����ڿ� �μ����� �Ѱ��ش�.
	// �׷����� Tire Ŭ������ �ش� ��ü�� ������ �����ڸ� ����� �ؾߵȴ�.
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll() == false) {
			System.out.println("�տ���Ÿ�̾� ��ũ");
		}else if(frontRightTire.roll() == false) {
			System.out.println("�տ�����Ÿ�̾� ��ũ");
		}else if(backLeftTire.roll() == false) {
			System.out.println("�ڿ���Ÿ�̾� ��ũ");
		}else if(backRightTire.roll() == false) {
			System.out.println("�ڿ�����Ÿ�̾� ��ũ");
		}
		
		return 0;
	}

	private void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
