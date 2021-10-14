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
	
	public static void main(String[] args) throws IOException {
		
		String[] 도서목록 =  {"된다! 네이버 블로그 & 포스트", "스프링 부트 실전활용 마스터", "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C언어"};
		
		while(true) {
		System.out.println("도서 검색 프로그램 메인화면 입니다.");
		System.out.println("1. 검색하기\t2. 수정하기");
		System.out.print("선택 > : "); 
		
		byte[] arr = new byte [100]; // 자꾸 클래스 선언이 헷갈림 클래스 작성 규칙 문서 보기 (https://devuna.tistory.com/4)
		int a = System.in.read(arr);	//바이트 -> 정수
		String ch = new String(arr, 0, a-2); //정수 -> 문자열
		
			//1. 도서 검색하기 출력
			if (ch.equals("1")) {
				System.out.print("도서 검색 : ");
				int a2 = System.in.read(arr);
				String book = new String(arr, 0, a2-2);
				for(int i = 0; i<도서목록.length; i++) {
					if(도서목록[i].contains(book)) {
						System.out.println("------- 결과 --------");
						System.out.println(i+"번 "+도서목록[i]);
						System.out.println("--------------------");
					}
				}
			}
			//2. 도서 수정하기 출력
			else if (ch.equals("2")) {
				System.out.println("수정할 도서 검색 :"); // 문자열 -> 정수
			
				int a2 = System.in.read(arr);
				String book2 = new String(arr, 0, a2-2);
				for(int i =0; i<도서목록.length; i++) {
					if(도서목록[i].contains(book2)) {
						System.out.println(i+"번 " +도서목록[i]);
					}
				}
				System.out.println("수정할 도서의 번호 입력 : ");	//바이트 -> 수
				int a3 = System.in.read(arr);
				int index = Integer.parseInt(new String(arr, 0, a3-2));
				
				System.out.println("바꾸고 싶은 문자 입력 : ");
				a3 = System.in.read(arr);
				String old = new String(arr,0,a3-2);
				
				System.out.println("새롭게 바꿀 문자 입력 : ");
				a3 = System.in.read(arr);
				String news = new String(arr, 0, a3-2);
				
				도서목록[index] = 도서목록[index].replace(old, news);
				
			}	
		}
	}
}
