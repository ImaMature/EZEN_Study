package Day13;

 // Toolkit Ŭ���� �������� [UI ���� �޼ҵ� ����] �ٵ� �ܿ��ʿ����. �����Ŷ�
import java.awt.Toolkit;
//p.576 ������
public class Day13_1 {

	//1. cpu : �޸� ���� [�������� : �ҷ��� ��ɾ� ��� ]
	//2. �޸� [�ֱ����ġ]
	public static void main(String[] args) {
		//1.main : ���� ������ ����
			//1. ù�ڵ���� ���������� ����
			//2. return�� ������ ���� ���� (return�� ��������, void)
		//2. ��Ƽ������ [���� �۾�]
			// ��ǻ�ʹ� ���ÿ� ó�� ����. �����층�� �޾Ƽ� ó��. �װ� �ʹ����� ��Ƽ�½�ŷ�ϴ°� ���ƺ���;
			//* �ü���� �����忡�� �ڿ� �Ҵ� �޾�(�����층) => ���������� ó��
			//1. �������� ������ �� �ϳ��� ���������� ���μ��� �����������.
			//2. ��Ƽ������ ���� ���
		
				//1. Runnable : ������ �������̽�
					// implements Runnable 
						// (��ü ȥ�� ������) ����Ŭ���� �����ߵ�
							// Runnable runnable = new ����Ŭ������();
							// Thread thread = new thread (runnable);
							// Thread.start();
		
				//2. Thread : ������ Ŭ����
					//extends Class
							// Thread thread = new ����Ŭ������();
							// Thread.start();
		
				//3. �͸� ���� ��ü
					// ��ȸ��
		
		//* �������̽�  : ��ü X, �߻�޼ҵ忡 ���� ������ �ʼ��� �ؾ���
			

	//p.581 ���� ������
		//���̺귯�� ���� �ٲٴ� �� : ������Ʈ ����Ŭ�� build path -> configure build path ->Libraries��
		//JRE system ��¼�� ����Ŭ�� -> ����1.8�� ���� -> toolkit������ ���� ����ߵ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for ( int i =0; i<5; i++) {
			toolkit.beep();//������ �Ҹ� �޼ҵ�
			
			try {Thread.sleep(500);} //0.5�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
			catch (InterruptedException e) {}
			//����ó�� ������ �߻�.
		}
		for(int i = 0 ; i <5; i++) {
			System.out.println("��");
			
			try {Thread.sleep(1000);} //1�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
			catch (InterruptedException e) {}	
			
			//�ݺ��� 5�������ϰ� �� �ٸ� �ݺ��� 5�� ����. ������ �Ʒ��� ����
			//�� �ݺ����� �Ʒ��ݺ����� ���� �ٸ� ������
			//���� ���� ���� ������� ���ÿ� ������� ����.
		}
		System.out.println("��Ƽ������ ---------------------------------------------");	
	//p.582 ��Ƽ������ ( �Ҹ��� ���ڸ� ���ÿ� ����ϱ� )	
		//1. �������̽��� Ŭ���� ����
			//1-1) �������̽� ����
			Runnable runnable = new BeepTask(); // Runnable�� ���ʿ� ��Ŭ������ ����. �������̽��� ����Ϸ��� ��ü�� �����ߵ�
			//1-2) ������ Ŭ������ �������̽� ����
			Thread thread = new Thread(runnable);
			//1-3) ������ ����
			thread.start();
			
			// ����
			for(int i = 0 ; i <5; i++) {
				System.out.println("��");
				// ������ ����ó��
				try {Thread.sleep(1000);} //1�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
				catch (InterruptedException  e) {}	
		}
		System.out.println("�͸�ü runnable---------------------------------------------");	
	//p.583 [ ��Ƽ������ : �͸�ü runnable ]				//�͸� ��ü	
			//�͸� ��ü : �������̽��� ������ = new Ŭ������(new�������̽���(){����});
			//�͸� ��ü ���� ����? ��ȸ�� ��ȸ������ ����ʹ�? Ŭ������ ����
		
			Thread thread2 = new Thread(new Runnable() {
									// ���ο� Ŭ���� �ȸ���� �ٷ� �ȿ��� �����ϱ�
				@Override
				public void run() {
					//�Ҹ�
					for ( int i =0; i<5; i++) {
						toolkit.beep();//������ �Ҹ� �޼ҵ�
						
						try {Thread.sleep(1000);} //1�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
						catch (InterruptedException e) {}
						//����ó�� ������ �߻�.
					}
					
				}
			});
			thread2.start();
			
			//����
			for(int i = 0 ; i <5; i++) {
				System.out.println("��");
				// ������ ����ó��
				try {Thread.sleep(1000);} //1�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
				catch (InterruptedException  e) {}	
		}
			
		System.out.println("������ Ŭ���� ��ӹ޾� �����---------------------------------------------");
		
		//p.584 [ ��Ƽ������ : Thread Ŭ���� ��ӹ޾� ����� ] //ThreadŬ������ ��Ŭ�������� �̸� ������� ����
		Thread thread3 = new BeepThread();
		thread3.start(); // run�޼ҵ� ȣ��
		
		//p.586
		//���� ������ �� ã��
		System.out.println("������ �� : " + thread3.getName());
		
		//����
		for(int i = 0 ; i <5; i++) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);} //1�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
			catch (InterruptedException  e) {}	
		}
			
	}
}
