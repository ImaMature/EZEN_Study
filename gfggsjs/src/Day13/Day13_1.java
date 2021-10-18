package Day13;

 // Toolkit 클래스 가져오기 [UI 관련 메소드 제공] 근데 외울필요없음. 옛날거라
import java.awt.Toolkit;
//p.576 스레드
public class Day13_1 {

	//1. cpu : 메모리 없음 [레지스터 : 소량의 명령어 기억 ]
	//2. 메모리 [주기억장치]
	public static void main(String[] args) {
		//1.main : 메인 스레드 포함
			//1. 첫코드부터 순차적으로 실행
			//2. return을 만나면 실행 종료 (return은 생략가능, void)
		//2. 멀티스레드 [병렬 작업]
			// 컴퓨터는 동시에 처리 못함. 스케쥴링을 받아서 처리. 그게 너무빨라서 멀티태스킹하는거 같아보욈;
			//* 운영체제가 스레드에게 자원 할당 받아(스케쥴링) => 순차적으로 처리
			//1. 여러개의 스레드 중 하나라도 남아있으면 프로세스 종료되지않음.
			//2. 멀티스레드 구현 방법
		
				//1. Runnable : 스레드 인터페이스
					// implements Runnable 
						// (객체 혼자 못만듦) 구현클래스 만들어야됨
							// Runnable runnable = new 구현클래스명();
							// Thread thread = new thread (runnable);
							// Thread.start();
		
				//2. Thread : 스레드 클래스
					//extends Class
							// Thread thread = new 구현클래스명();
							// Thread.start();
		
				//3. 익명 구현 객체
					// 일회성
		
		//* 인터페이스  : 객체 X, 추상메소드에 대한 구현을 필수로 해야함
			

	//p.581 단일 스레드
		//라이브러리 버전 바꾸는 법 : 프로젝트 오른클릭 build path -> configure build path ->Libraries탭
		//JRE system 어쩌구 더블클릭 -> 버전1.8로 변경 -> toolkit쓰려면 버전 낮춰야됨
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for ( int i =0; i<5; i++) {
			toolkit.beep();//비프음 소리 메소드
			
			try {Thread.sleep(500);} //0.5초 일시정지 [Thread.sleep(밀리초[1000/초])]
			catch (InterruptedException e) {}
			//예외처리 무조건 발생.
		}
		for(int i = 0 ; i <5; i++) {
			System.out.println("띵");
			
			try {Thread.sleep(1000);} //1초 일시정지 [Thread.sleep(밀리초[1000/초])]
			catch (InterruptedException e) {}	
			
			//반복문 5번실행하고 또 다른 반복문 5번 실행. 위에서 아래로 실행
			//위 반복문과 아래반복문은 서로 다른 스레드
			//둘이 각각 단일 스레드라 동시에 실행되지 않음.
		}
		System.out.println("멀티스레드 ---------------------------------------------");	
	//p.582 멀티스레드 ( 소리와 문자를 동시에 출력하기 )	
		//1. 인터페이스에 클래스 연결
			//1-1) 인터페이스 생성
			Runnable runnable = new BeepTask(); // Runnable은 애초에 이클립스에 있음. 인터페이스는 사용하려면 객체를 만들어야됨
			//1-2) 스레드 클래스에 인터페이스 연결
			Thread thread = new Thread(runnable);
			//1-3) 스레드 시작
			thread.start();
			
			// 문자
			for(int i = 0 ; i <5; i++) {
				System.out.println("띵");
				// 무조건 예외처리
				try {Thread.sleep(1000);} //1초 일시정지 [Thread.sleep(밀리초[1000/초])]
				catch (InterruptedException  e) {}	
		}
		System.out.println("익명객체 runnable---------------------------------------------");	
	//p.583 [ 멀티스레드 : 익명객체 runnable ]				//익명 객체	
			//익명 객체 : 인터페이스명 변수명 = new 클래스명(new인터페이스명(){구현});
			//익명 객체 쓰는 이유? 일회성 다회용으로 쓰고싶다? 클래스로 생성
		
			Thread thread2 = new Thread(new Runnable() {
									// 새로운 클래스 안만들고 바로 안에서 구현하기
				@Override
				public void run() {
					//소리
					for ( int i =0; i<5; i++) {
						toolkit.beep();//비프음 소리 메소드
						
						try {Thread.sleep(1000);} //1초 일시정지 [Thread.sleep(밀리초[1000/초])]
						catch (InterruptedException e) {}
						//예외처리 무조건 발생.
					}
					
				}
			});
			thread2.start();
			
			//문자
			for(int i = 0 ; i <5; i++) {
				System.out.println("띵");
				// 무조건 예외처리
				try {Thread.sleep(1000);} //1초 일시정지 [Thread.sleep(밀리초[1000/초])]
				catch (InterruptedException  e) {}	
		}
			
		System.out.println("스레드 클래스 상속받아 만들기---------------------------------------------");
		
		//p.584 [ 멀티스레드 : Thread 클래스 상속받아 만들기 ] //Thread클래스는 이클립스에서 미리 만들어져 있음
		Thread thread3 = new BeepThread();
		thread3.start(); // run메소드 호출
		
		//p.586
		//현재 스레드 명 찾기
		System.out.println("스레드 명 : " + thread3.getName());
		
		//문자
		for(int i = 0 ; i <5; i++) {
			System.out.println("띵");
			// 무조건 예외처리
			try {Thread.sleep(1000);} //1초 일시정지 [Thread.sleep(밀리초[1000/초])]
			catch (InterruptedException  e) {}	
		}
			
	}
}
