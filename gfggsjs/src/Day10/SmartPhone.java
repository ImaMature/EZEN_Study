package Day10;

public class SmartPhone extends Phone{
//�߻�Ŭ������ ����� ���
//�߻�Ŭ���� �ѹ� ��� �ް� �� ���̻� ������
//�ݸ� �������̽��� ������ ���� �� ����
	
	
	public SmartPhone(String owner) {
		super(owner);
		//���빰�� �ִ� �����ڰ� ���� superŬ���� ���� ���
		//super(); ����Ŭ������ ������ ȣ��
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	@Override
	public void sound() {
		//sound �������̵�
		
	}
}
