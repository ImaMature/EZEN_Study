package Day14;

public class Util {
				//<T> Box�� T�� Box<T>�� �̵�
	public static <T> Box <T> boxing(T t) {
				//<���׸�>	��ȯŸ��	�޼ҵ��(����)
		Box<T>box = new Box<>();
		box.setT(t);
		return box; //return box�� Day14_1
	}
}
