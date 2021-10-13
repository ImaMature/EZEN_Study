package Day07;

import java.util.Scanner;

public class Member {

	//1. �ʵ� [���̵� ��� �̸� ����ó ���
	private String m_id; //
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	
	//2. ������ [��ü ������ �ʵ��� �ʱⰪ]
		//2-1) ȸ�����Խ� �����Ǵ� ��ü�� ������
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
		//2-2) �� ������
	public Member() {	} // �� �����ڸ� ����� ���ߵ�(����Ʈ, ���������� ����)

	
	//3. �޼ҵ� [����]
		//2. ȸ������ �޼ҵ�[ �Է¹��� ������ ��ü �����ؼ� �迭�� �����ϱ� ]
	public static boolean signup() { 
		//static�� �پ�� Member.signup();�� �ٷ� ���� �� �ִ�.			//boolean ? ȸ������ �������θ� ������ϱ� ����
		//private�̸� �ܺ� Ŭ������ ���� �ȵ�							//public�� ���� ����?	=>	�� Ŭ������ �ƴ� main�� ���� Ŭ����(�ܺ� Ŭ����)�κ��� ȣ���ϱ� ���� (�ܺ� Ŭ������ �����ϵ��� �ϱ�����)
			//2-1. �Է¹ޱ�
			System.out.println("-------------------ȸ������ ������------------------");
			System.out.println("���̵� : ");		String m_id = BookApplication.scanner.next(); //�ܺ� Ŭ������ scanner ����ϴ¹�
				//���̵� �ߺ�üũ																  // Ŭ������.��ü��.next~;

				boolean check = idcheck(m_id);
				if ( check ) {
					System.out.println("[[�˸�]] : ����� �� ���� ���̵� �Դϴ�.");
					return false;
				}
			System.out.println("��й�ȣ : ");		String m_pw = BookApplication.scanner.next();
			System.out.println("�̸� : ");		String m_name = BookApplication.scanner.next();
			System.out.println("�ڵ��� ��ȣ : ");	String m_phone = BookApplication.scanner.next();
			
			//2-2. �Է¹��� ������ ��ü ���� [������]
			Member member = new Member(m_id, m_pw, m_name, m_phone);
			
			//2-3. ���� ��ü�� �迭�� �ֱ� [����� ã�� �ֱ�
			for(int i = 0; i<BookApplication.members.length; i++) {
				if( BookApplication.members[i] == null) {
					BookApplication.members[i] = member;
					return true; //ȸ������ ����	//��ȯ�� : ȸ�����Լ��� or ���� => True or False
			}
		}
			return false; //ȸ������ ���� [������� ���� ���]
	}
		
		
		//6. ���̵� �ߺ� üũ �޼ҵ�
	public static boolean idcheck(String check_id) {
			for (int i =0; i<BookApplication.members.length; i++) {
				if (BookApplication.members[i] != null &&
						BookApplication.members[i].getM_id().equals(check_id)) {
					return true; // �μ��� ������ ���̵� �迭�� �����ϸ� true 
			}
		}
			return false; // �迭�� ������ ���� ������� 
	}	

		//3. �α��� �޼ҵ�	[�Է¹��� ���̵�� ����� �迭 �� �����ϸ� �α��� ���� �ƴ� ���� ]
	public static String login() {
			// 3-1. ���̵� ��� �Է¹ޱ�
			System.out.println("---------------�α��� ������------------------");
			System.out.println("���̵� : "); String m_id = BookApplication.scanner.next();
			System.out.println("��й�ȣ : "); String m_pw = BookApplication.scanner.next();
			
			// 3-2. �迭�� �����ϸ� �α��� ����
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_pw().equals(m_pw)) { 
					return m_id; // �α��� ������ ������ ���̵� ��� ��ȯ // ��ȣ �� �ֱ�
				}
			}
			
		return null; //�α��� ����  // ��ȯ�� : �α��� ������ => ������ ���̵� ��ȯ(return) or ���н� null
	}
	
	
		//4. ���̵�ã�� �޼ҵ� ( �̸�, ����ó �Է¹޾� �����ϸ� => ���̵� �˷��ֱ�)
	public static String findid() { //id == String 
			// 4-1. �Է¹ޱ�
			System.out.println("---------------���̵� ã�� ������------------------");
			System.out.println("�̸� : "); String m_name = BookApplication.scanner.next();
			System.out.println("����ó : "); String m_phone = BookApplication.scanner.next();
			//4-2. �迭�� ������ ������ ��ü ã��
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null &&
						BookApplication.members[i].getM_name().equals(m_name) && 
						BookApplication.members[i].getM_phone().equals(m_phone)) {
					return BookApplication.members[i].getM_id(); // �α��� ������ ������ ���̵� ��� ��ȯ
			}
		}
			return null;
	}
		//5. ���ã�� �޼ҵ� ( ���̵�, ����ó �Է¹޾� �����ϸ� => ��� �˷��ֱ�
					// pw == String
	public static String findpw() { 
			
			//5-1. �Է¹ޱ�
			System.out.println("---------------��й�ȣ ã�� ������------------------");
			System.out.println("���̵� : "); String m_id = BookApplication.scanner.next();
			System.out.println("����ó : "); String m_phone = BookApplication.scanner.next();
			//5-2. �迭�� ������ ������ ��ü ã��
			for( int i = 0 ; i < BookApplication.members.length ; i++ ) {
				if(BookApplication.members[i] != null &&
						BookApplication.members[i].getM_id().equals(m_id) && 
						BookApplication.members[i].getM_phone().equals(m_phone)) {
					return BookApplication.members[i].getM_pw(); // �α��� ������ ������ ���̵� ��� ��ȯ
			}
		}
			return null;// ��ȯ�� : ��й�ȣ ã���� ��� => ��й�ȣ / ���н� null
	}
	
	
	
	
		//1) �ʵ带 private�� => get, set �޼ҵ� ���
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
	
	
	
}
