package test;

import java.util.Scanner;

public class BankApplication {// class start
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {// main start
			//�ڵ带 ���� ĥ�� ch {}�ȿ��� ���� ���� ���� ���� 
			// ��ü���ΰ� ¥�� �ڵ徲��
			boolean run = true;
				while(run) {//while start
					System.out.println("-------------------------------------------");
					System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
					System.out.println("-------------------------------------------");
					System.out.println("���� > :");
					//�Է¹ޱ�
					int ch = sc.nextInt();
					if(ch==1) {makeAccount();}
					else if (ch==2) {}
					else if (ch==3) {}
					else if (ch==4) {}
					else if (ch==5) {run = false;}
					}//while end
				System.out.println("���α׷� ����"); //����
			}//main end
					//���»��� 1��
					private static void makeAccount() {
						// TODO Auto-generated method stub
						System.out.println("----------");
						System.out.println("���»���");
						System.out.println("----------");
						System.out.println("[[������]] : ");		String owner = sc.next();
						System.out.println("[[���¹�ȣ]] : ");		String ano = sc.next();
						System.out.println("[[�⺻�ݾ�]] : ");		int balance = sc.nextInt();
						Account abc = new Account(owner, ano, balance);
						//for(int i=0; i<accountArray.length; i++) {
							//if (accountArray[i] == null) {
							//accountArray[i] = abc;
							//}
						System.out.println(abc);
							}
						
			
					//���¸�� 2��
					private void accountList() {
						// TODO Auto-generated method stub

					}
					//����
					private void inMoney() {
						// TODO Auto-generated method stub

					}
					
					//���
					private void outMoney() {
						// TODO Auto-generated method stub

					}
		
}//class end
