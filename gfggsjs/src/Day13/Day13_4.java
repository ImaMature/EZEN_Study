package Day13;

public class Day13_4 { //�ڽ� Ŭ����

	public static void main(String[] args) {
		
		//�����׸� : ���׸��� �������
			//1. Ÿ�� ��ȯ
		//1. ��ü ����
		Box box = new Box();
		//2. ��ü �޼ҵ� ȣ��
		box.set("ȫ�浿");	//�ڽ�Ŭ������ �θ�Ŭ���� �� �޾ƿ� �� ����		
										//ȫ�浿 [String] -> object [�ڵ� ����ȯ]
		String name = (String)box.get(); //object 		 -> String [���� ����ȯ]
		
		box.set(new Apple());
		Apple apple = (Apple)box.get(); //���� ����ȯ
		
		//���׸� : ����ȯ�� ���� ��ü Ŭ���� ����
		//p.658 BoxExample
		Box2<String> box2 = new Box2<>();
		//Ŭ������ <�Ű�Ŭ����> ������ = new ������<>();
		box2.set("hello");
		String str = box2.get(); // ����� hello�� str�� ����
		
		Box2<Integer> box22 = new Box2<>();
		box22.set(6);
		int value = box22.get();
		
	}
}
