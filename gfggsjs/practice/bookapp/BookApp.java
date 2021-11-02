package bookapp;


import java.util.Scanner;


public class BookApp {

//	------------------- 회원제 도서관 프로그램 ---------------------
//	// [조건1] : 객체지향 [ 회원 클래스 , 도서 클래스  ]
//		설계 : 필드 , 생성자 , 메소드
//	// [조건2] : 객체는 배열에 저장
//	// [조건3] : 회원만 프로그램 이용
//		[ 로그인전 ] : 로그인 , 회원가입 , 아이디/비밀번호 찾기   
//		[ 로그인시 ] : 1.도서목록 ,2. 대여 , 3.반납  , 4.로그아웃
//	// [조건4] : 관리자[ ID:admin ] 만 도서 등록 가능 
//		[ 관리자 로그인시 ] : 1.도서등록 ,2.도서목록 3. 로그아웃 
	
	
	public static Member [] arr = new Member[100];
	public static Book [] b_arr = new Book[100];
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BookApp.start();
	}
	
	public static void start() {	
			Member member = new Member();
			
				while(true) {
				try{
					Scanner scanner = new Scanner(System.in);
					System.out.println("----------------회원제 도서관 프로그램-----------------");
					System.out.println("1. 로그인 | 2. 회원가입 | 3. 아이디찾기 | 4. 비밀번호찾기");
					System.out.println("------------------------------------------------");
					int ch = scanner.nextInt();
					if(ch == 1) {
						member.login();
					}
					else if(ch == 2) {
						member.signup();
					}
					else if(ch == 3) {
						member.findid();
					}
					else if(ch == 4) {
						member.findpw();
					}
					else { System.out.println("[잘못된 숫자를 입력하셨습니다.]");}
				}catch(Exception e) {System.out.println("[오류발생] 관리자에게 문의하세요." + e);}
			
		}//while end
	}//main end
}//BookApp class end
