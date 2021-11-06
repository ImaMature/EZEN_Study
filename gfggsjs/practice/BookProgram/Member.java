package BookProgram;

public class Member {
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;


	
	//생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//로그인시
	public Member(String m_id, String m_pw) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	//회원가입시
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}

	
	//메소드
	
	//로그인 메소드
	public void login() {
		System.out.println("------------------ 로그인 페이지 -----------------");
		System.out.print("아이디 입력 : ");		String id = BookApp.sc.next();
		System.out.print("비밀번호 입력 : ");		String pw = BookApp.sc.next();
			if(id.equals("admin") && pw.equals("1234") ) {
				System.out.println("[관리자 로그인 완료]");
				adminlogin();
				return;
			}
		Member member = new Member(id, pw);
		for(int i =0; i<BookApp.m_arr.length; i++) {
			if(BookApp.m_arr[i] != null && 
				BookApp.m_arr[i].getM_id().equals(id) && 
				BookApp.m_arr[i].getM_pw().equals(pw)) {
				BookApp.m_arr[i] = member;
				System.out.println("[로그인 완료]");
				loginok();
				return;
			}else {
				System.out.println("[로그인 실패] 해당 정보가 없습니다.");
				return;
			}
		}
		
	}
	
	//일반 회원으로 로그인 시의 메소드
	private void loginok() {
		while(true) {
			Book book = new Book();
			System.out.println("--------------------------------------------");
			System.out.println("1. 도서목록 | 2. 도서대여 | 3. 도서반납 | 4. 로그아웃");
			System.out.println("--------------------------------------------");
			int ch2 = BookApp.sc.nextInt();
			if(ch2 == 1) {
				System.out.println("[도서목록 페이지입니다.]");
				book.booklist();
			}else if(ch2 == 2) {
				System.out.println("[도서대여 페이지입니다.]");
				book.bookrent();
			}else if(ch2 == 3) {
				System.out.println("[도서반납 페이지입니다.]");
				book.bookreturn();
			}else if(ch2 == 4) {
				System.out.println("로그아웃");
				break;
			}else { System.out.println("잘못된 숫자를 입력하셨습니다. (1 ~ 4 사이의 숫자를 입력해주세요.)");}
		}	
	}
	
	//관리자 (admin)으로 로그인 시의 메소드
	private void adminlogin() {
		while(true) {
			Book book = new Book();
			System.out.println("--------------------------------------------");
			System.out.println("1. 도서등록| 2. 도서목록 | 3. 로그아웃");
			System.out.println("--------------------------------------------");
			int adminCh = BookApp.sc.nextInt();
				if(adminCh == 1) {
					System.out.println("[도서등록 페이지입니다.]");
					book.bookreg();
				}else if (adminCh == 2) {
					System.out.println("[도서목록 페이지입니다.]");
					book.booklist();
				}else if (adminCh == 3) {
					System.out.println("[관리자 로그아웃]");
					break;
				}else {System.out.println("잘못된 숫자를 입력하셨습니다. (1 ~ 3 사이의 숫자를 입력해주세요.)");}
		}
	}

	//회원가입 메소드
	public void signup() {
		System.out.println("-------------- 회원가입 페이지 -------------");
		System.out.print("아이디 입력 : ");		String id = BookApp.sc.next();
			if(id.equals("admin")) {
				System.out.println("[중복된 아이디입니다.]");
				return;
			}
			
			if(idcheck(id)) {
				System.out.println("[중복된 아이디 입니다.]"); //중복된 아이디입니다. 다음에 다시 메인메뉴로 넘어가지 않고 회원가입페이지에 남아있는법?
				return;
			}
		System.out.print("비밀번호 입력 : ");		String pw = BookApp.sc.next();
		System.out.print("이름 입력 : ");		String name = BookApp.sc.next();
		System.out.print("이메일 입력 : ");		String email = BookApp.sc.next();
		
		Member member = new Member(id, pw, name, email);
			for(int i = 0; i<BookApp.m_arr.length; i++) {
				if(BookApp.m_arr[i] == null){
					BookApp.m_arr[i] = member;
					System.out.println("[회원가입 완료]");
					break;
				}
			}
	}
	
	
	//아이디 중복체크 메소드
	public boolean idcheck(String id) {
		for(int i = 0; i<BookApp.m_arr.length; i++) {
			if(BookApp.m_arr[i] != null && BookApp.m_arr[i].getM_id().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//getter
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


}//class end
