package Day07_Practice;

import java.util.Scanner;

public class Library_P {
	
	public static L_Member [] l_members = new L_Member[100];
	public static L_Book [] l_Books = new L_Book[100];
	public static Scanner sc = new Scanner(System.in);	
		
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 아이디 찾기 | 4. 비밀번호 찾기");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > : ");  int ch = sc.nextInt();
			
			//1.로그인
			if(ch==1) {
			String loginInfo = L_Member.login();
			// 로그인실패
			if 		(loginInfo == null) 		
			{System.out.println("[[알림]] : 없는 정보입니다.");}
			// 관리자 계정 로그인 성공
			else if (loginInfo.equals("admin")) 
			{System.out.println("\t         [[로그인 성공]]"); 
			 System.out.println("\t    [[관리자 메뉴로 진입합니다.]]"); admin_menu();}
			// 일반 계정 로그인 성공
			else	
			{System.out.println("[[알림]] : 로그인 성공"); user_menu(loginInfo);}
			}
			
			//2.회원가입
			if(ch==2) {L_Member.signup();}
			//3.아이디찾기
			if(ch==3) {
				String L_find_id = L_Member.L_find_id();
				if(L_find_id==null) {System.out.println("[[동일한 회원정보가 없습니다.]]");}
				else {System.out.println("[[회원님의 아이디는 "+ L_find_id +"입니다.]]");}
			}
			//4.비번찾기
			if(ch==4) {
				String L_find_pw = L_Member.L_find_pw();
				if(L_find_pw==null) {
					System.out.println("[[동일한 회원정보가 없습니다.]]");
				}
				else {System.out.println("[[회원님의 아이디는 "+L_find_pw+"입니다.]]");}
			}
		}
	}
			
	// 유저 메뉴 메소드
	private static void user_menu(String loginInfo) {
		L_Book l_Book = new L_Book();
		
		while(true) {
		System.out.println("-------------User Menu-------------");
		System.out.println("|1.도서목록 | 2.대여 | 3.반납 | 4.로그아웃|");
		System.out.println("-----------------------------------");
		System.out.println("선택 > : ");		int ch = sc.nextInt();
		// 도서목록
		if(ch == 1) {l_Book.b_list();}
		// 대여
		if(ch == 2) {l_Book.b_borrow(loginInfo);}
		// 반납
		if(ch == 3) {l_Book.b_back(loginInfo);}
		// 로그아웃
		if(ch == 4) {System.out.println("[[사용자 로그아웃 완료.]]"); return;}
		}
	}
	// 관리자 메뉴 메소드
	private static void admin_menu() {
		L_Book l_Book = new L_Book();
		
		while(true) {
		System.out.println("\t----------Admin Menu----------");
		System.out.println("\t|1.도서등록 | 2.도서목록 | 3.로그아웃|");
		System.out.println("\t------------------------------");
		System.out.println("선택 > : ");		int ch = sc.nextInt();
		if(ch == 1) {l_Book.b_reg();}
		if(ch == 2) {l_Book.b_list();}
		if(ch == 3) {System.out.println("[[관리자 계정 로그아웃 완료.]]"); return;}
		
		}
	}
	

	

}
