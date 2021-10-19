package Day14;
//p.668
public class Worker extends Person{
	
	public Worker(String name) {
		
		super(name); //worker, students, highschool 클래스의 슈퍼는 부모인 person클래스의 슈퍼와 구성이 같아야한다.
			// super는 슈퍼(부모)클래스의 생성자를 불러오는것.
			// highschool과 worker와 students는 호환이 안됨 형변환도 안됨
			// highschool의 슈퍼클래스는 최종적으로 person.
	}

}
