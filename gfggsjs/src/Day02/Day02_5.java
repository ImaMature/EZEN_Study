package Day02;

public class Day02_5 { //c s

	public static void main(String[] args) { //m s
		
		//���� : char
		//���ڿ� : �ڷ��� ���� => String Ŭ����
		
		char ����1 = 'a'; System.out.println("����1 : " + ����1);
		//char ����2 = 'abc'; //�Ұ� �ֳ��ϸ� char�� 2����Ʈ�� �ϳ��� ���ڸ� ���� �����ϱ� ����.
		// �ذ�� 1. String�� �̿��� ���ڿ� ����
		String ���ڿ�1 = "abc"; System.out.println("���ڿ�1 : " + ���ڿ�1);  //���ڿ� ���尡�� ������ ū����ǥ��ߵ�
		
		// �ذ�� 2. �迭�� �̿��� ���ڿ� ���� 
		char[] ���ڿ�2 = {'a', 'b', 'c'};
		System.out.println(���ڿ�2);
		System.out.println("���ڿ�2 : " + ���ڿ�2); //***�̻��ϰ� ��µǴ� ����?
		
		// String : ���ڿ� ���� ���ִ� Ŭ����
			// ��ü���� �� �����ڸ� ������� ���Ѵ�. 
			// ��ü���� ���� ���� .equals(���ڿ�) �޼ҵ带 ���
		
		String �̸� = "���缮"; //���� : 1����Ʈ , �ѱ� : 2����Ʈ
		String �̸�2 = new String("���缮"); 
		System.out.println(�̸� + �̸�2);
		// new�� �ᵵ �ǰ� �� �ᵵ�� ������ ���ڿ� ��ü�� �޸𸮰� ���ֱ� ����
		// Scanner���� new�� ��ߵ� �Ҵ�� ���� ���� �𸣱� ����
		
		System.out.println(�̸� == �̸�2); //false, ==�����ڴ� �ּҸ� ���Ѵ�
		System.out.println(�̸�.equals(�̸�2) ); //true, equals()�� ������ ���Ѵ�.
	} //m e
}//c e
