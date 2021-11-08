package BookAppv2;

public class Member {//ȸ���� ���õ� Ŭ����

	//�ʵ�
	//private ���� �����ڷ� �ܺ�Ŭ�������� �������� ���ϵ��� ����. Ŭ���� ���ο����� ���� ����
	private String m_id; //ȸ���� ���̵� �� ��ü 
	private String m_pw; //ȸ���� ��й�ȣ �� ��ü
	private String m_name; //ȸ���� �̸� �� ��ü
	private String m_phone; //ȸ���� ��ȭ��ȣ �� ��ü
	
	
	public Member() {} //�� ������. Member�� �޼ҵ峪 �ʵ带 �ٸ� Ŭ�������� ����ϱ� ���� ����. 
	//Member ��ü = new Member();
	//��ü.get~~~ or ��ü.set~~~���� getter setter �޼ҵ���� ����� �� �ִ�.
	
	// ȸ�������� ���� ������
	public Member(String m_id, String m_pw, String m_name, String m_phone) { //�μ����� ���޹޴� �Ű�������
		//�μ����� ���޹����� this.~~~�� �� �μ����� ����ȴ�.
		//���⼭ this�� �μ� �ڽ��� ���Ѵ�.
		//�Ű������� �ʵ��� �������� ��ĥ �� ���
		this.m_id = m_id; // ȸ�� ���̵� �����ϴ� �ν��Ͻ�
		this.m_pw = m_pw; // ȸ�� ��й�ȣ �����ϴ� �ν��Ͻ�
		this.m_name = m_name; // ȸ�� �̸� �����ϴ� �ν��Ͻ�
		this.m_phone = m_phone; // ȸ�� ��ȭ��ȣ �����ϴ� �ν��Ͻ�
	}
	
	
	
	//�α��� ������
	public Member(String m_id, String m_pw) {
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	
	
	//�α��� �޼ҵ�
	public void login() {
		while(true) {
			try {
				System.out.println("---------------------�α��� ������------------------------");
				System.out.print("���̵� : "); 	String id = BookMainv2.sc.next(); // print �� �Է��� ���� ������� �ʰ� ��. //�Է¹��� ���̵� ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc ���� ��ü id�� ����
				System.out.print("��й�ȣ : ");	String pw = BookMainv2.sc.next(); //�Է¹��� ��й�ȣ ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc ���� ��ü pw�� ����
					if(id.equals("admin") && pw.equals("1234")) { //�Է¹��� id ���� admin�̰� ��й�ȣ ���� 1234�̸�
						System.out.println("������ �α���"); //������ �α��� ���
						adminlogin(); //������ �α��� �޼ҵ� ����, ���� �޼ҵ�� Ŭ������.�޼ҵ�� ���� ���� ���ص� ��
						return; // �޼ҵ� ����
					}//�ƴ϶�� ������ ����
				Member member = new Member(id, pw); // �Է¹��� id, pw���� �α��� �����ڿ� ����
				for(int i = 0; i<BookMainv2.m_arr.length; i++) {//ȸ���� �迭 �� ��ŭ �ݺ����� ����
					Member m = BookMainv2.m_arr[i]; // ȸ���� i��° �ε��� ���� �ӽ� ��ü m�� ���� �ش� ������ ����Ұ�. ���̵��� null���̶�� ��
					if(m != null && m.getM_id().equals(id) && m.getM_pw().equals(pw)) {//�ε����� ������� �ʰ� ���̵��� ��ġ�ϰ�, ��й�ȣ ���� ��ġ�Ҷ�
						m = member;
						System.out.println("�α��� ����"); 
						loginconfirm(id); //�α��� ������ �޼ҵ� ����
						return; //�ݺ� ������� �ʰ� Ż��
					}
					else if(m == null && !m.getM_id().equals(id) && !m.getM_pw().equals(pw)) { 
					//i��° �ε����� ����� ������ ���̵� ���� �Է¹��� ���̵𰪰� ���� �ʰ� ������ ��й�ȣ ���� �Է¹��� ��й�ȣ ���� ���� �ʴٸ�
						System.out.println("��ġ�ϴ� ������ �����ϴ�.");
						return;//�޼ҵ� ����
						
					}
				}
			}
			//�α��� �����߻��� ����ó��
			catch(Exception e) {
				System.out.println("�α��ν� ����" + e.getMessage()); //e.getMessage�޼ҵ�� �޽��� ȣ��
				break; //���ѹݺ� Ż��
				}
		}	
	
	}
	
	//�Ϲ�ȸ�� �α��οϷ�� �޼ҵ�
	public void loginconfirm(String id) { //id���� �μ��� �޾ƿ�
		while(true) { //�ݺ��� ����
			try { // ������� ���� try catch�� ����
				Book book = new Book(); //BookŬ������ �޸𸮸� ����ϱ� ���� �ӽð�ü ����
				System.out.println("---------------------------------------------------------");
				System.out.println("1. ������� | 2. �뿩 | 3. �ݳ� | 4. �α׾ƿ�");
				System.out.println("---------------------------------------------------------");
				int ch2 = BookMainv2.sc.nextInt(); //�Է°�ü ch2 ����
					if(ch2 == 1) { //ch2�� 1�̸�
						book.booklist(); //���� ��� �޼ҵ� ȣ��
					}
					else if(ch2 == 2) { //ch2�� 2�̸�
						book.bookrent(id); //���� �뿩 �޼ҵ� ȣ��
					}
					else if(ch2 == 3) { //ch2�� 3�̸�
						book.bookreturn(id); //���� �ݳ� �޼ҵ� ȣ��
					}
					else if(ch2 == 4) { //ch2�� 4�̸�
						System.out.println("�α׾ƿ�. �̿����ּż� �����մϴ�.");
						return; // �ݺ��� Ż��
					}else { //ch2�� 1~4������ ���ڰ� �ƴϸ�
						System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
						
					} 
					//�Ϲ� ȸ�� �α����� �����߻��� ����ó��
			}catch(Exception e) { //����ó�� ���� , ���ڸ� �Է��Ѵٴ��� �ϴ� ���ܰ� �ִٸ�,
				System.out.println("�Ϲ�ȸ�� �α��ν� ����" + e.getMessage()); //e.getMessage�޼ҵ�� �޽��� ȣ��
				break;
			}
		}
	}
	
	//�����ڷ� �α��ν� �޼ҵ�
	public void adminlogin() {
		while(true) {
			try {
				Book book = new Book(); //Book Ŭ������ �޸𸮸� ����ϱ� ���� ������ ����
				System.out.println("---------------------------------------------------------");
				System.out.println("1. ������� | 2. ������� | 3. �α׾ƿ�");
				System.out.println("---------------------------------------------------------");
				int ch3 = BookMainv2.sc.nextInt(); // �Է°�ü ch3 ����
					if(ch3 == 1) { //ch3�� ���� 1�̸�
						book.bookreg(); //���� ��� �޼ҵ� ȣ��
					}
					else if(ch3 == 2) { //ch3�� ���� 2�̸�
						book.booklist(); //���� ��� �޼ҵ� ȣ��
					}
					else if(ch3 == 3) { //ch3�� ���� 3�̸�
						System.out.println("������ �α׾ƿ�");
						break;
					}else {
						System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�."); //1~3�� �ƴ� �ٸ� ���ڸ� �Է����� ���
					}
				}
			catch (Exception e) { //����ó�� ���� 
				System.out.println("������ �α��� �� ����" + e.getMessage()); //������ �α��ν� ����ó��
				break; //�ݺ��� Ż��
			}
		}	
	}

	//ȸ������ �޼ҵ�
	public void signup() {
		System.out.print("���̵� �Է��� �ּ���. : ");	String id = BookMainv2.sc.next(); //�Է¹��� ���̵� ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc�� ���� ��ü id�� ����
			if(id.equals("admin")) {	//���̵� ���� admin�� ���ٸ�
				System.out.println("�ߺ��� ���̵��Դϴ�.");	//���
				return;	//�޼ҵ� ����
			}
			//�ߺ�üũ �޼ҵ� ����
			if(idcheck(id)) {// �ߺ�üũ �޼ҵ忡 �Է¹��� id�� ���� //��ȯ�� ���� true��� �ߺ��� ���̵� �Դϴ�. ���
				System.out.println("�ߺ��� ���̵� �Դϴ�.");
				return; //�޼ҵ� ����
			} //��ȯ�� ���� false��� if�� Ż��
		System.out.print("��й�ȣ�� �Է��� �ּ���.");		String pw = BookMainv2.sc.next(); //�Է¹��� ��й�ȣ ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc�� ���� ��ü pw�� ����
		System.out.print("�̸��� �Է��� �ּ���.");		String name = BookMainv2.sc.next(); //�Է¹��� �̸� ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc�� ���� ��ü name�� ����
		System.out.print("��ȭ��ȣ �Է��� �ּ���.");		String phone = BookMainv2.sc.next(); //�Է¹��� ��ȭ��ȣ ���� BookMainv2 Ŭ������ ����� �Է� ��ü sc�� ���� ��ü phone�� ����
		Member member = new Member(id, pw, name, phone); //ȸ�������� ���� �����ڻ��
		for(int i =0; i<BookMainv2.m_arr.length; i++) { //ȸ���� �迭 �� ��ŭ �ݺ��� ����
			if(BookMainv2.m_arr[i] == null) { //����� ���� ���ٸ�
				BookMainv2.m_arr[i] = member; //��ü member�� ��(id, pw, name, phone) i��° �ε����� ����
				System.out.println("ȸ������ �Ϸ�");
				System.out.println(member);
				break; // ���� �ݺ� ���� �ʰ� break���� �ѹ� ����Ǹ� �ݺ��� Ż��
			}
		}
	}
		
	//�ߺ� üũ �޼ҵ�	
	public boolean idcheck(String id) { //id�� �Ű������� ���޹���
		for(int i = 0; i<BookMainv2.m_arr.length; i++) { //ȸ���� �迭 �� ��ŭ �ݺ��� ����
			Member m = BookMainv2.m_arr[i]; // ȸ���� i��° �ε��� ���� �ӽ� ��ü m�� ����
			if(m != null && m.getM_id().equals(id)) { //m���� null�� �ƴϰ� i��° �ε������� ������ id���� �Է��� id���� ���ٸ�
				return true; //true �� ��ȯ
			}
		}
		return false; //���� �ƴ��ϸ� false�� ��ȯ
	}
		
	
	//getter setter
	//Member ��ü = new Member();
	//��ü.get~~~ , ��ü.set~~
	//getter setter �޼ҵ尡 �Ϲݸ޼ҵ�麸�� ������ ������ �־�� get~ set~ ��� ����
	public String getM_id() { // ȸ���� ���̵� ���� ��������(�����ϴ�) �޼ҵ�
		return m_id; //���̵� ���� ��ȯ�Ѵ�.
	}
	public void setM_id(String m_id) { //ȸ���� ���̵� ���� �����ϴ� �޼ҵ� 
		this.m_id = m_id; // ������ ���� this.m_id�� �����Ͽ� �ν��Ͻ��Ѵ�.
	}
	public String getM_pw() { // ȸ���� ��й�ȣ ���� ��������(�����ϴ�) �޼ҵ�
		return m_pw; //��й�ȣ ���� ��ȯ�Ѵ�.
	}
	public void setM_pw(String m_pw) { //ȸ���� ��й�ȣ ���� �����ϴ� �޼ҵ�
		this.m_pw = m_pw; // ������ ���� this.m_pw�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	public String getM_name() {// ȸ���� �̸� ���� ��������(�����ϴ�) �޼ҵ�
		return m_name; //�̸� ���� ��ȯ�Ѵ�.
	}
	public void setM_name(String m_name) {//ȸ���� �̸� ���� �����ϴ� �޼ҵ�
		this.m_name = m_name;// ������ ���� this.m_name�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
	public String getM_phone() {// ȸ���� ��ȭ��ȣ ���� ��������(�����ϴ�) �޼ҵ�
		return m_phone; //��ȭ��ȣ ���� ��ȯ�Ѵ�.
	}
	public void setM_phone(String m_phone) {//ȸ���� ��ȭ��ȣ ���� �����ϴ� �޼ҵ�
		this.m_phone = m_phone; // ������ ���� this.m_phone�� �����Ͽ� �ν��Ͻ�ȭ�Ѵ�.
	}
}
