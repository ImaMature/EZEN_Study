package test;

public class Account {
	//1.�ʵ�
	
			//����̸�	
			private String owner;	
	
			//���¹�ȣ
			private String ano;
		
			//�⺻��
			private int balance;
	//2. ������
			public Account(String owner, String ano, int balance) {
				
				this.owner = owner;
				this.ano = ano;
				this.balance = balance;
				
	//3. �޼ҵ�			
			}
			
			public String getOwner() {return owner;}
			public void setOwner(String owner) {this.owner = owner;}
			
			public String getAno() {return ano;}
			public void setAno(String ano) {this.ano = ano;}
			
			public int getBalance() {return balance;}
			public void setBalance(int balance) {this.balance = balance;}
	
}
