package Day11;

public class NotExistIDException extends Exception {
	//���� Ŭ���� ����� extends ����� �޾ƾ� �ش� Ŭ������ ���� Ŭ������ ��� ����

//p.487 7��	
	//�ʵ�
	//������ : Ŭ������� ������ �޼ҵ�
		// �������
	public NotExistIDException() {}
	
		//�μ��� �ִ� ������
	public NotExistIDException(String message) {
		super(message); //����Ŭ�������� �޽��� ������'
		//super() : �θ��� ������		�θ��� �����ڴ� ��ȣ��
		//super.�ʵ�	//super.�޼ҵ�	�θ��� �ʵ峪 �޼ҵ�� .���� �ҷ�����
	}
	
	//�޼ҵ�

}
