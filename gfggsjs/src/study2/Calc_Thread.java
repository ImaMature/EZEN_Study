package study2;

public class Calc_Thread extends Thread{
			//������ ���
	public Calc_Thread(String name) {
		super.setName(name);
		//�̸��� �ٲ��ִ� ������
		//super.�޼ҵ� : �θ� Ŭ������ �޼ҵ忡 �����ϱ�
	}
	
	@Override
	public void run() { //run�� �ϸ� run�̸��� ����Ǵ� ���ΰ���? �ƴ� 
		for(int i =0; i<200000000; i++) {}
			System.out.println("�ݺ��� ���� : " + getName());
			//�ݺ��� ���� + �̸� �ٲ��ֱ��� �� �����ϴ�.
			//�� �����ڿ��� �ٲ� �̸��� �������� �� �����ϴ�.
		
	}
	
}
