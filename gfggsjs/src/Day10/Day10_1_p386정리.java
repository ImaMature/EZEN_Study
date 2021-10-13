package Day10;
//p.386 3�� Ŭ���� Day10_1, Cat, Dog, Soundable4���� Ŭ������ ��������
public class Day10_1_p386���� {
	
	private static void printSound(Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
	
	public static void dbWork( DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		// p.386 Ȯ�ι���		
			// 1. 3 [ �������̽��� ����� �޼ҵ常 ���� ] 
			// 2. 4 [ ������ü�� �������̽��� �ڵ� ��ȯ ] 
			// 3. 
		printSound( new Cat() );
		printSound( new Dog() );
			// 4. 
		dbWork( new OracleDao() );
		dbWork( new MySqlDao() );
			// 5. �͸� ���� ��ü 
			// �������̽��� ������ = new �������̽���(){ ���� };
		
		Action action = new Action() {
			
			// �߻�޼ҵ� ���� 
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
			
		}; // ���� ��
			// �������̽� ���� 
			action.work();
	}
	
	
}
