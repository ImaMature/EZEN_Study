package Interface;

public class ���� implements ATM{
	//�������̽��� ������ Ŭ���� (����(implements) Ŭ����)
	//�������̽��� �ִ� �߻�޼ҵ���� ����.

	//�ʵ�
	String ���¹�ȣ;
	int ���ݾ�;
	@Override
	public void ���µ��() {
		System.out.println("���µ��");
	}
	@Override
	public void ������ü() {
		System.out.println("������ü");
		
	}
	@Override
	public void ����() {
		System.out.println("����");
		
	}
	@Override
	public ATM ���() {
		System.out.println("���");
		return null;
	}
	@Override
	public ATM �����ܰ�() {
		System.out.println("�ܰ�");
		return null;
	}
	
	
}
