package study2;

public class Calculator {
	//�ʵ�
	private int memory;

	//�ν��Ͻ�ȭ?? MemberDao.getDao()...�ߴ� �Ͱ� ������ �����ϴ�.
	public int getMemory() {
		return memory;
	}
	
	//�޼ҵ�
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		//����ȭ : �켱 �����尡 ���� ������ �ٸ� ������� ����մϴ�.
		//�� ���� �̻��� ���� ���ÿ� ���� ��츦 ����ؼ�
		//�� ������ ���� �����Ű�� �������� ���߿� �����Ų��.
		//User1�� User�� �̰��� �������̵� �մϴ�.
		try {
			Thread.sleep(2000);
			//2�ʰ� ����ϴ�.
		}catch(Exception e){
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
		//�� 100�̳����� 50�� �������� �𸣰ڽ��ϴ�.
		//100�̶�� ���ڸ� ��� ���� �޾Ҵ��� �𸣰ڽ��ϴ�.(�ذ�)
		//User1Ŭ������ User2Ŭ�������� setMemory�Ѱſ����ϴ�.
	}
	
}
