package Day09_1;

public class Child extends Parent{
	//Parent�κ��� ��ӹ��� Child

	private String name;
	

	public Child() { // ���� Ŭ������ ������
		this("ȫ�浿"); // (ȫ�浿,3)�ϰ��? �� �޼ҵ忡 �ʵ忡 int��ü�� �޼ҵ忡 int ��ü�� �����Ǿ�ߵ�
		System.out.println("Child() call");
		
		
	}


	public Child(String name) {	//this�� ���� �μ���ŭ ��µ�
	this.name = name;
	System.out.println("Child(String name) call");

	}
}
