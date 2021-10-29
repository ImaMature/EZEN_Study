package CarTire;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		for(int i = 0; i<5; i++) {
			int process = car.run();
		}
	}
}
