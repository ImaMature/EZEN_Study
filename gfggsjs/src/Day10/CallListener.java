package Day10;

import Day10.Button; //Button Ŭ���� ��������

public class CallListener implements Button.OnClickListener{
									//Ŭ������.�����������̽�(�̰� ��� Button class�� Onclick~�������̽��� ���� onClick�޼ҵ����ǰ���
	@Override //onClick������ �߻�޼ҵ� ����
	public void onClick() { 
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �մϴ�.");
	}
}
