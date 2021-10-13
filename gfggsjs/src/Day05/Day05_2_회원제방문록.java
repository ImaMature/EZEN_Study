package Day05;

import java.util.Scanner;

public class Day05_2_회원제방문록 {

	public static void main(String[] args) {
		
		//0. 입력객체
		Scanner scanner = new Scanner(System.in); //무한루프문에 넣으면 안됨
		
		//1. 회원 100명[id,pw] 저장하는 방법	선언
			String [][] 회원목록 = new String[100][2]; // 100행 * 2열 => 200칸
		//1-1. 방문록 100개[contents, writer] 저장하는 방법 선언
			String [][] 방문록 = new String[100][2];
		
		//2. 메뉴 => 메뉴는 계속 반복실행 : 무한루프 (while)
			while(true) {
				System.out.println("\n\n\t - 회원제 방문록 - ");
				System.out.println("-----------------------------------");
				System.out.println(" [[1.회원가입 2. 로그인 선택 : ");
				int ch = scanner.nextInt();
				
				
				
		//3. 입력에 따른 값 제어
				switch(ch) {	//if == 번호
					case 1 : 
						System.out.println(" --- 회원가입 페이지 --- ");	
						System.out.println("Id : ");		String id = scanner.next();
						System.out.println("Password : ");	String pw = scanner.next();
							
						// id 중복체크 ( 반복문, 모든 배열 내 인덱스에 접근해서 동일한 아이디가 있는지 체크 )
						boolean idcheck = true; // 중복체크 변수
						for(int i = 0; i<회원목록.length; i++) { 	//회원목록.length : 배열의 가로길이 => 100
							if ( 회원목록[i][0] != null && 회원목록[i][0].equals(id)) {	// i번째 id와 동일하면
								System.out.println("[[알림]] : 중복된 아이디가 존재합니다.");
								idcheck = false;
								break; //중복찾기 for 종료
							}
						}

							// 중복체크 변수가 true이면 배열 내 빈 공간을 찾아서 저장
						if(idcheck) {
							for (int i =0; i<회원목록.length; i++) {
								if(회원목록[i][0] ==null) {
									회원목록[i][0] = id; 회원목록[i][1] = pw;
									System.out.println("[[알림]] : 회원가입이 되었습니다.");
									break; // 저장하기, for 종료
								}
							}
						}
						
						break;	//break가 있어야 밑에 것들이 안나옴
						
					case 2 :
						System.out.println(" --- 로그인 페이지 --- ");	
						// 1. 입력 -> 저장
						System.out.println("아이디 입력 : ");	String log_id = scanner.next();
						System.out.println("비밀번호 입력 : ");	String log_pw = scanner.next();
						// 2. 배열 내에서 입력한 아이다와 패스워드가 존재하는지 => 존재하면 로그인 성공
							//for 문을 이용한 모든 인덱스에 접근해서 하나씩 비교
						
						boolean loginCheck = true;
						for(int i =0; i<회원목록.length; i++) { // for start
						if(회원목록[i][0] != null && // 공백이 아닐경우를 안썼었음 //회원목록[i][0] != null
								회원목록[i][0].equals(log_id) &&
								회원목록[i][1].equals(log_pw)) {
							System.out.println("[[알림]] : 로그인에 성공했습니다.");
							//////////////////////////////로그인 성공시 메뉴////////////////////////////////
							while(true) { // 회원메뉴 무한루프
								System.out.println("\n\n\t - 회원 메뉴 - ");
								System.out.print(" [[1.방문록 쓰기 2. 방문록 확인 3. 로그아웃 선택 : ");
								int ch2 = scanner.nextInt();
								
								if(ch2==1) {
									System.out.print("방문록 내용 : ");		String contents = scanner.next(); 
									//.next(); 다음에 .nextLine();이 오면 그 사이를 하나로 인식해서 내용이 다합쳐짐.
									// 그래서 윗 단락에 scanner.nextLine();을 추가하고 .nextLine();을 써야됨.
										// ↓↓↓↓	방문록 배열내 빈공간을 찾아서 내용과 로그인된 아이디를 저장
									for(int j =0; j<방문록.length; j++) { // i를 쓰면 안됨. 왜냐면 i안에 들어와있기 때문에 i가 다시 선언 안됨
										if(방문록[j][0] == null )// j번째 인덱스의 값이 공백(null)이면
										{방문록[j][0] = contents;		방문록[j][1] = log_id;
										System.out.println(">>> 방문록 등록");
										break;
										}
									}
								}	
									
								else if (ch2==2){
									System.out.println("--------- 방문록 목록 ------------");
									System.out.printf("%10s \t %s \n", "작성자", "내용");
									// 배열 내 공백을 제외한 모든 내용 출력
									for(int j = 0; j<방문록.length; j++) {
										if(방문록[j][0] == null) {break;}
										
										System.out.printf("%10s \t %s \n",방문록[j][1], 방문록[j][0]);
														//%s : 문자열 꾸밀때 %10s = 10칸 띄우기, \n 줄바꿈
									}//for end
								}// else if 2 end
								else if (ch2 ==3) {
									System.out.println("[[알림]] : 로그아웃 되었습니다.");
									break;
								}
								else System.out.println("[[알림]] : 알 수 없는 행동입니다.");
								
							}
							//////////////////////////////////////////////////////////////////////////
							
							loginCheck = false;
							break;
							} // else 문을 쓴다면 for문에 걸려서 100번 출력됨
						} // for end
						
						if( loginCheck) { System.out.println("[[알림]] : 로그인 실패 (동일한 회원정보가 없습니다.)");}
						break;
						
						
					default :
						System.out.println("[[알림]] : 알 수 없는 번호입니다.");
			} //switch end
		}// while end
	} // main end
} // class end
