package Day13;

import java.util.Scanner;

public class Day13_��������2 {

//	����2 ���ѷ��� �޴�
//
//	1.�������
//	2.��ȭ���
//
//	[����1] 1�� ���ý� 1�ʰ������� ������� ���
//	[����2] 2�� ���ý� 1�ʰ������� ��ȭ��� ���
//	[����3] ����,��ȭ�� ������ ��ȣ�� �ٽ� �����ϸ� ��� ���� [����������]
//	ex) 1�������� ���ǽ���, ������ �ٽ� 1�������� ����.
//
//��� ��) 
//1 �� ������? 
//�������
//�������
//   .
//   . 
//   .
//�������
//Music, Movie Ŭ������ ����	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 
		boolean sw = true; // ���� ��� ���� Ȯ�� ����
		boolean sw2 = true; // true��� �������� //false�̸� ����
		
		while(true) { // ���ѷ���
			 
			System.out.println("1. ������� | 2. ��ȭ���"); 
			int ch = sc.nextInt();
			
			if (ch == 1) { // 1�� ������ ��
				Thread thread= new Music(); // MuzikŬ������ ������ ������
				
				if(sw) {
					Music.musicStop(sw);
					thread.start();
					sw = false; // �ѹ� �����ϸ� run�� ���鼭 �������� sw = false�� �Ǿ��ִ� ����
				}else {
					Music.musicStop(sw); //�ѹ� �� 1������ sw = false���� ���� 
					sw = true;
				}
			 	
			 
			 }
			 
			 else if (ch == 2) { // 2�� ������ ��
				 Thread thread = new Movie(); //������ ���� ��ü ����
				 if(sw2) {
					 Movie.moviestop(sw2);
					 thread.start();
					 sw2=false;
					 
				 }else {
					 Movie.moviestop(sw2);
					 sw2 = true;
				 }
			 }
		}//while end
	}//main end
}//class end
