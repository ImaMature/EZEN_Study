//package study_ing;
//
//public class bank {
//	// account
//	package hw;
//	import java.util.Scanner;	//Scanner 클래스로 입력받기.
//
//	class Account {			//속성(변수)과 동작(메서드)을 선언해주는 메서드.
//		private String num;	//계좌번호. 기호 '-'가 있기 때문에 int 대신 String 타입.
//		private String owner;	//계좌주
//		private int balance;	//입금액.
//		public String msg;
//
//		
//		public Account(String num, String owner, int balance) {	//매개변수가 있는 생성자
//			this.num=num;		//this는 Account를 의미.
//			this.balance=balance;	//전달인자(매개변수)의 이름과 동일할 경우 Account의 private balance임을 this.를 붙여 구분.
//			this.owner=owner;
//		}
//		public Account( ) {}
//		
//		public String getNum() {return num;}			//(1) Account 객체들의 접근제한자가 private이니까 외부클래스에서는 get,set 메서드로 접근해야한다.
//		public void setNum(String num) {this.num=num;}		//set()메서드는 값을 지정하는 역할
//		public String getOwner() {return owner;}		//get()메서드는  값을 반환하는 역할
//		public void setOwner(String owner) {this.owner=owner;}
//		public int getBalance() {return balance;}
//		public void setBalance(int balance) {this.balance=balance;}
//
//	}
//	//main과 main에서 실행될 메서드들을 묶어주는 메서드. 이 메서드들이 쓸 배열과 Scanner 정적변수를 선언해주고 시작!
//	//bank app
//	public class Q19 {			
//		private static Account[] accountArray= new Account[100];	//java는 배열을 만들면 고정되기때문에 크기를 크게 지정.
//		private static Scanner scanner= new Scanner(System.in);		//static은 메서드가 끝나도 계속 유지되는 정적변수.	
//		String[] recordArray = new String[100];				//기록내역 저장할 배열 선언
//
//
//		public static void main(String[] args) {
//			boolean run=true;				//반복문에 쓰일 boolean
//			while(run) {					//run=false 될때까지 반복
//				System.out.println("-------------------------------------------");
//				System.out.println("1.계좌 생성 | 2.계좌목록 |  3.예금 |  4.출금  | 5.송금 | 6.기록내역 | 7.종료");	
//				System.out.println("-------------------------------------------");
//				System.out.println("선택> ");
//				int selectNo = scanner.nextInt();			//숫자를 입력하면 scanner가 읽어서 selectNo 변수에 저장.
//				if (selectNo == 1) { createAccount(); }		//1.createAccount()메서드 호출.
//				else if (selectNo == 2) {accountList(); }	//2. accountList()메서드 호출.
//				else if (selectNo == 3) {deposit(); }		//3. deposit()메서드 호출.
//				else if (selectNo == 4) {withdraw(); }		//4. withdraw()메서드 호출.
//				else if (selectNo == 5) {wire(); }		//5. wire()메서드 호출.
//				else if (selectNo == 6) {recordList(); }	//6. recordList()메서드 호출.
//				else if (selectNo == 7) {run = false; }		//7. run=false; 반복문 중단.
//			}
//			System.out.println("프로그램 종료");		//반복문이 끝나면 출력되는 문장.
//		}
//			
//			//계좌 생성하기
//		private static void createAccount() {
//			System.out.println("--------------");
//			System.out.println("계좌생성");
//			System.out.println("--------------");
//			System.out.println("계좌번호: "); String num=scanner.next();
//			System.out.println("계좌주: "); String owner = scanner.next();
//			System.out.println("초기입금액: "); int balance = scanner.nextInt();
//			Account newAccount = new Account(num, owner, balance);	//매개변수 있는 생성자 호출! (2)
//			for(int i=0;i<accountArray.length;i++) {
//				if (accountArray[i]== null) {
//					accountArray[i]= newAccount;	//배열 한칸에 넣어준것. 결국 배열 한칸에 한 객체(세개의 정보를 갖고있는)가 들어가는 것.
//					System.out.println("결과: 계좌가 생성되었습니다.");
//					record("계좌 생성 | 계좌 정보: "+newAccount);	//기록내역에 저장할 메서드 호출.
//					break;
//				}
//			}
//		}
//			//계좌 목록보기
//		private static void accountList() {
//			System.out.println("--------------");
//			System.out.println("계좌목록");
//			System.out.println("--------------");
//			for (int i=0; i<accountArray.length;i++) {		//배열 accountArray의길이(100)까지 반복.
//				Account account = accountArray[i]; 			//반복문이 실행되면서 각 배열에 담긴 변수를 그때그때 담을 객체 선언
//				if (account != null) {						//배열이 비어 있을 수도 있는데 객체가 비어있지 않다면
//					System.out.println(account.getNum());	//계좌번호 반환하는 getNum()메서드 호출! (3)
//					System.out.println("      ");
//					System.out.println(account.getOwner());	//계좌주 반환하는 getOwner()메서드 호출!
//					System.out.println("      ");
//					System.out.println(account.getBalance());//계좌 금액 반환하는 getBalance() 메서드 호출!
//					System.out.println("      ");		
//				}
//			}
//		}
//			//예금하기
//		private static void deposit() {
//			System.out.println("--------------");
//			System.out.println("예금");
//			System.out.println("--------------");
//			System.out.println("계좌번호: "); String num= scanner.next();	//에금할 계좌번호 입력.
//			System.out.println("예금액: "); int money = scanner.nextInt();	 //예금할 금액 입력.
//			Account account = findAccount(num);				   //계좌정보(num,owner,balance) 넣는 변수 선언. findAccount(): 계좌를 찾는 메서드를 따로 생성. why? 계좌 찾는 일이 많으니까 반복을 줄이기위해.
//	/*		if(account == null) {					//인스턴스가 null이면 findAccount()가 반환한 계좌정보가 없단 소리.
//				System.out.println("결과: 계좌가 없습니다.");
//				return;						//return의 기능 (4)		
//			}
//	생각해보니까 findAccount()에서 배열이 비었는지 검사하기 때문에 여기서도 검사할 필요가 없다 느껴서 주석처리 했음. 넣어도 상관은 없을듯.
//	*/		account.setBalance(account.getBalance()+money);					//(getBalance()를 호출해서) 반환된 현재 balance에 예금한 돈을 합쳐서 (setBalance()를 호출해서 인자를 전달하여 )다시 balance에 저장.
//			System.out.println("결과: 예금이 성공되었습니다.");
//			record("예금 | 계좌정보: " + account + "예금액: "+money);		//기록내역에 저장할 메서드 호출.
//		}
//		
//			//출금하기
//		private static void withdraw() {			//사실 예금의 반대 기능 메서드이기 때문에 코드가 deposit()과 같고 +를 -로만 바꿔주면 된다.
//			System.out.println("--------------");
//			System.out.println("출금");
//			System.out.println("--------------");
//			System.out.println("계좌번호: "); String num= scanner.next();	//출금시킬 계좌번호 입력해서 num에 저장.
//			System.out.println("출금액: "); int money = scanner.nextInt();	 //출금금액 입력해서 money에 저장.
//			Account account = findAccount(num);				//계좌정보(num,owner,balance) 넣는 객체 선언. 
//	/*		if(account == null) {						 //account객체가 비어있으면 계좌정보가 비어있다는 거니까 계좌가 없다는 뜻.
//				System.out.println("결과: 계좌가 없습니다.");
//				return;	
//			}
//	예금 메서드와 같은 이유로 생략 가능.
//	*/		account.setBalance(account.getBalance()-money);		//(getBalance()를 호출하여 반환된)현재 balance에서 출금값을 빼주고 (setBalance()를 호출하여)그 값을 balance로 지정.
//			System.out.println("결과: 출금이 성공되었습니다.");
//			record("출금 | 계좌정보: " + account + "출금액: "+money);
//		}
//
//			//계좌 찾기
//		private static Account findAccount(String num) {	 //Account클래스의 객체를 반환하려면 return타입도 Account.
//			Account account = null;							 //Account 타입의 객체를 선언. 아직은 비어있는 객체.
//			for(int i=0;i<accountArray.length; i++) {		 //배열 수(100)만큼 반복.
//				if(accountArray[i] != null) {				 //배열이 비어있으면 계좌가 비어있는 거니까 null이 아닌 경우 if문 실행.
//					String dbNum = accountArray[i].getNum(); //각 배열의 계좌번호가 반복 초기화될 변수 dbNum.
//					if (dbNum.equals(num)) {				 //변수 dbNum이 num이랑 같으면 (전달인자로 들어온 사용자가 찾는 계좌번호와 배열에 저장돼있는 계좌번호가 같으면)
//						account = accountArray[i];			 //반환할 객체 account에 그 배열정보(객체정보num,owner,balance) 저장. 
//						break;			//찾았으니까 끝내기. (만약 dbNum과 num이 달라서 if문이 실행안됐다면 다시 for문으로 가서 그 다음 배열에 저장된 객체(계좌정보)와 비교.
//					}
//				}
//			}
//			return account;			//저장된 계좌정보(타입:Account타입)를 반환.
//		}
//		
//			//송금하기
//		private static void wire() {
//			System.out.println("--------------");
//			System.out.println("송금");
//			System.out.println("--------------");
//			//출금 계좌번호 찾기
//			System.out.println("출금할 계좌번호: "); String num = scanner.next();
//			System.out.println("출금액: "); int money = scanner.nextInt();
//			Account withdrawAccount = findAccount(num);
//			if (money>withdrawAccount.getBalance()) {
//				System.out.println("계좌에 돈이 부족합니다.");			//출금액이 부족할경우
//				return;					//메서드 종료.
//			}
//			else withdrawAccount.setBalance(withdrawAccount.getBalance()-money);	//else getBalance()에서 balance가져와서 출금액만큼 빼주고 다시 setBalance()로 지정.
//			//예금 계좌번호 찾기
//			System.out.println("예금할 계좌번호: "); String depositNum = scanner.next();
//			if(num == depositNum) {
//				System.out.println("출금할 계좌와 예금할 계좌가 같습니다.");//출금계좌와 예금계좌가 같으면
//				return;					 //메서드 종료.
//			}
//			Account depositAccount= findAccount(depositNum);			//다르면 예금할 계좌정보 찾아서 객체에 저장.
//			depositAccount.setBalance(depositAccount.getBalance()+money);
//			System.out.println("결과: 송금이 성공되었습니다.");
//			record("송금 | "+"송금계좌정보: " + withdrawAccount + "예금계좌정보: " + depositAccount + "송금액: " + money); //기록내역에 저장할 메서드 선언.
//		}
//
//			//기록하기
//		private static void record(String msg) {
//			Q19 a = new Q19();
//			for(int i=0;i<a.recordArray.length;i++) {
//				if (a.recordArray[i]== null) {	//비어있으면 넣어주고 안비어있으면 다음 인덱스로 넘어가서 확인.
//					a.recordArray[i]= msg;	//배열 한칸에 넣어준것. 결국 배열 한칸에 한 객체(세개의 정보를 갖고있는)가 들어가는 것.
//					break;
//				}
//			}
//		}
//			//기록내역보기
//		private static void recordList() {
//			Q19 a = new Q19();
//			for(int i=0;i<a.recordArray.length;i++) {	//기록배열 길이만큼 반복하면서
//				if (a.recordArray[i]== null) {			//배열이 비어있으면
//					System.out.println("기록된 내역이 없습니다.");
//					return;
//				}
//				else			//배열이 안비어있으면
//					System.out.println(a.recordArray[i]);//기록내역 보여주기.
//			}
//		}
//	}
//}
