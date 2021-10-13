package Day07;

import java.util.Scanner;

public class Member {

	//1. 필드 [아이디 비번 이름 연락처 등등
	private String m_id; //
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	
	//2. 생성자 [객체 생성시 필드의 초기값]
		//2-1) 회원가입시 생성되는 객체의 생성자
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
		//2-2) 빈 생성자
	public Member() {	} // 빈 생성자를 만들어 놔야됨(디폴트, 유지보수를 위해)

	
	//3. 메소드 [동작]
		//2. 회원가입 메소드[ 입력받은 정보로 객체 생성해서 배열에 저장하기 ]
	public static boolean signup() { 
		//static이 붙어야 Member.signup();을 바로 받을 수 있다.			//boolean ? 회원가입 성공여부만 입출력하기 위해
		//private이면 외부 클래스가 접근 안됨							//public을 쓰는 이유?	=>	이 클래스가 아닌 main이 속한 클래스(외부 클래스)로부터 호출하기 위해 (외부 클래스가 접근하도록 하기위해)
			//2-1. 입력받기
			System.out.println("-------------------회원가입 페이지------------------");
			System.out.println("아이디 : ");		String m_id = BookApplication.scanner.next(); //외부 클래스의 scanner 사용하는법
				//아이디 중복체크																  // 클래스명.객체명.next~;

				boolean check = idcheck(m_id);
				if ( check ) {
					System.out.println("[[알림]] : 사용할 수 없는 아이디 입니다.");
					return false;
				}
			System.out.println("비밀번호 : ");		String m_pw = BookApplication.scanner.next();
			System.out.println("이름 : ");		String m_name = BookApplication.scanner.next();
			System.out.println("핸드폰 번호 : ");	String m_phone = BookApplication.scanner.next();
			
			//2-2. 입력받은 정보로 객체 생성 [생성자]
			Member member = new Member(m_id, m_pw, m_name, m_phone);
			
			//2-3. 만든 객체를 배열에 넣기 [빈공간 찾아 넣기
			for(int i = 0; i<BookApplication.members.length; i++) {
				if( BookApplication.members[i] == null) {
					BookApplication.members[i] = member;
					return true; //회원가입 성공	//반환값 : 회원가입성공 or 실패 => True or False
			}
		}
			return false; //회원가입 실패 [빈공간이 없을 경우]
	}
		
		
		//6. 아이디 중복 체크 메소드
	public static boolean idcheck(String check_id) {
			for (int i =0; i<BookApplication.members.length; i++) {
				if (BookApplication.members[i] != null &&
						BookApplication.members[i].getM_id().equals(check_id)) {
					return true; // 인수와 동일한 아이디가 배열내 존재하면 true 
			}
		}
			return false; // 배열내 동일한 값이 없을경우 
	}	

		//3. 로그인 메소드	[입력받은 아이디와 비번이 배열 내 존재하면 로그인 성공 아님 실패 ]
	public static String login() {
			// 3-1. 아이디 비번 입력받기
			System.out.println("---------------로그인 페이지------------------");
			System.out.println("아이디 : "); String m_id = BookApplication.scanner.next();
			System.out.println("비밀번호 : "); String m_pw = BookApplication.scanner.next();
			
			// 3-2. 배열내 존재하면 로그인 성공
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_pw().equals(m_pw)) { 
					return m_id; // 로그인 성공시 성공한 아이디 비번 반환 // 괄호 잘 넣기
				}
			}
			
		return null; //로그인 실패  // 반환값 : 로그인 성공시 => 성공한 아이디 반환(return) or 실패시 null
	}
	
	
		//4. 아이디찾기 메소드 ( 이름, 연락처 입력받아 동일하면 => 아이디 알려주기)
	public static String findid() { //id == String 
			// 4-1. 입력받기
			System.out.println("---------------아이디 찾기 페이지------------------");
			System.out.println("이름 : "); String m_name = BookApplication.scanner.next();
			System.out.println("연락처 : "); String m_phone = BookApplication.scanner.next();
			//4-2. 배열내 동일한 정보의 객체 찾기
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null &&
						BookApplication.members[i].getM_name().equals(m_name) && 
						BookApplication.members[i].getM_phone().equals(m_phone)) {
					return BookApplication.members[i].getM_id(); // 로그인 성공시 성공한 아이디 비번 반환
			}
		}
			return null;
	}
		//5. 비번찾기 메소드 ( 아이디, 연락처 입력받아 동일하면 => 비번 알려주기
					// pw == String
	public static String findpw() { 
			
			//5-1. 입력받기
			System.out.println("---------------비밀번호 찾기 페이지------------------");
			System.out.println("아이디 : "); String m_id = BookApplication.scanner.next();
			System.out.println("연락처 : "); String m_phone = BookApplication.scanner.next();
			//5-2. 배열내 동일한 정보의 객체 찾기
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null &&
						BookApplication.members[i].getM_id().equals(m_id) && 
						BookApplication.members[i].getM_phone().equals(m_phone)) {
					return BookApplication.members[i].getM_pw(); // 로그인 성공시 성공한 아이디 비번 반환
			}
		}
			return null;// 반환값 : 비밀번호 찾았을 경우 => 비밀번호 / 실패시 null
	}
	
	
	
	
		//1) 필드를 private로 => get, set 메소드 사용
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
	
}
