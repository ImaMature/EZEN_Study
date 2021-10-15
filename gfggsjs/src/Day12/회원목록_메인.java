package Day12;

import java.util.Scanner;

public class 회원목록_메인 {
	//로그인/회원가입 [ 파일처리]

	//[조건1] : 회원가입 파일에 저장
	//[회원클래스] 아이디, 비밀번호, 성명, 연락처
	//[조건2] : 로그인시 파일내 회원정보가 존재하면 로그인
	public static Scanner scanner = new Scanner(System.in);  
		//0. Scanner는 웬만하면 메인클래스 메인 메소드 밖에 입력하기
		//0-1. main 메소드 밖에 선언하는 이유 -> 다른 클래스나 메소드가 접근할 수 있도록 하기 위해서.
		//0-2. static이 있어야  main메소드가 읽을 수 있음.
		//0.3. static 은 main 메소드처럼 메모리 우선 할당됨
	
	public static 회원목록_멤버 [] members = new 회원목록_멤버 [100]; 
	//회원 저장할 수 있는 배열 생성	
	
	public static void main(String[] args) {
	

		
		//1. 입력받기 -> 2. 객체생성 -> 파일쓰기[out]
		//* 주의점 : 1.회원구분 2.회원당 필드 구분 왜? 객체를 통째로 저장할 수 없고, 객체 저장할때 필드르 저장할 것이기 때문.
		while(true) {
			회원목록_멤버 temp = new 회원목록_멤버(); //temp라는 객체 생성
			temp.signUp(); //
		}
	}
}
