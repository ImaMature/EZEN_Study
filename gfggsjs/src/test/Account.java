package test;

public class Account {
	//1.필드
	
			//사람이름	
			private String owner;	
	
			//계좌번호
			private String ano;
		
			//기본액
			private int balance;
	//2. 생성자
			public Account(String owner, String ano, int balance) {
				
				this.owner = owner;
				this.ano = ano;
				this.balance = balance;
				
	//3. 메소드			
			}
			
			public String getOwner() {return owner;}
			public void setOwner(String owner) {this.owner = owner;}
			
			public String getAno() {return ano;}
			public void setAno(String ano) {this.ano = ano;}
			
			public int getBalance() {return balance;}
			public void setBalance(int balance) {this.balance = balance;}
	
}
