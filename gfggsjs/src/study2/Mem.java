package study2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Mem {

	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	public Mem() {
		
	}
	
	public Mem(String m_id, String m_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	
	public static void signup() {
		while(true) {
			Scanner sc = Test.sc;
			System.out.println("아이디 : "); String m_id = sc.next();
			System.out.println("비밀번호 : "); String m_pw = sc.next();
			System.out.println("이름 : "); String m_name = sc.next();
			System.out.println("폰번호 : "); String m_phone = sc.next();
			
			Mem mem = new Mem(m_id, m_pw, m_name, m_phone);
			
			for(int i=0; i<Test.arr.length; i++) {
				Mem s = Test.arr[i];
				if(s == null) {
					s=mem;
					break;
				}
			}
			
			FileOutputStream fileOutputStream;
			try {
				fileOutputStream = new FileOutputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study2\\member.txt", true);
				String w = new String(mem.getM_id()+" "+mem.getM_pw()+" "+mem.getM_name()+" "+mem.getM_phone()+"\n");
				fileOutputStream.write(w.getBytes());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	

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
