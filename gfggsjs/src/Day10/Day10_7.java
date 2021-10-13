package Day10;

public class Day10_7 {
	public static void main(String[] args) {
		
	
	//����ó�� : 1. �Ϲ� ���� 2. ���� ����
			// ���� : �پ��� ���� �߻��� => ���α׷� ����ȭ
			//*try {}�ȿ��� ���ܰ� �߻��ϸ� catch�� ���� Ŭ���� ��ü�� ���� �߻� ������ �����ϰ� catch����
			//* �� ���ܰ� ���� ��� try{} ������� �� catch{}�� ���� ����.
			// try { ���ܰ� �߻� ���� �ڵ� }
			// catch { ����Ŭ������ ������ ��ü�� ��� �ƹ��ų� } { ���� �߻��� ����Ǵ� �ڵ� }
			// finally {������ ����Ǵ� Ŭ����}
		
			//���� Ŭ����
				//*Exception : ���� ����Ŭ����
				//1. NullPointerException
				//2. ArrayIndexOutOfBoundsException
				//3. NumberFormatException
				//4. -------------------------------���...
		
			//���� ������
				//���� : �޼ҵ� ������ �߻��� ���ܸ� ȣ���� ������ �̵� [ ���� ���ϼ��� ���� ]
		
	//���� �����	
	//��1) p.423
//	String data = "���缮";		
//	//String data = null; 		//String ��ü�� null ���� , ��ü�� ���� ���¿��� ��ü�� ����Ϸ� �ؼ� ���ܹ߻� ����!!
//	System.out.println(data.toString()); // toString() ��ü ���� ��ȯ
	try {
		String data = null;		//String ��ü�� null ����
		System.out.println(data.toString());	//toString() : ��ü ���� ��ȯ
	}catch (NullPointerException e) {
		System.out.println("���ܰ� �߻��߽��ϴ�. [�����ڿ��� ����]");
	}finally {
		System.out.println("** ���ܰ� �ִ� ���� ������ ����Ǵ� ��ġ");
	}
	
	//��2) p.424 	ArrayIndexOutOfBoundsException ���� (�ܿ��ʿ� ����)
//	String [] ���ڿ��迭 = new String [2];
//	���ڿ��迭[0] = "���缮"; ���ڿ��迭[1] = "��ȣ��";	���ڿ��迭[2] = "�ŵ���";	//�����߻�, 2�������ߴµ� 3���� ����־.
	try {
		String [] ���ڿ��迭 = new String [2];
		���ڿ��迭[0] = "���缮"; ���ڿ��迭[1] = "��ȣ��";	���ڿ��迭[2] = "�ŵ���";	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭�� �ڸ��� �����մϴ�. [�����ڿ��� ����]");
		System.out.println("�������� : " + e); //���ܰ� �߻��� �ڵ������� �帧 ���� catch�� �̵�
	}
	
	
	//��3) p.426
	try {
	String data1 = "100";		// "100" => 100 [����]
	String data2 = "a100";		// "a100" => 100 [�Ұ���, a�� ��� �Ұ��� ��������ߵ�]
	System.out.println(Integer.parseInt(data1));
	System.out.println(Integer.parseInt(data2));
	}
	catch(NumberFormatException e) {
		System.out.println("���ڰ� ���Ե� ���ڿ��� ������ ��ȯ�� �Ұ�. [�����ڿ��� ����]");
		System.out.println("�������� : " + e);
	}
//	String data1 = "100";		// "100" => 100 [����]
//	String data2 = "a100";		// "a100" => 100 [�Ұ���, a�� ��� �Ұ��� ��������ߵ�]
//	System.out.println(Integer.parseInt(data1));
//	System.out.println(Integer.parseInt(data2));
		// Integer : ���� ���� Ŭ����
				// .parseInt(����) : ���ڸ� ���������� ��ȯ���ִ� �޼ҵ�
	}
}
