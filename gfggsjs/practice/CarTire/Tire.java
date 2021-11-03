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
			System.out.println(location + "Tire 수명 : " + (maxRotation-accRotation) + "회");
			return true;
		}else {
			System.out.println("[경고]" + location + "쪽 타이어 펑크");
			return false;
		}
	}
}
