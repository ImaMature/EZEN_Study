package Day06;

public class Day06_3_Calculator {

	//p.217 //Day06_3
	// ��ü�� ���� �޼ҵ� ȣ���ϱ�
	//�ʵ�
	
	//������
	
	//[�޼ҵ�]
	// �μ�X ��ȯ(return)X [void]
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	// �μ�O [int, int] ��ȯO [int]
	int plus(int x, int y) { //5�� 6�� ����
		int result = x+y; //11�� result�� ����
		return result;	
		//�� ���� result�� ����, ���� �����ִ°� �ƴ϶� 11�� ���� �����ߴٴ� ��
		//��������!! return�� �ڿ� ���๮(system.out.print~~)�̿��� �ȵȴ�.
	}
	//int �� �޼ҵ忡��  byte, short, intŸ���� ���� ���ϵǵ� ������.
	// byte short�� int�� �ڵ� ����ȯ�Ǿ� ���ϵǱ� ����.
	
	//�μ� O [byte, byte] ��ȯ O [double]
	double divide( int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	//�μ�X ��ȯX[void]
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
