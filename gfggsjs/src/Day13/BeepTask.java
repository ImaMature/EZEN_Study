package Day13;

import java.awt.Toolkit;

public class BeepTask implements Runnable { //멀티스레드 인터페이스를 만들때 쓰는 것 = Runnable
				//인터페이스 : 추상메소드가 존재
	@Override
		public void run() { // 추상메소드 구현하기위해 (Runnable)
			// 멀티 스레드 시작 메소드 (메인 메소드 같은거)

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for ( int i =0; i<5; i++) {
			toolkit.beep();//비프음 소리 메소드
		
			try {Thread.sleep(1000);} //0.5초 일시정지 [Thread.sleep(밀리초[1000/초])]
			catch (InterruptedException e) {}
			//예외처리 무조건 발생.
		}
	}
}
