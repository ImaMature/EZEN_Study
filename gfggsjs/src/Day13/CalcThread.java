package Day13;

public class CalcThread extends Thread{

	//�ʵ�
	
	//������
	public CalcThread (String name) {
		super.setName(name);
		//super.�޼ҵ�() : �θ� Ŭ���� �� �޼ҵ忡 �����ϴ� ��
		//super() : ������
	}
	
	@Override
	public void run() {
		for(int i=0; i<200000000; i++) {
						//20��ȸ �ݺ�
		}
			System.out.println("�ݺ��� ���� : " + getName());
	}
}
