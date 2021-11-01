package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Board2 {
	// 클래스사용 Database 클래스와 같이보기
	public static void main(String[] args) {
		
		Database [] array = new Database[100];
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("==============================================================");
			System.out.println("\t\t  [게시판]");
			System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", "순번", "제목", "작성자", "작성일", "조회수");
			
				for(int i =0; i<array.length; i++) {
					if(array[i] != null) {
						System.out.printf("%2s\t%10s\t%5s\t%5s\t%3s\n", i, array[i].getTitle(), array[i].getWriter(), array[i].date, array[i].viewCount);
					}
				}
			System.out.println("==============================================================");
			System.out.println("선택 : 1. 글쓰기 | 2. 글 상세 페이지");
			try{
				int ch = scanner.nextInt();
				System.out.println();
					if(ch == 1) {
						scanner.nextLine();
						System.out.println("------------------------[ 글쓰기 메뉴 ]--------------------------");
						System.out.println("제목 : ");		String title = scanner.nextLine();
						System.out.println("내용 : ");		String contents = scanner.nextLine();
						System.out.println("작성자 : ");		String writer = scanner.nextLine();
						
						Date date = new Date();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
						String strDate = dateFormat.format(date);
						int view = 0; // 조회수

						Database data = new Database(title, contents, writer, strDate, view);
						
						//set메소드를 쓴다면?
						for(int i = 0; i< array.length; i++) {
							if(array[i] == null) {
								array[i] = data;
								break;
							}
						}
					}
					else if (ch == 2) {
						while(true) {
						System.out.println("------------------------[ 글상세 페이지 ]-------------------------");
						System.out.println("1. 게시물 번호 선택 | 2. 뒤로가기"); int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("게시물 번호를 선택해주세요. > :"); int ch3 = scanner.nextInt();
								array[ch3].viewCount++;
								
								System.out.println("==============================================================");
								System.out.println(">>제목 : " + array[ch3].getTitle());
								System.out.println(">>작성자 : " + array[ch3].getWriter() + "\t작성일 : " + array[ch3].date + "\t조회수 : " + array[ch3].viewCount);
								System.out.println(">>내용 : " + array[ch3].getContents()); // get을 쓰는 이유 private 필드 객체때문에
							}
							else if (ch2 == 2) {
								break;
							}else System.out.println(" 잘못된 선택입니다. 다시 선택해주세요.");
							
						}
					}else System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
					
			}catch (Exception e) {
				System.out.println("==============================================================");
				System.out.println("[시스템 오류 발생] [오류내용 : " + e + " ]");
				
			}	
			
		}//while end
	}//main end
}//class end
