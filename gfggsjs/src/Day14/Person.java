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
		//수강생 명단에 주소값이 아닌 문자열이 출력되기를 원할 경우 toString
	}
	
	
}
