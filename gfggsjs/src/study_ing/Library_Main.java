package study_ing;

import java.io.IOException;

public class Library_Main {

//	도서검색 프로그램
//	1. 조건 도서 목록 배열 선언
// 		[4개의 도서를 배열에 등록]
// 		1. 된다! 네이버 블로그 & 포스트
// 		2. 스프링 부트 실전 활용 마스터
// 		3. Tucker의 Go 언어 프로그래밍
// 		4. 혼자 공부하는 C언어
// 	1-1. scanner 대신에 System.in.read() 사용	
// 	2. 검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력하기
// 	3. 수정기능 : 수정할 도서를 입력받아 선택 후 교체할 단어와 새로운 단어 입력받아 교체
// 
// String [] 도서목록 = {"된다! 네이버 블로그 & 포스트" , "스프링 부트 실전활용 마스터" , "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C언어"};
	
	public static void main(String[] args) throws IOException{
		
		String[] 도서목록 =  {"된다! 네이버 블로그 & 포스트", "스프링 부트 실전활용 마스터", "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C언어"}; // 도서목록(책장)
		
		while (true) {
			System.out.println("도서검색 프로그램 메인 화면입니다.");
			System.out.println("1. 검색\t2. 수정");
			//손님수 만큼 입력받을 배열 선언
			byte[] b = new byte [100];
			System.in.read(b);
			String ch = new String (b, 0);
			
		}
		
		//0을 입력받았을 때
		//1을 입력받았을 때
		//2를 입력받았을 때
		//3을 입력받았을 때
		
		
	}
}
