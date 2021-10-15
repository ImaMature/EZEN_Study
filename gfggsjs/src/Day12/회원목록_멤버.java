package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 회원목록_멤버 {
	
	//1.필드 [ 메모리 = 저장 ]
	private String id;
	private String pw;
	private String name;
	private String phone;
			//private 접근제한자 : 필드 보호용 , 다른 클래스에서 접근 불가
	//2.생성자
	
	// 빈생성자
	public 회원목록_멤버() {} 
	// 빈 생성자 : 기본 생성자 이외의 생성자를 만들게 된다면 기본 생성자는 자동으로 만들어지지 않으므로 초기값 선언을 위해 생성자를 만듦 
	//https://aomee0880.tistory.com/96
	
	//모든 필드를 받는 생성자
	public 회원목록_멤버(String id, String pw, String name, String phone) { //상속받을게 없으니 super()지움
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	
	//3.메소드
		//1) private 필드 사용시 getter, setter 있어야 외부클래스가 접근
		
		//2) 로그인 메소드
	public void signIn() { //일단 void넣고 나가는게(return 값) 있으면 string같은걸로 바꿈
		
	}
		
		//3) 회원 가입 메소드
	public void signUp() {
		//3-a) 입력객체 가져오기
		Scanner scanner = 회원목록_메인.scanner; // main클래스의 scanner주소값 불러와서 씀 그래서 그냥 scanner라고 써도 인식됨.
														// 그게 아니라면 일일이 Day12~~~.scanner.next라고 써야됨
		//3-b) 입력받기
		System.out.println("-------회원가입 페이지-------");
		System.out.println("아이디"); 	String id = scanner.next();
		System.out.println("비밀번호"); 	String pw = scanner.next();
		System.out.println("성명"); 		String name = scanner.next();
		System.out.println("연락처"); 	String phone = scanner.next();
				
		//3-3-c) 객체 생성
		회원목록_멤버 member = new 회원목록_멤버(id, pw, name, phone);
		
		//3-3-c2) 배열 저장(str -> int 가 아닌 인덱스값 불러오기로 저장하기)
			for(int i =0; i<회원목록_메인.members.length; i++) {
				if(회원목록_메인.members[i] == null) {
					회원목록_메인.members[i] = member; break;
				}
			}
							
		//3-3-d) 파일 저장
				//파일 저장하는법
					//A. 회원별 [\n] 필드별 [ , ] 파일 저장
				
				//3-3-d-1) 파일 출력 객체 생성				//파일은 예외가 많기 때문에 try catch로 잡음. throws 써도되긴 함.
					//* 배열의 모든 객체 파일처리하기 for문 이용
					try {	
						//for(Day12_회원목록_Member temp : Day12_회원목록_Main.members) {
							//if (temp == null) break;  
						//for문 이용하려면 객체 내보내기에서 member를 모두 temp로 바꿔야됨 그리고 파일 출력 객체에 끝에 ", true"지워야됨
					
					// 파일 출력 객체
						FileOutputStream fileOutputStream = 
								new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/memberlist.txt", true); //true 이어쓰기																
						//3-3-d-2) 객체 내보내기 [ 필드 구분 ]
						String outstring = (member.id+","+member.pw+","+member.name+","+member.phone+"\n"); //꼭 끝에 "\n" 쓰기 
						fileOutputStream.write(outstring.getBytes()); // 바이트 변환후 쓰기
						
					}	
					catch(Exception e){
							System.out.println("알림 : 회원 DB 저장 실패" + e); 
					}		
	}//sign up 끝
	
	
	//getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
