package Day10;
//p.394
public class A {

	//�ʵ�
	
	//������ : ���� Ŭ������� �̸��� �����ϸ� ������		// �������� ������ �޼ҵ�
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	
	//�ν��Ͻ� ��� Ŭ����//
	class B {
		// 1. �ʵ�
		int field1;
		int field2;
		// 2. ������
		public B() {
			System.out.println("B ��ü�� ������");
		}
		// 3. �޼ҵ�
		void method1() {}
	} // B end
	
	//���� ��� Ŭ����//
	static class C{

		//1. �ʵ�
		int field1;
		static int field2;
		
		//2. ������
		public C() {
			System.out.println("C ��ü�� ������");
		}
		void method1() {}
		static void method2() {}
	}// C end
	
	//3. �޼ҵ� [ AŬ���� �� �޼ҵ� ]
	void method () {
		//���� Ŭ����// (�޼ҵ� �ȿ� Ŭ������ �� �� ����)
		class D{ 
			//1.�ʵ�
			int field1;
			//2.������
			public D() {System.out.println("D ��ü�� ������");}
			//3.�޼ҵ�
			void method1() {}
		}
		//�޼ҵ� �� ��������
		//�޼ҵ� ȣ���Ϸ��� d�� �����ؼ� ���
		D d = new D(); //DŬ������ d��� ��ü ���� �ν��Ͻ�ȭ
		d.field1 = 3;
		d.method1();
	}
}
