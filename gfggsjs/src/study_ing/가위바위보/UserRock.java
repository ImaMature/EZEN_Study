package study_ing.����������;

import java.util.Random;

public class UserRock extends Main_menu{
	
	//Main_menu�� �����ڸ� �����ϸ� UserRock�� ���� ���� ����
	
	

	public static void rock() {
		// ������ ���� ����
		System.out.println("���� ���� : ����");
		// ��ǻ�� ���� ���� ���? // �� ����� �ȳ��� ������� ������
		Random random = new Random();	//��ǻ�Ͱ� �� �� �޼ҵ� �����غ���
		int computer = random.nextInt(3);
		System.out.println("��ǻ�Ͱ� �� �� : " + computer); //���� ���� ���
		gameCount++;
	}

}
