package Day05;

import java.util.Scanner;

public class Day05_2_ȸ�����湮�� {

	public static void main(String[] args) {
		
		//0. �Է°�ü
		Scanner scanner = new Scanner(System.in); //���ѷ������� ������ �ȵ�
		
		//1. ȸ�� 100��[id,pw] �����ϴ� ���	����
			String [][] ȸ����� = new String[100][2]; // 100�� * 2�� => 200ĭ
		//1-1. �湮�� 100��[contents, writer] �����ϴ� ��� ����
			String [][] �湮�� = new String[100][2];
		
		//2. �޴� => �޴��� ��� �ݺ����� : ���ѷ��� (while)
			while(true) {
				System.out.println("\n\n\t - ȸ���� �湮�� - ");
				System.out.println("-----------------------------------");
				System.out.println(" [[1.ȸ������ 2. �α��� ���� : ");
				int ch = scanner.nextInt();
				
				
				
		//3. �Է¿� ���� �� ����
				switch(ch) {	//if == ��ȣ
					case 1 : 
						System.out.println(" --- ȸ������ ������ --- ");	
						System.out.println("Id : ");		String id = scanner.next();
						System.out.println("Password : ");	String pw = scanner.next();
							
						// id �ߺ�üũ ( �ݺ���, ��� �迭 �� �ε����� �����ؼ� ������ ���̵� �ִ��� üũ )
						boolean idcheck = true; // �ߺ�üũ ����
						for(int i = 0; i<ȸ�����.length; i++) { 	//ȸ�����.length : �迭�� ���α��� => 100
							if ( ȸ�����[i][0] != null && ȸ�����[i][0].equals(id)) {	// i��° id�� �����ϸ�
								System.out.println("[[�˸�]] : �ߺ��� ���̵� �����մϴ�.");
								idcheck = false;
								break; //�ߺ�ã�� for ����
							}
						}

							// �ߺ�üũ ������ true�̸� �迭 �� �� ������ ã�Ƽ� ����
						if(idcheck) {
							for (int i =0; i<ȸ�����.length; i++) {
								if(ȸ�����[i][0] ==null) {
									ȸ�����[i][0] = id; ȸ�����[i][1] = pw;
									System.out.println("[[�˸�]] : ȸ�������� �Ǿ����ϴ�.");
									break; // �����ϱ�, for ����
								}
							}
						}
						
						break;	//break�� �־�� �ؿ� �͵��� �ȳ���
						
					case 2 :
						System.out.println(" --- �α��� ������ --- ");	
						// 1. �Է� -> ����
						System.out.println("���̵� �Է� : ");	String log_id = scanner.next();
						System.out.println("��й�ȣ �Է� : ");	String log_pw = scanner.next();
						// 2. �迭 ������ �Է��� ���̴ٿ� �н����尡 �����ϴ��� => �����ϸ� �α��� ����
							//for ���� �̿��� ��� �ε����� �����ؼ� �ϳ��� ��
						
						boolean loginCheck = true;
						for(int i =0; i<ȸ�����.length; i++) { // for start
						if(ȸ�����[i][0] != null && // ������ �ƴҰ�츦 �Ƚ���� //ȸ�����[i][0] != null
								ȸ�����[i][0].equals(log_id) &&
								ȸ�����[i][1].equals(log_pw)) {
							System.out.println("[[�˸�]] : �α��ο� �����߽��ϴ�.");
							//////////////////////////////�α��� ������ �޴�////////////////////////////////
							while(true) { // ȸ���޴� ���ѷ���
								System.out.println("\n\n\t - ȸ�� �޴� - ");
								System.out.print(" [[1.�湮�� ���� 2. �湮�� Ȯ�� 3. �α׾ƿ� ���� : ");
								int ch2 = scanner.nextInt();
								
								if(ch2==1) {
									System.out.print("�湮�� ���� : ");		String contents = scanner.next(); 
									//.next(); ������ .nextLine();�� ���� �� ���̸� �ϳ��� �ν��ؼ� ������ ��������.
									// �׷��� �� �ܶ��� scanner.nextLine();�� �߰��ϰ� .nextLine();�� ��ߵ�.
										// �����	�湮�� �迭�� ������� ã�Ƽ� ����� �α��ε� ���̵� ����
									for(int j =0; j<�湮��.length; j++) { // i�� ���� �ȵ�. �ֳĸ� i�ȿ� �����ֱ� ������ i�� �ٽ� ���� �ȵ�
										if(�湮��[j][0] == null )// j��° �ε����� ���� ����(null)�̸�
										{�湮��[j][0] = contents;		�湮��[j][1] = log_id;
										System.out.println(">>> �湮�� ���");
										break;
										}
									}
								}	
									
								else if (ch2==2){
									System.out.println("--------- �湮�� ��� ------------");
									System.out.printf("%10s \t %s \n", "�ۼ���", "����");
									// �迭 �� ������ ������ ��� ���� ���
									for(int j = 0; j<�湮��.length; j++) {
										if(�湮��[j][0] == null) {break;}
										
										System.out.printf("%10s \t %s \n",�湮��[j][1], �湮��[j][0]);
														//%s : ���ڿ� �ٹж� %10s = 10ĭ ����, \n �ٹٲ�
									}//for end
								}// else if 2 end
								else if (ch2 ==3) {
									System.out.println("[[�˸�]] : �α׾ƿ� �Ǿ����ϴ�.");
									break;
								}
								else System.out.println("[[�˸�]] : �� �� ���� �ൿ�Դϴ�.");
								
							}
							//////////////////////////////////////////////////////////////////////////
							
							loginCheck = false;
							break;
							} // else ���� ���ٸ� for���� �ɷ��� 100�� ��µ�
						} // for end
						
						if( loginCheck) { System.out.println("[[�˸�]] : �α��� ���� (������ ȸ�������� �����ϴ�.)");}
						break;
						
						
					default :
						System.out.println("[[�˸�]] : �� �� ���� ��ȣ�Դϴ�.");
			} //switch end
		}// while end
	} // main end
} // class end
