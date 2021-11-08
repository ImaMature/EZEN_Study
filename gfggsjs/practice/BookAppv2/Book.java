package BookAppv2;

public class Book {//������ ���õ� Ŭ����
	
	//�ʵ�
	//private ���� �����ڷ� �ܺ�Ŭ�������� �������� ���ϵ��� ����. Ŭ���� ���ο����� ���� ����
	private String b_isbn; //���� �ڵ� ��ü ������
	private String b_name; //���� �̸� ��ü
	private boolean b_rent; //���� ���� ���� ��ü (boolean ��ü�� �⺻ ���� true�̴�.)
	private String m_id; //ȸ�� ���̵� ��ü (���߿� ���� �뿩 ���ο��� ��Ÿ�� ���̵� ��ü�̴�.)
	
	
	//������
	//�������
	public Book () {} //BookŬ������ �޼ҵ峪 �ʵ带 �ٸ� �ܺ� Ŭ�������� ����ϱ� ���� ����

	//���� �뿩 ����, ���� ���(b_rent�� true, m_id�� null��) ������
	public Book(String b_isbn, String b_name, boolean b_rent, String m_id) { //������ ���õ� �μ����� ���޹޴� �Ű�������
		this.b_isbn = b_isbn; // ������ �ڵ带 ���޹޾� this.b_isbn�� ������ �ν��Ͻ�ȭ�Ѵ�.(�޸𸮿� �Ҵ��Ѵ�.) (���޸𸮿� �Ҵ�)
		this.b_name = b_name; // ������ �̸��� ���޹޾� this.b_name�� ������ �ν��Ͻ�ȭ�Ѵ�.
		this.b_rent = b_rent; // ������ �뿩 ���θ� true�� false�� ���޹޾� this.b_rent�� ������ �ν��Ͻ�ȭ�Ѵ�
		this.m_id = m_id; // ������ ���� ȸ���� ���̵� ���޹޾� this.m_id�� ������ �ν��Ͻ�ȭ�Ѵ�.
	}


	//���� ��� �޼ҵ�
	public void booklist() {
		
		System.out.println("------------------------------------------------------------");
		System.out.printf("%10s\t%8s\t%5s\t%8s\n", "�����ڵ�","������","�뿩����","�뿩�� ȸ��");//printf�� �Ἥ �� ����� �ʵ���� ���ڼ� ����
		for(int i =0; i<BookMainv2.b_arr.length; i++) { //�迭 ����
			Book book = new Book(); //book �ӽð�ü����
			book = BookMainv2.b_arr[i]; //book �ӽð�ü ���� �迭�� i��° �ε����� ������ book�� ���� 
			if(book != null) { //�ӽð�ü�� null���� �ƴҶ�
				System.out.printf("%10s\t%8s\t%5s\t%8s\n" , book.getB_isbn(), book.getB_name(), book.isB_rent(), book.getM_id()); //�ش� %����s��ŭ ������ ��ü���� �ֱ�
				//%����s : ���� ��ŭ ���ʿ� ���� ����.
				
			}
		}
		System.out.println("------------------------------------------------------------");
		
	}
	//���� ��� �޼ҵ�
	public void bookreg() {
		BookMainv2.sc.nextLine(); // next�� nextint������ nextLine���� ����� ���� ��� ���ؼ� nextLine���
		System.out.print("����� ���� �ڵ� : ");	String bookisbn = BookMainv2.sc.nextLine(); //�Է¹��� ���� �ڵ带 bookisbn�� ����
		if(bookcheck(bookisbn)) { //���� �ߺ� üũ �Է¹��� bookisbn�� �ش� �޼ҵ忡 ����
			//�׷��� ��ȯ���� true�̸� if ���� ���๮ ���� false�̸� if�� ��ŵ
			System.out.println("�ش� ���� �ڵ带 ���� å�� �̹� �����մϴ�.");
			return; //�ݺ��� Ż��
		}
		System.out.print("����� ���� �̸� : ");	String bookname = BookMainv2.sc.nextLine(); //�Է¹��� ���� �̸��� bookname�� ���� ������ ���� �� ������ nextLine���
		
		Book book = new Book(bookisbn, bookname, true, null); // �Է¹��� �� ���� ��ü ���� (���� �ڵ�, ���� �̸�, true(b_rent�� �⺻��), null(ȸ�����̵��� �⺻��))
		for(int i = 0; i<BookMainv2.b_arr.length; i++) {
			
			//m = BookMainv2.b_arr[i]; //���� �迭�� i��°�� �ε������� m�� ����
			if(BookMainv2.b_arr[i] == null) { //i��° �ε��� ���� null���̸�
				BookMainv2.b_arr[i] = book; //book�� ����(bookisbn, bookname, true, null)�� m�� ����
				System.out.println("���� ��� �Ϸ�");
				System.out.println(BookMainv2.b_arr[i]);
				break; //�ݺ��� Ż�� �ѹ��� �ϳ����� ��ϰ����ϱ� ����
			}
		}
	}

	
	//���� �ߺ� üũ �޼ҵ� //public�̾�� �ٸ� �޼ҵ忡���� ����� �� �� ����
	public boolean bookcheck(String bookisbn) {//isbn���� ���޹���
		for(int i =0; i<BookMainv2.b_arr.length; i++) { // ���� �迭 �ε����� ���� ��ŭ �ݺ����� ������
			Book b = new Book();//b��� �ӽð�ü ����
			b = BookMainv2.b_arr[i]; // ���� �迭�� i��°�� ���� �ӽð�ü b�� ����
			if(b != null && b.getB_isbn().equals(bookisbn)) { //���� i��° �ε��� ���� null�� �ƴϰ� i��° �ε������� ������ isbn �����ڵ�� ���޹��� bookisbn���� ���� ������
				return true;//�´ٸ� true��ȯ
			}
		}
		return false; //�ƴ϶�� false ��ȯ
	}


	//���� �뿩 �޼ҵ�
	public void bookrent(String id) { //id �� �α��� �Ϸ�� �޼ҵ�(MemberŬ������ loginconfirm)���� �޾ƿ���
		System.out.println("�뿩�� ���� �ڵ� : ");	String isbn = BookMainv2.sc.next(); //�Է� ���� �����ڵ带 isbn�� ����
			if(bookcheck(isbn)) { //���� �ߺ� üũ �޼ҵ忡 �Է¹��� isbn�� ���� 
				for(int i = 0; i<BookMainv2.b_arr.length; i++) {// ���� �迭�� ���̸�ŭ �ݺ��� ����
					Book b = BookMainv2.b_arr[i]; //b��� �ӽð�ü�� ���������� i��° �ε��� �� ����
					if(b != null && b.isB_rent() && b.getB_isbn().equals(isbn)) { //���� i��° �ε��� ���� null�� �ƴϰ� B_rent(true)��� //���� �߻�!!���� �뿩�Ҷ� ������ ù��° ������ �뿩��
						System.out.println("���� �뿩 ����");
						b.setB_rent(false); //i���� �ε����� b_rent���� false�� ����
						b.setM_id(id); //i��° �ε����� b_isbn���� �Է¹��� id�� ����
						break; //�ݺ��� Ż��
					}
				}
			}else {System.out.println("�߸��� �Է��Դϴ�.");} // �ƴ��ҽ� �߸��� �Է��Դϴ�. ���
	}

	//���� �ݳ� �޼ҵ�
	public void bookreturn(String id) { //id �� �α��� �Ϸ�� �޼ҵ�(MemberŬ������ loginconfirm)���� �޾ƿ���
		System.out.println("�ݳ��� ���� �ڵ� : "); String isbn = BookMainv2.sc.next(); //�Է� ���� �����ڵ带 isbn�� ����
		if(bookcheck(isbn)) { //���� �ߺ� üũ �޼ҵ忡 �Է¹��� isbn�� ���� 
			for(int i = 0; i<BookMainv2.b_arr.length; i++) { // ���� �迭�� ���̸�ŭ �ݺ��� ����
				Book book = BookMainv2.b_arr[i];//book�̶�� �ӽð�ü�� ���������� i��° �ε��� �� ����
				if(book != null && !book.isB_rent() && book.getB_isbn().equals(isbn)) { 
					//i��° �ε��� ���� null�� �ƴϰ� i��° �ε������� ����� ���� �Է¹��� isbn���� ���� ��
					System.out.println("���� �ݳ� �Ϸ�");
					book.setB_rent(true);
					book.setM_id(null);
					break;
				}
				
			}
		}else {System.out.println("�߸��� �Է��Դϴ�.");}
		
	}

	

	
	//getter setter
	public String getB_isbn() { // ������ �ڵ� ���� ��������(�����ϴ�) �޼ҵ�
		return b_isbn; //���� �ڵ� ���� ��ȯ�Ѵ�.
	}
	
	public void setB_isbn(String b_isbn) { //���� �ڵ� ���� �����ϴ� �޼ҵ�
		this.b_isbn = b_isbn; // ������ ���� this.b_isbn�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	
	public String getB_name() { // ������ �̸� ���� ��������(�����ϴ�) �޼ҵ�
		return b_name; //���� �̸� ���� ��ȯ�Ѵ�.
	}
	
	public void setB_name(String b_name) { //���� �̸� ���� �����ϴ� �޼ҵ�
		this.b_name = b_name; // ������ ���� this.b_name�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	
	public boolean isB_rent() { // ������ �뿩���� ��(true or false)�� ��������(�����ϴ�) �޼ҵ�
		return b_rent;//�뿩 ���� ���� ��ȯ�Ѵ�.(true or false)
	}
	
	public void setB_rent(boolean b_rent) { //���� �뿩 ���� ���� �����ϴ� �޼ҵ� (true or false)
		this.b_rent = b_rent; // ������ ���� this.b_rent�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	
	public String getM_id() { // ȸ���� id ���� ��������(�����ϴ�) �޼ҵ�
		return m_id; //ȸ���� id���� ��ȯ�Ѵ�.
	}
	
	public void setM_id(String m_id) { //ȸ�� id ���� �����ϴ� �޼ҵ�
		this.m_id = m_id; // ������ ���� this.m_id�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	
	
}
