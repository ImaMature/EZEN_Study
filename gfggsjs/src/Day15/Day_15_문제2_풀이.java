package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day_15_����2_Ǯ�� {

	//����2 : set �÷���
	// * �ζ� ���α׷�
	// 1. 6�� �Է¹޾� set�÷��ǿ� �����Ͽ� 
	// [ ���� ] �ߺ��� ���X
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.println("1~45 ���� ���� ( �ߺ� �Ұ� ) : ");
			int num = sc.nextInt();
			
			if(num < 1 || num > 45) {
				System.out.println("������ �� ���� �����Դϴ�.");
			}
			else{
				//�ߺ�Ȯ��
				if(set.contains(num)) {
					System.out.println("**�ߺ���ȣ �Դϴ�.");
				}else {
					set.add(num); // ����
					System.out.println("Ȯ�� : " + set); // Ȯ���ϱ�
				}
			}
			//���ѷ��� ������ ���� : 6���� ���� �Է�
			if(set.size()==6) break;
		}
	}
}
