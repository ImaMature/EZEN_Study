package BookAppv2;

import java.util.Scanner; //입력받는 객체를 선언하거나 사용하기 위해(Scanner를 쓰기위해) import함.

public class BookMainv2 {

//	------------------- 회원제 도서관 프로그램 ---------------------
//	// [조건1] : 객체지향 [ 회원 클래스 , 도서 클래스  ]
//		설계 : 필드 , 생성자 , 메소드
//	// [조건2] : 객체는 배열에 저장
//	// [조건3] : 회원만 프로그램 이용
//		[ 로그인전 ] : 로그인 , 회원가입 , 아이디/비밀번호 찾기   
//		[ 로그인시 ] : 1.도서목록 ,2. 대여 , 3.반납  , 4.로그아웃
//	// [조건4] : 관리자[ ID:admin ] 만 도서 등록 가능 
//		[ 관리자 로그인시 ] : 1.도서등록 ,2.도서목록 3. 로그아웃 
	
	public static Member [] m_arr = new Member [100]; 
	//Member의 필드값을 이용한 회원정보(아이디(m_id), 패스워드(m_pw), 이름(m_name), 전화번호(m_phone)가 100개까지 들어가는 배열 m_arr을 전역 변수로 선언.
	public static Book [] b_arr = new Book [100]; 
	//Book클래스의 필드값을 이용한 도서정보(b_isbn(도서코드), b_name(도서이름), b_rent(도서 대여 여부), m_id(회원정보))가 100개까지 들어가는 배열 b_arr 전역변수로 선언.
	public static Scanner sc = new Scanner(System.in);  //입력객체 sc 전역변수로 선언 외부클래스에서도 사용 가능 
	public static void main(String[] args) {//main메소드
		start(); // start메소드 호출
	}
	
	public static void start() { //start메소드 선언. 
		//static으로 선언해서 main메소드에서 불러올 수 있게 하기
		Member member = new Member(); //Member클래스의 메소드들을 불러오기 위해 new 생성자로 객체 member선언
		while(true) {//무한루프(반복문)를 쓰기 위해 while(true)사용
			try { //예외 처리를 위해서 try catch문 사용
				BookMainv2.sc = new Scanner(System.in); //오류발생시 무한루프 피하기 위하여 입력객체 선언 static에 있는 sc가져와서 새로 선언.
				System.out.println("--------------도서관 관리 프로그램v2-------------------");
				System.out.println("1. 로그인 | 2. 회원가입 | 3. 프로그램 종료");
				System.out.println("------------------------------------------------");
				int ch = sc.nextInt(); // 입력받은 숫자를 ch에 저장 숫자라서 int타입
				if(ch == 1) { //입력받은 ch 값이 1이면
					member.login(); //Book클래스의 login메소드 호출
				}
				else if(ch == 2) { //입력받은 ch 값이 2이면
					member.signup(); //Book클래스의 signup메소드 호출
				}
				else if(ch == 3) { //입력받은 ch 값이 3이면
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
					break; //반복문 탈출
				}else {System.out.println("잘못된 입력입니다.");} //입력받은 값이 숫자 1~3이 아니면
			} catch (Exception e) { // 어떤 예외든지 발생하면 객체 e로 불러올 수 있음
				System.out.println("오류발생 관리자에게 문의" + e.getMessage()); //getMessage메소드를 호출하여 반환값(메시지) 가져옴
				
			}	
		}
	}
}
