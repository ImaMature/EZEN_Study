package Day13;

import java.awt.Toolkit;

public class BeepTask implements Runnable { //��Ƽ������ �������̽��� ���鶧 ���� �� = Runnable
				//�������̽� : �߻�޼ҵ尡 ����
	@Override
		public void run() { // �߻�޼ҵ� �����ϱ����� (Runnable)
			// ��Ƽ ������ ���� �޼ҵ� (���� �޼ҵ� ������)

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for ( int i =0; i<5; i++) {
			toolkit.beep();//������ �Ҹ� �޼ҵ�
		
			try {Thread.sleep(1000);} //0.5�� �Ͻ����� [Thread.sleep(�и���[1000/��])]
			catch (InterruptedException e) {}
			//����ó�� ������ �߻�.
		}
	}
}
