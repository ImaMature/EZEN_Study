package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

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
			//1. FileOutputStream : 파일출력 스트림 (그냥 외우기) [ 해당 파일이 없으면 새로 생성 ]
					// FileOutputStream 객체명 = new FileOutputStream("파일경로")
						//   "/" : 경로
				//1-1) write ( 바이트형 ) : 해당 파일에 쓰기
		
				//FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt"); //해당경로에 문자열이 들어간 txt파일 생성됨, 에러뜨면 C드라이브에 java폴더 생성해놓고 실행
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/JHD/git/EZEN_Study/gfggsjs/src/Day12/test.txt");// 내 워크트리에 Day12패키지에 test.txt파일 생성
					// 입출력 관련된 클래스 => 예외처리 발생 확률 높음
				String 문자열 = "이클립스에서 작성된 문서입니다."; // 한글 14자 + 공백 2개 -> 28byte + 2byte -> 30byte
				fileOutputStream.write(문자열.getBytes()); // 문자열 -> 바이트 (이렇게 안하면 컴터에서 인식 못함)
		
			//2. FileInputStream : 파일 입력(이클립스 기준) 스트림
						//FileInputStream 객체명 = new FileInputStream("파일경로/파일명.확장자");
						// read(바이트배열) : 해당 파일을 바이트 배열에 읽어오기
				//FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");//읽어 올 때는 바이트 -> 문자열 필요
				FileInputStream fileInputStream = new FileInputStream("C:/Users/JHD/git/EZEN_Study/gfggsjs/src/Day12/test.txt"); // 내 워크트리에 Day12패키지에 있는 test.txt파일				
				//2-1) 읽어온 바이트를 저장할 배열
				byte [] 바이트배열 = new byte[1024]; //1bit [0,1] -> 8bit [1byte] -> 1024byte [1kb]
				fileInputStream.read(바이트배열); // 파일 읽어오기 (왜 읽어오기인지? byte [] 바이트배열을 자바 라이브러리의 read()메소드에 인수로 받아와서 처리함)
					//System.in.read(); // 키보드 읽어오기
					//바이트 -> 문자열 형변환
				String strRead = new String(바이트배열);//바이트배열을 string으로 형변환해서 strRead에 저장
				System.out.println("현재 파일의 내용은 : " + strRead); 
				
				/////////////
				//키보드에 입력된 변수를 메모장에 누적 저장
				
				Scanner scanner = new Scanner(System.in);
				
				while(true) {
					System.out.println("메모장 입력할 데이터 : ");
					String outStr = scanner.next();
					outStr = outStr + "\n";
					fileOutputStream.write(outStr.getBytes());
				}
	} //main end	
}//class end
