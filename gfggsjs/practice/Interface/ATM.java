package Interface;

public interface ATM {
	//�ʵ�� ������ ���
	//��� : ����ٲ��� �ʴ� �� (public static final�� �Ƚᵵ �ڹ� �����Ϸ����� �ڵ����� ������ ���ش�.)
	//�߻�޼ҵ� : ���� O,  ����X, �μ� �������� ����
	//������ Ŭ������ �ʿ�. �� Ŭ������ ����.java
	
	public void ���µ��();
	public void ������ü();
	public void ����();
	public ATM ���(); 
	public ATM �����ܰ�();
	
	default void ����Ʈ() {
		System.out.println("����Ʈ�޼ҵ����");
	}
}
