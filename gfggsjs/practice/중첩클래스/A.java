package 중첩클래스;

public class A {

	A() {  System.out.println("A 객체 생성"); } //힙 메모리
	
	class B { //? 무슨 클래스인지
		B() { System.out.println("B 객체 생성");}
		int field1; //field1 선언
		void method1() {}
		
	}
	
	static class C { //A와는 다른 정적 클래스 C //데이터 영역 메모리 //프로그램종료시까지 메모리에 남아있음
		C() {System.out.println("C 객체 생성"); }
		int field1; //B클래스의 field1과 이름이 같지만 다른 영역 메모리에 생성되기 때문에 같은이름으로 생성가능
		static int field2;
		void method1() {}
		static void method2(){}	
		
	}
	void method() { //메소드
		
		class D { // 지역 클래스 //메소드 실행시에만 사용, 메소드 실행 종료되면 없어짐
			D() {System.out.println("D 객체 생성");}
			int field1;
			void method1() {}
		}
		D d = new D();//생성자
		d.field1 =3;
		d.method1();
		
	}
}
