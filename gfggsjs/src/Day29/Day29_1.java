package Day29;

import java.net.InetAddress;

public class Day29_1 {

	//��Ʈ��ũ�� ���� ����
		//��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ� ��
		//��Ÿ� : ���� ��ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ� �̻��� ���� �ǹ�
		//TCP/IP
		//��ǻ�� ������ ��� ǥ�� �� ��Ʈ��ũ�� ����� �� ��ȣ���ῡ ���� �ڼ��� ��Ģ�������ϴ� �������� ����Ʈ, ���ͳݿ��� �������ϰ� ���.
		//��Ʈ��ũ�� �����ϴ� �ڼ��� ��Ģ
			//TCP : �������, �� ��ǻ�� ���� ���� ����
			//IP : ��� ��ġ���� ���θ� �ν��ϰ� ����� �ϱ� ���� ����ϴ� Ư���� ��ȣ
//		���ּ� (�� 1�� -> 1�� �ּ�) : ��ǻ�� �ּ� (��ǻ�� 1�� -> 1�� IP)
//		�ù� (���� -> �� )         : ��� (PC�� -> �п�)  
//		���̹����� (�п� ip ---> ���̹� ip ������)
//		ip : ���� 0~255, 4�ڸ�, ����
//		ip�� ����� ����Ʈ���� �ܿ�� ����� ������ ���ڷ� ��ȯ
//		ip ---> ���� : ������ �ּ�(DNS) 
//		���� IPȮ�ι�
//		CMD -> ipconfig 
//		JAVA -> InetAddress Ŭ���� ���
//	
//	
	public static void main(String[] args) {
		//1. ���� pc�� ȣ��Ʈ ��������
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();//������ ����ó��
			System.out.println("���� pc�� ������ü : " + inetAddress);
			System.out.println("���� pc�� �̸� : " + inetAddress.getHostName());
			System.out.println("���� pc�� �ּ� : " + inetAddress.getHostAddress());
		//2. ���̹� ȸ���� ȣ��Ʈ ��������
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� ȸ���� ������ü : " + inetAddress2);
			System.out.println("���̹� ȸ���� �̸� : " + inetAddress2.getHostName());
			System.out.println("���̹� ȸ���� �ּ� : " + inetAddress2.getHostAddress());
		//3. ���̹� ȸ���� �ټ� IP Ȯ��
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress address : inetAddresses) {
				System.out.println("���̹� �迭 �� PC �̸� : " + address.getHostName());
				System.out.println("���̹� �迭 �� PC �ּ� : " + address.getHostAddress());
			}
		//4. ���̽��� ȸ���� IP Ȯ��	
			InetAddress inetAddress3 = InetAddress.getByName("www.facebook.com");
			System.out.println("���̽��� pc�� ������ü : " + inetAddress3);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
