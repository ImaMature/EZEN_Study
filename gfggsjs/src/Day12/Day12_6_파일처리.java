package Day12;

import java.io.FileOutputStream;

public class Day12_6_파일처리 {
	//파일 처리
	
	//메모리 [주기억장치 = RAM] : 변수, 배열, 객체 등등 : 프로그램 종료시 다 초기화됨
		// 주기억장치의 역할 : 현재 실행중인 프로그램 [ 명령어 집합 ] 기억
			// 전기 X 저장 X => 휘발성 메모리
		// 보조기억장치 : [USB, 파일, DB, HDD 등등]
			// 전기 X 저장 O => 비휘발성 메모리
			// 자바 -> 보조기억장치 -> 외부 스트림
	
	//파일 <----- 스트림(단위 : 바이트 ------> 자바프로그램
	public static void main(String[] args) throws Exception {
		
		//파일처리 클래스
			//1. FileOutputStream : 파일출력 스트림 (그냥 외우기)
		FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt"); //해당경로에 문자열이 들어간 txt파일 생성됨, 에러뜨면 C드라이브에 java폴더 생성해놓고 실행
			// 입출력 관련된 클래스 => 예외처리 발생 확률 높음
		String 문자열 = "이클립스에서 작성된 문서입니다.";
		fileOutputStream.write(문자열.getBytes());
	} //main end	
}//class end
