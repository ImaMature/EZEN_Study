package CarTire;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i =0; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new 한국타이어("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire = new 금호타이어("앞오른쪽", 13);
				break;	
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.BackLeftTire= new 한국타이어("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.BackRightTire = new 금호타이어("뒤오른쪽", 17);
				break;
			}
			System.out.println("--------------------------------");
		}
	}
}
