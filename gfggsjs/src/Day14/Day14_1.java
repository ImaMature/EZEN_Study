package Day14;

public class Day14_1 {
//Member Ŭ������ ����
	//�ܺηκ��� Ŭ���� Ÿ�� ���ϱ�
	public static void main(String[] args) {
		
		Member<String, Integer> member = new Member();
		// ���׸� : Ÿ�Ժ�ȯ
		// ���Ŭ���� T�� String����ֱ� 
		// ��ӹ��� �ڽ��� �ڵ� ����ȯ ����, �θ�� ��������ȯ\
		
		// p.660 ���׸� �޼ҵ�
		Box<Integer> box1 = Util.<Integer>boxing(100);
		// Util.Box<T>�� <integer> ����ֱ�, BoxŬ���� �ڷ����� �� int������ �ٲ�
		System.out.println(box1.getT());
		
	}
	
}
