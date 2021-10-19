package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_회원제 {
	//회원제 프로그램 //금욜셤 //list
	
		//1. 리스트(list)를 이용한 회원가입, 로그인, 회원수정, 회원탈퇴
	public static void main(String[] args) {
	
		//0. 설정 [입력객체]
		Scanner scanner = new Scanner(System.in);
		//0-1. 설정 [리스트 생성] User 클래스만 담을 수 있는 클래스 (User 클래스의 하위도 가능)
		ArrayList<User> users = new ArrayList<>(); //클래스 생성을 위해 users 임시객체 생성
		//0-2. [파일 읽어오기 : 파일에 있는 회원들을 리스트에 저장]
			//예외처리
		try{
			FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); //, true 쓸 필요X
		
		
			//0-2-1. 파일내 모든 글자 가져오기 [ 스트림 단위 : byte ]
					//1) 바이트 배열 선언부터 해야함
					byte[] bytes = new byte[1024]; // 1bit -> 8bit -> 1byte -> 1024byte - > 1kb -> 1024kb -> 1mb
								//영문, 특수문자, 공백 1바이트		//한글 2바이트
					//2) 읽어오기
					fileInputStream.read(bytes);
					//3) 바이트 -> 문자열 변환
					String inString = new String(bytes);
					
			//0-2-2. 회원 구분하기 //split (기준) 분리 -> 배열
					String [] usernum = inString.split("\n");
			//0.2-3. 필드 구분하기 //반복문 사용
					for(String temp: usernum) {
						
						String[] userdata = temp.split(","); //userdata에 저장되어있는 값들을" ," 으로 나눔
						
						if(userdata.length==1) break; //마지막 회원은 공백회원이라 1번부터 시작
						//0-2-4. 객체 생성
						User user = new User(userdata[0] , userdata[1] , userdata[2]);
						//0-2-5. 리스트 담기
						users.add(user);
					}
		}
		catch(Exception e) {
			System.out.println("[[파일 불러오기 실패 ]]");
		}
		
		
		//1.메뉴
		while(true) {
			System.out.println("1. 회원가입 | 2. 로그인");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				System.out.println("성명 : ");		String name = scanner.next();
				
				//2. 입력받은 데이터를 객체화 [user 객체 인데스 하나에 id, pw, name 다 있음 ] 
											//[3개의 변수값을 하나로]
				User user = new User(id, pw, name);
			
				//*아이디 중복체크 [리스트 내 객체 하나씩 temp에 대입 ]
				boolean idcheck = true;
				for(User temp : users) { //temp 임시객체 생성
					if(temp.getId().equals(id)) {
						System.out.println("[[중복된 아이디 입니다.]]");
						idcheck = false; break;
					}
				}
				//3. 리스트에 저장 [ 만약에 중복값이 없으면 ]
				if(idcheck) {users.add(user); System.out.println("[[회원가입 성공]]");// if 안에 세미콜론 하나다 그러면 {}스킵가능, 두개 이상이면 {} 필수
				
				//4. 파일처리
					//1. 파일 출력 클래스 (FileOutputStream fileOutputStream = new FileOutputStream("파일경로/파일명.확장자") 꼭 슬래쉬로 사용
							//이어쓰기 하려면 확장자 뒤에 , true
							//예외처리 필수
						try {
							FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt", true);
																																		//누적은 맨뒤에 true
							//2.필드값 구분 [,]					//회원간 구분					[\n]
							String outString = user.getId()+", "+user.getPassword()+", "+user.getName()+"\n"; //쉼표나 백슬래시 n을 회원가입할 때 막아놔야됨
							//3. String ---> byte 내보내기
							fileOutputStream.write(outString.getBytes()); //바이트 형변환 꼭 필요.
							
							System.out.println("[[파일 처리 성공]]");
							
							
						} catch (Exception e) {
							System.out.println("[[파일 처리 실패]]");
						}
				
				}
			}else if(ch==2) {
				//1. 입력받기
				System.out.println("아이디 : ");		String id = scanner.next(); 
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				
				//2. 리스트내 객체와 비교하기
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPassword().equals(pw)) { //getID, getPassword : 이클립스에 있는 메소드
						System.out.println("로그인 성공");
						logincheck = false; 
						
						////////////////////////////////로그인 성공시////////////////////////////////
						System.out.println("1. 회원정보 | 2. 회원수정 | 3. 회원탈퇴 | 4. 로그아웃");
						int ch2 = scanner.nextInt();
						if(ch2==1) {
							System.out.println("아이디 : " + temp.getId());
							System.out.println("성명 : " + temp.getName());
						}
						else if(ch2==2) {
							//1. 수정할 정보 입력
							System.out.println("수정할 성명 : "); String newName = scanner.next();
							//2. set 메소드를 통한 필드 값 변경
							temp.setName(newName); // 기존에 저장된 이름을 입력받은 이름으로 변경
							//3. 파일 업데이트 처리 (메소드로 처리하기 아직 안배움)
								//1) 리스트 내 모든 회원 저장 [ 업데이트 ] 
							try {
									// 1-1)파일 출력 객체 생성 [ 파일경로 ]
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); 
								//새로쓰기를 해야돼서 끝에 true 빼야됨
								
									// 1-2) 모든 회원의 정보 저장
								String outString = ""; // 모든 회원의 정보를 담을 문자열
								for(User temp2 : users) {
									// 회원 분류
									String outTemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									// 분류된 정보를 모든 회원 문자열에 추가
									outString += outTemp;
								}
								// 모든 회원 내보내기
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) { //Exception 이어야됨
								
							}
						}
						else if(ch2==3) {
							//1. 리스트에서 객체 삭제
							users.remove(temp);
							System.out.println("[[회원탈퇴 : 로그아웃]]");
							//파일 업데이트 처리 (메소드화 해보기)
							try {
								// 1-1)파일 출력 객체 생성 [ 파일경로 ]
							FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); 
							//새로쓰기를 해야돼서 끝에 true 빼야됨
							
								// 1-2) 모든 회원의 정보 저장
							String outString = ""; // 모든 회원의 정보를 담을 문자열
							for(User temp2 : users) {
								// 회원 분류
								String outTemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
								// 분류된 정보를 모든 회원 문자열에 추가
								outString += outTemp;
							}
							// 모든 회원 내보내기
							fileOutputStream.write(outString.getBytes());
						} catch (Exception e) { //Exception 이어야됨
							
						}
							break; // 회원탈퇴하고 첫화면으로
						}
						else if(ch2==4) {
							System.out.println("[[로그아웃]]"); break; //로그아웃
						}
						break;//
					}
				}
				if(logincheck) {System.out.println("[[동일한 회원 정보가 없습니다.]]");}
			}
		}//while end
	}//main end
}//class end
