package Day08;
//p.291
			//�ڽ�Ŭ������				//�θ�Ŭ������
public class DmbCellPhone extends CellPhone {
						//extends; �����ϴ�	//��� 1��
	
	//�ڵ��� �⺻��� => CellPhone ���
	//1. �ʵ�
	int channel;	//���� Ŭ���� ���� channel ����
	//2. ������
	public DmbCellPhone(String model, String color, int channel) { 
//		//this : ���� Ŭ������ ���
//		//���� Ŭ�������� model�� ������ �ܺ�Ŭ�������� ��ӹ޾ƿͼ� �����Ӱ� ��� ����. (extends ���)
//		this.model = model; // �θ� Ŭ������ ��� ���
//		this.color = color; // �θ� Ŭ������ ��� ���
//		this.channel = channel;	//���� Ŭ���� ��� ���
		
		//p293~4
		// ������ ȣ��
		// �θ� Ŭ������ ������ ���� �� => super() Ű���带 �̿��� �θ�Ŭ����(CellPhone) ������ ȣ��
		super(model,color); 		// �θ� Ŭ�������� �����ڰ� �Ұ�ȣ �ȿ� 2�� �μ��� ���������� 2�� �μ��� ��������Ѵ�.
		 							
	}
	//3. �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� :" + channel + "�� ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��  "+ channel + "������ �ٲߴϴ�.");
		//this.channel : �ϴû�(Ȥ�� �Ķ���) => ���� Ŭ������ ���
		//channel : ������(������) => �޼ҵ忡 �ܺη� ���� ����
	}
	void turnOffdmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
	
	// �������̵� [ �θ� Ŭ���� �� �޼ҵ� ������ ] : �ڵ��ϼ� ����
	@Override //  @: ������̼� 
			// �Ƚᵵ�� �ڵ����� ����
	void powerOn() {	
		//super.���  => ���ȣ��
		super.powerOn();
		System.out.println("���� �޼ҵ� ������ : DMB�� �մϴ�.");
		
	}
	// [������ {} �ȿ���] 
	//�ʵ�, �޼ҵ� : ������ �̸� ������
	// �������̵� : ������ �̸��� ���� �޼ҵ� ������
	// �����ε� : ������ �������� �̸��� ���� ������ ����
	
	
	
	
}
