package Generic;

public class AgeList <T> {
	// �ʵ� 
		private String name;
		private int age;
		private T[] aa;
		// ������ 
		public AgeList( String name , int capacity ) {
			this.name = name;
			this.age = age;
			aa = (T[])new Object[capacity];
				// ���׸� ��ü������ NEW ������ �Ұ� 
				// object ���� �迭 ������ ���׸����� ����ȯ
		}
		// �޼ҵ� 
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
