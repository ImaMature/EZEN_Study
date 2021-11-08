package BookAppv2;

public class Member {//회원과 관련된 클래스

	//필드
	//private 접근 제한자로 외부클래스에서 접근하지 못하도록 제한. 클래스 내부에서는 접근 가능
	private String m_id; //회원의 아이디 값 객체 
	private String m_pw; //회원의 비밀번호 값 객체
	private String m_name; //회원의 이름 값 객체
	private String m_phone; //회원의 전화번호 값 객체
	
	
	public Member() {} //빈 생성자. Member의 메소드나 필드를 다른 클래스에서 사용하기 위해 선언. 
	//Member 객체 = new Member();
	//객체.get~~~ or 객체.set~~~으로 getter setter 메소드들을 사용할 수 있다.
	
	// 회원가입을 위한 생성자
	public Member(String m_id, String m_pw, String m_name, String m_phone) { //인수들을 전달받는 매개변수들
		//인수들을 전달받으면 this.~~~에 각 인수들이 저장된다.
		//여기서 this는 인수 자신을 뜻한다.
		//매개변수와 필드의 변수들이 겹칠 때 사용
		this.m_id = m_id; // 회원 아이디 저장하는 인스턴스
		this.m_pw = m_pw; // 회원 비밀번호 저장하는 인스턴스
		this.m_name = m_name; // 회원 이름 저장하는 인스턴스
		this.m_phone = m_phone; // 회원 전화번호 저장하는 인스턴스
	}
	
	
	
	//로그인 생성자
	public Member(String m_id, String m_pw) {
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	
	
	//로그인 메소드
	public void login() {
		while(true) {
			try {
				System.out.println("---------------------로그인 페이지------------------------");
				System.out.print("아이디 : "); 	String id = BookMainv2.sc.next(); // print 로 입력한 값이 개행되지 않게 함. //입력받은 아이디 값을 BookMainv2 클래스에 선언된 입력 객체 sc 통해 객체 id에 저장
				System.out.print("비밀번호 : ");	String pw = BookMainv2.sc.next(); //입력받은 비밀번호 값을 BookMainv2 클래스에 선언된 입력 객체 sc 통해 객체 pw에 저장
					if(id.equals("admin") && pw.equals("1234")) { //입력받은 id 값이 admin이고 비밀번호 값이 1234이면
						System.out.println("관리자 로그인"); //관리자 로그인 출력
						adminlogin(); //관리자 로그인 메소드 실행, 내부 메소드라 클래스명.메소드명 으로 선언 안해도 됨
						return; // 메소드 종료
					}//아니라면 밑으로 진행
				Member member = new Member(id, pw); // 입력받은 id, pw값을 로그인 생성자에 전달
				for(int i = 0; i<BookMainv2.m_arr.length; i++) {//회원의 배열 수 만큼 반복문을 진행
					Member m = BookMainv2.m_arr[i]; // 회원의 i번째 인덱스 값을 임시 객체 m에 저장 해당 변수는 실행불가. 아이디값이 null값이라고 뜸
					if(m != null && m.getM_id().equals(id) && m.getM_pw().equals(pw)) {//인덱스가 비어있지 않고 아이디값이 일치하고, 비밀번호 값이 일치할때
						m = member;
						System.out.println("로그인 성공"); 
						loginconfirm(id); //로그인 성공시 메소드 실행
						return; //반복 실행되지 않게 탈출
					}
					else if(m == null && !m.getM_id().equals(id) && !m.getM_pw().equals(pw)) { 
					//i번째 인덱스가 비었고 가져온 아이디 값이 입력받은 아이디값과 같지 않고 가져온 비밀번호 값이 입력받은 비밀번호 값과 같지 않다면
						System.out.println("일치하는 정보가 없습니다.");
						return;//메소드 종료
						
					}
				}
			}
			//로그인 오류발생시 예외처리
			catch(Exception e) {
				System.out.println("로그인시 오류" + e.getMessage()); //e.getMessage메소드로 메시지 호출
				break; //무한반복 탈출
				}
		}	
	
	}
	
	//일반회원 로그인완료시 메소드
	public void loginconfirm(String id) { //id값을 인수로 받아옴
		while(true) { //반복문 설정
			try { // 오류잡기 위해 try catch문 선언
				Book book = new Book(); //Book클래스의 메모리를 사용하기 위해 임시객체 선언
				System.out.println("---------------------------------------------------------");
				System.out.println("1. 도서목록 | 2. 대여 | 3. 반납 | 4. 로그아웃");
				System.out.println("---------------------------------------------------------");
				int ch2 = BookMainv2.sc.nextInt(); //입력객체 ch2 선언
					if(ch2 == 1) { //ch2가 1이면
						book.booklist(); //도서 목록 메소드 호출
					}
					else if(ch2 == 2) { //ch2가 2이면
						book.bookrent(id); //도서 대여 메소드 호출
					}
					else if(ch2 == 3) { //ch2가 3이면
						book.bookreturn(id); //도서 반납 메소드 호출
					}
					else if(ch2 == 4) { //ch2가 4이면
						System.out.println("로그아웃. 이용해주셔서 감사합니다.");
						return; // 반복문 탈출
					}else { //ch2가 1~4사이의 숫자가 아니면
						System.out.println("잘못된 숫자를 입력하셨습니다.");
						
					} 
					//일반 회원 로그인후 오류발생시 예외처리
			}catch(Exception e) { //예외처리 적용 , 문자를 입력한다던가 하는 예외가 있다면,
				System.out.println("일반회원 로그인시 오류" + e.getMessage()); //e.getMessage메소드로 메시지 호출
				break;
			}
		}
	}
	
	//관리자로 로그인시 메소드
	public void adminlogin() {
		while(true) {
			try {
				Book book = new Book(); //Book 클래스의 메모리를 사용하기 위한 생성자 선언
				System.out.println("---------------------------------------------------------");
				System.out.println("1. 도서등록 | 2. 도서목록 | 3. 로그아웃");
				System.out.println("---------------------------------------------------------");
				int ch3 = BookMainv2.sc.nextInt(); // 입력객체 ch3 선언
					if(ch3 == 1) { //ch3의 값이 1이면
						book.bookreg(); //도서 등록 메소드 호출
					}
					else if(ch3 == 2) { //ch3의 값이 2이면
						book.booklist(); //도서 목록 메소드 호출
					}
					else if(ch3 == 3) { //ch3의 값이 3이면
						System.out.println("관리자 로그아웃");
						break;
					}else {
						System.out.println("잘못된 숫자를 입력하셨습니다."); //1~3이 아닌 다른 숫자를 입력했을 경우
					}
				}
			catch (Exception e) { //예외처리 적용 
				System.out.println("관리자 로그인 시 오류" + e.getMessage()); //관리자 로그인시 예외처리
				break; //반복문 탈출
			}
		}	
	}

	//회원가입 메소드
	public void signup() {
		System.out.print("아이디를 입력해 주세요. : ");	String id = BookMainv2.sc.next(); //입력받은 아이디 값을 BookMainv2 클래스에 선언된 입력 객체 sc를 통해 객체 id에 저장
			if(id.equals("admin")) {	//아이디 값이 admin과 같다면
				System.out.println("중복된 아이디입니다.");	//출력
				return;	//메소드 종료
			}
			//중복체크 메소드 실행
			if(idcheck(id)) {// 중복체크 메소드에 입력받은 id값 전달 //반환된 값이 true라면 중복된 아이디 입니다. 출력
				System.out.println("중복된 아이디 입니다.");
				return; //메소드 종료
			} //반환된 값이 false라면 if문 탈출
		System.out.print("비밀번호를 입력해 주세요.");		String pw = BookMainv2.sc.next(); //입력받은 비밀번호 값을 BookMainv2 클래스에 선언된 입력 객체 sc를 통해 객체 pw에 저장
		System.out.print("이름을 입력해 주세요.");		String name = BookMainv2.sc.next(); //입력받은 이름 값을 BookMainv2 클래스에 선언된 입력 객체 sc를 통해 객체 name에 저장
		System.out.print("전화번호 입력해 주세요.");		String phone = BookMainv2.sc.next(); //입력받은 전화번호 값을 BookMainv2 클래스에 선언된 입력 객체 sc를 통해 객체 phone에 저장
		Member member = new Member(id, pw, name, phone); //회원가입을 위한 생성자사용
		for(int i =0; i<BookMainv2.m_arr.length; i++) { //회원의 배열 수 만큼 반복문 실행
			if(BookMainv2.m_arr[i] == null) { //저장된 값이 없다면
				BookMainv2.m_arr[i] = member; //객체 member의 값(id, pw, name, phone) i번째 인덱스에 저장
				System.out.println("회원가입 완료");
				System.out.println(member);
				break; // 무한 반복 되지 않게 break선언 한번 저장되면 반복문 탈출
			}
		}
	}
		
	//중복 체크 메소드	
	public boolean idcheck(String id) { //id값 매개변수로 전달받음
		for(int i = 0; i<BookMainv2.m_arr.length; i++) { //회원의 배열 수 만큼 반복문 실행
			Member m = BookMainv2.m_arr[i]; // 회원의 i번째 인덱스 값을 임시 객체 m에 저장
			if(m != null && m.getM_id().equals(id)) { //m값이 null이 아니고 i번째 인덱스에서 가져온 id값이 입력한 id값과 같다면
				return true; //true 값 반환
			}
		}
		return false; //같지 아니하면 false값 반환
	}
		
	
	//getter setter
	//Member 객체 = new Member();
	//객체.get~~~ , 객체.set~~
	//getter setter 메소드가 일반메소드들보다 밑으로 내려가 있어야 get~ set~ 사용 가능
	public String getM_id() { // 회원의 아이디 값을 가져오는(접근하는) 메소드
		return m_id; //아이디 값을 반환한다.
	}
	public void setM_id(String m_id) { //회원의 아이디 값을 지정하는 메소드 
		this.m_id = m_id; // 지정된 값을 this.m_id에 저장하여 인스턴스한다.
	}
	public String getM_pw() { // 회원의 비밀번호 값을 가져오는(접근하는) 메소드
		return m_pw; //비밀번호 값을 반환한다.
	}
	public void setM_pw(String m_pw) { //회원의 비밀번호 값을 지정하는 메소드
		this.m_pw = m_pw; // 지정된 값을 this.m_pw에 저장하여 인스턴스화한다.
	}
	public String getM_name() {// 회원의 이름 값을 가져오는(접근하는) 메소드
		return m_name; //이름 값을 반환한다.
	}
	public void setM_name(String m_name) {//회원의 이름 값을 지정하는 메소드
		this.m_name = m_name;// 지정된 값을 this.m_name에 저장하여 인스턴스화한다.
	}
	public String getM_phone() {// 회원의 전화번호 값을 가져오는(접근하는) 메소드
		return m_phone; //전화번호 값을 반환한다.
	}
	public void setM_phone(String m_phone) {//회원의 전화번호 값을 지정하는 메소드
		this.m_phone = m_phone; // 지정된 값을 this.m_phone에 저장하여 인스턴스화한다.
	}
}
