package Day13;

public class Day13_3 {

	
	//스레드 제어
		//1. Thread.sleep(밀리초[1000/1초]) : 밀리초만큼 일시정지후 다시 실행 //p.602
		//2. Thread.yield() : 다른 스레드에 양보 //p.603
	public static void main(String[] args) {
		
		//1. 스레드 생성
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		//2. 스레드 실행 [ run 메소드 호출 ]
		threadA.start();
		threadB.start();
		
			//3초간 일시 정지시 main이 정지된거임 ThreadA,B와 관련 X
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
			
			//스레드A가 양보 [ 스레드A 실행 X, B만 실행 ]
		threadA.work = false;
			
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
		
			//스레드 A, B 모두 실행
		threadA.work = true;
		
		try {Thread.sleep(3000);} 
		catch (Exception e) {}
		
		threadA.stop = true; //무한루프 종료
		threadB.stop = true;
	}
}
