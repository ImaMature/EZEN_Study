package Day14;

public class Util {
				//<T> Box의 T는 Box<T>에 이동
	public static <T> Box <T> boxing(T t) {
				//<제네릭>	반환타입	메소드명(변수)
		Box<T>box = new Box<>();
		box.setT(t);
		return box; //return box가 Day14_1
	}
}
