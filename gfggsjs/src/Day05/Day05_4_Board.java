package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	/*	배열의 문제 
	 *   1. 서로 다른 자료형을 동일한 배열에 저장할 수 없음
	    	서로 다른 자료형 => 하나의 자료형 만들기 => 클래스
	   			자료형 설계
	 *   2. 배열 선언과 동시에 메모리 할당 -> 프로그램 실행시 메모리 변경 불가
	 *   Day05_Board_Class 참고
	 */

public class Day05_4_Board { // 안보고 짜야 게시판 작성 가능 -> 배열,반복문 이해
	
	// 문제1 : 게시판 프로그램
				// 0. 조건 : 2차원 배열 사용	//게시물 번호는 인덱스 순서대로
				// 1. 게시판 [ 제목(String), 내용(String), 작성자(String), 작성일[Date], 조회수(int) ]
				// 2. 예시 메뉴
				 
				// 2-1. 
				/*	초기메뉴
				 * 			[게시판]
				 * 순번	제목		작성자	작성일	조회수
				 * 1	안녕		김현수	10-05	3
				 * 2	안녕2		김현수	10-05	3	 
				 * 3	안녕3		강호동	10-04	2
				 * 선택 : 1. 글쓰기	2.글 상세 페이지		
				 */
			
			/*2-2. 메인메뉴
			 *  [글쓰기 했을 때]
			 * 1) 제목, 내용 작성자 작성일[Date] 입력받아 배열에 저장
			 * 
			 * [글 상세 페이지 눌렀을때]
			 * 
			 * 1) 상세 페이지를 볼 게시물 번호 선택 ( 인덱스 순서대로)
			 * 2) 선택한 게시물의 상세 페이지 출력
			 * 
			 *2-3. 상세 페이지 예시 
			 *
			 * >> 제목 : 안녕
			 * >> 작성자 : 김현수			작성일 : 10-05	조회수 : 3
			 * >> 내용 : 안녕하세요 자바입니다.
			 * 
			 * >>선택 : 1. 뒤로가기
			 */

	public static void main(String[] args) {
		//0. 설정
		Scanner scann = new Scanner(System.in);
		String [][] boards = new String[100][5];	//게시물 100개를 저장할 수 있는 배열 선언 [게시물당 5열]
	
		
		//1. 무한루프
		while(true) { // while start
			System.out.println("------------------------- [게시판] -----------------------------");
			System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", "순번", "제목", "작성자", "작성일", "조회수" );
			//배열내 모든 인덱스 출력
			
			for (int i = 0; i<boards.length; i++) { // for start
				if(boards[i][0] != null) {
					System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", 
							i, boards[i][0], boards[i][2], boards[i][3], boards[i][4] ); // 내용생략
					}
				} // for end
				System.out.println("====================================================================");
				System.out.println("선택 : 1. 글쓰기 2. 글 상세 페이지"); int ch = scann.nextInt();
				
				if ( ch == 1) { // if 1 start
					System.out.println(" >>>>> 게시물 쓰기 >>>>>");
						scann.nextLine(); // 문제 보완 nextLine 오류 예방
					System.out.print("제목 : ");	String title = scann.nextLine();
					System.out.print("내용 : ");	String contents = scann.nextLine();
					System.out.print("작성자 : ");String writer = scann.nextLine();
					
					// 오늘 날짜 출력해보기
					Date now = new Date (); // 날짜 객체
					
						//날짜 형식 클래스
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String date = dateFormat.format(now);
					
					// 조회수
					String count = "1";
					
					// 모든 변수를 빈 공간 배열에 저장
					for(int i=0; i<boards.length; i++) { // for2 start
						if(boards[i][0] == null) {
							boards[i][0] = title; boards[i][1] = contents; boards[i][2] = writer;
							boards[i][3] = date; boards[i][4] = count;	break;
					
							}
						} // for2 end
					} // if 1 end
				
				if ( ch == 2) { //if 2 start
					System.out.println(" >>>>> 글 상세 페이지 >>>>>");
					System.out.println(" >>> 게시물 번호 선택 : "); int ch2 = scann.nextInt();
						
						//해당 게시물의 조회수 1 증가
					int count = Integer.parseInt(boards[ch2][4]);	//[조회수(String) -> int 변환]
					//count++;	boards[ch2][4] = count+""; 	
					boards[ch2][4] = Integer.toString(++count); //(조회수 증가후 -> String 변환)
						
					System.out.println("----------------------------- 게시물 상세페이지 -------------------------------");
					System.out.println(" >>> 제목 : " + boards[ch2][0]);
					System.out.println(" >>> 작성자 : " + boards[ch2][2] + "\t작성일 : " + boards[ch2][3] + "\t조회수 : " + boards[ch2][4]);
					System.out.println(" >>> 내용 : " + boards[ch2][1]);
					System.out.println("--------------------------------------------------------------------------");			
						
				
			}// if2 end
		} // while end
	} // main end
} // class end
