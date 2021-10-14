package Day11;

public class Day11_3 {

	public static void main(String[] args) {
		
	//p.482
	// System 클래스
		// 모든 멤버가 static이기 때문에 객체가 필요없음
		//ex) System.out.println(); //static -> 객체가 없어도 메소드가 호출됨
		
		//1. exit : 프로그램 종료
//		System.out.println("안녕");
//		System.exit(0); // 프로그램 강제 종료할 때 씀
//		System.setSecurityManager(new SecurityManager() {
//			@Override
//			public void checkExit(int status) { //32번째 줄의 들어온 값을 status에를 받아서 if문 실행
//				if(status != 5) { 
//					throw new SecurityException();
//					
//					//i가 0일때 status = 0 => true => 예외발생O
//					//i가 1일때 status = 1 => true => 예외발생O
//					//~~~~
//					//i가 5일때 status = 5 => false => 예외발생X => try문 실행
//				}
//			}
//		});
//			for(int i =0; i<10; i++) { // 이거부터 젤 먼저 실행 i는 0부터 9까지 1씩 증가
//			System.out.println(i); // 출력
//			try {
//				//JVM종료 요청
//				System.exit(i); // i에 exit() 넣기 //17번째 줄의 status에 들어감
//				// i가 5일때 예외가 없어서 exit 실행
//			}	catch(SecurityException e) {}
//		}
			
		//프로그램 실행 소요시간 구하기	
		//for문이 1000000회 실행했을 때 걸리는 시간
			//시작시간
			long time1 = System.nanoTime();	
			
			int sum = 0;
			for (int i = 1; i<1000000; i++) {
				sum+=1;
			}
			//끝나는 시간
			long time2 = System.nanoTime();
			
			System.out.println("1~1000000까지의 합 : " + sum); //메모리에 따라 출력값 다름
			System.out.println("걸린시간 : " + (time2-time1) + " 나노 초"); 
			System.out.println(System.nanoTime());
			
		//시스템 정보(프로퍼티) 읽기 [ System.getgetProperty("호출키")]
			System.out.println("pc os : " + System.getProperty("os.name"));
			System.out.println("pc 사용자이름 : " + System.getProperty("user.name")); // 사용자 컴퓨터 이름
			System.out.println("사용자 폴더 위치 : "+System.getProperty("user.home")); // 사용자 폴더 위치
	
	}//main end
}//class end
