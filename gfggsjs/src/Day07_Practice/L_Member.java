package Day07_Practice;

public class L_Member {

	//1. 필드
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	
	//2. 생성자
	public L_Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	//2-2. 빈생성자
	public L_Member() {}
	
	//3. 메소드 
	
	
	//3_2) 회원가입 메소드
	public static boolean signup() {
		//입력받기
		System.out.println("아이디 : ");			String m_id = Library_P.sc.next();
			//아이디 중복체크
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("[[알림]] : 사용할 수 없는 아이디입니다.");
				return false;
			}
		
		System.out.println("비밀번호 : ");			String m_pw = Library_P.sc.next();
		System.out.println("이름 : ");			String m_name = Library_P.sc.next();
		System.out.println("핸드폰 번호 : ");		String m_phone = Library_P.sc.next();
		
		L_Member l_Member = new L_Member(m_id, m_pw, m_name, m_phone);
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] == null) {
				Library_P.l_members[i] = l_Member;
				System.out.println("회원가입 성공");
				return true; 
			}
		}
		System.out.println("회원가입 실패");
		return false;
	}
		//3_2_1)중복체크 메소드
		public static boolean idcheck (String check_id) {
			for(int i = 0; i<Library_P.l_members.length; i++) {
				if(Library_P.l_members[i] != null &&
					Library_P.l_members[i].getM_id().equals(check_id)) {
					return true;
				}
			}
			return false;
		}
		
	//3_1) 로그인 메소드
	public static String login() {
			System.out.println("--------------로그인 페이지----------------");
			System.out.println("아이디 : ");		String m_id = Library_P.sc.next();
			System.out.println("비밀번호 : ");		String m_pw = Library_P.sc.next();
			
			for(int i =0; i<Library_P.l_members.length; i++) {
				if (Library_P.l_members[i] != null && 
						Library_P.l_members[i].getM_id().equals(m_id) && 
						Library_P.l_members[i].getM_pw().equals(m_pw)) {
					return m_id;
				}
			}
			return null;
			
	}
	//3_3) 아이디찾기 메소드
	public static String L_find_id() {
		System.out.println("--------------아이디 찾기 페이지----------------");
		System.out.println("이름 : ");		String m_name = Library_P.sc.next();
		System.out.println("전화번호 : ");		String m_phone = Library_P.sc.next();
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] != null && 
					Library_P.l_members[i].getM_name().equals(m_name) && 
					Library_P.l_members[i].getM_phone().equals(m_phone)) {
				return Library_P.l_members[i].getM_id();
			}
		} 
		return null;	//else
	}
	
	//3_4) 비번찾기 메소드
	public static String L_find_pw() {
		System.out.println("--------------비밀번호 찾기 페이지----------------");
		System.out.println("아이디 : ");		String m_id = Library_P.sc.next();
		System.out.println("전화번호 : ");		String m_phone = Library_P.sc.next();
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] != null && 
					Library_P.l_members[i].getM_id().equals(m_id) && 
					Library_P.l_members[i].getM_phone().equals(m_phone)) {
				return Library_P.l_members[i].getM_pw();
			}
		} 
		return null;	//else
	}
	
	
	// set메소드 : 필드에 값 대입 메소드 
	// get메소드 : 필드의 값 호출 메소드

	public String getM_id() 
	{return m_id;}
	public void setM_id(String m_id) 
	{this.m_id = m_id;}

	public String getM_pw() 
	{return m_pw;}
	public void setM_pw(String m_pw) 
	{this.m_pw = m_pw;}

	public String getM_name() 
	{return m_name;}
	public void setM_name(String m_name) 
	{this.m_name = m_name;}

	public String getM_phone() 
	{return m_phone;}
	public void setM_phone(String m_phone)
	{this.m_phone = m_phone;}
	
	
}
