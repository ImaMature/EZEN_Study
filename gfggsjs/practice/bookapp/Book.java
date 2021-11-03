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
	
	//���� ��� �޼ҵ�
	public void b_reg() { 
		
		System.out.println("[���� ��� �޴�]");
		System.out.print("å ISBN �ڵ� : ");	String isbn = BookApp.sc.next();
			if(b_check(isbn)) {
				System.out.println("�̹� ��ϵ� �����Դϴ�.");
				return;
			}
		BookApp.sc.nextLine();
		System.out.print("å �̸� : ");		String b_name = BookApp.sc.nextLine();
		Book book = new Book(isbn, b_name, true, null);	
		
				
			for(int i = 0; i<BookApp.b_arr.length; i++) {
				if(BookApp.b_arr[i]==null) { //���⼭ isbn�� �Է��ص� ��������� �ٷ� �Ǵ� ������? nextLine�� �ѹ� ���������
						BookApp.b_arr[i] = book;
						System.out.println("[���� ��� �Ϸ�]");
						break;
				}
			}
	}
	
	//���� ��� �޼ҵ�
	public static void b_list() {
		System.out.println("[������� �޴�]");
		System.out.println("���� �ڵ�\t������\t�뿩 ����\tȸ�� ���̵�");
		for(int i =0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null) {	
				System.out.println(	BookApp.b_arr[i].getB_isbn()+"\t"+
									BookApp.b_arr[i].getB_name()+"\t"+ 
									BookApp.b_arr[i].isB_rent()+"\t"+
									BookApp.b_arr[i].getM_id());				
			}//else {System.out.println("��������� ����ֽ��ϴ�."); 
			//else�� �Ƚ�� ��������� ����� �۵� �ٵ� ��������� ����ִٸ�??	
			//}
		}
	}

	//���� �ߺ� üũ
	public static boolean b_check(String isbn) { //static�� �ƴϸ� ������ϸ޼ҵ��� b_check�� ������ ��
		for(int i =0; i<BookApp.b_arr.length; i++) {
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(isbn)) {
				return true;
			}
		}
		return false;
	}
	
	//���� �뿩 �޼ҵ�
	public static boolean b_rental(String loginid) {
		System.out.println("[������� �޴�]");
		System.out.print("�뿩�� ������ �ڵ带 �Է��� �ּ���."); String b_code = BookApp.sc.next();

		if(b_check(b_code)) {
			for(int i =0; i<BookApp.b_arr.length; i++) {
				if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getB_isbn().equals(b_code)) {
					if(BookApp.b_arr[i].isB_rent()) { 
						System.out.println("���� �뿩 ����");
						BookApp.b_arr[i].setB_rent(false);
						BookApp.b_arr[i].setM_id(loginid);
						return true;
					}else {System.out.println("�̹� �뿩�� �����Դϴ�.");}
				}
			}
		}else {
			System.out.println("�ش� ���� �ڵ�� ���� �ڵ��Դϴ�.");
			return false;
		}
		return false;
		
	}
	
	//���� �ݳ� �޼ҵ�
	public static void b_return(String loginid) {
		System.out.println("���� �ݳ� �޼ҵ�");
		System.out.print("�ݳ��� ������ �ڵ带 �Է��� �ּ���."); String b_code = BookApp.sc.next();
		for(int i = 0; i<BookApp.b_arr.length; i++) {
			
			if(BookApp.b_arr[i] != null && BookApp.b_arr[i].getM_id().equals(loginid) &&
					BookApp.b_arr[i].getB_isbn().equals(b_code) && !BookApp.b_arr[i].isB_rent()) {
				
				System.out.println("���� �ݳ� ����");
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
