package Day13;

public class Day13_3 {

	
	//������ ����
		//1. Thread.sleep(�и���[1000/1��]) : �и��ʸ�ŭ �Ͻ������� �ٽ� ���� //p.602
		//2. Thread.yield() : �ٸ� �����忡 �纸 //p.603
	public static void main(String[] args) {
		
		//1. ������ ����
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		
//		//2. ������ ���� [ run �޼ҵ� ȣ�� ]
//		threadA.start();
//		threadB.start();
//		
//			//3�ʰ� �Ͻ� ������ main�� �����Ȱ��� ThreadA,B�� ���� X
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//			
//			//������A�� �纸 [ ������A ���� X, B�� ���� ]
//		threadA.work = false;
//			
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//		
//			//������ A, B ��� ����
//		threadA.work = true;
//		
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//		
//		threadA.stop = true; //���ѷ��� ����
//		threadB.stop = true;
//		
		
		System.out.println("-------------------���뼱-----------------");
		
		//p.607
		
		SumThread sumThread = new SumThread();
		sumThread.start(); //�� ����ϱ� start() -> run() ȣ��
		
		//main ������� sum�����尡 ���������� ��ٸ�
		try{sumThread.join(); } catch (Exception e) {}
		
		System.out.println("1~100�� �� : " + sumThread.getSum()); //0�� ���� ����?
			// sumThread�� ����۾��� �Ϸ����� ���� ���¿��� ���� ���� ����ϱ� ����
			//�׷���? try catch������ ��ٸ��� �ϰ�, ����
		
		
		//p.614
		//stop �÷��� �̿��ϴ� ��
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		//printThread1.setStop(true); 
		//1)while�� stop�� true���� ����־ ���ѷ��� ����
		
		//printThread1.stop(); //�������� ���� ��Ҽ� 
		//2) ������ ���� ����
		// while���� true���� �־� ���ѷ��� ����
		
		printThread1.interrupt();//3) ���ܸ� �߻����Ѽ� �ݺ��� Ż��
		
	}
}
