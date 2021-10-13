package Day06;

import java.util.Scanner;

public class ����_BankApp {//class start
	
	private static ����_Account [] accountArray2 = new ����_Account [100]; //??�����ϴ� ����?
	private static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			boolean run = true;
			while(run) {
				System.out.println("------------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("------------------------------------------");
				System.out.print("���� >");
				int ch = sc.nextInt();
			
				if(ch == 1) {createAccount();}
				else if(ch == 2) {accountList();}
				else if(ch == 3) {deposit();}
				else if(ch == 4) {withdraw();}
				// ����
				else if(ch == 5) {run = false;}
			} //while end
			System.out.println("���α׷� ����");
		}// main end

			//1. ���»���
			private static void createAccount() {
				System.out.println("---------");
				System.out.println("���»���");
				System.out.println("---------");
				//1)�Է¹ޱ�
				System.out.print("���¹�ȣ : "); 		String ano = sc.next();
				System.out.print("������ : ");		String owner = sc.next();
				System.out.print("�ʱ��Աݾ� : "); 		int balance = sc.nextInt();
				//2)��ü����
				����_Account account2 = new ����_Account (ano, owner, balance);
				//3)���
				for (int i=0; i<accountArray2.length; i++) {
					if(accountArray2[i] == null) {
						accountArray2[i] = account2;
						System.out.println("���°� �����Ǿ����ϴ�.");
						break;
				}
			}	
		}
			
		//2. ���¸��
			private static void accountList() {
				System.out.println("---------");
				System.out.println("���¸��");
				System.out.println("---------");
				
				for(int i =0; i>accountArray2.length; i++) {
					if(accountArray2[i] == null) break;
					System.out.println(accountArray2[i].getAno() + "\t" + 
									accountArray2[i].getOwner() + "\t" +
									accountArray2[i].getBalance());
				}
			}
			
			private static ����_Account findAccount(String ano) {
				����_Account account2 = null;
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

		//3. ����
			private static void deposit() {
				System.out.println("---------");
				System.out.println("����");
				System.out.println("---------");
				//1) �Է¹ޱ�
				System.out.print("���¹�ȣ : ");		String ano = sc.next();
				System.out.print("���ݾ� : ");		int balance = sc.nextInt();
				
				//2) �ִ��� ������
				����_Account account2 = findAccount(ano);
				//3) ������ ����X
				if(account2==null) { System.out.println("��� : ���°� �����ϴ�.");
				return;
				}
				account2.setBalance(account2.getBalance() + balance);
				System.out.println("��� : ������ �����Ǿ����ϴ�.");
				
			}


		//4. ���
			private static void withdraw() {
				System.out.println("---------");
				System.out.println("���");
				System.out.println("---------");
				
				System.out.println("");
			}

	
	
		
}//class end
