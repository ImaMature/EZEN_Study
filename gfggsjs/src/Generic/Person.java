package Generic;
//����1 ��� ���α׷�
//[����1] �޴� [���ѷ���]
//	1. ��� �߰�
//	2. ��� ���
//
//[����2] �̸�, ���� �Է¹޾� �Ʒ� ���ǿ� ���� ��� ���
//
//[����3]    ���̰� 8�� �̸��̸� ���� ��� ���
//	���̰� 20�� �̸��̸� û�ҳ� ��� ���
//	�׿ܴ� ���� ��� ���
//
//[����4] �����½� ��ܺ� �ο����� ��� �̸� ���
//
//[����5] ����, û�ҳ�, ���� => ������κ��� ���


public class Person {

	String name;
	int age;
	
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
