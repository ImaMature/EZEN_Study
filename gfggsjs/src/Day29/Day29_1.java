package Day29;

import java.net.InetAddress;

public class Day29_1 {

	//��Ʈ��ũ�� ���� ����
		//��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ� ��
		//��Ÿ� : ���� ��ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ� �̻��� ���� �ǹ�
		
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
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
