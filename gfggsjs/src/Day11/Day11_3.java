package Day11;

public class Day11_3 {

	public static void main(String[] args) {
		
	//p.482
	// System Ŭ����
		// ��� ����� static�̱� ������ ��ü�� �ʿ����
		//ex) System.out.println(); //static -> ��ü�� ��� �޼ҵ尡 ȣ���
		
		//1. exit : ���α׷� ����
//		System.out.println("�ȳ�");
//		System.exit(0); // ���α׷� ���� ������ �� ��
//		System.setSecurityManager(new SecurityManager() {
//			@Override
//			public void checkExit(int status) { //32��° ���� ���� ���� status���� �޾Ƽ� if�� ����
//				if(status != 5) { 
//					throw new SecurityException();
//					
//					//i�� 0�϶� status = 0 => true => ���ܹ߻�O
//					//i�� 1�϶� status = 1 => true => ���ܹ߻�O
//					//~~~~
//					//i�� 5�϶� status = 5 => false => ���ܹ߻�X => try�� ����
//				}
//			}
//		});
//			for(int i =0; i<10; i++) { // �̰ź��� �� ���� ���� i�� 0���� 9���� 1�� ����
//			System.out.println(i); // ���
//			try {
//				//JVM���� ��û
//				System.exit(i); // i�� exit() �ֱ� //17��° ���� status�� ��
//				// i�� 5�϶� ���ܰ� ��� exit ����
//			}	catch(SecurityException e) {}
//		}
			
		//���α׷� ���� �ҿ�ð� ���ϱ�	
		//for���� 1000000ȸ �������� �� �ɸ��� �ð�
			//���۽ð�
			long time1 = System.nanoTime();	
			
			int sum = 0;
			for (int i = 1; i<1000000; i++) {
				sum+=1;
			}
			//������ �ð�
			long time2 = System.nanoTime();
			
			System.out.println("1~1000000������ �� : " + sum); //�޸𸮿� ���� ��°� �ٸ�
			System.out.println("�ɸ��ð� : " + (time2-time1) + " ���� ��"); 
			System.out.println(System.nanoTime());
			
		//�ý��� ����(������Ƽ) �б� [ System.getgetProperty("ȣ��Ű")]
			System.out.println("pc os : " + System.getProperty("os.name"));
			System.out.println("pc ������̸� : " + System.getProperty("user.name")); // ����� ��ǻ�� �̸�
			System.out.println("����� ���� ��ġ : "+System.getProperty("user.home")); // ����� ���� ��ġ
	
	}//main end
}//class end
