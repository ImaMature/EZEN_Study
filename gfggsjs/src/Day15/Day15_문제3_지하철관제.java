package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_����3_����ö���� {

/*	[����1] �� 4�� (������ -> ��� -> ���� -> ���� -> ������)
 * 	[����2] ��ö 3�� ��ü [���������� 3�� ��ö ���]
 *  [����3] ��� ��ȣ �޾Ƽ� �ش翪���� ����ؼ� ���������� ����
 *  [����4] �� �� �ҿ�ð� 2��
 *  [����5] queue�� �̿��ϱ�
 *  
 *  ��߽�ȣ �޴�
 *  1. ���� 2. ��� 3. ���� 4. ����
 *  
 *  [����]	1�� ���ý� �������� ���� ���� ��ö�� ���������� �̵�
 *  [����2]	���� �ش翪�� ��ö�� ������ ���� ���
 *  
 *  [����]
 *  ----- �� ��ö�� ��Ȳ -----
 *  ������ : ��ö3, ��ö4
 *  ��꿪 : ��ö2
 *  ���￪ : ��ö1
 *  ���ο� : ��öX
 *  ---------��� ��ȣ--------
 *  1.���� 2.��� 3.���� 4.����
 */
	
	
	//��ü���� ���ϰ� �� Ŭ������ �� ������������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Train> ������ = new LinkedList<>();
		Queue<Train> ��꿪 = new LinkedList<>();
		Queue<Train> ���￪ = new LinkedList<>();
		Queue<Train> ���ο� = new LinkedList<>();
	
		
		while(true) {
		
		
		System.out.println("1.���� | 2.��� | 3.���� | 4.����"); int ch = sc.nextInt();
		//��ü �ֱ�
		
		������.offer(new Train("a1")); // ��ö�� �� ���������
		������.offer(new Train("b1"));
		������.offer(new Train("c1"));
	
		
	
			if(ch==1) {
				System.out.println("������");
				
				try {
					Thread.sleep(2000);
					��꿪.offer(������.poll());
					System.out.println("�� ��ö ��Ȳ : "+ ������.peek());
					System.out.println("������� ����մϴ�.");
				} catch (InterruptedException e) {
					
					
				}
				
				
			}
			if(ch==2) {
				System.out.println("��꿪");
				
				try {
					Thread.sleep(2000);
					������.offer(��꿪.poll());
					System.out.println("�� ��ö ��Ȳ : " + ��꿪.peek());
					System.out.println("���￪���� ����մϴ�.");
				} catch (InterruptedException e) {
					
				}
				
			}
			if(ch==3) {
				System.out.println("���￪");
				
				try {
					Thread.sleep(2000);
					��꿪.offer(���￪.poll());
					System.out.println("�� ��ö ��Ȳ : "+ ���￪.peek());
					System.out.println("���ο����� ����մϴ�.");
				} catch (InterruptedException e) {
					
				}
				
			}
			if(ch==4) {
				System.out.println("���ο�");
				
				try {
					Thread.sleep(2000);
					���￪.offer(������.poll());
					System.out.println("�� ��ö ��Ȳ : "+ ������.peek());
					System.out.println("���������� ����մϴ�.");
				} catch (InterruptedException e) {
				
				}
				
			}
		}
	}
}
