package study2;


import java.util.Scanner;

public class Test {
	//로그인/회원가입 [ 파일처리]

		//[조건1] : 회원가입 파일에 저장
		//[회원클래스] 아이디, 비밀번호, 성명, 연락처
		//[조건2] : 로그인시 파일내 회원정보가 존재하면 로그인
	public static Mem[] arr = new Mem [100];
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Mem.signup();
	}
}
