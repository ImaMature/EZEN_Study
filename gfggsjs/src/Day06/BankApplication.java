package Day06;

import java.util.Scanner;

public class BankApplication { //BankApplication class start
	//���� ������ : private, protected, public, default
		// public : ������Ʈ �� ��� ������ ȣ�� ����
		// private : ���� ���� �������� ȣ�� ����
		// default(����) : ������ ��Ű���������� ȣ�� ����
		// protected : ������ ��Ű���������� ȣ�� ����
			// ���� : https://velog.io/@gillog/Java-%EC%A0%91%EA%B7%BC-%EC%A0%9C%ED%95%9C%EC%9E%90
	
	// 100���� ������ü�� ������ �� �ִ� �迭 ����
		
	/*private Account[] accountArray = new Account[100];
			// private : ���� Ŭ���� �������� ȣ�� ����
			// static�� ���� ��� main���� ����, �ٵ� main�� accountArray���� �Լ��� �����Ƿ� �� �о.
			// �׷��� static ��ߵ�
			 
		public Account[] = new Account[100];
		
		// static ���� �迭 ȣ��� 
		System.out.println("static ���� ��� :"); // ����
		
		
	[static] ���� ���� : ���α׷� ���ݿ� ���� ���� ����
		<->  ���� ���� : ����� {} �ȿ����� ��� -> {} ������ ������ �ʱ�ȭ
			// main �޼ҵ�� ���� ���α׷� ���۰� ���ÿ� �޸� �Ҵ�		
			// main �޼ҵ� �ۿ� ����� -> main �޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ����
			!! static�� ���� ���� �뷮�� �þ �ӵ��� �پ�� -> ȿ�� �϶�
			?? �׷� ������ ??  ��� �޼ҵ忡 ���Ǵ� �ʵ忡 �����ؾߵ�
	*/
	//p. 284 ~ 286 ���°��� ���α׷�
	//  ---�ʵ�---
	private static Account[] accountArray = new Account[100]; 	//java�� �迭�� ����� �����Ǳ⶧���� ũ�⸦ ũ�� ����.
	private static Scanner scanner = new Scanner(System.in);	//static�� �޼ҵ尡 ������ ��� �����Ǵ� ��������.
	
	// ---���� �޼ҵ�---
	public static void main(String[] args) { // main start
		
		boolean run = true;		//�ݺ��� boolean
		while(run) {			//run = false �� ������ �ݺ�
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("���� > ");
			
			int selectNo = scanner.nextInt();	// ���� �Է��ϸ� scanner�� �о selectNo�� ����
			if(selectNo == 1) {	createAccount(); } 	//1.createAccount()�޼ҵ� ȣ��.
			else if (selectNo == 2) {accountList();}
			else if (selectNo == 3) {deposit();	} 
			else if (selectNo == 4) {withdraw();}
			else if (selectNo == 5) {run = false;}
		}
		System.out.println("���α׷� ����");
	  } // main end
	
	//�޼ҵ� ����
	//���� : ���������� Ű���� ��ȯŸ�� �޼ҵ��(�Ű�����, �Ű�����2 ~~ ) { �����ڵ�; return;}
	
	//���»����ϱ� 
	private static void createAccount() { //���»����ϱ� ����
	//private �����ص� �� �׷��� default�� �ڵ����� ��
		// static ����ϴ� ���� : main���� ȣ���ϱ� ���� (�̻��� : main �ش� �޼ҵ� ���Ұ�)
			
		//���»��� 
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		
		// 1. �Է¹޾� ������ ����
		System.out.println("���¹�ȣ : "); 	String ano = scanner.next();
		System.out.println("������ : ");		String owner = scanner.next();
		System.out.println("�ʱ� �Աݾ� : "); 	int balance = scanner.nextInt();
		
		// 2. ��ü ���� [�Է¹��� �������� ��ü �����ڿ� �־ ��ü �����]
		Account account = new Account(ano, owner, balance);
		
		// 3. �迭 ���� [�迭 �� �����(null)�� ã�Ƽ� ����� �ε����� ��ü ����]
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {  // i��° �ε����� ��� ������ �迭�� �ֱ�
				   accountArray[i] = account; // i��° �ε����� ��ü �ֱ�
				   System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				   break;// ���»����� �ݺ��� ����
				   
			}
		}
	}// createAccount end ���»����ϱ� ����
	
	//���¸�Ϻ��� [�μ�x ��ȯx]
	private static void accountList() {
		
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");
		
		//1. �迭 �� ��� �ε����� ȣ�� [���� ����]
		for (int i=0; i<accountArray.length; i++) { 
			if (accountArray[i] == null)  break;
				//���� �����ϱ��� i�ʹٸ� �ֳĸ� �� i�� i�� ������ �ƴҶ� �ؿ��� ����ϱ� ����
			System.out.println(accountArray[i].getAno() +"\t" //   getAno �޼ҵ� ȣ��
							+ accountArray[i].getOwner() + "\t"
							+ accountArray[i].getBalance()		);
		}
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã�� �޼ҵ� [�μ�o (String ano) ��ȯo (Account��ü)]
	private static Account findAccount(String ano) { //�ߺ��� ã�� //�ٷ� �� �� ���� �ֳĸ� private�̶� �׷��� getAno�� ��ߵ�
		Account account = null; // �ӽð�ü
		for( int i = 0 ; i<accountArray.length ; i++ ) {
			if( accountArray[i] != null ) { // i��° �ε����� ������ �ƴϸ鼭 
				if( accountArray[i].getAno().equals(ano) ) { //
					// i��° �ε����� ��ü�� ���¹�ȣ�� �μ�[�Է¹��� ���¹�ȣ]�� ������ 
					account = accountArray[i]; // ã�� ��ü�� ��ü account�� ����
					break;
				}
			}
		}
		return account; // ���࿡ ������ ���¹�ȣ ������ ��ü[ã����ü] ��ȯ 
						// ������ ���¹�ȣ�� ������ ��ü[null] ��ȯ
	}//���¸�Ϻ��� ����
	
	
	//�����ϱ� [�μ�x ��ȯx]
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		//1. �Է¹ޱ�
		System.out.println(">>>���¹�ȣ : ");		String ano = scanner.next();
		System.out.println(">>>���ݾ� : ");		int balance = scanner.nextInt();
		
		//2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
		Account account = findAccount(ano); // - > findAccount(String ano)�� �̵�
			//findAccount ��ȯ : ã�� ��ü Ȥ�� null
		
		//3. 
		if( account == null ) { // ��ȯ�� null �ϰ�� 
			System.out.println("��� : ���°� �������� �ʽ��ϴ�. ");
			return; // ���� �޼ҵ� ���� ���� 
		}
		
		//4.
		account.setBalance( account.getBalance() + balance  );
									  // �������ݾ�  + �Է¹��� �Աݾ� 
		// account.Balance(account.getBalance()+balance); => private �ʵ忡���� �Ұ� // Balance �տ� set�� �ٿ��� ��.
		// set�޼ҵ� : �ʵ忡 �� ���� �޼ҵ� 
		// get�޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ� 
		System.out.println("��� : ������ �����Ǿ����ϴ�. ");
	} //�����ϱ� ����
	
	//����ϱ� [�μ�x ��ȯx]
	private static void withdraw() {
		
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		//1. �Է¹ޱ�
		System.out.println(">>> ���¹�ȣ : ");		String ano = scanner.next();
		System.out.println(">>> ��ݾ� : ");	 	int balance = scanner.nextInt();
		
		// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ�� 
		Account account = findAccount(ano); // findAccount ��ȯ -> ã�� ��ü�� null�� ����
											// - > findAccount(String ano)�� �̵�
		
		// 3.
		if(account == null) { 
			System.out.println("��� : ���°� �������� �ʽ��ϴ�."); 
			return;
			// ��ȯ�� null�� ��� ���� �޼ҵ� ��������
		}
		
		if(account.getBalance() < balance) {
			//��ݾ��� �������ݾ׺��� ũ�� ��� �Ұ�
			System.out.println("���ݾ׺��� ���� �ݾ��� ����� �� �����ϴ�."); 
			return;
		}
		
		//4. �������ݾ� - ��ݾ�
		account.setBalance( account.getBalance() - balance );
		System.out.println("��� : ����� �����Ǿ����ϴ�. ");
		
	}//����ϱ� ����
	
	
	
	//Account �迭���� ano�� ������ Account ��ü ã��		// [�μ�o(String ano) ��ȯo(Account ��ü)] 
	//private static Account findAccount(String ano) {
		//�ۼ� ��ġ	
		//return Account;
	
} //BankApplication class end
