package Day14;

public class Day14_1 {
//Member Ŭ������ ����
	//�ܺηκ��� Ŭ���� Ÿ�� ���ϱ�
	public static void main(String[] args) {
		
		Member<String, Integer> member = new Member();
		// ���׸� : Ÿ�Ժ�ȯ
		// ���Ŭ���� T�� String����ֱ� A�� integer 
		// ��ӹ��� �ڽ��� �ڵ� ����ȯ ����, �θ�� ��������ȯ
		// 
		
		
		// p.660 ���׸� �޼ҵ�
		Box<Integer> box1 = Util.<Integer>boxing(100);
		// Util.Box<T>�� <integer> ����ֱ�, BoxŬ���� �ڷ����� �� int������ �ٲ�
		System.out.println(box1.getT());
		
		
		/*
		 * util boxing()�޼ҵ� ���� -> util Ŭ������ public static <T> Box <T> boxing(T t) ���� 
		 * <T>�� int�ֱ� 
		 */
		Box<String> box2 = Util.boxing("ȫ�浿");
		System.out.println(  box2.getT() );
		
	}
	
}
