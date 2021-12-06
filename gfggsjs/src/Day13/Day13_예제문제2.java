package Day13;

import java.util.Scanner;

public class Day13_예제문제2 {

//	문제2 무한루프 메뉴
//
//	1.음악재생
//	2.영화재생
//
//	[조건1] 1번 선택시 1초간격으로 음악재생 출력
//	[조건2] 2번 선택시 1초간격으로 영화재생 출력
//	[조건3] 음악,영화가 실행중 번호를 다시 선택하면 재생 종료 [스레드종료]
//	ex) 1번누르면 음악실행, 실행중 다시 1번누르면 종료.
//
//출력 예) 
//1 번 누르면? 
//음악재생
//음악재생
//   .
//   . 
//   .
//음악재생
//Music, Movie 클래스와 관련	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 
		boolean sw = true; // 현재 재생 여부 확인 변수
		boolean sw2 = true; // true라면 중지상태 //false이면 실행
		
		while(true) { // 무한루프
			 
			System.out.println("1. 음악재생 | 2. 영화재생"); 
			int ch = sc.nextInt();
			
			if (ch == 1) { // 1번 눌렀을 때
				Thread thread= new Music(); // Muzik클래스의 스레드 생성자
				
				if(sw) {
					Music.musicStop(sw);
					thread.start();
					sw = false; // 한번 실행하면 run이 돌면서 한편으로 sw = false가 되어있는 상태
				}else {
					Music.musicStop(sw); //한번 더 1누르면 sw = false였던 값이 
					sw = true;
				}
			 	
			 
			 }
			 
			 else if (ch == 2) { // 2번 눌렀을 때
				 Thread thread = new Movie(); //스레드 구현 객체 생성
				 if(sw2) {
					 Movie.moviestop(sw2);
					 thread.start();
					 sw2=false;
					 
				 }else {
					 Movie.moviestop(sw2);
					 sw2 = true;
				 }
			 }
		}//while end
	}//main end
}//class end
