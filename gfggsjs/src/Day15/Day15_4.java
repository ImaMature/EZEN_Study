package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	public static void main(String[] args) {
		
		//p.747 아디 비번 검사
		//Hashtable //회원가입 //로그인
		// 0. 설정
		Scanner scanner = new Scanner(System.in);
		
		// 0.map 컬렉션 선언
		Hashtable <String, String> hashtable = new Hashtable<>();
			//아이디(키), 비밀번호(값)		//키 : 중복 불가
		
		//메뉴
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				
					//*
					if(hashtable.containsKey(id)) { // 키값이 존재하면 true // 아니면 false
						System.out.println("**이미 사용중인 아이디입니다.");
					}else {
						//1. map에 객체 넣기
						hashtable.put(id, pw); System.out.println("[[가입 성공]]");
					}
			}
			if(ch==2) {
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				
				if(hashtable.containsKey(id)) {
					if(hashtable.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					
				}else {
					System.out.println("패스워드가 다릅니다.");
				}
			}else {
				System.out.println("아이디가 다릅니다.");
			}
			}
		}
	}
}
