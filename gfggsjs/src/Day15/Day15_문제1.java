package Day15;

import java.util.LinkedList;
import java.util.Scanner;

public class Day15_����1 {

	/* 
	 * ����1. list �÷��� �̿�
	 * 		* ����� ���α׷�
	 * 			[�޴�]		1. ��� �߰� (�ο� �� �Է¹޾� ����ȣ ��ȯ)	
	 * 						2. ��� ��� (����ȣ �Է¹޾� ��� ���)
	 * 						3. ��� ���� (���1������ ����, ���� ���ٰ� �ϱ�)[������]
	 * 
	 * 
	 * 
	 * ����2. set�÷���
	 * 		�ζ� ���α׷� 
	 * 			1. 6�� ���� �Է¹޾Ƽ� set �÷��ǿ� ������ ���
	 * 			2. �ߺ��� ��� X
	 */
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//0. ����Ʈ���
		LinkedList<People> list1 = new LinkedList<>();
		while(true) {
			System.out.println("--------------------------");
			System.out.println("[[����� ���α׷��Դϴ�.]]");
			System.out.println("[[1.��� �߰� | 2. ��� ��� | 3. ��� ����]]");
			System.out.print("���ڸ� �Է��� �����Ͽ� �ּ��� > : "); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("--------------------------");
				System.out.println("[[��� �߰� �޴��Դϴ�.]]");
				System.out.print("�ο� ���� �Է����ּ���. > : "); int insertN = scanner.nextInt();
				System.out.println("�߰��� �ο� ���� "+insertN+"�� �Դϴ�.");
					for(People temp : list1) {
						
						list1.add(new People(insertN));
						
						System.out.println("��ȣ : " + temp.getPeopleN()); 
						
					}
			} if(ch==2) {
				System.out.println("--------------------------");
				System.out.println("[[��� ��� �޴��Դϴ�.]]");
				System.out.print("����� ����ȣ�� �Է����ּ���. > : "); int ch2 = scanner.nextInt();
				if(!list1.isEmpty()) {
				list1.remove(new People(ch2));
				}else {
					System.out.println("�˼��մϴ�. ����� ����ֽ��ϴ�.");
				}
			} if(ch==3) {
				System.out.println("--------------------------");
				System.out.println("[[��� ���� �޴��Դϴ�.]]");
				System.out.println("--------------------------");
				System.out.println("������ ����ȣ�� �Է����ּ���. > : "); int ch3 = scanner.nextInt();
				if(list1.isEmpty()) {
					System.out.println("�˼��մϴ�. ����� ����ֽ��ϴ�.");
				}
				
			}
		}//while end
	}//main end
}//class end
