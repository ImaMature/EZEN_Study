package BookAppv2;

public class Book {//도서와 관련된 클래스
	
	//필드
	//private 접근 제한자로 외부클래스에서 접근하지 못하도록 제한. 클래스 내부에서는 접근 가능
	private String b_isbn; //도서 코드 객체 힙영역
	private String b_name; //도서 이름 객체
	private boolean b_rent; //도서 대출 여부 객체 (boolean 객체의 기본 값은 true이다.)
	private String m_id; //회원 아이디 객체 (나중에 도서 대여 여부에서 나타낼 아이디 객체이다.)
	
	
	//생성자
	//빈생성자
	public Book () {} //Book클래스의 메소드나 필드를 다른 외부 클래스에서 사용하기 위해 선언

	//도서 대여 여부, 도서 등록(b_rent에 true, m_id에 null값) 생성자
	public Book(String b_isbn, String b_name, boolean b_rent, String m_id) { //도서에 관련된 인수들을 전달받는 매개변수들
		this.b_isbn = b_isbn; // 도서의 코드를 전달받아 this.b_isbn에 저장해 인스턴스화한다.(메모리에 할당한다.) (힙메모리에 할당)
		this.b_name = b_name; // 도서의 이름을 전달받아 this.b_name에 저장해 인스턴스화한다.
		this.b_rent = b_rent; // 도서의 대여 여부를 true나 false로 전달받아 this.b_rent에 저장해 인스턴스화한다
		this.m_id = m_id; // 도서를 빌린 회원의 아이디를 전달받아 this.m_id에 저장해 인스턴스화한다.
	}


	//도서 목록 메소드
	public void booklist() {
		
		System.out.println("------------------------------------------------------------");
		System.out.printf("%10s\t%8s\t%5s\t%8s\n", "도서코드","도서명","대여여부","대여한 회원");//printf를 써서 각 출력할 필드명의 문자수 설정
		for(int i =0; i<BookMainv2.b_arr.length; i++) { //배열 선언
			Book book = new Book(); //book 임시객체선언
			book = BookMainv2.b_arr[i]; //book 임시객체 선언 배열의 i번째 인덱스의 값들을 book에 저장 
			if(book != null) { //임시객체가 null값이 아닐때
				System.out.printf("%10s\t%8s\t%5s\t%8s\n" , book.getB_isbn(), book.getB_name(), book.isB_rent(), book.getM_id()); //해당 %숫자s만큼 가져온 객체들을 넣기
				//%숫자s : 숫자 만큼 왼쪽에 여백 설정.
				
			}
		}
		System.out.println("------------------------------------------------------------");
		
	}
	//도서 등록 메소드
	public void bookreg() {
		BookMainv2.sc.nextLine(); // next나 nextint다음에 nextLine쓰면 생기는 오류 잡기 위해서 nextLine사용
		System.out.print("등록할 도서 코드 : ");	String bookisbn = BookMainv2.sc.nextLine(); //입력받은 도서 코드를 bookisbn에 저장
		if(bookcheck(bookisbn)) { //도서 중복 체크 입력받은 bookisbn을 해당 메소드에 전달
			//그래서 반환값이 true이면 if 안의 실행문 실행 false이면 if문 스킵
			System.out.println("해당 도서 코드를 지닌 책이 이미 존재합니다.");
			return; //반복문 탈출
		}
		System.out.print("등록할 도서 이름 : ");	String bookname = BookMainv2.sc.nextLine(); //입력받은 도서 이름을 bookname에 저장 공백이 있을 수 있으니 nextLine사용
		
		Book book = new Book(bookisbn, bookname, true, null); // 입력받은 값 담을 객체 선언 (도서 코드, 도서 이름, true(b_rent의 기본값), null(회원아이디의 기본값))
		for(int i = 0; i<BookMainv2.b_arr.length; i++) {
			
			//m = BookMainv2.b_arr[i]; //도서 배열의 i번째의 인덱스값을 m에 저장
			if(BookMainv2.b_arr[i] == null) { //i번째 인덱스 값이 null값이면
				BookMainv2.b_arr[i] = book; //book의 내용(bookisbn, bookname, true, null)을 m에 저장
				System.out.println("도서 등록 완료");
				System.out.println(BookMainv2.b_arr[i]);
				break; //반복문 탈출 한번에 하나씩만 등록가능하기 때문
			}
		}
	}

	
	//도서 중복 체크 메소드 //public이어야 다른 메소드에서도 제대로 쓸 수 있음
	public boolean bookcheck(String bookisbn) {//isbn값을 전달받음
		for(int i =0; i<BookMainv2.b_arr.length; i++) { // 도서 배열 인덱스의 개수 만큼 반복문을 돌려서
			Book b = new Book();//b라는 임시객체 선언
			b = BookMainv2.b_arr[i]; // 도서 배열의 i번째의 값을 임시객체 b에 저장
			if(b != null && b.getB_isbn().equals(bookisbn)) { //만약 i번째 인덱스 값이 null이 아니고 i번째 인덱스에서 가져온 isbn 도서코드와 전달받은 bookisbn값이 같지 않으면
				return true;//맞다면 true반환
			}
		}
		return false; //아니라면 false 반환
	}


	//도서 대여 메소드
	public void bookrent(String id) { //id 값 로그인 완료시 메소드(Member클래스의 loginconfirm)에서 받아오기
		System.out.println("대여할 도서 코드 : ");	String isbn = BookMainv2.sc.next(); //입력 받은 도서코드를 isbn에 저장
			if(bookcheck(isbn)) { //도서 중복 체크 메소드에 입력받은 isbn값 전달 
				for(int i = 0; i<BookMainv2.b_arr.length; i++) {// 도서 배열의 길이만큼 반복문 실행
					Book b = BookMainv2.b_arr[i]; //b라는 임시객체에 도서배을의 i번째 인덱스 값 저장
					if(b != null && b.isB_rent() && b.getB_isbn().equals(isbn)) { //만약 i번째 인덱스 값이 null이 아니고 B_rent(true)라면 //버그 발생!!도서 대여할때 무조건 첫번째 도서가 대여됨
						System.out.println("도서 대여 성공");
						b.setB_rent(false); //i번재 인덱스의 b_rent값을 false로 지정
						b.setM_id(id); //i번째 인덱스의 b_isbn값에 입력받은 id값 지정
						break; //반복문 탈출
					}
				}
			}else {System.out.println("잘못된 입력입니다.");} // 아니할시 잘못된 입력입니다. 출력
	}

	//도서 반납 메소드
	public void bookreturn(String id) { //id 값 로그인 완료시 메소드(Member클래스의 loginconfirm)에서 받아오기
		System.out.println("반납할 도서 코드 : "); String isbn = BookMainv2.sc.next(); //입력 받은 도서코드를 isbn에 저장
		if(bookcheck(isbn)) { //도서 중복 체크 메소드에 입력받은 isbn값 전달 
			for(int i = 0; i<BookMainv2.b_arr.length; i++) { // 도서 배열의 길이만큼 반복문 실행
				Book book = BookMainv2.b_arr[i];//book이라는 임시객체에 도서배을의 i번째 인덱스 값 저장
				if(book != null && !book.isB_rent() && book.getB_isbn().equals(isbn)) { 
					//i번째 인덱스 값이 null이 아니고 i번째 인덱스값에 저장된 값이 입력받은 isbn값과 같을 때
					System.out.println("도서 반납 완료");
					book.setB_rent(true);
					book.setM_id(null);
					break;
				}
				
			}
		}else {System.out.println("잘못된 입력입니다.");}
		
	}

	

	
	//getter setter
	public String getB_isbn() { // 도서의 코드 값을 가져오는(접근하는) 메소드
		return b_isbn; //도서 코드 값을 반환한다.
	}
	
	public void setB_isbn(String b_isbn) { //도서 코드 값을 지정하는 메소드
		this.b_isbn = b_isbn; // 지정된 값을 this.b_isbn에 저장하여 인스턴스화한다.
	}
	
	public String getB_name() { // 도서의 이름 값을 가져오는(접근하는) 메소드
		return b_name; //도서 이름 값을 반환한다.
	}
	
	public void setB_name(String b_name) { //도서 이름 값을 지정하는 메소드
		this.b_name = b_name; // 지정된 값을 this.b_name에 저장하여 인스턴스화한다.
	}
	
	public boolean isB_rent() { // 도서의 대여여부 값(true or false)을 가져오는(접근하는) 메소드
		return b_rent;//대여 여부 값을 반환한다.(true or false)
	}
	
	public void setB_rent(boolean b_rent) { //도서 대여 여부 값을 지정하는 메소드 (true or false)
		this.b_rent = b_rent; // 지정된 값을 this.b_rent에 저장하여 인스턴스화한다.
	}
	
	public String getM_id() { // 회원의 id 값을 가져오는(접근하는) 메소드
		return m_id; //회원의 id값을 반환한다.
	}
	
	public void setM_id(String m_id) { //회원 id 값을 지정하는 메소드
		this.m_id = m_id; // 지정된 값을 this.m_id에 저장하여 인스턴스화한다.
	}
	
	
}
