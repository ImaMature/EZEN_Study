package Generic;

public class AgeList <T> {
	// 필드 
		private String name;
		private int age;
		private T[] aa;
		// 생성자 
		public AgeList( String name , int capacity ) {
			this.name = name;
			this.age = age;
			aa = (T[])new Object[capacity];
				// 제네릭 자체적으로 NEW 연산자 불가 
				// object 으로 배열 선언후 제네릭으로 형변환
		}
		// 메소드 
		public String getName() {return name;}
		public int getAge() {return age;}
		public T[] getStudents() {return aa;}

		public void add( T t ) {
			for( int i = 0 ; i<aa.length; i++ ) {
				if( aa[i]==null ) {
					aa[i] = t;	break;
				}
			}
		}
		public void add(String name, int age) {
			
		}
}
