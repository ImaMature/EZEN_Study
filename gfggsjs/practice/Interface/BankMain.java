package Interface;



public class BankMain {


	//1. ���� ���α׷� [ ���, �������̽� ]
		// ATM [�������̽�]
			// �߻�޼ҵ� : ���µ��, ����, ���, ��ü, �ܰ�
		//1. ���� [����Ŭ����]
			// �ʵ�(�Ӽ�) : ���¹�ȣ, ���ݾ�
			// �޼ҵ�(�ൿ) : ���µ��, ����, ���, ��ü, �ܰ�
		//2. �������� [����Ŭ����]
	
		//3. �������� [����Ŭ����]
	public static ���� [] arr = new ���� [100];
	public static void main(String[] args) {
		ATM a = new ��������();
		a.���µ��();
		a.������ü();
		a.�����ܰ�();
		a.����Ʈ();
		
		System.out.println();
		
		ATM b = new ��������();
		b.���µ��();
		b.������ü();
		b.�����ܰ�();
		b.����Ʈ();
		b.����();
		b.���();
		
		
		
		//5. ����Ŭ������ ����Ŭ������ ��ü�� ���� �� �ִ� �迭
		// ����Ŭ������ �迭 ����
		���� temp = new ����();
		arr[0] = temp;
		�������� temp2 = new ��������();
		arr[1] = temp2;
		�������� temp3 = new ��������();
		arr[2] = temp3;
		
		arr[0] = new ����();
		arr[1] = new ��������();
		arr[2] = new ��������();
	
	}
}