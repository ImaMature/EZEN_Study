package Day06;

public class Day06_3_Car4 {
 // p.223
	
	//�ʵ�
	int gas;//4.int gas = 5
	//������
	
	//�޼ҵ�
	void setGas(int gas) { //2.car4.setGas(5) �޾Ƽ�  int gas(�Ű�����)�� ����
		this.gas = gas; //3. �Ű����� gas�� ���� 5�� this.gas�� ����(�ʵ� int gas = 5)
	}
	boolean isLeftGas() { //5.gas==5�ϱ� //16. gas ==0�̶� if ����
		if(gas==0) {
			System.out.println("gas�� �����ϴ�."); //17. ������ �����ϴ� ���
			return false; //18. boolean isLeftGas = false ��ȯ
		}
		System.out.println("gas�� �ֽ��ϴ�."); //7.gas�� �ֽ��ϴ� ���
		return true; //8. return true����
	}
	
	void run () { //���ѷ��� //12. run ���ѷ��� ����
		while(true) {
			if(gas>0) { //13. gas = 5~ 0�� ���� ���ѷ��� 
				System.out.println("�޸��ϴ�(gas�ܷ�:" + gas + ")");
				gas-=1;
			} else {
				System.out.println("����ϴ�(gas�ܷ�:" + gas + ")"); //14. gas =0�϶� ""�� ���� ���
				return; // 15. void run() �޼ҵ� �������� boolean���� �ö�
			}
		}
	} //void run() end
	
	/* [�޼ҵ� �����ε�] : �޼ҵ���� ������ ��� �μ� ����[Ÿ��, ����, ����]
	void run() 	   	 { }	// �޼ҵ���� ���� �μ��� ���� run�� �־ ���� <�Ұ�>
	void run(int x ) { }	// ���� �̸��� ������ �μ��� �޶�(int x) ���� <����>
	* ��� : �޼ҵ� ���� ������ ���Ұ�, �μ� ���� �ٸ��ٸ� ��밡��
	*/
	
	//���� Ŭ���� ȣ��
	void start() {
		run();
	}

}
