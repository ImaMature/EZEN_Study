//package study_ing;
//
//public class bank {
//	// account
//	package hw;
//	import java.util.Scanner;	//Scanner Ŭ������ �Է¹ޱ�.
//
//	class Account {			//�Ӽ�(����)�� ����(�޼���)�� �������ִ� �޼���.
//		private String num;	//���¹�ȣ. ��ȣ '-'�� �ֱ� ������ int ��� String Ÿ��.
//		private String owner;	//������
//		private int balance;	//�Աݾ�.
//		public String msg;
//
//		
//		public Account(String num, String owner, int balance) {	//�Ű������� �ִ� ������
//			this.num=num;		//this�� Account�� �ǹ�.
//			this.balance=balance;	//��������(�Ű�����)�� �̸��� ������ ��� Account�� private balance���� this.�� �ٿ� ����.
//			this.owner=owner;
//		}
//		public Account( ) {}
//		
//		public String getNum() {return num;}			//(1) Account ��ü���� ���������ڰ� private�̴ϱ� �ܺ�Ŭ���������� get,set �޼���� �����ؾ��Ѵ�.
//		public void setNum(String num) {this.num=num;}		//set()�޼���� ���� �����ϴ� ����
//		public String getOwner() {return owner;}		//get()�޼����  ���� ��ȯ�ϴ� ����
//		public void setOwner(String owner) {this.owner=owner;}
//		public int getBalance() {return balance;}
//		public void setBalance(int balance) {this.balance=balance;}
//
//	}
//	//main�� main���� ����� �޼������ �����ִ� �޼���. �� �޼������ �� �迭�� Scanner ���������� �������ְ� ����!
//	//bank app
//	public class Q19 {			
//		private static Account[] accountArray= new Account[100];	//java�� �迭�� ����� �����Ǳ⶧���� ũ�⸦ ũ�� ����.
//		private static Scanner scanner= new Scanner(System.in);		//static�� �޼��尡 ������ ��� �����Ǵ� ��������.	
//		String[] recordArray = new String[100];				//��ϳ��� ������ �迭 ����
//
//
//		public static void main(String[] args) {
//			boolean run=true;				//�ݺ����� ���� boolean
//			while(run) {					//run=false �ɶ����� �ݺ�
//				System.out.println("-------------------------------------------");
//				System.out.println("1.���� ���� | 2.���¸�� |  3.���� |  4.���  | 5.�۱� | 6.��ϳ��� | 7.����");	
//				System.out.println("-------------------------------------------");
//				System.out.println("����> ");
//				int selectNo = scanner.nextInt();			//���ڸ� �Է��ϸ� scanner�� �о selectNo ������ ����.
//				if (selectNo == 1) { createAccount(); }		//1.createAccount()�޼��� ȣ��.
//				else if (selectNo == 2) {accountList(); }	//2. accountList()�޼��� ȣ��.
//				else if (selectNo == 3) {deposit(); }		//3. deposit()�޼��� ȣ��.
//				else if (selectNo == 4) {withdraw(); }		//4. withdraw()�޼��� ȣ��.
//				else if (selectNo == 5) {wire(); }		//5. wire()�޼��� ȣ��.
//				else if (selectNo == 6) {recordList(); }	//6. recordList()�޼��� ȣ��.
//				else if (selectNo == 7) {run = false; }		//7. run=false; �ݺ��� �ߴ�.
//			}
//			System.out.println("���α׷� ����");		//�ݺ����� ������ ��µǴ� ����.
//		}
//			
//			//���� �����ϱ�
//		private static void createAccount() {
//			System.out.println("--------------");
//			System.out.println("���»���");
//			System.out.println("--------------");
//			System.out.println("���¹�ȣ: "); String num=scanner.next();
//			System.out.println("������: "); String owner = scanner.next();
//			System.out.println("�ʱ��Աݾ�: "); int balance = scanner.nextInt();
//			Account newAccount = new Account(num, owner, balance);	//�Ű����� �ִ� ������ ȣ��! (2)
//			for(int i=0;i<accountArray.length;i++) {
//				if (accountArray[i]== null) {
//					accountArray[i]= newAccount;	//�迭 ��ĭ�� �־��ذ�. �ᱹ �迭 ��ĭ�� �� ��ü(������ ������ �����ִ�)�� ���� ��.
//					System.out.println("���: ���°� �����Ǿ����ϴ�.");
//					record("���� ���� | ���� ����: "+newAccount);	//��ϳ����� ������ �޼��� ȣ��.
//					break;
//				}
//			}
//		}
//			//���� ��Ϻ���
//		private static void accountList() {
//			System.out.println("--------------");
//			System.out.println("���¸��");
//			System.out.println("--------------");
//			for (int i=0; i<accountArray.length;i++) {		//�迭 accountArray�Ǳ���(100)���� �ݺ�.
//				Account account = accountArray[i]; 			//�ݺ����� ����Ǹ鼭 �� �迭�� ��� ������ �׶��׶� ���� ��ü ����
//				if (account != null) {						//�迭�� ��� ���� ���� �ִµ� ��ü�� ������� �ʴٸ�
//					System.out.println(account.getNum());	//���¹�ȣ ��ȯ�ϴ� getNum()�޼��� ȣ��! (3)
//					System.out.println("      ");
//					System.out.println(account.getOwner());	//������ ��ȯ�ϴ� getOwner()�޼��� ȣ��!
//					System.out.println("      ");
//					System.out.println(account.getBalance());//���� �ݾ� ��ȯ�ϴ� getBalance() �޼��� ȣ��!
//					System.out.println("      ");		
//				}
//			}
//		}
//			//�����ϱ�
//		private static void deposit() {
//			System.out.println("--------------");
//			System.out.println("����");
//			System.out.println("--------------");
//			System.out.println("���¹�ȣ: "); String num= scanner.next();	//������ ���¹�ȣ �Է�.
//			System.out.println("���ݾ�: "); int money = scanner.nextInt();	 //������ �ݾ� �Է�.
//			Account account = findAccount(num);				   //��������(num,owner,balance) �ִ� ���� ����. findAccount(): ���¸� ã�� �޼��带 ���� ����. why? ���� ã�� ���� �����ϱ� �ݺ��� ���̱�����.
//	/*		if(account == null) {					//�ν��Ͻ��� null�̸� findAccount()�� ��ȯ�� ���������� ���� �Ҹ�.
//				System.out.println("���: ���°� �����ϴ�.");
//				return;						//return�� ��� (4)		
//			}
//	�����غ��ϱ� findAccount()���� �迭�� ������� �˻��ϱ� ������ ���⼭�� �˻��� �ʿ䰡 ���� ������ �ּ�ó�� ����. �־ ����� ������.
//	*/		account.setBalance(account.getBalance()+money);					//(getBalance()�� ȣ���ؼ�) ��ȯ�� ���� balance�� ������ ���� ���ļ� (setBalance()�� ȣ���ؼ� ���ڸ� �����Ͽ� )�ٽ� balance�� ����.
//			System.out.println("���: ������ �����Ǿ����ϴ�.");
//			record("���� | ��������: " + account + "���ݾ�: "+money);		//��ϳ����� ������ �޼��� ȣ��.
//		}
//		
//			//����ϱ�
//		private static void withdraw() {			//��� ������ �ݴ� ��� �޼����̱� ������ �ڵ尡 deposit()�� ���� +�� -�θ� �ٲ��ָ� �ȴ�.
//			System.out.println("--------------");
//			System.out.println("���");
//			System.out.println("--------------");
//			System.out.println("���¹�ȣ: "); String num= scanner.next();	//��ݽ�ų ���¹�ȣ �Է��ؼ� num�� ����.
//			System.out.println("��ݾ�: "); int money = scanner.nextInt();	 //��ݱݾ� �Է��ؼ� money�� ����.
//			Account account = findAccount(num);				//��������(num,owner,balance) �ִ� ��ü ����. 
//	/*		if(account == null) {						 //account��ü�� ��������� ���������� ����ִٴ� �Ŵϱ� ���°� ���ٴ� ��.
//				System.out.println("���: ���°� �����ϴ�.");
//				return;	
//			}
//	���� �޼���� ���� ������ ���� ����.
//	*/		account.setBalance(account.getBalance()-money);		//(getBalance()�� ȣ���Ͽ� ��ȯ��)���� balance���� ��ݰ��� ���ְ� (setBalance()�� ȣ���Ͽ�)�� ���� balance�� ����.
//			System.out.println("���: ����� �����Ǿ����ϴ�.");
//			record("��� | ��������: " + account + "��ݾ�: "+money);
//		}
//
//			//���� ã��
//		private static Account findAccount(String num) {	 //AccountŬ������ ��ü�� ��ȯ�Ϸ��� returnŸ�Ե� Account.
//			Account account = null;							 //Account Ÿ���� ��ü�� ����. ������ ����ִ� ��ü.
//			for(int i=0;i<accountArray.length; i++) {		 //�迭 ��(100)��ŭ �ݺ�.
//				if(accountArray[i] != null) {				 //�迭�� ��������� ���°� ����ִ� �Ŵϱ� null�� �ƴ� ��� if�� ����.
//					String dbNum = accountArray[i].getNum(); //�� �迭�� ���¹�ȣ�� �ݺ� �ʱ�ȭ�� ���� dbNum.
//					if (dbNum.equals(num)) {				 //���� dbNum�� num�̶� ������ (�������ڷ� ���� ����ڰ� ã�� ���¹�ȣ�� �迭�� ������ִ� ���¹�ȣ�� ������)
//						account = accountArray[i];			 //��ȯ�� ��ü account�� �� �迭����(��ü����num,owner,balance) ����. 
//						break;			//ã�����ϱ� ������. (���� dbNum�� num�� �޶� if���� ����ȵƴٸ� �ٽ� for������ ���� �� ���� �迭�� ����� ��ü(��������)�� ��.
//					}
//				}
//			}
//			return account;			//����� ��������(Ÿ��:AccountŸ��)�� ��ȯ.
//		}
//		
//			//�۱��ϱ�
//		private static void wire() {
//			System.out.println("--------------");
//			System.out.println("�۱�");
//			System.out.println("--------------");
//			//��� ���¹�ȣ ã��
//			System.out.println("����� ���¹�ȣ: "); String num = scanner.next();
//			System.out.println("��ݾ�: "); int money = scanner.nextInt();
//			Account withdrawAccount = findAccount(num);
//			if (money>withdrawAccount.getBalance()) {
//				System.out.println("���¿� ���� �����մϴ�.");			//��ݾ��� �����Ұ��
//				return;					//�޼��� ����.
//			}
//			else withdrawAccount.setBalance(withdrawAccount.getBalance()-money);	//else getBalance()���� balance�����ͼ� ��ݾ׸�ŭ ���ְ� �ٽ� setBalance()�� ����.
//			//���� ���¹�ȣ ã��
//			System.out.println("������ ���¹�ȣ: "); String depositNum = scanner.next();
//			if(num == depositNum) {
//				System.out.println("����� ���¿� ������ ���°� �����ϴ�.");//��ݰ��¿� ���ݰ��°� ������
//				return;					 //�޼��� ����.
//			}
//			Account depositAccount= findAccount(depositNum);			//�ٸ��� ������ �������� ã�Ƽ� ��ü�� ����.
//			depositAccount.setBalance(depositAccount.getBalance()+money);
//			System.out.println("���: �۱��� �����Ǿ����ϴ�.");
//			record("�۱� | "+"�۱ݰ�������: " + withdrawAccount + "���ݰ�������: " + depositAccount + "�۱ݾ�: " + money); //��ϳ����� ������ �޼��� ����.
//		}
//
//			//����ϱ�
//		private static void record(String msg) {
//			Q19 a = new Q19();
//			for(int i=0;i<a.recordArray.length;i++) {
//				if (a.recordArray[i]== null) {	//��������� �־��ְ� �Ⱥ�������� ���� �ε����� �Ѿ�� Ȯ��.
//					a.recordArray[i]= msg;	//�迭 ��ĭ�� �־��ذ�. �ᱹ �迭 ��ĭ�� �� ��ü(������ ������ �����ִ�)�� ���� ��.
//					break;
//				}
//			}
//		}
//			//��ϳ�������
//		private static void recordList() {
//			Q19 a = new Q19();
//			for(int i=0;i<a.recordArray.length;i++) {	//��Ϲ迭 ���̸�ŭ �ݺ��ϸ鼭
//				if (a.recordArray[i]== null) {			//�迭�� ���������
//					System.out.println("��ϵ� ������ �����ϴ�.");
//					return;
//				}
//				else			//�迭�� �Ⱥ��������
//					System.out.println(a.recordArray[i]);//��ϳ��� �����ֱ�.
//			}
//		}
//	}
//}
