package Day09;

public interface ATM {
	//1. ����ʵ�
	//2. �߻�޼ҵ� [ ���� �ϰ� �����ڵ� ����X]
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	//3. ������ �޼ҵ�
	default void ���� () {System.out.println("ATM");}
	//4. �����޼ҵ�
	
} 
