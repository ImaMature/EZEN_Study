package CarTire;

public class �ѱ�Ÿ�̾� extends Tire{

	public �ѱ�Ÿ�̾�(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"�ѱ�Ÿ�̾� ���� : " + (maxRotation-accRotation) + "ȸ");
			return true;
		}else {
			System.out.println("[���]" + location + "�ѱ�Ÿ�̾� ��ũ");
			return false;
		}
	}
}
