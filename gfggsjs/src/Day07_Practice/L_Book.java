package Day07_Practice;

public class L_Book {
	//1.필드
	private String b_ISBN;
	private String b_name;
	private boolean b_rent;
	private String m_name;
	
	//2.생성자
	public L_Book(String b_ISBN, String b_name, boolean b_rent, String m_name) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rent = b_rent;
		this.m_name = m_name;
	}
	
	//2-1. 빈생성자
	public L_Book() {}
	
	//3.메소드
	//3_1. 어드민 메소드
		//3_1_1) 도서 등록 메소드
		public boolean b_reg() {
			System.out.println("------------------도서 등록 페이지----------------");
			System.out.println("도서 코드 : ");	String b_ISBN = Library_P.sc.next();
				//도서 코드 중복 체크
				boolean check =  bookcheck(b_ISBN); 				
				if(check) {
					System.out.println("[[알림]] : 동일한 도서 코드가 존재합니다.");
					return false;
				}
			
			System.out.println("도서명 : ");		String b_name = Library_P.sc.next();
			
														// 도서대여여부 초기값 => true (Boolean으로 중복체크를 해서 true가 되어야 넘어감)
			//입력받기										// null은 String타입에서 없는 값을 의미
			L_Book l_Book = new L_Book (b_ISBN, b_name, true, null); 
			//배열 저장
			for (int i = 0 ; i<Library_P.l_Books.length; i++) {		
				if(Library_P.l_Books[i] == null) {
					Library_P.l_Books[i] = l_Book; return true;	}
			}
			return false;
		}
			///4. 도서 코드(ISBN) 중복체크 메소드
			public static boolean bookcheck(String check_isbn) {
				for(int i=0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] != null &&
							Library_P.l_Books[i].getB_ISBN().equals(check_isbn)) {
						return true;
					}
				}
				return false;
			}		
		//3_1_2) 도서 목록 메소드
			public void b_list() {
				System.out.println("------------------도서 목록 페이지----------------");
				System.out.println("도서코드\t도서이름\t대여여부\t대여한사람");
				for(int i=0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] == null) return;
					
					L_Book l_Book = Library_P.l_Books[i];
					System.out.println(l_Book.getB_ISBN()+"\t"+l_Book.getB_name()
					+"\t"+l_Book.getB_rent()+"\t"+l_Book.m_name);
				}
				return;
			}
			
		//3_1_3) 로그아웃 // main 메소드에서 return으로 실행
	
	//3_2. 일반 유저 메소드
		//3_2_1) 대여 메소드
			public boolean b_borrow(String loginInfo) {
				System.out.println("------------------도서 대여 페이지----------------");
				System.out.println("도서 코드 입력 : ");	String b_ISBN = Library_P.sc.next();
				//중복여부 체크, 여기서 중복은 해당 도서 코드가 존재하는지 안하는지가 됨
				boolean check = bookcheck(b_ISBN);
				if(check) {
					for(int i = 0; i<Library_P.l_Books.length; i++) {
						if(Library_P.l_Books[i] != null && Library_P.l_Books[i].getB_ISBN().equals(b_ISBN)) {
							if(Library_P.l_Books[i].getB_rent()) { 
								//rent는 boolean이라 true or false =>equals안씀 
								System.out.println("[[해당 도서를 대여했습니다.]]");
								Library_P.l_Books[i].setB_rent(false);
								Library_P.l_Books[i].setM_name(loginInfo);
								return true;
							}
							else {System.out.println("[[현재 대여중인 도서입니다. 대여불가합니다.]]"); return false;}
						}
					}
				}else {
					System.out.println("[[잘못된 도서 코드입니다. 다시 입력해 주십시오.]]");
					return false;
				}
				return false;
			}
				
		//3_2_2) 반납 메소드
			public boolean b_back(String loginInfo) {
				System.out.println("------------------도서 대여 페이지----------------");
				System.out.println("반납할 도서 코드 입력 : ");	String b_ISBN = Library_P.sc.next();
				
				for(int i =0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] != null && !Library_P.l_Books[i].getB_rent()) {
						if(Library_P.l_Books[i].getB_ISBN().equals(b_ISBN)) {
							if(Library_P.l_Books[i].getM_name().equals(loginInfo)) {
								System.out.println("[[반납 성공.]]");
								Library_P.l_Books[i].setM_name(null);
								Library_P.l_Books[i].setB_rent(true);
								return true;
							}
							
						}
					}
				}
				System.out.println("[[회원님이 대여중인 도서가 아닙니다.]]");
				return true;
	
			}
	
	public String getB_name() // set메소드 : 필드에 값 대입 메소드 	// get메소드 : 필드의 값 호출 메소드				
	{return b_name;}
	public void setB_name(String b_name) 
	{this.b_name = b_name;}
	
	public String getB_ISBN() 
	{return b_ISBN;}
	public void setB_ISBN(String b_ISBN) 
	{this.b_ISBN = b_ISBN;}
	
	public boolean getB_rent() 
	{return b_rent;}
	public void setB_rent(boolean b_rent) 
	{this.b_rent = b_rent;}
	
	public String getM_name() 
	{return m_name;}
	public void setM_name(String m_name) 
	{this.m_name = m_name;}

	
	
}
