package Day11;

import java.io.IOException;

public class Day11_5_1 {
	
	/*
	 * 2021.10.14. �����˻� ���α׷�
	 * 1. ���� ���� ��� �迭 ����
	 * [4���� ������ �迭�� ���]
	 * 1. �ȴ�! ���̹� ��α� & ����Ʈ
	 * 2. ������ ��Ʈ ���� Ȱ�� ������
	 * 3. Tucker�� Go ��� ���α׷���
	 * 4. ȥ�� �����ϴ� C���
	 * 	1-1. scanner �� System.in.read() ���
	 * 	2. �˻���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ�
	 * 	3. ������� : ������ ������ �Է¹޾� ���� �� ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü
	 */
	
	public static void main(String[] args) throws IOException {
		// 0. �غ� 
		String [] ������� = {"�ȴ�! ���̹� ��α� & ����Ʈ", "������ ��Ʈ ����Ȱ�� ������",
	             "Tucker�� Go ��� ���α׷���", "ȥ�� �����ϴ� C���"};
	       
	       // Ű����κ��� ����Ʈ�� �о�ö� /r/n ���� 
	       
		// �޴�
	       while(true) {
	          System.out.println("1. �˻� | 2. ����");
	          
	          byte[] b = new byte[100];  // Ű����κ��� ���� ����Ʈ �迭 ����
	       // �Է�[Ű����=����Ʈ] �ޱ� �� ����Ʈ �迭 // �˳��� 100 ����Ʈ[�����̸� 1����Ʈ, �ѱ��̸� 2����Ʈ]
	          int count = System.in.read(b); // 1. ������ ���� �߻�[1. ������, 2. try]
	             
	          	// �Է¹��ڼ� + 2[\n , \r ]
	            // Ű����κ��� ����Ʈ�� �޾� �迭�� ����
	          String ch = new String(b ,0, count-2); // ����Ʈ �� ���ڿ�
	                         // 0���� �Է��� ���ڼ����� ��ȯ
	          				// 100����Ʈ ��� ���ڿ� ��ȯ
	          
	          if(ch.equals("1")) { // equals : ������ ��� ��ġ���� ���
	             System.out.println("�˻� ���� : "); 
	             int count2 = System.in.read(b);
	                // �Է¹��ڼ� + 2[\n , \r ]
	                // Ű����κ��� ����Ʈ�� �޾� �迭�� ����
	             String book = new String(b , 0 , count2-2); // ����Ʈ �� ���ڿ�
	                            // 0���� �Է��� ���ڼ����� ��ȯ
	             // �����˻�[å��=�迭] => ��� å�� �˻� => for
	             for(int i = 0 ; i<�������.length; i++) {
	                if(�������[i].contains(book)) { // contains �������� ���Ե� ���
	                  System.out.println(i + "��  " + �������[i]); 
	                }
	             }
	          } else if(ch.equals("2") ) {
	             System.out.println("�˻� ���� : "); 
	             int count2 = System.in.read(b);
	                // �Է¹��ڼ� + 2[\n , \r ]
	                // Ű����κ��� ����Ʈ�� �޾� �迭�� ����
	             String book = new String(b , 0 , count2-2); // ����Ʈ �� ���ڿ�
	                            // 0���� �Է��� ���ڼ����� ��ȯ
	             // �����˻�[å��=�迭] �� ��� å�� �˻� �� for
	             for(int i = 0 ; i<�������.length; i++) {
	                if(�������[i].contains(book)) {
	                  System.out.println(i + "��  " + �������[i]); 
	                }
	             }
	             
	             // ������ ������ȣ [ �ε��� ]  e
	             System.out.println("���� �� ������ȣ : "); 

	             int count3 = System.in.read(b);
	             int index = Integer.parseInt(new String(b , 0 , count3-2));
	             
	             System.out.println("������ ���� : ");
	             count3 = System.in.read(b);
	             String oldbook = new String(b , 0 , count3-2); // ����Ʈ �� ���ڿ�
	             
	             System.out.println("���ο� ���� : ");
	             count3 = System.in.read(b);
	             String newbook = new String(b , 0 , count3-2); // ����Ʈ �� ���ڿ�
	             
	             // ġȯ(replace)
	             �������[index] = �������[index].replace(oldbook, newbook);
	          }
	       }
	}
}

/*
 * �� �߿� ���
 * �Է� �ޱ�[Ű����=����Ʈ] �ޱ�
 * �Է¹��ڼ� + 2 [\n, \r ]
 * 
 */