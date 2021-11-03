package bookapp;

public class Member {

	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	public Member () {}
	
	//�α��� ������
	public Member(String m_id, String m_pw) {
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	
	//ȸ������ ������
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	//ȸ������ �޼ҵ�
	public void signup () {
		
		System.out.print("���̵� : ");	 	String id = BookApp.sc.next();
			//�ߺ��� ���̵� ã��
			if(idcheck(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�.");
				return;
			}
		System.out.print("��й�ȣ : ");		String pw = BookApp.sc.next();
		
			//���̵� admin�Ͻ�
			if(id.equals("admin")) {
				System.out.println("�ߺ��� ���̵��Դϴ�."); 
				 
			}
		System.out.print("�̸� : ");			String name = BookApp.sc.next();
		System.out.print("��ȭ��ȣ : ");		String phone = BookApp.sc.next();
		
		Member member = new Member(id, pw, name, phone);
		
		for(int i=0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i] == null) {
				BookApp.arr[i]= member;
				System.out.println(BookApp.arr[i]);
				System.out.println("ȸ������ �Ϸ�");
				break;
			}
		}
	}
	
	//������ �α��� �޼ҵ�
	private void admin_login() {
		boolean flag = true;
		while(flag) {
		System.out.println("[������ �α��� �޴�]");
		System.out.println("1.������� | 2. ������� | 3. �α׾ƿ�");
		int a_Ch = BookApp.sc.nextInt();
			if (a_Ch == 1) {
				Book book = new Book();
				book.b_reg();
			}
			else if (a_Ch == 2) {
				Book.b_list();
			}
			else if (a_Ch == 3) {
				System.out.println("[������ �α׾ƿ�]");
				flag = false;
			}
		}
	}

	//�Ϲ�ȸ�� �α��� �޼ҵ�
	public void login() {
		
		System.out.print("���̵� : "); String id = BookApp.sc.next();
		System.out.print("��й�ȣ : "); String pw = BookApp.sc.next();
		
			//�����ڷ� �α��ν�(id == "admin" && pw == "1234")
			if(id.equals("admin") && pw.equals("1234")) {
				Member member2 = new Member(); //admin_login()�޼ҵ忡 static �Ⱦ����
				member2.admin_login(); 
			}else {
				for(int i =0; i<BookApp.arr.length; i++) {
					if(BookApp.arr[i] != null && 
							BookApp.arr[i].getM_id().equals(id) && BookApp.arr[i].getM_pw().equals(pw)) {
						loginOK(id); //id �� �޾Ƽ� �޼ҵ忡 �μ��� �ѱ��
					}else {
						System.out.println("������ ȸ�������� �����ϴ�.");
						break;
					}
				}
			}
	}
	
	//�Ϲ�ȸ�� �α��� �Ϸ�� �޼ҵ�
	public void loginOK(String loginid) { //id�� �޾ƿ���
		boolean flag = true;
		while(flag) {		
			System.out.println("------------------------------------------------");
			System.out.println("1.������� | 2. �뿩 | 3. �ݳ� | 4. �α׾ƿ�");
			System.out.println("------------------------------------------------");
			int ch2 = BookApp.sc.nextInt();
			if(ch2 == 1) {
				System.out.println("[�������]");
				Book.b_list();
			}
			else if(ch2 == 2) {
				System.out.println("[�뿩]");
				Book.b_rental(loginid);
			}
			else if(ch2 == 3) {
				System.out.println("[�ݳ�]");
				Book.b_return(loginid);
			}
			else if (ch2 == 4) {
				System.out.println("[�α׾ƿ� �Ϸ�.]");
				flag = false;
			}
			else {System.out.println("�߸��� �Է��Դϴ�.");
				
			}
		}
	}

	//���̵� ã�� �޼ҵ�
	//public void findid(String m_name, String m_email) {// ���� ���?
	public void findid() { 
		System.out.println("[���̵� ã��]");
		System.out.print("�̸� : ");		String name = BookApp.sc.next();
		System.out.print("��ȭ��ȣ : ");	String phone = BookApp.sc.next();
		for(int i = 0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i].getM_name().equals(name) && BookApp.arr[i].getM_phone().equals(phone)){
				System.out.println("ȸ������ ���̵�� "+ BookApp.arr[i].getM_id() +"�Դϴ�.");
				break;
			}	
		}
	}
	
	//��й�ȣ ã�� �޼ҵ�
	public void findpw() {
		System.out.println("[��й�ȣ ã��]");
		System.out.print("���̵� : ");		String id = BookApp.sc.next();
		System.out.print("��ȭ��ȣ : ");		String phone = BookApp.sc.next();
		for(int i = 0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i].getM_id().equals(id) && BookApp.arr[i].getM_phone().equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ�� " + BookApp.arr[i].getM_pw() + "�Դϴ�.");
			}
		}
	}
	
	//�ߺ�üũ �޼ҵ�
	public boolean idcheck(String id) {
		for(int i =0; i<BookApp.arr.length; i++) {
			if(BookApp.arr[i] != null && BookApp.arr[i].getM_id().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//getter setter
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

}//Member class end
