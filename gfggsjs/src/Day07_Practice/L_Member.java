package Day07_Practice;

public class L_Member {

	//1. �ʵ�
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	
	//2. ������
	public L_Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	//2-2. �������
	public L_Member() {}
	
	//3. �޼ҵ� 
	
	
	//3_2) ȸ������ �޼ҵ�
	public static boolean signup() {
		//�Է¹ޱ�
		System.out.println("���̵� : ");			String m_id = Library_P.sc.next();
			//���̵� �ߺ�üũ
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("[[�˸�]] : ����� �� ���� ���̵��Դϴ�.");
				return false;
			}
		
		System.out.println("��й�ȣ : ");			String m_pw = Library_P.sc.next();
		System.out.println("�̸� : ");			String m_name = Library_P.sc.next();
		System.out.println("�ڵ��� ��ȣ : ");		String m_phone = Library_P.sc.next();
		
		L_Member l_Member = new L_Member(m_id, m_pw, m_name, m_phone);
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] == null) {
				Library_P.l_members[i] = l_Member;
				System.out.println("ȸ������ ����");
				return true; 
			}
		}
		System.out.println("ȸ������ ����");
		return false;
	}
		//3_2_1)�ߺ�üũ �޼ҵ�
		public static boolean idcheck (String check_id) {
			for(int i = 0; i<Library_P.l_members.length; i++) {
				if(Library_P.l_members[i] != null &&
					Library_P.l_members[i].getM_id().equals(check_id)) {
					return true;
				}
			}
			return false;
		}
		
	//3_1) �α��� �޼ҵ�
	public static String login() {
			System.out.println("--------------�α��� ������----------------");
			System.out.println("���̵� : ");		String m_id = Library_P.sc.next();
			System.out.println("��й�ȣ : ");		String m_pw = Library_P.sc.next();
			
			for(int i =0; i<Library_P.l_members.length; i++) {
				if (Library_P.l_members[i] != null && 
						Library_P.l_members[i].getM_id().equals(m_id) && 
						Library_P.l_members[i].getM_pw().equals(m_pw)) {
					return m_id;
				}
			}
			return null;
			
	}
	//3_3) ���̵�ã�� �޼ҵ�
	public static String L_find_id() {
		System.out.println("--------------���̵� ã�� ������----------------");
		System.out.println("�̸� : ");		String m_name = Library_P.sc.next();
		System.out.println("��ȭ��ȣ : ");		String m_phone = Library_P.sc.next();
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] != null && 
					Library_P.l_members[i].getM_name().equals(m_name) && 
					Library_P.l_members[i].getM_phone().equals(m_phone)) {
				return Library_P.l_members[i].getM_id();
			}
		} 
		return null;	//else
	}
	
	//3_4) ���ã�� �޼ҵ�
	public static String L_find_pw() {
		System.out.println("--------------��й�ȣ ã�� ������----------------");
		System.out.println("���̵� : ");		String m_id = Library_P.sc.next();
		System.out.println("��ȭ��ȣ : ");		String m_phone = Library_P.sc.next();
		
		for(int i =0; i<Library_P.l_members.length; i++) {
			if (Library_P.l_members[i] != null && 
					Library_P.l_members[i].getM_id().equals(m_id) && 
					Library_P.l_members[i].getM_phone().equals(m_phone)) {
				return Library_P.l_members[i].getM_pw();
			}
		} 
		return null;	//else
	}
	
	
	// set�޼ҵ� : �ʵ忡 �� ���� �޼ҵ� 
	// get�޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ�

	public String getM_id() 
	{return m_id;}
	public void setM_id(String m_id) 
	{this.m_id = m_id;}

	public String getM_pw() 
	{return m_pw;}
	public void setM_pw(String m_pw) 
	{this.m_pw = m_pw;}

	public String getM_name() 
	{return m_name;}
	public void setM_name(String m_name) 
	{this.m_name = m_name;}

	public String getM_phone() 
	{return m_phone;}
	public void setM_phone(String m_phone)
	{this.m_phone = m_phone;}
	
	
}
