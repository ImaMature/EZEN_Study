package BookAppv2;

import java.util.Scanner; //�Է¹޴� ��ü�� �����ϰų� ����ϱ� ����(Scanner�� ��������) import��.

public class BookMainv2 {

//	------------------- ȸ���� ������ ���α׷� ---------------------
//	// [����1] : ��ü���� [ ȸ�� Ŭ���� , ���� Ŭ����  ]
//		���� : �ʵ� , ������ , �޼ҵ�
//	// [����2] : ��ü�� �迭�� ����
//	// [����3] : ȸ���� ���α׷� �̿�
//		[ �α����� ] : �α��� , ȸ������ , ���̵�/��й�ȣ ã��   
//		[ �α��ν� ] : 1.������� ,2. �뿩 , 3.�ݳ�  , 4.�α׾ƿ�
//	// [����4] : ������[ ID:admin ] �� ���� ��� ���� 
//		[ ������ �α��ν� ] : 1.������� ,2.������� 3. �α׾ƿ� 
	
	public static Member [] m_arr = new Member [100]; 
	//Member�� �ʵ尪�� �̿��� ȸ������(���̵�(m_id), �н�����(m_pw), �̸�(m_name), ��ȭ��ȣ(m_phone)�� 100������ ���� �迭 m_arr�� ���� ������ ����.
	public static Book [] b_arr = new Book [100]; 
	//BookŬ������ �ʵ尪�� �̿��� ��������(b_isbn(�����ڵ�), b_name(�����̸�), b_rent(���� �뿩 ����), m_id(ȸ������))�� 100������ ���� �迭 b_arr ���������� ����.
	public static Scanner sc = new Scanner(System.in);  //�Է°�ü sc ���������� ���� �ܺ�Ŭ���������� ��� ���� 
	public static void main(String[] args) {//main�޼ҵ�
		start(); // start�޼ҵ� ȣ��
	}
	
	public static void start() { //start�޼ҵ� ����. 
		//static���� �����ؼ� main�޼ҵ忡�� �ҷ��� �� �ְ� �ϱ�
		Member member = new Member(); //MemberŬ������ �޼ҵ���� �ҷ����� ���� new �����ڷ� ��ü member����
		while(true) {//���ѷ���(�ݺ���)�� ���� ���� while(true)���
			try { //���� ó���� ���ؼ� try catch�� ���
				BookMainv2.sc = new Scanner(System.in); //�����߻��� ���ѷ��� ���ϱ� ���Ͽ� �Է°�ü ���� static�� �ִ� sc�����ͼ� ���� ����.
				System.out.println("--------------������ ���� ���α׷�v2-------------------");
				System.out.println("1. �α��� | 2. ȸ������ | 3. ���α׷� ����");
				System.out.println("------------------------------------------------");
				int ch = sc.nextInt(); // �Է¹��� ���ڸ� ch�� ���� ���ڶ� intŸ��
				if(ch == 1) { //�Է¹��� ch ���� 1�̸�
					member.login(); //BookŬ������ login�޼ҵ� ȣ��
				}
				else if(ch == 2) { //�Է¹��� ch ���� 2�̸�
					member.signup(); //BookŬ������ signup�޼ҵ� ȣ��
				}
				else if(ch == 3) { //�Է¹��� ch ���� 3�̸�
					System.out.println("���α׷��� �����մϴ�. �̿����ּż� �����մϴ�.");
					break; //�ݺ��� Ż��
				}else {System.out.println("�߸��� �Է��Դϴ�.");} //�Է¹��� ���� ���� 1~3�� �ƴϸ�
			} catch (Exception e) { // � ���ܵ��� �߻��ϸ� ��ü e�� �ҷ��� �� ����
				System.out.println("�����߻� �����ڿ��� ����" + e.getMessage()); //getMessage�޼ҵ带 ȣ���Ͽ� ��ȯ��(�޽���) ������
				
			}	
		}
	}
}
