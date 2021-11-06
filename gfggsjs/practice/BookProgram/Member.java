package BookProgram;

public class Member {
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;


	
	//������
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//�α��ν�
	public Member(String m_id, String m_pw) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	//ȸ�����Խ�
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}

	
	//�޼ҵ�
	
	//�α��� �޼ҵ�
	public void login() {
		System.out.println("------------------ �α��� ������ -----------------");
		System.out.print("���̵� �Է� : ");		String id = BookApp.sc.next();
		System.out.print("��й�ȣ �Է� : ");		String pw = BookApp.sc.next();
			if(id.equals("admin") && pw.equals("1234") ) {
				System.out.println("[������ �α��� �Ϸ�]");
				adminlogin();
				return;
			}
		Member member = new Member(id, pw);
		for(int i =0; i<BookApp.m_arr.length; i++) {
			if(BookApp.m_arr[i] != null && 
				BookApp.m_arr[i].getM_id().equals(id) && 
				BookApp.m_arr[i].getM_pw().equals(pw)) {
				BookApp.m_arr[i] = member;
				System.out.println("[�α��� �Ϸ�]");
				loginok();
				return;
			}else {
				System.out.println("[�α��� ����] �ش� ������ �����ϴ�.");
				return;
			}
		}
		
	}
	
	//�Ϲ� ȸ������ �α��� ���� �޼ҵ�
	private void loginok() {
		while(true) {
			Book book = new Book();
			System.out.println("--------------------------------------------");
			System.out.println("1. ������� | 2. �����뿩 | 3. �����ݳ� | 4. �α׾ƿ�");
			System.out.println("--------------------------------------------");
			int ch2 = BookApp.sc.nextInt();
			if(ch2 == 1) {
				System.out.println("[������� �������Դϴ�.]");
				book.booklist();
			}else if(ch2 == 2) {
				System.out.println("[�����뿩 �������Դϴ�.]");
				book.bookrent();
			}else if(ch2 == 3) {
				System.out.println("[�����ݳ� �������Դϴ�.]");
				book.bookreturn();
			}else if(ch2 == 4) {
				System.out.println("�α׾ƿ�");
				break;
			}else { System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. (1 ~ 4 ������ ���ڸ� �Է����ּ���.)");}
		}	
	}
	
	//������ (admin)���� �α��� ���� �޼ҵ�
	private void adminlogin() {
		while(true) {
			Book book = new Book();
			System.out.println("--------------------------------------------");
			System.out.println("1. �������| 2. ������� | 3. �α׾ƿ�");
			System.out.println("--------------------------------------------");
			int adminCh = BookApp.sc.nextInt();
				if(adminCh == 1) {
					System.out.println("[������� �������Դϴ�.]");
					book.bookreg();
				}else if (adminCh == 2) {
					System.out.println("[������� �������Դϴ�.]");
					book.booklist();
				}else if (adminCh == 3) {
					System.out.println("[������ �α׾ƿ�]");
					break;
				}else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. (1 ~ 3 ������ ���ڸ� �Է����ּ���.)");}
		}
	}

	//ȸ������ �޼ҵ�
	public void signup() {
		System.out.println("-------------- ȸ������ ������ -------------");
		System.out.print("���̵� �Է� : ");		String id = BookApp.sc.next();
			if(id.equals("admin")) {
				System.out.println("[�ߺ��� ���̵��Դϴ�.]");
				return;
			}
			
			if(idcheck(id)) {
				System.out.println("[�ߺ��� ���̵� �Դϴ�.]"); //�ߺ��� ���̵��Դϴ�. ������ �ٽ� ���θ޴��� �Ѿ�� �ʰ� ȸ�������������� �����ִ¹�?
				return;
			}
		System.out.print("��й�ȣ �Է� : ");		String pw = BookApp.sc.next();
		System.out.print("�̸� �Է� : ");		String name = BookApp.sc.next();
		System.out.print("�̸��� �Է� : ");		String email = BookApp.sc.next();
		
		Member member = new Member(id, pw, name, email);
			for(int i = 0; i<BookApp.m_arr.length; i++) {
				if(BookApp.m_arr[i] == null){
					BookApp.m_arr[i] = member;
					System.out.println("[ȸ������ �Ϸ�]");
					break;
				}
			}
	}
	
	
	//���̵� �ߺ�üũ �޼ҵ�
	public boolean idcheck(String id) {
		for(int i = 0; i<BookApp.m_arr.length; i++) {
			if(BookApp.m_arr[i] != null && BookApp.m_arr[i].getM_id().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//getter
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}


}//class end
