package Day01;

import java.util.Scanner; // import : 다른 패키지에서 클래스 가져오기

public class Day01_5 { // c s

	public static void main(String[] args) { // m s
		
		// 입력과 출력 문제 2
		/*
		 * 학생 1명의 회원가입 표 만들기
		 * [입력변수]
		 * 
		 * 아이디, 비밀번호, 성명, 이메일 입력받아 출력하기
		 * 
		 * [출력 예]
		 * >>>>>>>> 회원가입 완료 아래 정보를 확인해 주세요 >>>>>>>>>
		 * 아이디		비밀번호		성명			이메일
		 * qwe		1234		유재석		itdanjak@naver.com
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력해 주세요 : ");		String id = sc.next();
		System.out.print("비밀번호를 입력해 주세요 : ");	String password = sc.next();
		System.out.print("성명을 입력해 주세요 : ");		String user_name = sc.next();
		System.out.print("이메일을 입력해 주세요 : ");		String email = sc.next();
		
		System.out.println("\n>>>>>>>>>>>>>>>>>>> 회원가입 완료! 아래 정보를 확인해 주세요 >>>>>>>>>>>>>>>>>>>");
		System.out.println("아이디\t\t비밀번호\t\t성명\t\t이메일");
		System.out.println(id + "\t\t" + password + "\t\t" + user_name + "\t\t" + email);
		
		sc.close();
	} // m e

} // c e
