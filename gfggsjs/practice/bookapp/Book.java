package bookapp;

public class Book {

	private String b_isbn;
	private String b_name;

	public Book () {}

	public Book(String b_isbn, String b_name) {
		this.b_isbn = b_isbn;
		this.b_name = b_name;
	}
	
	
	//���� ��� �޼ҵ�
	public void b_reg() { // static�� �ƴϸ� MemberŬ������ admin_login()���� ȣ���� �ε�
		System.out.println("[���� ��� �޴�]");
		System.out.print("å ISBN �ڵ� : ");	String isbn = BookApp.sc.next();
		if(b_check(isbn)) {
			System.out.println("�̹� ��ϵ� �����Դϴ�.");
			return;
		}
		System.out.println("å �̸� : ");		String b_name = BookApp.sc.nextLine();
		
		Book book = new Book(isbn, b_name);
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i]==null) { //���⼭ isbn�� �Է��ص� ��������� �ٷ� �Ǵ� ������?
				BookApp.b_arr[i] = book;
				System.out.println("[���� ��� �Ϸ�]");
				break;
			}
		}
	}
	
	//���� ��� �޼ҵ�
	public static void b_list() {
		
	}

	//���� �ߺ� üũ
	public boolean b_check(String isbn) { //static�� �ƴϸ� ������ϸ޼ҵ��� b_check�� ������ ��
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

