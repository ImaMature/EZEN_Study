package Day11;

public class Member2 implements Cloneable{ 
					//��ü �������̽� ����
	
	//�ʵ�
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	//������
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//�޼ҵ�
	public Member2 getMember2() {
		Member2 cloned = null; //�� ���� ����
		try {
			cloned = (Member2)clone(); //����ȯ
			// �ش� �޼ҵ带 ȣ���� ��ü�� ����
			// clone(); ���� Clonable �������̽� ����
		} catch (CloneNotSupportedException e) {}
		return cloned;
	} // �Ϲݿ��� ����
	
	@Override
	public String toString() {
		System.out.println("id : " + this.id);
		System.out.println("id : " + this.name);
		System.out.println("id : " + this.password);
		System.out.println("id : " + this.age);
		System.out.println("id : " + this.adult);
		return" ";
	}
	
}
