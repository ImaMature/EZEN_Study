package sound;

public class EE {

	private static void printsound(Soundable soundable) { //������ (�������̽�Ÿ�� �Ű�����)
		System.out.println(soundable.sound()); //soundable�� �Ű����� �߻�޼ҵ� ȣ�� Cat,DogŬ������ sound�޼ҵ� ����
		//return�� �߿�,�۸� ���
	}
	
	public static void main(String[] args) {
		printsound(new Cat()); //printsound �޼ҵ� ȣ��,cat Ŭ������ �޸𸮸� �Ű������� �޾ƿ� ��ȯ�� ���
		printsound(new Dog()); //printsound �޼ҵ� ȣ��,Dog Ŭ������ �޸𸮸� �Ű������� �޾ƿ� ��ȯ�� ���
	}
}
