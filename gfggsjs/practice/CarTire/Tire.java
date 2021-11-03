package CarTire;


	public class Tire {
	
	public int maxRotation;
	public int accRotation;
	public String location;
	
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accRotation;
		if(maxRotation>accRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation-accRotation) + "ȸ");
			return true;
		}else {
			System.out.println("[���]" + location + "�� Ÿ�̾� ��ũ");
			return false;
		}
	}
}
