package study_ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 파일처리예제 {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\test.txt");
			/*	1. 파일 내용 출력하는 객체 선언 (FileOutputStream 객체명 = new FileOutputStream("경로")
				2. 예외처리 필수 (try,catch 혹은 throws Exception)
			 	3. "/" = "\\"
			 */
			
			String str = "이클립스에서 작성된 문서"; 
			// 1.str에 해당 문자 저장  2.한글 => 2바이트  3.영어, 숫자, 공백 => 1바이트
			
			fileOutputStream.write(str.getBytes()); 
			/*	1. .write() : 해당 파일에 쓰기	
			 	2. ()안에 byte 배열이나, int나, (byte 배열, int시작점, int끝나는점)이들어가야함.
				3. 객체명.getBytes() : String 객체 -> 바이트 배열화
			*/
			
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\test.txt");
			//	입력받는 객체 선언 (FileOutputStream 객체명 = new FileOutputStream("경로/파일명.확장자  or 경로\\파일명.확장자")
			
			byte [] bytearr = new byte[1000]; 
			//	1000byte 크기의 byte 배열 선언 
			
			fileInputStream.read(bytearr);
			/*	1. .read() : byte 배열 읽어오기
			 *	2. bytearr 객체를 read메소드에 매개변수(인수)로 넘겨 처리
			 *	3. ()안에 byte 배열이나, (byte 배열, int시작점, int끝나는점)이들어가야함
			 *	4. .write와는 다르게 ()안에 int형 단독으로는 올 수 없음.
			 */
			
			String str2 = new String(bytearr);
			//	byte 배열 객체 bytearr을 String으로 형변환해서 str2에 저장
			
			System.out.println("파일 내용 : " + str2);
			//	저장된 내용 출력
			
			Scanner scanner = new Scanner(System.in);
			//	입력 객체 선언
			
			while(true){ //	누적 저장을 위해 while문 선언
				System.out.println("입력할 데이터 : ");
				String inputdata = scanner.nextLine();
				//	띄어쓰기 입력받기 위해 .nextLine() 사용
//				if("\n".equals(scanner.nextLine())){
//					System.out.println("다시 입력해주세요");
//					return;
//				}
				// 	개행문자(\n) 입력시 처리방법
				inputdata += "\n";
				//	입력한 데이터가 개행될 수 있도록 inputdata= inputdata+"\n" 사용
				fileOutputStream.write(inputdata.getBytes());
				//	입력한 데이터를 byte 배열화 해서 파일에 쓰기
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
