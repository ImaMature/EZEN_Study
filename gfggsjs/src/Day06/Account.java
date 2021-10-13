package Day06;

public class Account { //계좌 설계
	
	//1. 필드  [ private : 필드 보호를 위한 접근 제한자]
			// 현재 클래스 내에서만 사용 가능
			// 외부로 접근불가 [ 간접 접근 : get, set 메소드를 통해야됨 ]
	
	//필드 입력하고나서 오른 클릭 후 source 밑에서 3번째 클릭해서 생성자 자동완성 만들수 있음
	
	private String ano; // 계좌번호 //getAno()에서 호출받아옴 //String ano를 출력
	private String owner; // 계좌주
	private int balance; // 입금액
	
	//2. 생성자 //자동완성 마우스 오른쪽 클릭 => source => 밑에서 3번째클릭 // 필드 입력후 사용
				//자동완성시 생기는 super();는 상속 여기서는 생략
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//3. 메소드 //자동완성 getter and setter //필드 입력후 사용
	public String getAno() {return ano;} 
	//계좌목록보기에서 호출 받아 return ano에 저장 
	//return으로 필드 String ano에 넘김
	
	public void setAno(String ano) { this.ano = ano;} 
	public String getOwner() { return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() { return balance;} 
	public void setBalance(int Balance) {this.balance = balance;}
}
