package Day08;

//p.292
public class Day08_1 {
	//���� Ŭ���� => main�޼ҵ� [ ������ ]
	
	//[���]
	// ��� :
		// 1. extends : �����ϴ� [���赵 ����]
			//public class �ڽ�Ŭ������ extends �θ�Ŭ������ { }
	
		// 2. super : �θ�Ŭ������ ��� ����
			//1) super() : �θ�Ŭ������ ������ ȣ��
			//2) super.�ʵ��/�޼ҵ�� : �θ�Ŭ���� �� �ʵ峪 �޼ҵ� ȣ��
	
		// 3. @Override : �θ�Ŭ���� �� �޼ҵ� ������ 
			
		// 4. final  p.300 ~ 302
			//1) Ŭ���� �տ� �پ��� ��, �θ�Ŭ������ ��� �Ұ� (��� X, ���� X)
				// final class CellPhone
			//2) �޼ҵ忡 ���� ��, �������̵� �Ұ�
				// final void powerOn()
		
	public static void main(String[] args) {
	
		//���� Ŭ������ �̿��� ��ü ���� DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);  // DmbCellPhon Ŭ������ 10��°�ٿ� �ش�.
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model); // private ������ �ƴ� ��� ��� ���� ����	//dmbCellPhoneŬ������ model�� ������(�θ���)
		System.out.println("���� : " + dmbCellPhone.color); // �θ� ���
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel); 
		
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn(); // �θ� �޼ҵ� ȣ��
		dmbCellPhone.powerOff(); // �θ� �޼ҵ� ȣ��
		dmbCellPhone.sendVoice("�ȳ��ϼ���.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿 �Դϴ�.");
		dmbCellPhone.sendVoice("�ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffdmb();
	}
}
