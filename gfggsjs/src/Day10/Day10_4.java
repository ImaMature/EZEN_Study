package Day10;

//Button CallListener MessageListener ���θ޼ҵ�
public class Day10_4 {

	public static void main(String[] args) {
			//button ��ü �� �������̽�(OnClickListener�� ����)
		Button button = new Button(); 
		button.setOnClickCListener(new CallListener()); // �̰� �����ϸ� CallListenerŬ���� ���� -> Button.java�� �޼ҵ� ����
		button.touch();
		System.out.println("��ü �� �������̽��� ����� ������ü ����");
		button.setOnClickCListener(new MessageListener());
		button.touch();
	}
}
