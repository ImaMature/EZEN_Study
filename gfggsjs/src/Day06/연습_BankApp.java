package Day06;

import java.util.Scanner;

public class 연습_BankApp {//class start
	
	private static 연습_Account [] accountArray2 = new 연습_Account [100]; //??선언하는 이유?
	private static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			boolean run = true;
			while(run) {
				System.out.println("------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("------------------------------------------");
				System.out.print("선택 >");
				int ch = sc.nextInt();
			
				if(ch == 1) {createAccount();}
				else if(ch == 2) {accountList();}
				else if(ch == 3) {deposit();}
				else if(ch == 4) {withdraw();}
				// 종료
				else if(ch == 5) {run = false;}
			} //while end
			System.out.println("프로그램 종료");
		}// main end

			//1. 계좌생성
			private static void createAccount() {
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				//1)입력받기
				System.out.print("계좌번호 : "); 		String ano = sc.next();
				System.out.print("계좌주 : ");		String owner = sc.next();
				System.out.print("초기입금액 : "); 		int balance = sc.nextInt();
				//2)객체생성
				연습_Account account2 = new 연습_Account (ano, owner, balance);
				//3)결과
				for (int i=0; i<accountArray2.length; i++) {
					if(accountArray2[i] == null) {
						accountArray2[i] = account2;
						System.out.println("계좌가 생성되었습니다.");
						break;
				}
			}	
		}
			
		//2. 계좌목록
			private static void accountList() {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				
				for(int i =0; i>accountArray2.length; i++) {
					if(accountArray2[i] == null) break;
					System.out.println(accountArray2[i].getAno() + "\t" + 
									accountArray2[i].getOwner() + "\t" +
									accountArray2[i].getBalance());
				}
			}
			
			private static 연습_Account findAccount(String ano) {
				연습_Account account2 = null;
				for(int i =0; i<accountArray2.length; i++) {
					if(accountArray2[i] !=null) {
						if (accountArray2[i].getAno().equals(ano)) {  //? 
							account2 = accountArray2[i];
							break;
						}
					}
				}
				return account2;
			}

		//3. 예금
			private static void deposit() {
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				//1) 입력받기
				System.out.print("계좌번호 : ");		String ano = sc.next();
				System.out.print("예금액 : ");		int balance = sc.nextInt();
				
				//2) 있는지 없는지
				연습_Account account2 = findAccount(ano);
				//3) 없으면 존재X
				if(account2==null) { System.out.println("결과 : 계좌가 없습니다.");
				return;
				}
				account2.setBalance(account2.getBalance() + balance);
				System.out.println("결과 : 예금이 성공되었습니다.");
				
			}


		//4. 출금
			private static void withdraw() {
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				
				System.out.println("");
			}

	
	
		
}//class end
