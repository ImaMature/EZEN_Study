package bookapp;

public class Book {

	private String b_isbn;
	private String b_name;
	private boolean b_rent;
	private String m_id;
	
	public Book () {}

	public Book(String b_isbn, String b_name, boolean b_rent, String m_id) {
		this.b_isbn = b_isbn;
		this.b_name = b_name;
		this.b_rent = b_rent;
		this.m_id = m_id;
	}
	
	//도서 등록 메소드
	public void b_reg() { 
		
		System.out.println("[도서 등록 메뉴]");
		System.out.print("책 ISBN 코드 : ");	String isbn = BookApp.sc.next();
			if(b_check(isbn)) {
				System.out.println("이미 등록된 도서입니다.");
				return;
			}
		BookApp.sc.nextLine();
		System.out.print("책 이름 : ");		String b_name = BookApp.sc.nextLine();
		Book book = new Book(isbn, b_name, true, null);	
		
				
			for(int i = 0; i<BookApp.b_arr.length; i++) {
				if(BookApp.b_arr[i]==null) { //여기서 isbn만 입력해도 도서등록이 바로 되는 이유는? nextLine을 한번 더써줘야함
						BookApp.b_arr[i] = book;
						System.out.println("[도서 등록 완료]");
						break;
				}
			}
	}
	
	//도서 목록 메소드
	public static void b_list() {
		System.out.println("[도서목록 메뉴]");
		System.out.println("도서 코드\t도서명\t대여 여부\t회원 아이디");
		for(int i =0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null) {	
				System.out.println(	BookApp.b_arr[i].getB_isbn()+"\t"+
									BookApp.b_arr[i].getB_name()+"\t"+ 
									BookApp.b_arr[i].isB_rent()+"\t"+
									BookApp.b_arr[i].getM_id());				
			}//else {System.out.println("도서목록이 비어있습니다."); 
			//else를 안써야 도서목록이 제대로 작동 근데 도서목록이 비어있다면??	
			//}
		}
	}

	//도서 중복 체크
	public static boolean b_check(String isbn) { //static이 아니면 도서등록메소드의 b_check에 오류가 뜸
		for(int i =0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(isbn)) {
				return true;
			}
		}
		return false;
	}
	
	//도서 대여 메소드
	public static boolean b_rental(String loginid) {
		System.out.println("[도서목록 메뉴]");
		System.out.print("대여할 도서의 코드를 입력해 주세요."); String b_code = BookApp.sc.next();

		if(b_check(b_code)) {
			for(int i =0; i<BookApp.b_arr.length; i++) {
				if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(b_code)) {
					if(BookApp.b_arr[i].isB_rent()) { 
						System.out.println("도서 대여 성공");
						BookApp.b_arr[i].setB_rent(false);
						BookApp.b_arr[i].setM_id(loginid);
						return true;
					}else {System.out.println("이미 대여된 도서입니다.");}
				}
			}
		}else {
			System.out.println("해당 도서 코드는 없는 코드입니다.");
			return false;
		}
		return false;
		
	}
	
	//도서 반납 메소드
	public static void b_return(String loginid) {
		System.out.println("도서 반납 메소드");
		System.out.print("반납할 도서의 코드를 입력해 주세요."); String b_code = BookApp.sc.next();
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getM_id().equals(loginid) &&
					BookApp.b_arr[i].getB_isbn().equals(b_code) && !BookApp.b_arr[i].isB_rent()) {
				
				System.out.println("도서 반납 성공");
				BookApp.b_arr[i].setM_id(null);
				BookApp.b_arr[i].setB_rent(true);
				break;
			}
		}
	}

	public String getB_isbn() {
		return b_isbn;
	}

	public void setB_isbn(String b_isbn) {
		this.b_isbn = b_isbn;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public boolean isB_rent() {
		return b_rent;
	}

	public void setB_rent(boolean b_rent) {
		this.b_rent = b_rent;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	
	//getter setter
	
	
	
	
	



	
	
	
}//Book class end
