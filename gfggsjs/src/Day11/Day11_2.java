package Day11;

//p.459 ��ü ���� �� �޼ҵ�
public class Day11_2 {

	public static void main(String[] args) {
		
		//API
			//���̺귯�� : ������� Ŭ����, �������̽�
		//Object Ŭ����
			//1. equals() :
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) { //��ü ���� �� �޼ҵ�
			System.out.println("�� ��ü�� �����մϴ�.");
		}else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("�� ��ü�� �����մϴ�.");
		}else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}
		
		//2. toString() : ��ü����
			// ��ü�� �ּҰ� [ �ڷ��� = �� ȣ�� ]
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		//3. clone() : ��ü ����
				//���� ���� : �迭 ��ü�� ���� �Ұ� [�ּҰ��� ����]
				//���� ���� : �迭 ��ü�� ���� ����
		
			//3-1. ��ü ����
			Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true);
			
			//3-2. ��ü ����
				//���赵(Ŭ����)�� ���ؼ� �޼ҵ尡 ��������� ���� �̸��� ������ �ٸ� �޼ҵ�
			Member2 cloned = original.getMember2(); //�ش� �޼ҵ带 ȣ���� ��ü = original
			cloned.password="67890";  //����� password�� �����
			
			System.out.println("-------------������ ��ü ����");
			cloned.toString();
			
			System.out.println("-------------���� ��ü ����");
			original.toString(); 
			//���� ��ü�� ����� ��ü�� �Ȱ����� �� �ּҰ��� �ٸ���.
			
			//3-3. ���� ����
				//1) ��ü ����
				Member3 original2 = new Member3("ȫ�浿", 25, new int [] {90, 90}, new Car("�ҳ�Ÿ"));
			
				//2)���� ����
				Member3 cloned2 = original2.getMember3();
				cloned2.scores[0] = 100;
				cloned2.car.model = "�׷���";
				
				System.out.println(" ----- ���� ��ü ");
				original2.toString();
				System.out.println(" ----- ���� ���� ��ü");
				cloned2.toString();
	}
}
