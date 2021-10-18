package Day13;
//Day 13_4 멀티 제네릭
public class Product <T, M>{ //여러개 가능

	private T kind;
	private M Model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return Model;
	}
	public void setModel(M model) {
		Model = model;
	}
	
	
}
