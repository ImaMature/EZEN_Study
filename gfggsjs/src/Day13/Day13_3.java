package Day13;

public class Day13_3 {

	
	//������ ����
		//1. Thread.sleep(�и���[1000/1��]) : �и��ʸ�ŭ �Ͻ������� �ٽ� ���� //p.602
		//2. Thread.yield() : �ٸ� �����忡 �纸 //p.603
	public static void main(String[] args) {
		
		//1. ������ ����
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		//2. ������ ���� [ run �޼ҵ� ȣ�� ]
		threadA.start();
		threadB.start();
		
			//3�ʰ� �Ͻ� ������ main�� �����Ȱ��� ThreadA,B�� ���� X
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
			
			//������A�� �纸 [ ������A ���� X, B�� ���� ]
		threadA.work = false;
			
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
		
			//������ A, B ��� ����
		threadA.work = true;
		
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
		
		threadA.stop = true; //���ѷ��� ����
		threadB.stop = true;
	}
}
