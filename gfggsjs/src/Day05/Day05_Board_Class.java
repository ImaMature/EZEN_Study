package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_Board_Class {

	public static void main(String[] args) {
		// 1. 서로 다른 자료형을 하나로 묶기
		
		Board[] boards = new Board [100];	
		// 내가 Board.java클래스에 만든 Board 배열 클래스
		Scanner scanner = new Scanner(System.in);
		
		// 2. 사용자가 임의로 작성한 클래스로 배열 선언
		while(true) { // while start
			System.out.println("------------------------- [게시판] -----------------------------");
			System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", "순번", "제목", "작성자", "작성일", "조회수" );
			//배열내 모든 인덱스 출력
			
			for (int i = 0; i<boards.length; i++) { // for start
				if(boards[i] != null) { // 게시물 객체가 존재하면
					System.out.printf("%2s \t %10s \t %5s \t %5s \t %3s \n", 
							i, boards[i].title, boards[i].writer, 
							boards[i].date, boards[i].count ); // 내용생략
					}
				} // for end
				System.out.println("====================================================================");
				System.out.println("선택 : 1. 글쓰기 2. 글 상세 페이지"); int ch = scanner.nextInt();
				
				if ( ch == 1) { // if 1 start
					System.out.println(" >>>>> 게시물 쓰기 >>>>>");
						scanner.nextLine(); // 문제 보완 nextLine 오류 예방
					System.out.print("제목 : ");	String title = scanner.nextLine();
					System.out.print("내용 : ");	String contents = scanner.nextLine();
					System.out.print("작성자 : ");	String writer = scanner.nextLine();
					
					// 오늘 날짜 출력해보기
					Date now = new Date (); // 날짜 객체
					
						//날짜 형식 클래스
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String date = dateFormat.format(now);
					
					// 조회수
					//String count = "1"; // 여기서는 필요 없음
					
					// 모든 변수를 빈 공간 배열에 저장
					for(int i=0; i<boards.length; i++) {// for2 start
						
						if( boards[i] == null) {
							
							Board board = new Board();// 해당 인덱스에 객체가 없으면
							board.title = title; 	board.contents = contents; //입력받은 contents를 board 클래스의 contents에 저장(메모리에 저장)
							board.writer = writer;	board.date = date; 		
							board.count = 1;
							
							boards[i] = board;
							break;
							
						}
					} // for2 end
				} // if 1 end
				
				if ( ch == 2) { //if 2 start
					System.out.println(" >>>>> 글 상세 페이지 >>>>>");
					System.out.println(" >>> 게시물 번호 선택 : "); int ch2 = scanner.nextInt();
						
						//해당 게시물의 조회수 1 증가
					//int count = Integer.parseInt(boards[ch2][4]);	//[조회수(String) -> int 변환]
					//count++;	boards[ch2][4] = count+""; 	//=(boards[ch2][4] = Integer.toString(++count); (조회수 증가후 -> String 변환)
					boards[ch2].count++;
					
					System.out.println("----------------------------- 게시물 상세페이지 -------------------------------");
					System.out.println(" >>> 제목 : " + boards[ch2].title);
					System.out.println(" >>> 작성자 : " + boards[ch2].writer + 
							"\t작성일 : " + boards[ch2].date + "\t조회수 : " + boards[ch2].count);
					System.out.println(" >>> 내용 : " + boards[ch2].contents);
					System.out.println("--------------------------------------------------------------------------");			
						
				
			}// if2 end
		} // while end
	}

}
