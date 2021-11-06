package BookProgram;

import java.util.Scanner;

public class BookApp {

	public static Scanner sc = new Scanner(System.in);
	public static Member [] m_arr = new Member [100]; // 회원 배열
	public static Book [] b_arr = new Book [100]; // 도서 배열
	
	public static void main(String[] args) {
		BookApp.start();
	}//main end	
	
	private static void start() {
			// TODO Auto-generated method stub
		Member member = new Member();
		while (true) {
			try {
				//메인메뉴
				BookApp.sc = new Scanner(System.in);
				System.out.println("------------도서관 관리 프로그램--------------");
				System.out.println("1. 로그인 | 2. 회원가입 | 3. 프로그램 종료");
				System.out.println("-----------------------------------------");
				int ch = sc.nextInt();
				if( ch == 1 ) {
					member.login();
				}else if (ch == 2) {
					member.signup();
				}else if ( ch == 3 ) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			} catch (Exception e) {
				System.out.println("오류" + e.getMessage());
			} 
		}//while end	
	}//start 메소드 end
}//class end
