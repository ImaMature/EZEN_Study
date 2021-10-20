package Day15;

public class Person implements Comparable<Person>{

	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	@Override // 오름차순
//	public int compareTo(Person o) {
//		if(age<o.age) return -1; //내부객체가 더 크면 -1 여기서 숫자는 인덱스
//		else if(age ==o.age) return 0;
//		else return 1; //외부객체가 크면 1\
//	}
	
	@Override // 내림차순
	public int compareTo(Person o) {
		if(age<o.age) return 1;
		else if(age ==o.age) return 0;
		else return -1; 
	}
	
	
}
