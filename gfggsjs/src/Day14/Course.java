package Day14;

public class Course <T>{
	
	//�ʵ�
	private String name;
	private T[] students; // �ܺηκ��� ���� Ÿ���� �迭 ����
	
	//
	public Course(String name, int capacity) {
		this.name=name;
		//students = new T[]; //�޸� �Ҵ��� �ȵ� ���׸��� new������ �Ұ�
		students = (T[])new Object[capacity]; 
		//Object�� �迭 ���� �� ���׸����� ����ȯ
		
		
		
	
		
		
	}

	public String getName() {return name;}

	

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t; break;
			}
		}
	}
	
}
