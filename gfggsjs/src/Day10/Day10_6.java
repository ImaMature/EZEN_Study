package Day10;

public class Day10_6 {

	//p.417 Ȯ�ι���
		// 1. ��) 4 [���� ��� Ŭ���� ���ο��� �ٱ� Ŭ������ ���� ������ ��밡��]
			//���� static [ static ��� �⸮�� ���� ���� ]
	
		// 2. ��) 3 [���� Ŭ������ static(����) ��� �Ұ�, �޼ҵ� �ȿ� �ֱ� ������ �Ұ�]
			// ���� Ŭ���� : �޼ҵ� �ȿ��� ����� Ŭ����
			// �ν��Ͻ� Ŭ���� && ���� Ŭ������ �ٱ� Ŭ������ ��� ��� ����, static�� �ȵ�
			// final Ư���� ���� �Ű� ������ ���� ������ ���� Ŭ���� ���ο��� ����� �� ����
	
		// 3. �� 3) [�͸� ��ü�� ��ȸ���̶� ������ ������ �� ����. �ϳ��� ��ü ���� ������]
			// �͸� ��ü�� ��ȸ��
		
		// 4. 
			// static ������ ���� ������ �ν��Ͻ�
			// Tire : �ν��Ͻ� Ŭ����		Car.Tire tire = myCar.new Tire(); ��ü�� ���� �ν��Ͻ� ����
			// Engine : ���� Ŭ����			Car.Engine engine = new Car.Engine();
	
		//5.
	public static void main(String[] args) {
		Anonymous2 anonymous2 = new Anonymous2();
		anonymous2.field.run();
		anonymous2.method1();
		anonymous2.method2(new Vehicle(){
			public void run() {
				System.out.println();
				}
			}
		);
	}
	
		//6. Chatting Ŭ����
}
