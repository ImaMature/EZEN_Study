package Day13;

public class Calculator {

	//필드
	private int memory;
	
	//생성자
	
	//메소드
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //public synchronized void가 안들어가면 동시에 50이 나옴
			//	동기화 : 우선 스레드가 끝날 때까지 다른 스레드 대기 [ 순서대기 ]
		this.memory = memory;
		
		//2초간 스레드 일시정지
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
