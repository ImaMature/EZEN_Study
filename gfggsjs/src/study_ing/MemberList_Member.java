package study_ing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MemberList_Member {

	//�α���/ȸ������ [ ����ó��]

		//[����1] : ȸ������ ���Ͽ� ����
		//[ȸ��Ŭ����] ���̵�, ��й�ȣ, ����, ����ó
		//[����2] : �α��ν� ���ϳ� ȸ�������� �����ϸ� �α���
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//ȸ���� ���̵�, ��й�ȣ, �̸�, ����ó�� ���õ� �ʵ�
	
	
	
	//�Է¹޴� ��ü ����
	
	public MemberList_Member() {}
	//�⺻ ������ �̿��� �����ڰ� ���� ��� �⺻ �����ڰ� �ڵ����� ��������� �ʾƼ� �ʱⰪ ������ ���� �� �����ڸ� ����
	
	
	public MemberList_Member(String m_id, String m_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	// ��� �ʵ带 �޴� ������ ȸ�����Խ� ���
	
	public static void signup() {
		while(true) {
			Scanner sc = MemberList_Main.scanner; 
			// while�� �ݺ����� �ʵ��� ��ĳ�� ����
			System.out.println("-------------ȸ������ ������--------------");
			System.out.println("-----ȸ������ ������ �Է����ֽñ� �ٶ��ϴ�.-----");
			System.out.print("���̵� : "); String m_id = sc.next();
			System.out.print("��й�ȣ : "); String m_pw = sc.next();
			System.out.print("�̸� : "); String m_name = sc.next();
			System.out.print("����ó : "); String m_phone = sc.next();
			//	ȸ�� ���� �Է�
			
			MemberList_Member member = new MemberList_Member(m_id,m_pw,m_name,m_phone);
			// ȸ���� �Է��� ������ ��� ��� ��ü ����
			
			
			for(int i=0; i<MemberList_Main.memarr.length; i++) {
				if(MemberList_Main.memarr[i] != null) {
					MemberList_Main.memarr[i] = member;
					break;
				}
			}
			//	1. MemberList_MainŬ������ ����� membrr �迭�� ���̸�ŭ �ݺ�
			//	2. �迭�� i��° �ε����� ������ ���ٸ� member ��ü�� ������ �迭�� ����
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\memberlist.txt", true);
				//	1. ��� ��ü ����
				//	2. try catch�� ���� ó��
				//	3. ���Ͽ��� �о���� ���� �ƴ϶� FileInputStream�� �ʿ� X
				//	4. true�� ��������
				
				String output = (member.m_id+", "+member.m_pw+", "+member.m_name+", "+member.m_phone+"\n");
				//	output ��ü�� member�ʵ��� �Է¹��� �������� ���� ����
				//	", "���� �����ϰ� ������ �༭ ��ġ�� �ʰ� ��
				fileOutputStream.write(output.getBytes());
				//	output ��ü�� ����� ���ڵ��� byteȭ �ؼ� ���Ͽ� ����
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}


	
	//getter setter �޼ҵ��
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
