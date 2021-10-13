package Day10;

public class Day10_3 {
	public static void main(String[] args) {
		//p.394 중첩클래스
		
		A a = new A(); // A클래스가 메모르 힐당될 때 중첩된 클래스들은 메모리 할당X
		
		//2. 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();		//인스턴스 클래스  B클래스의 생성자B를 a에 저장해서 A클래스의 B클래스 호출해서 b선언과 동시에 저장
		//A.B b2 = new A.B(); 	//정적 클래스 (static이 아니라서 오류뜸)
		b.field1 = 3;
		b.method1();
		
		//3. 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		
		A.C.field2 = 3; // static : 객체 생성 없이 접근 가능
		A.C.method2();
		
		//4. 로컬 클래스 객체 생성
		a.method();
	}
}
