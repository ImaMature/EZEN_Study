package Day09_1;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); //snowTire라는 객체를 생성하기
		//New_Tire tire = snowTire; //오버라이딩
		New_Tire new_Tire = snowTire;
		snowTire.run();
		new_Tire.run();
	}
}
