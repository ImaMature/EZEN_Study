package study_ing;

import java.util.Scanner;

public class MemberList_Main {

	//로그인/회원가입 [ 파일처리]

		//[조건1] : 회원가입 파일에 저장
		//[회원클래스] 아이디, 비밀번호, 성명, 연락처
		//[조건2] : 로그인시 파일내 회원정보가 존재하면 로그인
	public static Scanner scanner = new Scanner(System.in);
	//입력객체 static선언으로 다른 클래스에서도 사용 가능
	public static MemberList_Member [] memarr = new MemberList_Member[1000]; 
	//회원 정보 배열
	//전역변수(static) 선언으로 다른 클래스에서도 사용 가능
	
		public static void main(String[] args) {
			MemberList_Member.signup();
		}
}
