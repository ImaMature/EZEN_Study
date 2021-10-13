package Day10;

public class Anonymous {

	//p.407 �͸� �ڽ� ��ü ����
	
	//�ʵ� �ʱⰪ���� ����
	Person person = new Person(); //��ü
	
	//�͸� �ڽ� ��ü : 1ȸ�� ��ü ����
	Person field = new Person() { //Person Ŭ�����ȿ��� field��� �͸�ü ����
		
		//�Ϲ� �޼ҵ�
		void work() {
			System.out.println("����մϴ�.");
		}
		//�������̵� �޼ҵ�
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�."); // PersonŬ������ wake �������̵�
		}
	};// �͸�ü ���� ��
	
	
	// ������
	
	// �޼ҵ�
	void method1() {
		//���� ���������� ���� (�޼ҵ� �ȿ� �ִ°�)
		Person localvar = new Person() {
			void walk () {
				System.out.println("��å�մϴ�.");
				
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
				
			}
		};
		//���� ���� ���
		localvar.wake();
	}
	
	
	void method2(Person person) {
		person.wake();
	}

}
