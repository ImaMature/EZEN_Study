package ��øŬ����;

public class A {

	A() {  System.out.println("A ��ü ����"); } //�� �޸�
	
	class B { //? ���� Ŭ��������
		B() { System.out.println("B ��ü ����");}
		int field1; //field1 ����
		void method1() {}
		
	}
	
	static class C { //A�ʹ� �ٸ� ���� Ŭ���� C //������ ���� �޸� //���α׷�����ñ��� �޸𸮿� ��������
		C() {System.out.println("C ��ü ����"); }
		int field1; //BŬ������ field1�� �̸��� ������ �ٸ� ���� �޸𸮿� �����Ǳ� ������ �����̸����� ��������
		static int field2;
		void method1() {}
		static void method2(){}	
		
	}
	void method() { //�޼ҵ�
		
		class D { // ���� Ŭ���� //�޼ҵ� ����ÿ��� ���, �޼ҵ� ���� ����Ǹ� ������
			D() {System.out.println("D ��ü ����");}
			int field1;
			void method1() {}
		}
		D d = new D();//������
		d.field1 =3;
		d.method1();
		
	}
}
