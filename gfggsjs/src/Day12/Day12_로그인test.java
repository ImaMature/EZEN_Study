//package Day12;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Day12_로그인test {
//	//로그인/회원가입 [ 파일처리]
//
//			//[조건1] : 회원가입 파일에 저장
//			//[회원클래스] 아이디, 비밀번호, 성명, 연락처
//			//[조건2] : 로그인시 파일내 회원정보가 존재하면 로그인
//	public static void main(String[] args) throws IOException {//main start
//		Scanner scanner = new Scanner(System.in);
//		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/test.txt");
//		String [] 회원목록 = new String[100];
//		
//		//반복문 실행
//		while(true) { //while start
//			
//			System.out.println("1.회원가입하기 2.로그인"); int ch = scanner.nextInt();
//			
//			if(ch==1) {
//			//회원가입할 때 사용자의 입력받기
//				for(int i =0; i<회원목록.length; i++) {
//				System.out.println("아이디"); String = scanner.next();
//				System.out.println("비밀번호"); String pw = scanner.next();
//				System.out.println("성명"); String name = scanner.next();
//				System.out.println("연락처"); String phoneNumber = scanner.next();
//				
//				
//				
//				//해당 객체 생성 형식
//				id = "아이디 : " + id + "\n";
//				pw = "비밀번호 : " + pw + "\n";
//				name = "이름 : " + name + "\n";
//				phoneNumber = "연락처 : " + phoneNumber+ "\n";
//				
//				//바이트로 바꿔 문서에 저장하기
//				fileOutputStream.write(id.getBytes());
//				fileOutputStream.write(pw.getBytes());
//				fileOutputStream.write(name.getBytes());
//				fileOutputStream.write(phoneNumber.getBytes()); 
//				System.out.println("회원가입 완료."); break;
//				}
//			}
//			else if (ch==2) {
//				FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/test.txt");
//				//읽어온 바이트를 저장할 배열
//				
//				fileInputStream.read(회원목록);
//				//문자열 형변환
//				String custormers = new String(회원목록);
//				
//				System.out.println("아이디를 입력해주세요 : "); String input_Id = scanner.next();
//				System.out.println("비밀번호를 입력해주세요 : "); String input_Pw = scanner.next();
//				if(input_Id.equals(custormers)) {
//					System.out.println("로그인 되었습니다."); 
//					break;
//				} 
//				System.out.println("잘못된 명령입니다.");
//				
//			}
//		}//while end
//	}//main end
//}//class end
