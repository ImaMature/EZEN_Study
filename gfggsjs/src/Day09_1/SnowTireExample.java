package Day09_1;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); //snowTire��� ��ü�� �����ϱ�
		//New_Tire tire = snowTire; //�������̵�
		New_Tire new_Tire = snowTire;
		snowTire.run();
		new_Tire.run();
	}
}
