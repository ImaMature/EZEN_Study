package Day10;

public class Button {
//p.402 ���������� ������ �س���
	
	//��ü�� �������̽� �־ ���� ��ü(���ǵ� �޼ҵ�) �����
	
	//��ø �������̽� : Ŭ���� ���ο� �������̽� ����
	interface OnClickListener{
		void onClick(); //�߻�޼ҵ�
	}
	//1. �ʵ� : �������̽� �ʵ�
	OnClickListener listner; 
	
	//2. ������
	
	//3. �޼ҵ�
	void setOnClickCListener(OnClickListener listener) {  //�ܺο��� �ҷ��� �Ű������� �������̽��� ����ִ°� // OnClicListener -> listener -> this.listner -> �ʵ�� �̵�
		this.listner = listener;
	}
	
	void touch() {
		listner.onClick();
	}
}
