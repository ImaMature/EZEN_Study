package Day09;

public class KumhoTire extends Tire{

	
	
	//�ʵ�
	
	//������
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
			++accumulatedRotation;	//���� ȸ���� 1����
			if(accumulatedRotation<maxRotation) {	//���� ȸ���� < �ִ� ȸ����
				System.out.println(location + "KumhoTire ����" + (maxRotation-accumulatedRotation) + "ȸ"); //���� ȸ�� �� ���
				return true; // ������ ���Ҵٴ� ��ȯ��
			}else { // ���� ȸ���� > �ִ� ȸ����
				System.out.println("*** " + location + " KumhoTire ��ũ ***");
				return false; // ������ �ٵǾ����� ǥ���ϴ� ��ȯ
			
		}	
	}
}
