package Day07_Practice;

public class L_Book {
	//1.�ʵ�
	private String b_ISBN;
	private String b_name;
	private boolean b_rent;
	private String m_name;
	
	//2.������
	public L_Book(String b_ISBN, String b_name, boolean b_rent, String m_name) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rent = b_rent;
		this.m_name = m_name;
	}
	
	//2-1. �������
	public L_Book() {}
	
	//3.�޼ҵ�
	//3_1. ���� �޼ҵ�
		//3_1_1) ���� ��� �޼ҵ�
		public boolean b_reg() {
			System.out.println("------------------���� ��� ������----------------");
			System.out.println("���� �ڵ� : ");	String b_ISBN = Library_P.sc.next();
				//���� �ڵ� �ߺ� üũ
				boolean check =  bookcheck(b_ISBN); 				
				if(check) {
					System.out.println("[[�˸�]] : ������ ���� �ڵ尡 �����մϴ�.");
					return false;
				}
			
			System.out.println("������ : ");		String b_name = Library_P.sc.next();
			
														// �����뿩���� �ʱⰪ => true (Boolean���� �ߺ�üũ�� �ؼ� true�� �Ǿ�� �Ѿ)
			//�Է¹ޱ�										// null�� StringŸ�Կ��� ���� ���� �ǹ�
			L_Book l_Book = new L_Book (b_ISBN, b_name, true, null); 
			//�迭 ����
			for (int i = 0 ; i<Library_P.l_Books.length; i++) {		
				if(Library_P.l_Books[i] == null) {
					Library_P.l_Books[i] = l_Book; return true;	}
			}
			return false;
		}
			///4. ���� �ڵ�(ISBN) �ߺ�üũ �޼ҵ�
			public static boolean bookcheck(String check_isbn) {
				for(int i=0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] != null &&
							Library_P.l_Books[i].getB_ISBN().equals(check_isbn)) {
						return true;
					}
				}
				return false;
			}		
		//3_1_2) ���� ��� �޼ҵ�
			public void b_list() {
				System.out.println("------------------���� ��� ������----------------");
				System.out.println("�����ڵ�\t�����̸�\t�뿩����\t�뿩�ѻ��");
				for(int i=0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] == null) return;
					
					L_Book l_Book = Library_P.l_Books[i];
					System.out.println(l_Book.getB_ISBN()+"\t"+l_Book.getB_name()
					+"\t"+l_Book.getB_rent()+"\t"+l_Book.m_name);
				}
				return;
			}
			
		//3_1_3) �α׾ƿ� // main �޼ҵ忡�� return���� ����
	
	//3_2. �Ϲ� ���� �޼ҵ�
		//3_2_1) �뿩 �޼ҵ�
			public boolean b_borrow(String loginInfo) {
				System.out.println("------------------���� �뿩 ������----------------");
				System.out.println("���� �ڵ� �Է� : ");	String b_ISBN = Library_P.sc.next();
				//�ߺ����� üũ, ���⼭ �ߺ��� �ش� ���� �ڵ尡 �����ϴ��� ���ϴ����� ��
				boolean check = bookcheck(b_ISBN);
				if(check) {
					for(int i = 0; i<Library_P.l_Books.length; i++) {
						if(Library_P.l_Books[i] != null && Library_P.l_Books[i].getB_ISBN().equals(b_ISBN)) {
							if(Library_P.l_Books[i].getB_rent()) { 
								//rent�� boolean�̶� true or false =>equals�Ⱦ� 
								System.out.println("[[�ش� ������ �뿩�߽��ϴ�.]]");
								Library_P.l_Books[i].setB_rent(false);
								Library_P.l_Books[i].setM_name(loginInfo);
								return true;
							}
							else {System.out.println("[[���� �뿩���� �����Դϴ�. �뿩�Ұ��մϴ�.]]"); return false;}
						}
					}
				}else {
					System.out.println("[[�߸��� ���� �ڵ��Դϴ�. �ٽ� �Է��� �ֽʽÿ�.]]");
					return false;
				}
				return false;
			}
				
		//3_2_2) �ݳ� �޼ҵ�
			public boolean b_back(String loginInfo) {
				System.out.println("------------------���� �뿩 ������----------------");
				System.out.println("�ݳ��� ���� �ڵ� �Է� : ");	String b_ISBN = Library_P.sc.next();
				
				for(int i =0; i<Library_P.l_Books.length; i++) {
					if(Library_P.l_Books[i] != null && !Library_P.l_Books[i].getB_rent()) {
						if(Library_P.l_Books[i].getB_ISBN().equals(b_ISBN)) {
							if(Library_P.l_Books[i].getM_name().equals(loginInfo)) {
								System.out.println("[[�ݳ� ����.]]");
								Library_P.l_Books[i].setM_name(null);
								Library_P.l_Books[i].setB_rent(true);
								return true;
							}
							
						}
					}
				}
				System.out.println("[[ȸ������ �뿩���� ������ �ƴմϴ�.]]");
				return true;
	
			}
	
	public String getB_name() // set�޼ҵ� : �ʵ忡 �� ���� �޼ҵ� 	// get�޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ�				
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
