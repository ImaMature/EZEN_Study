package Day09;

public class Day09_2 {
	public static void main(String[] args) {
		
	
	// 1. �ڵ��� ��ü ����
	Car car = new Car(); //Ÿ�̾� Ŭ������ ���� �޸� ���� (frontLeftTire,frontRightTire,backLeftTire,backRightTire)
	
	// 2. �ڵ��� 5�� ����
	for(int i = 1; i < 5; i++) {
		int problemLocation = car.run(); //car Ŭ������ run�� return�� �޾� ����
		switch(problemLocation) {
		case 1 : 
			System.out.println("�տ��� HankookTire�� ��ü"); 
			car.frontLeftTire = new HanKookTire(15, "�տ���"); // �������̵��� �޼ҵ� ����
			break;
		case 2 : 
			System.out.println("�տ����� KumhoTire�� ��ü"); 
			car.frontRightTire = new KumhoTire(13, "�տ�����");
			break;
		case 3 : 
			System.out.println("�ڿ��� HankookTire�� ��ü"); 
			car.backLeftTire = new HanKookTire(14, "�ڿ���");
			break;
		case 4 : 
			System.out.println("�ڿ����� KumhoTire�� ��ü"); 
			car.backRightTire = new KumhoTire(17, "�ڿ�����");
			break;	
			}
		System.out.println("---------------------------");
		}
	}
}
