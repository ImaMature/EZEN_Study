package Day09;

public class Car {
	//p.315 //tireŬ������ maxRotation�����ڿ� location ������ ��ġ�� ����� �ٸ��Ƿ�, �ؿ� �����ִ� �ʵ��� �Է°��� ��ġ�� �ٸ�
	
	//�ʵ� [ ����, �迭, ��ü �� ]
	Tire frontLeftTire = new Tire ( 6, "�տ���");
	Tire frontRightTire = new Tire ( 2, "�տ�����");
	Tire backLeftTire = new Tire ( 3, "�ڿ���");
	Tire backRightTire = new Tire ( 4, "�ڿ�����");
	//������
	
	//�޼ҵ�
	int run() {
	// ���������� ������ => �⺻�� : default
		System.out.println("[�ڵ����� �޸��ϴ�]");
		//roll�� false�̸� �ִ� ȸ������ �۴ٴ� ��
		//true�� ��� if���� ���ͼ� return���� ���ϴ�.
		if(frontLeftTire.roll() == false) 	{stop(); return 1;} 
		if(frontRightTire.roll() == false) 	{stop(); return 2;} //Main �� case2
		if(backLeftTire.roll() == false) 	{stop(); return 3;}
		if(backRightTire.roll() == false ) 	{stop(); return 4;}
		return 0;
	}

	private void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
		
	}
}
