package CarTire;

public class ��ȣŸ�̾� extends Tire{

	public ��ȣŸ�̾�(String location, int maxRotation) {
		super(location, maxRotation);
		
	}

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"��ȣŸ�̾� ���� : " + (maxRotation-accRotation) + "ȸ");
			return true;
		}else {
			System.out.println("[���]" + location + "��ȣŸ�̾� ��ũ");
			return false;
		}
	}
}
