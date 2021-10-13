package test;

import java.util.Scanner;

public class BankApplication {// class start
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {// main start
			//코드를 따라 칠때 ch {}안에거 부터 쓰고 하지 말고 
			// 전체적인거 짜고 코드쓰기
			boolean run = true;
				while(run) {//while start
					System.out.println("-------------------------------------------");
					System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
					System.out.println("-------------------------------------------");
					System.out.println("선택 > :");
					//입력받기
					int ch = sc.nextInt();
					if(ch==1) {makeAccount();}
					else if (ch==2) {}
					else if (ch==3) {}
					else if (ch==4) {}
					else if (ch==5) {run = false;}
					}//while end
				System.out.println("프로그램 종료"); //종료
			}//main end
					//계좌생성 1번
					private static void makeAccount() {
						// TODO Auto-generated method stub
						System.out.println("----------");
						System.out.println("계좌생성");
						System.out.println("----------");
						System.out.println("[[예금주]] : ");		String owner = sc.next();
						System.out.println("[[계좌번호]] : ");		String ano = sc.next();
						System.out.println("[[기본금액]] : ");		int balance = sc.nextInt();
						Account abc = new Account(owner, ano, balance);
						//for(int i=0; i<accountArray.length; i++) {
							//if (accountArray[i] == null) {
							//accountArray[i] = abc;
							//}
						System.out.println(abc);
							}
						
			
					//계좌목록 2번
					private void accountList() {
						// TODO Auto-generated method stub

					}
					//예금
					private void inMoney() {
						// TODO Auto-generated method stub

					}
					
					//출금
					private void outMoney() {
						// TODO Auto-generated method stub

					}
		
}//class end
