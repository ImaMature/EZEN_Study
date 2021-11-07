package BookProgram;

public class Book extends Member{

	private String b_isbn;
	private String b_name;
	private boolean b_rent;
	private String m_id;
	private int m_no;
	
	//������
	
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

	public Book() {
		// TODO Auto-generated constructor stub
	}

	//�޼ҵ�


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
	
	public String getM_id() {
		return m_id;
	}



	public void setM_id(String m_id) {
		this.m_id = m_id;
	}



	public int getM_no() {
		return m_no;
	}



	public void setM_no(int m_no) {
		this.m_no = m_no;
	}



	//�������
	public void booklist() {
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%10s\t%20s\t%4s\t%8s\n", "������ȣ(isbn)","�����̸�","�뿩����","�뿩�� ���̵�");
			
			for(int i = 0; i<BookApp.b_arr.length; i++) {
				Book book_i = BookApp.b_arr[i];
				if(book_i != null) {
					System.out.printf("%10s\t%20s\t%4s\t%8s\n", book_i.getB_isbn(), book_i.getB_name(), book_i.isB_rent(), book_i.getM_id());
					
				}
			}
		System.out.println("-------------------------------------------------------------");	
	}
	
	//�����뿩
	public void bookrent(String id) {
		System.out.println("�뿩�� ������ ������ȣ�� �Է����ּ���.");		String isbn = BookApp.sc.next();
			if(bookcheck(isbn)) {
				for(int i = 0; i<BookApp.b_arr.length; i++) {
					if(BookApp.b_arr[i] != null && BookApp.b_arr[i].isB_rent()) { //isB_rent�� ������?? boolean�ε� �⺻�� true
						System.out.println("�����뿩 ����");
						BookApp.b_arr[i].setB_rent(false);
						BookApp.b_arr[i].setM_id(id);
						break;
					}
				}
			}else {System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ��Է����ּ���.");}
		
	
	}
	//�����ݳ�
	public void bookreturn() {
		System.out.println("�ݳ��� ������ ������ȣ�� �Է����ּ���");	 String isbn = BookApp.sc.next();
			if(bookcheck(isbn)) {
				for(int i = 0; i<BookApp.b_arr.length; i++) {
					Book book_i = BookApp.b_arr[i];
					if(book_i != null && book_i.getB_isbn().equals(isbn) && !book_i.isB_rent()) {
						book_i.setB_rent(true);
						book_i.setM_id(null);
					}
				}
			}
	}
	//�������
	public void bookreg() {
		BookApp.sc.nextLine();
		System.out.print("����� ������ ������ȣ(ISBN�ڵ�)�� �Է����ּ���. : ");	String b_isbn = BookApp.sc.nextLine();
		if(bookcheck(b_isbn)) {
			System.out.println("�̹� ��ϵ� ������ȣ�Դϴ�. �ٸ� ������ȣ�� �Է����ּ���.");
			return;
		}
		System.out.print("����� ������ �̸��� �Է����ּ���. : ");				String b_name = BookApp.sc.nextLine();
		Book book = new Book(b_isbn, b_name, true, null);
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i]==null) {
				BookApp.b_arr[i] = book;
				System.out.println("[������� �Ϸ�]");
				break;
			}
		}
		
	}

	public boolean bookcheck(String b_isbn) {
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(b_isbn)) {
				return true;
			}
		}return false;
	}
	
}//class end
