package BookProgram;

public class Book extends Member{

	private String b_isbn;
	private String b_name;
	private boolean b_rent;
	private String m_id;
	
	
	//생성자
	
	public Book(String b_isbn, String b_name, boolean b_rent, String m_id) {
		this.b_isbn = b_isbn;
		this.b_name = b_name;
		this.b_rent = b_rent;
		this.m_id = m_id;
	}
	
	
	
	public Book(String b_isbn, String b_name) {
		this.b_isbn = b_isbn;
		this.b_name = b_name;
	}



	

	//메소드

	public Book() {
		// TODO Auto-generated constructor stub
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

	public boolean isB_rent() {
		return b_rent;
	}

	public void setB_rent(boolean b_rent) {
		this.b_rent = b_rent;
	}

	//도서목록
	public void booklist() {
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%3s\t%10s\t%20s\t%4s\t%8s\n","도서목록번호", "고유번호(isbn)","도서이름","대여여부","대여한 아이디");
			for(int i = 0; i<BookApp.b_arr.length; i++) {
				Book book_i = BookApp.b_arr[i];
				if(book_i != null) {
					System.out.printf("%3s\t%10s\t%20s\t%4s\t%8s\n", i, book_i.getB_isbn(), book_i.getB_name(), book_i.isB_rent(), book_i.getM_id());
				}
			}
		System.out.println("-------------------------------------------------------------");	
	}
	//도서대여
	public void bookrent() {
		System.out.println("대여할 도서의 목록 번호를 입력해주세요.");	int b_ch = BookApp.sc.nextInt();
		for(int i = 0; i<BookApp.b_arr.length; i++)
		
	}
	//도서반납
	public void bookreturn() {
		// TODO Auto-generated method stub
		
	}
	//도서등록
	public void bookreg() {
		BookApp.sc.nextLine();
		System.out.print("등록할 도서의 고유번호(ISBN코드)를 입력해주세요. : ");	String b_isbn = BookApp.sc.nextLine();
		if(bookcheck(b_isbn)) {
			System.out.println("이미 등록된 고유번호입니다. 다른 고유번호를 입력해주세요.");
			return;
		}
		System.out.print("등록할 도서의 이름을 입력해주세요. : ");				String b_name = BookApp.sc.nextLine();
		Book book = new Book(b_isbn, b_name, true, null);
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i]==null) {
				BookApp.b_arr[i] = book;
				System.out.println("[도서등록 완료]");
				break;
			}
		}
		
	}

	public boolean bookcheck(String b_name) {
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(b_name)) {
				return true;
			}
		}return false;
	}
	
}//class end
