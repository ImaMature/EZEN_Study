package works;

public class library {

	// 1. �޴� => while ���ѷ���
	// 2. �Է¹ޱ� : 1. Scanner ��ü  2. System.in.read()
	// 3. ���θ޴� ���� 
	
//	���� �˻� ���α׷�
//	1.���� : ������� �迭 ���� 
//		[ 4���� ������ �迭�� ��� ]
//		1. �ȴ�! ���̹� ��α�&����Ʈ
//		2. ������ ��Ʈ ���� Ȱ�� ������
//		3. Tucker�� Go ��� ���α׷���
//		4. ȥ�� �����ϴ� C ���
//
//	2. Scanner -> System.in.read()
//
//	3.�˻���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ���
//	4.������� : ������ ������ �Է¹޾� ������ ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü
//
//	String[] ������� = {	
//			"�ȴ�! ���̹� ��α�&����Ʈ",
//			"������ ��Ʈ ���� Ȱ�� ������",
//			"Tucker�� Go ��� ���α׷���",
//			"ȥ�� �����ϴ� C ���"
//	};
	
	
	public static void main(String[] args) { //���� �޼ҵ�
		
		String[] ������� = {	
				"�ȴ�! ���̹� ��α�&����Ʈ",
				"������ ��Ʈ ���� Ȱ�� ������",
				"Tucker�� Go ��� ���α׷���",
				"ȥ�� �����ϴ� C ���"
		}; //��������� ��� String �迭 ����
		
		while(true) { // �ݺ��� ����
			try {
				System.out.println("===== ���� �˻�/���� ���α׷� ====="); // 
				System.out.println("1. �˻��ϱ� | 2. �����ϱ�");	
				byte [] a = new byte [50]; // ����Ʈ �迭 ���� 25�ڱ��� �Է°����մϴ�.
//				int ch = System.in.read(1);  //system.in.read()�� ���ڿ��� �޾��ִ� �޼ҵ�, �׷��� read(1)�� �� �� �����ϴ�.
//				int ch = System.in.read(); // 49 = �ƽ�Ű�ڵ尡 ���ͼ� int������ �����ؾ��մϴ�.
				int ch = System.in.read(a); //�Է°�ü ���� 50����Ʈ���� �Է� ���� �װ��� ch�� �����߽��ϴ�.
				String strCh = new String(a,0,ch-2); //String������ �ٲ��ݴϴ�. ����Ʈ �迭��ŭ, 0��° �ε���, /r�� /n�� ���ߵǱ� ������ ch-2�� �ؾ��մϴ�.
//				System.out.println(strCh); // strCh�� Ȯ���ϴ� ����. //�Է��� �� �״�� ���ɴϴ�.
//				break;//�ݺ������ҷ��� �ӽ÷� ������ �̴ϴ�. ������ �����մϴ�.
				if(strCh.equals("1")) { //strCh�� ���� 1�� ���ٸ�
					System.out.println("[�˻��ϱ� �������� �Ѿ�ϴ�.]");
					System.out.print("�ʿ��� ������ �˻��� �ּ���. : ");
					ch = System.in.read(a); //����Ʈ�迭���� �Է¹޾� ch�� ����. 
					String strCh2 = new String(a,0 ,ch-2); //�Է¹��� ������ stringȭ strCh2�� �����, �迭��ŭ, 0��° �ε���, /r/n
					for(int i =0; i<�������.length; i++) { //������� �迭�� ���̸�ŭ �ݺ����� �����ϴ�. ������� �迭�� �ִ� å�� ã�� ���ؼ��Դϴ�..
						if(�������[i].contains(strCh2)) { //�Է¹��� ������ ��������� i��° �ε��� ������ ��ġ�Ѵٸ�
							System.out.println( (i+1)+"���� �ش� ���� "+�������[i]+"��(��) �����մϴ�."); 
							// i��° ��������� ����մϴ�. �ε����� 0���� �����ؼ� i+1������ ���߽��ϴ�.
						}
//						else if(!�������[i].contains(strCh2)) {
//							System.out.println("�˼��մϴ�. ���� ��Ͽ� �˻��Ͻ� ������ �������� �ʽ��ϴ�.");
//							break;
//						} �˻��� ������ String �迭 �� �����ص� �ٸ� �ε������� ������ ���ٰ� ���� ���� ���ƾ� �� �� �����ϴ�.
					}
					
				}else if (strCh.equals("2")) { 
					System.out.println("[�����ϱ� �������� �Ѿ�ϴ�.]");
					System.out.print("������ ���� ��ȣ�� �˻��� �ּ���. : ");
					ch = System.in.read(a);// ����Ʈ�迭���� �Է¹޾� ch�� ����
					//4���� �Է��ϸ� �ε����� 3 �׷��� ch-1�� �ϸ� null���� ��ϴ�.
					String str = new String (a,0,ch-2); //int�� ����ȯ�� �ϱ� ���ؼ� Stringȭ �߽��ϴ�.
					System.out.println(str);
					int strCh3 = Integer.parseInt(str); //�Է¹��� ������ int�� ����ȯ
					//������ ���� �Է¹ޱ�
					System.out.println("���� ������ �� ������ ���ϴ� ������ �Է��� �ֽʽÿ�. : ");
					int txt = System.in.read(a); // �ٲٱ� ���ϴ� ���ڸ� �Է¹޽��ϴ�.
					String origintxt = new String (a, 0, txt-2);
					
					System.out.println("���� �ٲ� ������ �Է��� �ֽʽÿ�. : ");
					int txt2 = System.in.read(a); // ���� �ٲ� ���ڸ� �Է¹޽��ϴ�.
					String replacetxt = new String(a,0,txt2-2);
					String rs = �������[strCh3-1].replace(origintxt, replacetxt); 
					// �Է¹��� ��ȣ �ε����� �ؽ�Ʈ�� ġȯ�մϴ�. ���� �˻� ����� �ε���+1���̶� �ε���-1�� ���־����ϴ�.
					System.out.println(rs.toString());	//�ּҰ��� ���ñ�� tostring���� ���� Stringȭ �߽��ϴ�.
//					System.out.println(strCh3);
//					System.out.println(�������[strCh3]);
					
				}
			} catch (Exception e) { //����ó��
				System.out.println(e.getMessage()); //���� ���
			}
		
		}	
	}
}
