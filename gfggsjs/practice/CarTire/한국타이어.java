package CarTire;

public class 한국타이어 extends Tire{

	public 한국타이어(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"한국타이어 수명 : " + (maxRotation-accRotation) + "회");
			return true;
		}else {
			System.out.println("[경고]" + location + "한국타이어 펑크");
			return false;
		}
	}
}
