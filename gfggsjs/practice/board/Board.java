<<<<<<< HEAD
package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
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
	
		Scanner scanner = new Scanner(System.in);
		String [][] array = new String [100][5]; 
		String viewCount = "1";
		//String index = "1";
		//int index = 1; 
		//String strIndex = Integer.toString(index); //배열이 String 타입이라서 순번을 int로 놓을 수 없음.
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("\t\t   [게시판]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "순번", "제목", "작성자","작성일", "조회수");
			
		
			
			for(int i=0; i<array.length; i++) {
				if(array[i][0]!=null) {
				System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i][0], array[i][2], array[i][3], array[i][4]);
				
				//System.out.printf("%s\t%s\t%s\t%s\t%s\n", array[i][0], array[i][1], array[i][2], array[i][3], array[i][4], array[i][5]);
				//index++;
				//순번을 늘리는 방법은 i를 추가하는 수 밖에 없음
				//순번 : i를 넣으니 0부터 시작 -> 다른 객체를 1로 선언해서 집어넣고 1씩 증가하게 만들기
				}
			}
			System.out.println("=======================================================");
			System.out.println("1. 글쓰기 | 2. 글 상세 페이지");
			System.out.print("선택 > : ");	int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("<<< 글쓰기 메뉴 >>>");
				scanner.nextLine();
				System.out.print("제목 : ");		String title = scanner.nextLine();
				System.out.print("내용 : ");		String contents = scanner.nextLine();
				System.out.print("작성자 : ");	String writer = scanner.nextLine();
				
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String writeDate = dateFormat.format(date);
				
				
				for(int i =0; i<array.length; i++) {
					if(array[i][0] == null) { 
						array[i][0] = title; array[i][1] = contents; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						
						//array[i][0] = strIndex; array[i][1] = title; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						//배열에 순번을 넣어서 Integer.toString(index)로 변환해서 배열에 집어넣어보려했지만 안됨. 순번이 1씩 증가 X
						// 출력에서 순번을 i로 지정해서 i++하는 방법 말고 여기 배열에 한번에 넣어서 증가시키는 방법은 없을까..
						break;
					}
				}
				
			}
			
			if(ch == 2) {
				
				while(true) {
				System.out.println("<<< 글 상세 페이지 메뉴 >>>");
				System.out.println("1. 게시물 선택 | 2. 뒤로가기"); 
				int ch2 = scanner.nextInt(); 
					if (ch2 == 1) {
						System.out.println("선택 > : ");	int ch3 = scanner.nextInt();
						int count = Integer.parseInt(array[ch3][4]);
						count++;
						System.out.println("조회수 증가 확인 : " + count);
						array[ch3][4] = Integer.toString(ch3);
						
						System.out.println(">> 제목 : " + array[ch3][0]);
						System.out.println(">> 작성자 : " + array[ch3][2] + "\t>> 작성일 : " + array[ch3][3] + "\t>> 조회수 : " + array[ch3][4]);
						System.out.println(">> 내용 : " + array[ch3][1]);
					}
					else if (ch == 2) {
						break;
					}
					else {
						System.out.println("잘못된 선택입니다."); 
						continue;
					}
					
				}
				
			}
			scanner.close();
		}//while end
	}//main end
}//class end
=======
package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
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
	
		Scanner scanner = new Scanner(System.in);
		String [][] array = new String [100][5]; 
		String viewCount = "1";
		//String index = "1";
		//int index = 1; 
		//String strIndex = Integer.toString(index); //배열이 String 타입이라서 순번을 int로 놓을 수 없음.
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("\t\t   [게시판]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "순번", "제목", "작성자","작성일", "조회수");
			
		
			
			for(int i=0; i<array.length; i++) {
				if(array[i][0]!=null) {
				System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i][0], array[i][2], array[i][3], array[i][4]);
				
				//System.out.printf("%s\t%s\t%s\t%s\t%s\n", array[i][0], array[i][1], array[i][2], array[i][3], array[i][4], array[i][5]);
				//index++;
				//순번을 늘리는 방법은 i를 추가하는 수 밖에 없음
				//순번 : i를 넣으니 0부터 시작 -> 다른 객체를 1로 선언해서 집어넣고 1씩 증가하게 만들기
				}
			}
			System.out.println("=======================================================");
			System.out.println("1. 글쓰기 | 2. 글 상세 페이지");
			System.out.print("선택 > : ");	int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("<<< 글쓰기 메뉴 >>>");
				scanner.nextLine();
				System.out.print("제목 : ");		String title = scanner.nextLine();
				System.out.print("내용 : ");		String contents = scanner.nextLine();
				System.out.print("작성자 : ");	String writer = scanner.nextLine();
				
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String writeDate = dateFormat.format(date);
				
				
				for(int i =0; i<array.length; i++) {
					if(array[i][0] == null) { 
						array[i][0] = title; array[i][1] = contents; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						
						//array[i][0] = strIndex; array[i][1] = title; array[i][2] = writer; array[i][3] = writeDate; array[i][4] = viewCount;
						//배열에 순번을 넣어서 Integer.toString(index)로 변환해서 배열에 집어넣어보려했지만 안됨. 순번이 1씩 증가 X
						// 출력에서 순번을 i로 지정해서 i++하는 방법 말고 여기 배열에 한번에 넣어서 증가시키는 방법은 없을까..
						break;
					}
				}
				
			}
			
			if(ch == 2) {
				
				while(true) {
				System.out.println("<<< 글 상세 페이지 메뉴 >>>");
				System.out.println("1. 게시물 선택 | 2. 뒤로가기"); 
				int ch2 = scanner.nextInt(); 
					if (ch2 == 1) {
						System.out.println("선택 > : ");	int ch3 = scanner.nextInt();
						int count = Integer.parseInt(array[ch3][4]);
						count++;
						System.out.println("조회수 증가 확인 : " + count);
						array[ch3][4] = Integer.toString(ch3);
						
						System.out.println(">> 제목 : " + array[ch3][0]);
						System.out.println(">> 작성자 : " + array[ch3][2] + "\t>> 작성일 : " + array[ch3][3] + "\t>> 조회수 : " + array[ch3][4]);
						System.out.println(">> 내용 : " + array[ch3][1]);
					}
					else if (ch == 2) {
						break;
					}
					else {
						System.out.println("잘못된 선택입니다."); 
						continue;
					}
					
				}
				
			}
			scanner.close();
		}//while end
	}//main end
}//class end
>>>>>>> branch 'master' of https://github.com/ImaMature/EZEN_Study
