package 중첩클래스;



public class Main {

	public static void main(String[] args) {
		A a = new A();//a라는 임시 객체 생성 (A클래스의 메모리(필드, 생성자, 메소드)가 a에 저장)
		//A()메소드 실행 -> 
		 //A클래스 먼저 선언. 그다음 선언한 a를 통해 B클래스 메모리를 b에 저장
		A.B b = a.new B(); //클래스 B의 메모리를 사용하기 위해서 A클래스로 B클래스를 불러와서 임시객체 선언
		b.field1 = 3; //클래스 B의 field1의 3을 저장
		b.method1(); //메소드 method1() 실행
		
		A.C c = new A.C(); // 따로 A클래스의 임시객체를 미리 선언하지 않아도 정적클래스static클래스라 불러와진다.
		c.field1=3;
		c.method1();
		//c.method2(); //c.method2();가 안됨
		A.C.field2 =3;
		A.C.method2();// 이렇게 불러오는 이유?
		
		a.method(); //바로 불러와짐 이유는? A 클래스 내부의 메소드라서.
		//실행한 값인 d.method1(); 출력됨
	}
}
