package Day06;

public class Day06_2_Car3 {
// Car3.java�� ���赵�� Day06_2.javaŬ������ ����غ���
//p. 213	
	//1. �ʵ�
	String company = "�����ڵ���";
	String model;	String color;	int maxSpeed;		
	
	//2. ������ : ���� �ٸ� �μ��� ���� ������ ������ ���� ����	//�μ� : �ܺηκ��� ������ ����
		//1) �� ������(����) : �ʵ带 ���� ����
		public Day06_2_Car3() {
			
		} // car1�� ����
		
		//2) ������ : �ϳ��� �ʵ带 �޴� ������
		public Day06_2_Car3(String model)  {//�μ� 1��
			this.model = model; 
			//�����μ�      //�ܺ��̴�
		} // car2�� ����
		
		//3) �ΰ��� �ʵ带 �޴� ������
		public Day06_2_Car3(String model, String color) {//�μ� 2��
			this.model = model;
			this.color = color;
		} //car3�� ����
		
		//4) ������ �ʵ带 �޴� ������
		public Day06_2_Car3(String model, String color, int maxSpeed) {//�μ� 3��
			this.model=model;
			this.color=color;
			this.maxSpeed=maxSpeed;
		} //car4�� ����
		
	//3. �޼ҵ�
		//public static void main(String[] args) {
//				}
		//�Ϲ����� ������ {}�ȿ����� ���డ�� ������ ������
		// �װ��� �ٷ� ��������
		
}
