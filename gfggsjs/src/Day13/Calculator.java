package Day13;

public class Calculator {

	//�ʵ�
	private int memory;
	
	//������
	
	//�޼ҵ�
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //public synchronized void�� �ȵ��� ���ÿ� 50�� ����
			//	����ȭ : �켱 �����尡 ���� ������ �ٸ� ������ ��� [ ������� ]
		this.memory = memory;
		
		//2�ʰ� ������ �Ͻ�����
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
