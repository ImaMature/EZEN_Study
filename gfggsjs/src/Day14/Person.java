package Day14;

public class Person {

	//field
	private String name;
	
	
	//constructor
	public Person(String name) {
		
		this.name = name;
		
	}

	//method
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return this.getName();
		//������ ��ܿ� �ּҰ��� �ƴ� ���ڿ��� ��µǱ⸦ ���� ��� toString
	}
	
	
}
