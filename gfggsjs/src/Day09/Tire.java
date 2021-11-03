package Day09;

public class Tire {
	//p.314
	//�ʵ�
	public int maxRotation; //�ִ� ȸ�� �� [Ÿ�̾� ����]
	public int accumulatedRotation; //���� ȸ�� ��
	public String location; // Ÿ�̾� ��ġ
	
	
	//������
	
	public Tire(int maxRotation, String location) { // å�� �ٸ� maxRotation���� ����
		// �����ڸ� ���鶧 �ٸ������ �˾ƺ��� �ֵ��� �ʵ尪�� ���� �Ű��������� �����ؾ���.
		// �׸��� ��� ���� ���� ����غ��ߵ�.
		this.maxRotation = maxRotation; // �ִ� ȸ���� �ʱ�ȭ
		this.location = location; // Ÿ�̾� ��ġ ȸ����
	}


	
	//�޼ҵ�
	
	public boolean roll() {	//Ÿ�̾� ȸ�� �޼ҵ�
		++accumulatedRotation;	//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {	//���� ȸ���� < �ִ� ȸ����
			System.out.println(location + "Tire ����" + (maxRotation-accumulatedRotation) + "ȸ"); //���� ȸ�� �� ���(�ִ� ȸ���� - ���� ȸ����)
			return true; // ������ ���Ҵٴ� ��ȯ��
		}else { // ���� ȸ���� > �ִ� ȸ���� (���� ȸ������ �ִ� ȸ������ �Ѿ��)
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false; // ������ �ٵǾ����� ǥ���ϴ� ��ȯ
		}
	}
}
