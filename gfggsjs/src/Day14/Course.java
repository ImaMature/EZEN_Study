package Day14;

public class Course <T>{
	
	//필드
	private String name;
	private T[] students; // 외부로부터 받은 타입의 배열 선언 모든 T가 해당 타입으로 변환
	
	//
	public Course(String name, int capacity) {
		this.name=name;
		//students = new T[]; //메모리 할당이 안됨 제네릭은 new연산자 불가
		students = (T[])new Object[capacity]; 
		//Object로 배열 선언 후 제네릭으로 형변환
		//T가 students에 저장 students 는 T가됨
		
		
	
		
		
	}

	public String getName() {return name;}

	

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for(int i=0; i<students.length; i++) { //T의 길의 만큼 배열
			if(students[i] == null) {
				students[i] = t; break;
			}
		}
	}
	
}
