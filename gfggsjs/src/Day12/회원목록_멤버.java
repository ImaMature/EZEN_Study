package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ȸ�����_��� {
	
	//1.�ʵ� [ �޸� = ���� ]
	private String id;
	private String pw;
	private String name;
	private String phone;
			//private ���������� : �ʵ� ��ȣ�� , �ٸ� Ŭ�������� ���� �Ұ�
	//2.������
	
	// �������
	public ȸ�����_���() {} 
	// �� ������ : �⺻ ������ �̿��� �����ڸ� ����� �ȴٸ� �⺻ �����ڴ� �ڵ����� ��������� �����Ƿ� �ʱⰪ ������ ���� �����ڸ� ���� 
	//https://aomee0880.tistory.com/96
	
	//��� �ʵ带 �޴� ������
	public ȸ�����_���(String id, String pw, String name, String phone) { //��ӹ����� ������ super()����
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	
	//3.�޼ҵ�
		//1) private �ʵ� ���� getter, setter �־�� �ܺ�Ŭ������ ����
		
		//2) �α��� �޼ҵ�
	public void signIn() { //�ϴ� void�ְ� �����°�(return ��) ������ string�����ɷ� �ٲ�
		
	}
		
		//3) ȸ�� ���� �޼ҵ�
	public void signUp() {
		//3-a) �Է°�ü ��������
		Scanner scanner = ȸ�����_����.scanner; // mainŬ������ scanner�ּҰ� �ҷ��ͼ� �� �׷��� �׳� scanner��� �ᵵ �νĵ�.
														// �װ� �ƴ϶�� ������ Day12~~~.scanner.next��� ��ߵ�
		//3-b) �Է¹ޱ�
		System.out.println("-------ȸ������ ������-------");
		System.out.println("���̵�"); 	String id = scanner.next();
		System.out.println("��й�ȣ"); 	String pw = scanner.next();
		System.out.println("����"); 		String name = scanner.next();
		System.out.println("����ó"); 	String phone = scanner.next();
				
		//3-3-c) ��ü ����
		ȸ�����_��� member = new ȸ�����_���(id, pw, name, phone);
		
		//3-3-c2) �迭 ����(str -> int �� �ƴ� �ε����� �ҷ������ �����ϱ�)
			for(int i =0; i<ȸ�����_����.members.length; i++) {
				if(ȸ�����_����.members[i] == null) {
					ȸ�����_����.members[i] = member; break;
				}
			}
							
		//3-3-d) ���� ����
				//���� �����ϴ¹�
					//A. ȸ���� [\n] �ʵ庰 [ , ] ���� ����
				
				//3-3-d-1) ���� ��� ��ü ����				//������ ���ܰ� ���� ������ try catch�� ����. throws �ᵵ�Ǳ� ��.
					//* �迭�� ��� ��ü ����ó���ϱ� for�� �̿�
					try {	
						//for(Day12_ȸ�����_Member temp : Day12_ȸ�����_Main.members) {
							//if (temp == null) break;  
						//for�� �̿��Ϸ��� ��ü �������⿡�� member�� ��� temp�� �ٲ�ߵ� �׸��� ���� ��� ��ü�� ���� ", true"�����ߵ�
					
					// ���� ��� ��ü
						FileOutputStream fileOutputStream = 
								new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day12/memberlist.txt", true); //true �̾��																
						//3-3-d-2) ��ü �������� [ �ʵ� ���� ]
						String outstring = (member.id+","+member.pw+","+member.name+","+member.phone+"\n"); //�� ���� "\n" ���� 
						fileOutputStream.write(outstring.getBytes()); // ����Ʈ ��ȯ�� ����
						
					}	
					catch(Exception e){
							System.out.println("�˸� : ȸ�� DB ���� ����" + e); 
					}		
	}//sign up ��
	
	
	//getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
