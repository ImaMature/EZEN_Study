package bookapp;

public class Book {

	private String b_isbn;
	private String b_name;

	public Book () {}

	public Book(String b_isbn, String b_name) {
		this.b_isbn = b_isbn;
		this.b_name = b_name;
	}
	
	
	//도서 등록 메소드
	public void b_reg() { // static이 아니면 Member클래스의 admin_login()에서 호출이 인됨
		System.out.println("[도서 등록 메뉴]");
		System.out.print("책 ISBN 코드 : ");	String isbn = BookApp.sc.next();
		if(b_check(isbn)) {
			System.out.println("이미 등록된 도서입니다.");
			return;
		}
		System.out.println("책 이름 : ");		String b_name = BookApp.sc.nextLine();
		
		Book book = new Book(isbn, b_name);
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i]==null) { //여기서 isbn만 입력해도 도서등록이 바로 되는 이유는?
				BookApp.b_arr[i] = book;
				System.out.println("[도서 등록 완료]");
				break;
			}
		}
	}
	
	//도서 목록 메소드
	public static void b_list() {
		
	}

	//도서 중복 체크
	public boolean b_check(String isbn) { //static이 아니면 도서등록메소드의 b_check에 오류가 뜸
		for(int i =0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(isbn)) {
				return true;
			}
		}
		return false;
	}
	
	//getter setter
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

	
	
	
}//Book class end

