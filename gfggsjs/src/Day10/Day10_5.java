package Day10;

public class Day10_5 {
	//p.408 �ڽİ�ü ����
		public static void main(String[] args) {
			
			Anonymous anony = new Anonymous();
			//�͸� ��ü �ʵ� ���
			anony.field.wake(); // 6�ÿ� �Ͼ�ϴ�. �͸� �ڽ� ��ü �� �޼ҵ� ȣ��
			anony.method1(); // ��ü �� �޼ҵ� ȣ�� => �޼ҵ� �� �͸� ��ü
			anony.method2(
					new Person() {
						void study() {
							System.out.println("�����մϴ�.");
				}
					@Override
						void wake() {
							System.out.println("8�ÿ� �Ͼ�ϴ�.");
							study();
				}	
			}
		);
	}
}


///����
/*Day10_5 Ŭ������ ����Ŭ���� ���⼭ ����

(*Line�� ���ڴ� ���� �������� �ʴ� �̻�, ��� ����Ŭ������ �ڵ� ��)

Line7 : AnoymousŬ�������� ����� anony ����

Line9 : Anonymous�� Ŭ������ field��ü�� �̵�-> �������̵��� wake�޼ҵ� ���� (AnonymousŬ������ wake �޼ҵ�� PersonŬ������ wake �޼ҵ带 �������̵�(�����))
	-> ��å�մϴ� ���

Line10 : (��� AnonymousŬ������ method1������ ����Ǵ°�) method1�޼ҵ� ���� -> localvar.wake()�޼ҵ� ���� -> �������̵��� wake�޼ҵ� ���� -> 7�ÿ� �Ͼ�ϴ� ��� ->walk �޼ҵ�� -> ��å�մϴ� ���

Line11 : method2���� -> AnonymousŬ������ method2�� �Ű�����(Person person)���� �̵� �ش� �Ű������� Day10_5Ŭ���� Line 12�� ������ new Person�� �μ��� �޾Ƽ� wake()�޼ҵ带 ���� ->
	Day10_5 Ŭ������ Line17�� �������̵��� wake ���� -> 8�ÿ� �Ͼ�ϴ�. ��� -> study �޼ҵ� ���� -> �����մϴ� ���
*/
