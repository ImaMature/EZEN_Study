package Day06;
	
	//Day06_1�̶�� Ŭ������ main�޼ҵ忡�� Student ��ü ����
public class Day06_1 {
// public class = Ű����
// public ���� ������
	
//p.195 Ŭ�����κ��� ��ü ����
	
	
	// 1. ��ü ����� : Ŭ������ �̿��� �޸� �Ҵ�
	//����� ����? AŬ�������� BŬ������ ���ǵ� ������ �޼ҵ带 ���� ���ؼ�
	public static void main(String[] args) {
		
		
		
		Day06_1_Student student = new Day06_1_Student(); //å������ s1�̶�� ���������� student�� �ٲ� 	// Student Ŭ������ �ν��Ͻ�ȭ
		//Ŭ������ ��ü(����)�� = new ������ ();		//new ��� Ű���带 ���	 //new�� Ŭ�����κ��� ��ü�� �����ϴ� ������
		//Ŭ������ == �����ڸ�				// new �����ڷ� ������ �޸𸮴�	 ���� ������ ������
		
		
		
		System.out.println("student ������ Student ��ü�� �����մϴ�.");
		System.out.println("��ü�̸� ��� : " + student);
		
		Day06_1_Student student2 = new Day06_1_Student();
		System.out.println("student2 ������ Student ��ü�� �����մϴ�.");
		
		System.out.println("��ü�̸� ��� : " + student2); // �ش� ��ü �޸��� �ּҰ��� ����. // �ּ� = 16����
		// Student Ŭ������ 1��������, new�����ڸ� ����� ��ŭ ��ü�� �޸𸮿� ������. 
		// �̷��� ��ü���� Student Ŭ������ �ν��Ͻ���. 
		
		
		//p.201
		//��ü ����
		Day06_1_Car car = new Day06_1_Car();
		
		//��ü �� ���[�ʵ�] ȣ��
		System.out.println("����ȸ�� : " + car.company);
		System.out.println("�𵨸� : " + car.model);
		System.out.println("���� : " + car.color);
		System.out.println("�ְ�ӵ� : " + car.maxSpeed);
		System.out.println("����ӵ� : " + car.speed); //speed Ŭ������ ���� ���ؼ� ���� 0
		
		//��ü �� ���[�ʵ�] �� ����
		car.speed = 60;
		System.out.println("������ �ӵ� : " + car.speed); // speed �� 60���� �ٲ�
		
		
		//p.205 �����ڸ� �̿��� ��ü ����
		Day06_1_Car2 car2 = new Day06_1_Car2("����", 3000); 
		
		
		//p.207 : ������ = > �ʵ� �ʱ�ȭ
		Day06_1_Korean k1 = new Day06_1_Korean();
		System.out.println("k1 : " + k1.nation);
		
		Day06_1_Korean korean = new Day06_1_Korean("���ڹ�", "011225-1234567"); // Korean Ŭ������ String n, String s�� ���� �Էµ�
		System.out.println("korean1 name : " + korean.name);
		System.out.println("korean1 ssn : " + korean.ssn);
		
		Day06_1_Korean korean2 = new Day06_1_Korean("������", "930101-2234567");
		System.out.println("korean2 name : " + korean2.name);
		System.out.println("korean2 ssn : " + korean2.ssn);
		
		// ����ִ� ��ü [�������]
		Day06_1_Korean korean3 = new Day06_1_Korean();
		korean3.name = "���ڹ�"; // ���� �����ؾߵ�
		korean3.ssn = "930101-2234567";
		System.out.println("korean3 name : " + korean3.name);
		System.out.println("korean3 ssn : " + korean3.ssn);
		
	}
}
