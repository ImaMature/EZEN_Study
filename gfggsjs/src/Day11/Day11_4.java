package Day11;

import java.io.IOException;

public class Day11_4 {//class start
	//p.496
	public static void main(String[] args) throws IOException {//main start
		
		//String Ŭ����
			//1. String ������ : ����Ʈ�� ���ڿ��� ��ȯ
		
		//Ű����κ��� ���ڿ� �޾ƿ��� ����
			//Ű���� �Է�(a) => �Է°�(a) [ ����Ʈ�� �Էµ� ] => ����Ʈ(����) => ���ڿ� ��ȯ(a)
			// 						||(���Ʒ� ���� ����)
			//Ű���� [����Ʈ] �Է� => �Է½�Ʈ�� => �ڹ����α׷�
		
		//p.497
			//1_ ����Ʈ �迭�� ���� ����
			byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
					//�����ڵ�: H   e    l    l    o  sp(����)    j   a    v    a
			
			//2_ ����Ʈ �迭�� String �����ڿ� �ֱ�
			String str1 = new String(bytes);
			System.out.println(str1); // Hello java
			
			//3_							//s(start), c(count)
			String str2 = new String (bytes, 6, 4);
			System.out.println(str2);
			
		//p.498
			//1. ����Ʈ 100���� ������ �� �ִ� �迭
			byte[] bytes2 = new byte[100];
			
			System.out.print("�Է� : ");
			//System.in.read();	// ������ ����ó�� //����� ���� �׻� ���� ó�� �߻�
			int readcount = System.in.read(bytes2); 
			
			//System.in.read(�迭��) : Ű����κ��� �о�� ����Ʈ�� �迭�� ����
			System.out.println(new String (bytes2, 0, readcount-2)); //scanner���� read�� ����2�� ��ƾߵ�
										//����Ʈ�� -> ���ڿ� ��ȯ
			
		
		//p. 499
			//���� ����(chartAt())
			String ssn = "010624-1230123";
			char sex = ssn.charAt(7); //���ڿ����� �ε����� ������. ���⼭�� 1
			//�ε����� ������ �ش���ġ�� �ִ� ���ڿ��� ���´�.
			switch (sex) {
			case '1':
			case '3':
				System.out.println("���� �Դϴ�."); break; //switch������ break�߿�.
			case '2':
			case '4':	
				System.out.println("���� �Դϴ�."); break;
			}
			
		//p. 500
			//���ڿ� ��
				//���ڿ� ���� �� '=='�����ڸ� ����ϸ� ������ �ʴ� ����� ���� �� �ִ�.
			String strVar1 = new String ("�Ź�ö") ;
			String strVar2 = "�Ź�ö";
			String strVar3 = "�Ź�ö";
			
			//�Ұ�
			if(strVar1 == strVar2) {System.out.println("1����");}
			else {System.out.println("1�ٸ���");} 
			// ��°� �ٸ���. strVar1�� new�����ڷ� ������ �ٸ� String��ü�� �����ؼ� �ٸ� ���޸𸮿� ����Ǿ������Ƿ� �ּҰ��� �ٸ���.
			// ==�����ڴ� ������ ����� ������ ���ϱ� ������ �̷��� ����� ����.
			
			
			//����
			if(strVar1.equals(strVar2)) {System.out.println("2����.");}
			else {System.out.println("2�ٸ���.");}
			
		//p.502
			//4. getBytes() : ���ڿ��� ����Ʈ���� ��ȯ
			String str = "�ȳ��ϼ���"; // �ѱ��� 1���� 2����Ʈ, ����� 1���� 1����Ʈ
			
			byte[] bytes3 = str.getBytes(); //String�� ����Ʈ�� ��ȯ
			System.out.println(bytes3.length); // ���ڼ�*2����Ʈ = 10����Ʈ
			
			//�ݴ�� ����Ʈ ---> ���ڿ�
			System.out.println(new String(bytes3));
			
				//���ڵ� ����
					//1. UTF-8 : ������ �����
					//2. EUC-KR [CP-949] : ����, �ѱ�
			
		//p.504
			// indexOf() : ���ڿ� ã�� [ �μ� : ã�� ���ڿ� / ��ȯ : ã�� �ε����� ��ġ / ã�� �� ������ : -1 ]
			String subject = "�ڹ� ���α׷���";
			System.out.println(subject.indexOf("���α׷���")); // ��°� : 3
			//���α׷��� ���ڿ��� �ε�����ġ�� 3�̶� 3���
			
			if(subject.indexOf("�ڹ�") != -1) { //"�ڹ�"��� ���ڿ��� subject��ü�� ���� �ʴٸ�(�ִٸ�).
									//�ε����� -1 = �ε����� ����.
				System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
			}
			else {System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
			}
		
		//p.505
			//length() : ���ڿ��� ����
			System.out.println(subject.length());	//8ĭ(��������) : �ε��� 0~7
			
	}//main end
}//class end
