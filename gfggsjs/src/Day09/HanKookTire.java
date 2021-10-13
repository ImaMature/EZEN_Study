package Day09;

public class HanKookTire extends Tire{
	
	// �ʵ�
	// ������
	public HanKookTire(int maxRotation, String location) {
		super(maxRotation, location);
		//���콺 ����Ŭ��-> source -> generate constructor from superclass
	}

	
	
	// �޼ҵ�
	// �������̵� : �޼ҵ� ������ [ �޼ҵ� ���� �ٲٱ� ] ctrl space bar -> roll -> enter
	@Override
	public boolean roll() {
		++accumulatedRotation;	//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {	//���� ȸ���� < �ִ� ȸ����
			System.out.println(location + "HankookTire ����" + (maxRotation-accumulatedRotation) + "ȸ"); //���� ȸ�� �� ���
			return true; // ������ ���Ҵٴ� ��ȯ��
		}else { // ���� ȸ���� > �ִ� ȸ����
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false; // ������ �ٵǾ����� ǥ���ϴ� ��ȯ
		}
	}	
}
