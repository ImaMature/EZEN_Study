package Day06;

public class Day06_3 {

	public static void main(String[] args) {
		//p.217		//Calculator.java
		
		//��ü�����	[������ ���� ������ ���� ��� �� ������]
		Day06_3_Calculator calculator = new Day06_3_Calculator();
		
		
		//��ü�� ���� �޼ҵ� ȣ��
		calculator.powerOn();
		
		//��ü�� ���� �޼ҵ� ȣ�� [ �μ��� �����ؼ� ���� ���� ������ ���� ] // �μ� = 5�� 6
		int result1 = calculator.plus(5, 6); //return result���� ����� ���� result1�� ����
		System.out.println("�Լ� ����� : " + result1);
		
		byte x =10; byte y=4;//�ʱⰪ �����
		double result2 = calculator.divide(x, y);
		System.out.println("�Լ� ����� : " + result2);
		
		calculator.powerOff(); //������ ���ϴ�.
		
		
		//p.223
		
		Day06_3_Car4 car4; // ��ü
		car4 = new Day06_3_Car4(); // �ν��Ͻ�ȭ
			//1. ��ü�� �ʵ忡 ���� �ʱ�ȭ�� �� �ִ� ���
				//1) ��ü��.�ʵ�� = 10
				//2) new Ŭ������(10)
				//3) ��ü��.set�޼ҵ�(10)
		
		car4.setGas(5); //setGas �޼ҵ� ȣ�� [ �μ��� 5 �ֱ� ] 1. 5�ֱ�
		
		boolean gasState = car4.isLeftGas(); //9. return ���޾Ƽ� boolean gasState�� true�̱� ������ ����
		if(gasState) { //10. true
			System.out.println("���"); //11. ��� ���
			car4.run();//12. run ȣ��
		}
		
		if(car4.isLeftGas()) { // true�̸� if�� false�̸� else��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���."); //19. false ��ȯ�� �޾Ƽ� else ���
		}
	}
}
