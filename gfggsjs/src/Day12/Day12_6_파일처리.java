package Day12;

import java.io.FileOutputStream;

public class Day12_6_����ó�� {
	//���� ó��
	
	//�޸� [�ֱ����ġ = RAM] : ����, �迭, ��ü ��� : ���α׷� ����� �� �ʱ�ȭ��
		// �ֱ����ġ�� ���� : ���� �������� ���α׷� [ ��ɾ� ���� ] ���
			// ���� X ���� X => �ֹ߼� �޸�
		// ���������ġ : [USB, ����, DB, HDD ���]
			// ���� X ���� O => ���ֹ߼� �޸�
			// �ڹ� -> ���������ġ -> �ܺ� ��Ʈ��
	
	//���� <----- ��Ʈ��(���� : ����Ʈ ------> �ڹ����α׷�
	public static void main(String[] args) throws Exception {
		
		//����ó�� Ŭ����
			//1. FileOutputStream : ������� ��Ʈ�� (�׳� �ܿ��)
		FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt"); //�ش��ο� ���ڿ��� �� txt���� ������, �����߸� C����̺꿡 java���� �����س��� ����
			// ����� ���õ� Ŭ���� => ����ó�� �߻� Ȯ�� ����
		String ���ڿ� = "��Ŭ�������� �ۼ��� �����Դϴ�.";
		fileOutputStream.write(���ڿ�.getBytes());
	} //main end	
}//class end
