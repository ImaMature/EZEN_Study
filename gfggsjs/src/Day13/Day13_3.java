package Day13;

public class Day13_3 {

	
	//스레드 제어
		//1. Thread.sleep(밀리초[1000/1초]) : 밀리초만큼 일시정지후 다시 실행 //p.602
		//2. Thread.yield() : 다른 스레드에 양보 //p.603
	public static void main(String[] args) {
		
		//1. 스레드 생성
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		
//		//2. 스레드 실행 [ run 메소드 호출 ]
//		threadA.start();
//		threadB.start();
//		
//			//3초간 일시 정지시 main이 정지된거임 ThreadA,B와 관련 X
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//			
//			//스레드A가 양보 [ 스레드A 실행 X, B만 실행 ]
//		threadA.work = false;
//			
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//		
//			//스레드 A, B 모두 실행
//		threadA.work = true;
//		
//		try {Thread.sleep(3000);} 
//		catch (Exception e) {}
//		
//		threadA.stop = true; //무한루프 종료
//		threadB.stop = true;
//		
		
		System.out.println("-------------------절취선-----------------");
		
		//p.607
		
		SumThread sumThread = new SumThread();
		sumThread.start(); //꼭 기억하기 start() -> run() 호출
		
		//main 스레드는 sum스레드가 끝날때까지 기다림
		try{sumThread.join(); } catch (Exception e) {}
		
		System.out.println("1~100의 합 : " + sumThread.getSum()); //0이 나옴 이유?
			// sumThread가 계산작업을 완료하지 않은 상태에서 합을 먼저 출력하기 때문
			//그러면? try catch문으로 기다리게 하고, 실행
		
		
		//p.614
		//stop 플래그 이용하는 법
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		//printThread1.setStop(true); 
		//1)while에 stop에 true값을 집어넣어서 무한루프 종료
		
		//printThread1.stop(); //권장하지 않음 취소선 
		//2) 스레드 강제 종료
		// while문에 true값을 넣어 무한루프 종료
		
		printThread1.interrupt();//3) 예외를 발생시켜서 반복문 탈출
		
	}
}
