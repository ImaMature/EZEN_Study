package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_����1_Ǯ�� {

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
		//0. ����Ʈ ��ü�� Interger ��ü���� ����
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			//////////////////////////////////////////////////////////
			System.out.println("=-----------�����Ȳ------------=");
			for(int i =0; i<list.size(); i++) {
				System.out.println("����ȣ" + (i+1)+"��" +" �ο� :" + list.get(i));
			}
			
			System.out.println("--------------------------");
			System.out.println("[[����� ���α׷��Դϴ�.]]");
			System.out.println("[[1.��� �߰� | 2. ��� ��� | 3. ��� ����]]");
			System.out.print("���ڸ� �Է��� �����Ͽ� �ּ��� > : "); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("--------------------------");
				System.out.println("[[��� �߰� �޴��Դϴ�.]]");
				System.out.print("�ο� ���� �Է����ּ���. > : "); int count = scanner.nextInt();
				System.out.println("�߰��� �ο� ���� "+count+"�� �Դϴ�.");
				//����
						list.add(count);
						System.out.println("������ ����ȣ : " + list.size());
						
					}
			}else if(ch==2) {
				System.out.println("--------------------------");
				System.out.println("[[��� ��� �޴��Դϴ�.]]");
				System.out.print("����� ����ȣ�� �Է����ּ���. > : "); int num = scanner.nextInt();
				//����
				list.remove(num-1); // -1�� ��� ���� [ ����ȣ�� 1����//�ε��� 0����)
				System.out.println("**��ҵǾ����ϴ�.");
				}
			}else if(ch==3) {
				System.out.println("--------------------------");
				System.out.println("[[��� ���� �޴��Դϴ�.]]");
				System.out.println("--------------------------");
				System.out.println("������ ����ȣ�� �Է����ּ���. > : "); int ch3 = scanner.nextInt();
				if(list.isEmpty()) {
					System.out.println("�˼��մϴ�. ����� ����ֽ��ϴ�.");
					
				}else {
					System.out.println("����ȣ 1�� ����");
					list.remove(0); //����ȣ1������
			}
		}//while end
	}//main end
}//class end

