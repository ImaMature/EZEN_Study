package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

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
			//1. FileOutputStream : ������� ��Ʈ�� (�׳� �ܿ��) [ �ش� ������ ������ ���� ���� ]
					// FileOutputStream ��ü�� = new FileOutputStream("���ϰ��")
						//   "/" : ���
				//1-1) write ( ����Ʈ�� ) : �ش� ���Ͽ� ����
		
				//FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt"); //�ش��ο� ���ڿ��� �� txt���� ������, �����߸� C����̺꿡 java���� �����س��� ����
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/JHD/git/EZEN_Study/gfggsjs/src/Day12/test.txt");// �� ��ũƮ���� Day12��Ű���� test.txt���� ����
					// ����� ���õ� Ŭ���� => ����ó�� �߻� Ȯ�� ����
				String ���ڿ� = "��Ŭ�������� �ۼ��� �����Դϴ�."; // �ѱ� 14�� + ���� 2�� -> 28byte + 2byte -> 30byte
				fileOutputStream.write(���ڿ�.getBytes()); // ���ڿ� -> ����Ʈ (�̷��� ���ϸ� ���Ϳ��� �ν� ����)
		
			//2. FileInputStream : ���� �Է�(��Ŭ���� ����) ��Ʈ��
						//FileInputStream ��ü�� = new FileInputStream("���ϰ��/���ϸ�.Ȯ����");
						// read(����Ʈ�迭) : �ش� ������ ����Ʈ �迭�� �о����
				//FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");//�о� �� ���� ����Ʈ -> ���ڿ� �ʿ�
				FileInputStream fileInputStream = new FileInputStream("C:/Users/JHD/git/EZEN_Study/gfggsjs/src/Day12/test.txt"); // �� ��ũƮ���� Day12��Ű���� �ִ� test.txt����				
				//2-1) �о�� ����Ʈ�� ������ �迭
				byte [] ����Ʈ�迭 = new byte[1024]; //1bit [0,1] -> 8bit [1byte] -> 1024byte [1kb]
				fileInputStream.read(����Ʈ�迭); // ���� �о���� (�� �о��������? byte [] ����Ʈ�迭�� �ڹ� ���̺귯���� read()�޼ҵ忡 �μ��� �޾ƿͼ� ó����)
					//System.in.read(); // Ű���� �о����
					//����Ʈ -> ���ڿ� ����ȯ
				String strRead = new String(����Ʈ�迭);//����Ʈ�迭�� string���� ����ȯ�ؼ� strRead�� ����
				System.out.println("���� ������ ������ : " + strRead); 
				
				/////////////
				//Ű���忡 �Էµ� ������ �޸��忡 ���� ����
				
				Scanner scanner = new Scanner(System.in);
				
				while(true) {
					System.out.println("�޸��� �Է��� ������ : ");
					String outStr = scanner.next();
					outStr = outStr + "\n";
					fileOutputStream.write(outStr.getBytes());
				}
	} //main end	
}//class end
