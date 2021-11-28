package study_ing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MemberList_Member {

	//로그인/회원가입 [ 파일처리]

		//[조건1] : 회원가입 파일에 저장
		//[회원클래스] 아이디, 비밀번호, 성명, 연락처
		//[조건2] : 로그인시 파일내 회원정보가 존재하면 로그인
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//회원의 아이디, 비밀번호, 이름, 연락처와 관련된 필드
	
	
	
	//입력받는 객체 선언
	
	public MemberList_Member() {}
	//기본 생성자 이외의 생성자가 있을 경우 기본 생성자가 자동으로 만들어지지 않아서 초기값 선언을 위해 빈 생성자를 선언
	
	
	public MemberList_Member(String m_id, String m_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	// 모든 필드를 받는 생성자 회원가입시 사용
	
	public static void signup() {
		while(true) {
			Scanner sc = MemberList_Main.scanner; 
			// while문 반복되지 않도록 스캐너 선언
			System.out.println("-------------회원가입 페이지--------------");
			System.out.println("-----회원님의 정보를 입력해주시기 바랍니다.-----");
			System.out.print("아이디 : "); String m_id = sc.next();
			System.out.print("비밀번호 : "); String m_pw = sc.next();
			System.out.print("이름 : "); String m_name = sc.next();
			System.out.print("연락처 : "); String m_phone = sc.next();
			//	회원 정보 입력
			
			MemberList_Member member = new MemberList_Member(m_id,m_pw,m_name,m_phone);
			// 회원이 입력한 정보를 모두 담는 객체 선언
			
			
			for(int i=0; i<MemberList_Main.memarr.length; i++) {
				if(MemberList_Main.memarr[i] != null) {
					MemberList_Main.memarr[i] = member;
					break;
				}
			}
			//	1. MemberList_Main클래스에 선언된 membrr 배열의 길이만큼 반복
			//	2. 배열의 i번째 인덱스에 내용이 없다면 member 객체의 내용을 배열에 저장
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\memberlist.txt", true);
				//	1. 출력 객체 생성
				//	2. try catch로 예외 처리
				//	3. 파일에서 읽어오는 것이 아니라서 FileInputStream이 필요 X
				//	4. true로 누적저장
				
				String output = (member.m_id+", "+member.m_pw+", "+member.m_name+", "+member.m_phone+"\n");
				//	output 객체에 member필드의 입력받은 정보들을 각각 저장
				//	", "으로 구분하고 개행을 줘서 겹치지 않게 함
				fileOutputStream.write(output.getBytes());
				//	output 객체에 저장된 문자들을 byte화 해서 파일에 쓰기
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}


	
	//getter setter 메소드들
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
