package Day11;

public class Day11_1 {
	
	//p.448 10장 예외 확인문제
		//1번문제 답) 4
			//1. 사용자 조작 혹은 개발자의 잘못된 코드의 오류를 예외라 한다.
			//2. 실행예외 [ 실행 도중에 예외 발생 ], 일반예외 [ 실행 전에 예외 발생]
			//3. try{ } catch(예외클래스 변수명){}
			//4. 개발자가 예외 클래스를 설계 가능
		//2번문제 답) 3
			//3. 예외 상관없이 무조건 실행되는 블럭 [ 항상 실행 ]
			//
			//
		//3번문제 답 4)
			// throw와 throws는 다르다
			// throw : 사용자 예외 생성
			// throws : 예외던지기 => 메소드 안에서 발생된 예외를 메소드 호출된 곳으로 전달
			// Exception : 예외 클래스 중에 상위 클래스
			// 자식의 객체가 혼자서 생성되는게 아니라 부모클래스가 먼저 실행되고 자식의 객체가 실행됨 자식클래스의 생성자가 실행되면 부모클래스의 생성자도 동시 실행
		//4번문제 답 2)
			// throw는 떠넘기는 것이 아니라 예외를 생성하는 것이다.
		//5번문제 답 3)
			//catch (Exception e) {} catch(ClassNotFoundException e){}	앞에 catch (Exception e)에있는 Exception이 예외들의 상위클래스라서 뒤에 것은 효력이 없다.
			//Exception은 예외들의 (ClassNotFoundException 등)의 상위 클래스 앞에 상위클래스의 예외가 나오면 뒤에있는 자식클래스의 예외들은 의미가 없다.
	
	//p.449 	
		//6번문제 다음 코드가 실행되었을때 출력결과
//			public static void main(String[] args) {
//				String[] strArray = {"10","2a"};
//				int value = 0;
//				for (int i=0; i<=2; i++) {
//					try {
//						value = Integer.parseInt(strArray[i]);		
//					}												
//					//i == 0 => strArray[0] => 예외 발생 X => 예외가 없기 때문에 finally로 이동 => 10 출력	
//					//i == 1 => strArray[1] => 예외 발생 O(a10=문자열이기 때문) => finally로 이동 => value = 0 catch문으로 이동 => NumberFormatException e로 이동 => 숫자로변환할 수 없음 출력
//					//i == 2 => strArray[2] => 인덱스 없음 => 예외발생 => finally 출력 10 value는 = 10
//					catch (ArrayIndexOutOfBoundsException e) {
//						System.out.println("인덱스르 초과했음");
//					}
//					catch (NumberFormatException e) {
//						System.out.println("숫자로 변환할 수 없음");
//					} 
//					finally {
//						System.out.println(value);
//					}
//				}
//			}
			
		//7번문제 NotExistIDException, WrongPasswordException
			//아이디가 없을 경우 예외 클래스 만들기
			//비밀번호가 다를 경우 예외 클래스 만들기
	public static void main(String[] args) {	//1. main 실행
		
	
	try {
		login("white" , "12345") ;	//2. login 메소드의 white인수 받아서 //8.
	}
	catch (Exception e) {
		System.out.println( e.getMessage() );
	}
	try {
		login("blue", "54321");
	}catch (Exception e) {
		System.out.println( e.getMessage() );
	}
}			
				
	//public static void login(String id, String password)  throws Exception { //밑줄과 같은 것
	public static void login(String id, String password)  throws NotExistIDException, WrongPasswordException {	//4. String id 매개변수로 이동 //7. 예외처리(throws)
		
			if(!id.equals("blue")) {	//5. 아이디가 blue와 다름을 확인
				//!~.equals : ~가 아니면 
				throw new NotExistIDException("아이디가 존재하지 않습니다."); // 새로운 예외 생성	//6.throw new NotExistIDException 여기서 throw로 NotExistIDException 패키지에 public NotExistIDException(String message) 여기에 String message 인수전달
			}
			if(!id.equals("12345")) {
				//!~.equals : ~가 아니면 
				throw new WrongPasswordException("패스워드가 다릅니다.");
			
		}
	}
}

//1. main 메소드에서 try문 실행
//2. login메소드 실행 인수 "white", "12345"를 Line 66의 login(String id, String password)(매개변수)로 받기 
//3. if문 실행 아이디가 다름을 확인
//4. throw(예외 생성) new NotExistIDException (생성자 실행)
//5. NotExistIDException클래스의 String message 매개변수에 "아이디가 존재하지 않습니다." 이동
//6. String 매개변수로 받은거 super(message)로 이동 message에 "아이디가 존재하지 않습니다." 이동
//7. super(message) 가 부모의 생성자이기 때문에 부모클래스(Exception)에 "아이디가 존재하지 않습니다."  보내기
//	Exception이 예외클래스의 부모클래스이므로 message내용을 main메소드의 Exception으로 전달 throws를 통해서 예외 던지기
//8. catch에서 잡아서  e에 메시지 저장
//9. e.getmessage로 e에 저장된 "아이디가 존재하지 않습니다." 출력

