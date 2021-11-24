package works;

public class library {

	// 1. 메뉴 => while 무한루프
	// 2. 입력받기 : 1. Scanner 객체  2. System.in.read()
	// 3. 세부메뉴 구현 
	
//	도서 검색 프로그램
//	1.조건 : 도서목록 배열 선언 
//		[ 4개의 도서를 배열에 등록 ]
//		1. 된다! 네이버 블로그&포스트
//		2. 스프링 부트 실전 활용 마스터
//		3. Tucker의 Go 언어 프로그래밍
//		4. 혼자 공부하는 C 언어
//
//	2. Scanner -> System.in.read()
//
//	3.검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력
//	4.수정기능 : 수정할 도서를 입력받아 선택후 교체할 단어와 새로운 단어 입력받아 교체
//
//	String[] 도서목록 = {	
//			"된다! 네이버 블로그&포스트",
//			"스프링 부트 실전 활용 마스터",
//			"Tucker의 Go 언어 프로그래밍",
//			"혼자 공부하는 C 언어"
//	};
	
	
	public static void main(String[] args) { //메인 메소드
		
		String[] 도서목록 = {	
				"된다! 네이버 블로그&포스트",
				"스프링 부트 실전 활용 마스터",
				"Tucker의 Go 언어 프로그래밍",
				"혼자 공부하는 C 언어"
		}; //도서목록이 담긴 String 배열 선언
		
		while(true) { // 반복문 실행
			try {
				System.out.println("===== 도서 검색/수정 프로그램 ====="); // 
				System.out.println("1. 검색하기 | 2. 수정하기");	
				byte [] a = new byte [50]; // 바이트 배열 선언 25자까지 입력가능합니다.
//				int ch = System.in.read(1);  //system.in.read()는 문자열을 받아주는 메소드, 그래서 read(1)이 될 수 없습니다.
//				int ch = System.in.read(); // 49 = 아스키코드가 나와서 int형으로 저장해야합니다.
				int ch = System.in.read(a); //입력객체 선언 50바이트까지 입력 가능 그값을 ch에 저장했습니다.
				String strCh = new String(a,0,ch-2); //String값으로 바꿔줍니다. 바이트 배열만큼, 0번째 인덱스, /r과 /n을 빼야되기 때문에 ch-2를 해야합니다.
//				System.out.println(strCh); // strCh값 확인하는 문단. //입력한 값 그대로 나옵니다.
//				break;//반복해제할려고 임시로 선언한 겁니다. 지워도 무방합니다.
				if(strCh.equals("1")) { //strCh의 값이 1과 같다면
					System.out.println("[검색하기 페이지로 넘어갑니다.]");
					System.out.print("필요한 도서를 검색해 주세요. : ");
					ch = System.in.read(a); //바이트배열에서 입력받아 ch에 저장. 
					String strCh2 = new String(a,0 ,ch-2); //입력받은 도서를 string화 strCh2에 저장됨, 배열만큼, 0번째 인덱스, /r/n
					for(int i =0; i<도서목록.length; i++) { //도서목록 배열의 길이만큼 반복문을 돌립니다. 도서목록 배열에 있는 책을 찾기 위해서입니다..
						if(도서목록[i].contains(strCh2)) { //입력받은 도서와 도서목록의 i번째 인덱스 내용이 일치한다면
							System.out.println( (i+1)+"번에 해당 도서 "+도서목록[i]+"가(이) 존재합니다."); 
							// i번째 도서목록을 출력합니다. 인덱스는 0부터 시작해서 i+1번으로 정했습니다.
						}
//						else if(!도서목록[i].contains(strCh2)) {
//							System.out.println("죄송합니다. 도서 목록에 검색하신 도서가 존재하지 않습니다.");
//							break;
//						} 검색한 도서가 String 배열 내 존재해도 다른 인덱스에서 없으면 없다고 떠서 쓰지 말아야 할 것 같습니다.
					}
					
				}else if (strCh.equals("2")) { 
					System.out.println("[수정하기 페이지로 넘어갑니다.]");
					System.out.print("수정할 도서 번호를 검색해 주세요. : ");
					ch = System.in.read(a);// 바이트배열에서 입력받아 ch에 저장
					//4번을 입력하면 인덱스는 3 그런데 ch-1을 하면 null값이 뜹니다.
					String str = new String (a,0,ch-2); //int로 형변환을 하기 위해서 String화 했습니다.
					System.out.println(str);
					int strCh3 = Integer.parseInt(str); //입력받은 도서를 int로 형변환
					//수정할 문자 입력받기
					System.out.println("기존 도서명 중 수정을 원하는 문구를 입력해 주십시오. : ");
					int txt = System.in.read(a); // 바꾸길 원하는 문자를 입력받습니다.
					String origintxt = new String (a, 0, txt-2);
					
					System.out.println("새로 바꿀 문구를 입력해 주십시오. : ");
					int txt2 = System.in.read(a); // 새로 바꿀 문자를 입력받습니다.
					String replacetxt = new String(a,0,txt2-2);
					String rs = 도서목록[strCh3-1].replace(origintxt, replacetxt); 
					// 입력받은 번호 인덱스의 텍스트를 치환합니다. 도서 검색 결과는 인덱스+1번이라 인덱스-1을 해주었습니다.
					System.out.println(rs.toString());	//주소값이 나올까봐 tostring으로 값을 String화 했습니다.
//					System.out.println(strCh3);
//					System.out.println(도서목록[strCh3]);
					
				}
			} catch (Exception e) { //예외처리
				System.out.println(e.getMessage()); //예외 출력
			}
		
		}	
	}
}
