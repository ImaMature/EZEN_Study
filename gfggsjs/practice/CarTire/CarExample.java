package CarTire;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i =0; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new �ѱ�Ÿ�̾�("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new ��ȣŸ�̾�("�տ�����", 13);
				break;	
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.BackLeftTire= new �ѱ�Ÿ�̾�("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
				car.BackRightTire = new ��ȣŸ�̾�("�ڿ�����", 17);
				break;
			}
			System.out.println("--------------------------------");
		}
	}
}
