package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_회원제 {
	//회원제 프로그램
		//1. 리스트를 이용한 회원가입, 로그인, 회원수정, 회원탈퇴
	public static void main(String[] args) {
	
		//0. 설정 [입력객체]
		Scanner scanner = new Scanner(System.in);
		//0-1. 설정 [리스트 생성] User 클래스만 담을 수 있는 클래스 (User 클래스의 하위도 가능)
		ArrayList<User> users = new ArrayList<>();
		
		//1.메뉴
		while(true) {
			System.out.println("1. 회원가입 | 2. 로그인");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				System.out.println("성명 : ");		String name = scanner.next();
				
				//2. 입력받은 데이터를 객체화 [user 객체 인데스 하나에 id, pw, name 다 있음 ] 
											//[3개의 변수값을 하나로]
				User user = new User(id, pw, name);
				
				//3. 리스트에 저장
				users.add(user);
				
			}else if(ch==2) {
				
			}
		}
	}
}
