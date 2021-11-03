package bookapp;

public class Member {

	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	public Member () {}
	
	//로그인 생성자
	public Member(String m_id, String m_pw) {
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	
	//회원가입 생성자
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	//회원가입 메소드
	public void signup () {
		
		System.out.print("아이디 : ");	 	String id = BookApp.sc.next();
			//중복된 아이디 찾기
			if(idcheck(id)) {
				System.out.println("중복된 아이디입니다.");
				return;
			}
		System.out.print("비밀번호 : ");		String pw = BookApp.sc.next();
		
			//아이디가 admin일시
			if(id.equals("admin")) {
				System.out.println("중복된 아이디입니다."); 
				 
			}
		System.out.print("이름 : ");			String name = BookApp.sc.next();
		System.out.print("전화번호 : ");		String phone = BookApp.sc.next();
		
		Member member = new Member(id, pw, name, phone);
		
		for(int i=0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i] == null) {
				BookApp.arr[i]= member;
				System.out.println(BookApp.arr[i]);
				System.out.println("회원가입 완료");
				break;
			}
		}
	}
	
	//관리자 로그인 메소드
	private void admin_login() {
		boolean flag = true;
		while(flag) {
		System.out.println("[관리자 로그인 메뉴]");
		System.out.println("1.도서등록 | 2. 도서목록 | 3. 로그아웃");
		int a_Ch = BookApp.sc.nextInt();
			if (a_Ch == 1) {
				Book book = new Book();
				book.b_reg();
			}
			else if (a_Ch == 2) {
				Book.b_list();
			}
			else if (a_Ch == 3) {
				System.out.println("[관리자 로그아웃]");
				flag = false;
			}
		}
	}

	//일반회원 로그인 메소드
	public void login() {
		
		System.out.print("아이디 : "); String id = BookApp.sc.next();
		System.out.print("비밀번호 : "); String pw = BookApp.sc.next();
		
			//관리자로 로그인시(id == "admin" && pw == "1234")
			if(id.equals("admin") && pw.equals("1234")) {
				Member member2 = new Member(); //admin_login()메소드에 static 안쓸경우
				member2.admin_login(); 
			}else {
				for(int i =0; i<BookApp.arr.length; i++) {
					if(BookApp.arr[i] != null && 
							BookApp.arr[i].getM_id().equals(id) && BookApp.arr[i].getM_pw().equals(pw)) {
						loginOK(id); //id 값 받아서 메소드에 인수로 넘기기
					}else {
						System.out.println("동일한 회원정보가 없습니다.");
						break;
					}
				}
			}
	}
	
	//일반회원 로그인 완료시 메소드
	public void loginOK(String loginid) { //id값 받아오기
		boolean flag = true;
		while(flag) {		
			System.out.println("------------------------------------------------");
			System.out.println("1.도서목록 | 2. 대여 | 3. 반납 | 4. 로그아웃");
			System.out.println("------------------------------------------------");
			int ch2 = BookApp.sc.nextInt();
			if(ch2 == 1) {
				System.out.println("[도서목록]");
				Book.b_list();
			}
			else if(ch2 == 2) {
				System.out.println("[대여]");
				Book.b_rental(loginid);
			}
			else if(ch2 == 3) {
				System.out.println("[반납]");
				Book.b_return(loginid);
			}
			else if (ch2 == 4) {
				System.out.println("[로그아웃 완료.]");
				flag = false;
			}
			else {System.out.println("잘못된 입력입니다.");
				
			}
		}
	}

	//아이디 찾기 메소드
	//public void findid(String m_name, String m_email) {// 언제 사용?
	public void findid() { 
		System.out.println("[아이디 찾기]");
		System.out.print("이름 : ");		String name = BookApp.sc.next();
		System.out.print("전화번호 : ");	String phone = BookApp.sc.next();
		for(int i = 0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i].getM_name().equals(name) && BookApp.arr[i].getM_phone().equals(phone)){
				System.out.println("회원님의 아이디는 "+ BookApp.arr[i].getM_id() +"입니다.");
				break;
			}	
		}
	}
	
	//비밀번호 찾기 메소드
	public void findpw() {
		System.out.println("[비밀번호 찾기]");
		System.out.print("아이디 : ");		String id = BookApp.sc.next();
		System.out.print("전화번호 : ");		String phone = BookApp.sc.next();
		for(int i = 0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i].getM_id().equals(id) && BookApp.arr[i].getM_phone().equals(phone)) {
				System.out.println("회원님의 비밀번호는 " + BookApp.arr[i].getM_pw() + "입니다.");
			}
		}
	}
	
	//중복체크 메소드
	public boolean idcheck(String id) {
		for(int i =0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i] != null && BookApp.arr[i].getM_id().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//getter setter
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

}//Member class end
