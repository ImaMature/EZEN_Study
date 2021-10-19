package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ���� {
	//ȸ���� ���α׷� //�ݿ�� //list
	
		//1. ����Ʈ(list)�� �̿��� ȸ������, �α���, ȸ������, ȸ��Ż��
	public static void main(String[] args) {
	
		//0. ���� [�Է°�ü]
		Scanner scanner = new Scanner(System.in);
		//0-1. ���� [����Ʈ ����] User Ŭ������ ���� �� �ִ� Ŭ���� (User Ŭ������ ������ ����)
		ArrayList<User> users = new ArrayList<>(); //Ŭ���� ������ ���� users �ӽð�ü ����
		//0-2. [���� �о���� : ���Ͽ� �ִ� ȸ������ ����Ʈ�� ����]
			//����ó��
		try{
			FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); //, true �� �ʿ�X
		
		
			//0-2-1. ���ϳ� ��� ���� �������� [ ��Ʈ�� ���� : byte ]
					//1) ����Ʈ �迭 ������� �ؾ���
					byte[] bytes = new byte[1024]; // 1bit -> 8bit -> 1byte -> 1024byte - > 1kb -> 1024kb -> 1mb
								//����, Ư������, ���� 1����Ʈ		//�ѱ� 2����Ʈ
					//2) �о����
					fileInputStream.read(bytes);
					//3) ����Ʈ -> ���ڿ� ��ȯ
					String inString = new String(bytes);
					
			//0-2-2. ȸ�� �����ϱ� //split (����) �и� -> �迭
					String [] usernum = inString.split("\n");
			//0.2-3. �ʵ� �����ϱ� //�ݺ��� ���
					for(String temp: usernum) {
						
						String[] userdata = temp.split(","); //userdata�� ����Ǿ��ִ� ������" ," ���� ����
						
						if(userdata.length==1) break; //������ ȸ���� ����ȸ���̶� 1������ ����
						//0-2-4. ��ü ����
						User user = new User(userdata[0] , userdata[1] , userdata[2]);
						//0-2-5. ����Ʈ ���
						users.add(user);
					}
		}
		catch(Exception e) {
			System.out.println("[[���� �ҷ����� ���� ]]");
		}
		
		
		//1.�޴�
		while(true) {
			System.out.println("1. ȸ������ | 2. �α���");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				System.out.println("���� : ");		String name = scanner.next();
				
				//2. �Է¹��� �����͸� ��üȭ [user ��ü �ε��� �ϳ��� id, pw, name �� ���� ] 
											//[3���� �������� �ϳ���]
				User user = new User(id, pw, name);
			
				//*���̵� �ߺ�üũ [����Ʈ �� ��ü �ϳ��� temp�� ���� ]
				boolean idcheck = true;
				for(User temp : users) { //temp �ӽð�ü ����
					if(temp.getId().equals(id)) {
						System.out.println("[[�ߺ��� ���̵� �Դϴ�.]]");
						idcheck = false; break;
					}
				}
				//3. ����Ʈ�� ���� [ ���࿡ �ߺ����� ������ ]
				if(idcheck) {users.add(user); System.out.println("[[ȸ������ ����]]");// if �ȿ� �����ݷ� �ϳ��� �׷��� {}��ŵ����, �ΰ� �̻��̸� {} �ʼ�
				
				//4. ����ó��
					//1. ���� ��� Ŭ���� (FileOutputStream fileOutputStream = new FileOutputStream("���ϰ��/���ϸ�.Ȯ����") �� �������� ���
							//�̾�� �Ϸ��� Ȯ���� �ڿ� , true
							//����ó�� �ʼ�
						try {
							FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt", true);
																																		//������ �ǵڿ� true
							//2.�ʵ尪 ���� [,]					//ȸ���� ����					[\n]
							String outString = user.getId()+", "+user.getPassword()+", "+user.getName()+"\n"; //��ǥ�� �齽���� n�� ȸ�������� �� ���Ƴ��ߵ�
							//3. String ---> byte ��������
							fileOutputStream.write(outString.getBytes()); //����Ʈ ����ȯ �� �ʿ�.
							
							System.out.println("[[���� ó�� ����]]");
							
							
						} catch (Exception e) {
							System.out.println("[[���� ó�� ����]]");
						}
				
				}
			}else if(ch==2) {
				//1. �Է¹ޱ�
				System.out.println("���̵� : ");		String id = scanner.next(); 
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				
				//2. ����Ʈ�� ��ü�� ���ϱ�
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPassword().equals(pw)) { //getID, getPassword : ��Ŭ������ �ִ� �޼ҵ�
						System.out.println("�α��� ����");
						logincheck = false; 
						
						////////////////////////////////�α��� ������////////////////////////////////
						System.out.println("1. ȸ������ | 2. ȸ������ | 3. ȸ��Ż�� | 4. �α׾ƿ�");
						int ch2 = scanner.nextInt();
						if(ch2==1) {
							System.out.println("���̵� : " + temp.getId());
							System.out.println("���� : " + temp.getName());
						}
						else if(ch2==2) {
							//1. ������ ���� �Է�
							System.out.println("������ ���� : "); String newName = scanner.next();
							//2. set �޼ҵ带 ���� �ʵ� �� ����
							temp.setName(newName); // ������ ����� �̸��� �Է¹��� �̸����� ����
							//3. ���� ������Ʈ ó�� (�޼ҵ�� ó���ϱ� ���� �ȹ��)
								//1) ����Ʈ �� ��� ȸ�� ���� [ ������Ʈ ] 
							try {
									// 1-1)���� ��� ��ü ���� [ ���ϰ�� ]
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); 
								//���ξ��⸦ �ؾߵż� ���� true ���ߵ�
								
									// 1-2) ��� ȸ���� ���� ����
								String outString = ""; // ��� ȸ���� ������ ���� ���ڿ�
								for(User temp2 : users) {
									// ȸ�� �з�
									String outTemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									// �з��� ������ ��� ȸ�� ���ڿ��� �߰�
									outString += outTemp;
								}
								// ��� ȸ�� ��������
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) { //Exception �̾�ߵ�
								
							}
						}
						else if(ch2==3) {
							//1. ����Ʈ���� ��ü ����
							users.remove(temp);
							System.out.println("[[ȸ��Ż�� : �α׾ƿ�]]");
							//���� ������Ʈ ó�� (�޼ҵ�ȭ �غ���)
							try {
								// 1-1)���� ��� ��ü ���� [ ���ϰ�� ]
							FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/EZEN_Study/gfggsjs/src/Day14/userlist.txt"); 
							//���ξ��⸦ �ؾߵż� ���� true ���ߵ�
							
								// 1-2) ��� ȸ���� ���� ����
							String outString = ""; // ��� ȸ���� ������ ���� ���ڿ�
							for(User temp2 : users) {
								// ȸ�� �з�
								String outTemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
								// �з��� ������ ��� ȸ�� ���ڿ��� �߰�
								outString += outTemp;
							}
							// ��� ȸ�� ��������
							fileOutputStream.write(outString.getBytes());
						} catch (Exception e) { //Exception �̾�ߵ�
							
						}
							break; // ȸ��Ż���ϰ� ùȭ������
						}
						else if(ch2==4) {
							System.out.println("[[�α׾ƿ�]]"); break; //�α׾ƿ�
						}
						break;//
					}
				}
				if(logincheck) {System.out.println("[[������ ȸ�� ������ �����ϴ�.]]");}
			}
		}//while end
	}//main end
}//class end
