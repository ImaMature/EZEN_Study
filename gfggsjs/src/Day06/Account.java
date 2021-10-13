package Day06;

public class Account { //���� ����
	
	//1. �ʵ�  [ private : �ʵ� ��ȣ�� ���� ���� ������]
			// ���� Ŭ���� �������� ��� ����
			// �ܺη� ���ٺҰ� [ ���� ���� : get, set �޼ҵ带 ���ؾߵ� ]
	
	//�ʵ� �Է��ϰ��� ���� Ŭ�� �� source �ؿ��� 3��° Ŭ���ؼ� ������ �ڵ��ϼ� ����� ����
	
	private String ano; // ���¹�ȣ //getAno()���� ȣ��޾ƿ� //String ano�� ���
	private String owner; // ������
	private int balance; // �Աݾ�
	
	//2. ������ //�ڵ��ϼ� ���콺 ������ Ŭ�� => source => �ؿ��� 3��°Ŭ�� // �ʵ� �Է��� ���
				//�ڵ��ϼ��� ����� super();�� ��� ���⼭�� ����
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//3. �޼ҵ� //�ڵ��ϼ� getter and setter //�ʵ� �Է��� ���
	public String getAno() {return ano;} 
	//���¸�Ϻ��⿡�� ȣ�� �޾� return ano�� ���� 
	//return���� �ʵ� String ano�� �ѱ�
	
	public void setAno(String ano) { this.ano = ano;} 
	public String getOwner() { return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() { return balance;} 
	public void setBalance(int Balance) {this.balance = balance;}
}
