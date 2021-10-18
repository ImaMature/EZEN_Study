package Day13;
//Day13_4 제네릭과 연관
public class Box { //부모 클래스
	
	//필드
	private Object object;
	
	//메소드
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
