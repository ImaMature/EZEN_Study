package Day13;

public class Music extends Thread{
	
	static boolean stop = true;
	
	public static void musicStop(boolean sw) { // 무한루프 제어 메소드
		stop = sw;
		if(stop) 	{System.out.println("음악시작");}
		else 		{System.out.println("음악종료");}
 	}
	
	@Override
	public void run() {
		while(stop) { // stop이 true 인 경우에만 실행, 아니면 실행 X
			System.out.println("음악재생중~~"); // 음악재생중 출력
			try {Thread.sleep(1000);} // 1초동안 쉬기
			catch(Exception e) {}
			
			
			
		}
	}
}
