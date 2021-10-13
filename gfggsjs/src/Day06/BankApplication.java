package Day06;

import java.util.Scanner;

public class BankApplication { //BankApplication class start
	//접근 제한자 : private, protected, public, default
		// public : 프로젝트 내 모든 곳에서 호출 가능
		// private : 현재 파일 내에서만 호출 가능
		// default(생략) : 동일한 패키지내에서만 호출 가능
		// protected : 동일한 패키지내에서만 호출 가능
			// 참고 : https://velog.io/@gillog/Java-%EC%A0%91%EA%B7%BC-%EC%A0%9C%ED%95%9C%EC%9E%90
	
	// 100개의 계좌이체를 저장할 수 있는 배열 선언
		
	/*private Account[] accountArray = new Account[100];
			// private : 현재 클래스 내에서만 호출 가능
			// static이 없을 경우 main부터 실행, 근데 main에 accountArray관련 함수가 없으므로 못 읽어냄.
			// 그래서 static 써야됨
			 
		public Account[] = new Account[100];
		
		// static 없는 배열 호출시 
		System.out.println("static 없을 경우 :"); // 오류
		
		
	[static] 정적 변수 : 프로그램 전반에 걸쳐 수명 유지
		<->  지역 변수 : 선언된 {} 안에서만 사용 -> {} 밖으로 나가면 초기화
			// main 메소드와 같이 프로그램 시작과 동시에 메모리 할당		
			// main 메소드 밖에 선언시 -> main 메소드 외 모든 메소드에서 호출 가능
			!! static을 많이 쓰면 용량이 늘어나 속도가 줄어듦 -> 효율 하락
			?? 그럼 언제씀 ??  모든 메소드에 사용되는 필드에 선언해야됨
	*/
	//p. 284 ~ 286 계좌관리 프로그램
	//  ---필드---
	private static Account[] accountArray = new Account[100]; 	//java는 배열을 만들면 고정되기때문에 크기를 크게 지정.
	private static Scanner scanner = new Scanner(System.in);	//static은 메소드가 끝나도 계속 유지되는 정적변수.
	
	// ---메인 메소드---
	public static void main(String[] args) { // main start
		
		boolean run = true;		//반복문 boolean
		while(run) {			//run = false 될 때까지 반복
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();	// 숫자 입력하면 scanner가 읽어서 selectNo에 저장
			if(selectNo == 1) {	createAccount(); } 	//1.createAccount()메소드 호출.
			else if (selectNo == 2) {accountList();}
			else if (selectNo == 3) {deposit();	} 
			else if (selectNo == 4) {withdraw();}
			else if (selectNo == 5) {run = false;}
		}
		System.out.println("프로그램 종료");
	  } // main end
	
	//메소드 선언
	//형태 : 접근제한자 키워드 반환타입 메소드명(매개변수, 매개변수2 ~~ ) { 실행코드; return;}
	
	//계좌생성하기 
	private static void createAccount() { //계좌생성하기 시작
	//private 생략해도 됨 그러면 default가 자동으로 들어감
		// static 사용하는 이유 : main에서 호출하기 위해 (미사용시 : main 해당 메소드 사용불가)
			
		//계좌생성 
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		// 1. 입력받아 변수에 저장
		System.out.println("계좌번호 : "); 	String ano = scanner.next();
		System.out.println("계좌주 : ");		String owner = scanner.next();
		System.out.println("초기 입금액 : "); 	int balance = scanner.nextInt();
		
		// 2. 객체 생성 [입력받은 변수값을 객체 생성자에 넣어서 객체 만들기]
		Account account = new Account(ano, owner, balance);
		
		// 3. 배열 저장 [배열 내 빈공간(null)을 찾아서 빈공간 인덱스에 객체 저장]
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {  // i번째 인덱스가 비어 있으면 배열에 넣기
				   accountArray[i] = account; // i번째 인덱스의 객체 넣기
				   System.out.println("결과 : 계좌가 생성되었습니다.");
				   break;// 계좌생성시 반복문 종료
				   
			}
		}
	}// createAccount end 계좌생성하기 종료
	
	//계좌목록보기 [인수x 반환x]
	private static void accountList() {
		
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		//1. 배열 내 모든 인덱스를 호출 [공백 제외]
		for (int i=0; i<accountArray.length; i++) { 
			if (accountArray[i] == null)  break;
				//계좌 생성하기의 i와다름 왜냐면 이 i는 i에 공백이 아닐때 밑에를 출력하기 때문
			System.out.println(accountArray[i].getAno() +"\t" //   getAno 메소드 호출
							+ accountArray[i].getOwner() + "\t"
							+ accountArray[i].getBalance()		);
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기 메소드 [인수o (String ano) 반환o (Account객체)]
	private static Account findAccount(String ano) { //중복값 찾기 //바로 갈 수 없음 왜냐면 private이라 그래서 getAno를 써야됨
		Account account = null; // 임시객체
		for( int i = 0 ; i<accountArray.length ; i++ ) {
			if( accountArray[i] != null ) { // i번째 인덱스가 공백이 아니면서 
				if( accountArray[i].getAno().equals(ano) ) { //
					// i번째 인덱스의 객체내 계좌번호가 인수[입력받은 계좌번호]와 같으면 
					account = accountArray[i]; // 찾은 객체를 객체 account에 저장
					break;
				}
			}
		}
		return account; // 만약에 동일한 계좌번호 있으면 객체[찾은객체] 반환 
						// 동일한 계좌번호가 없으면 객체[null] 반환
	}//계좌목록보기 종료
	
	
	//예금하기 [인수x 반환x]
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		//1. 입력받기
		System.out.println(">>>계좌번호 : ");		String ano = scanner.next();
		System.out.println(">>>예금액 : ");		int balance = scanner.nextInt();
		
		//2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출
		Account account = findAccount(ano); // - > findAccount(String ano)로 이동
			//findAccount 반환 : 찾은 객체 혹은 null
		
		//3. 
		if( account == null ) { // 반환이 null 일경우 
			System.out.println("결과 : 계좌가 존재하지 않습니다. ");
			return; // 현재 메소드 강제 종료 
		}
		
		//4.
		account.setBalance( account.getBalance() + balance  );
									  // 기존예금액  + 입력받은 입금액 
		// account.Balance(account.getBalance()+balance); => private 필드에서는 불가 // Balance 앞에 set를 붙여야 함.
		// set메소드 : 필드에 값 대입 메소드 
		// get메소드 : 필드의 값 호출 메소드 
		System.out.println("결과 : 예금이 성공되었습니다. ");
	} //예금하기 종료
	
	//출금하기 [인수x 반환x]
	private static void withdraw() {
		
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		//1. 입력받기
		System.out.println(">>> 계좌번호 : ");		String ano = scanner.next();
		System.out.println(">>> 출금액 : ");	 	int balance = scanner.nextInt();
		
		// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출 
		Account account = findAccount(ano); // findAccount 반환 -> 찾은 객체나 null을 뜻함
											// - > findAccount(String ano)로 이동
		
		// 3.
		if(account == null) { 
			System.out.println("결과 : 계좌가 존재하지 않습니다."); 
			return;
			// 반환이 null일 경우 현재 메소드 강제종료
		}
		
		if(account.getBalance() < balance) {
			//출금액이 기존예금액보다 크면 출금 불가
			System.out.println("예금액보다 많은 금액을 출금할 수 없습니다."); 
			return;
		}
		
		//4. 기존예금액 - 출금액
		account.setBalance( account.getBalance() - balance );
		System.out.println("결과 : 출금이 성공되었습니다. ");
		
	}//출금하기 종료
	
	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기		// [인수o(String ano) 반환o(Account 객체)] 
	//private static Account findAccount(String ano) {
		//작성 위치	
		//return Account;
	
} //BankApplication class end
