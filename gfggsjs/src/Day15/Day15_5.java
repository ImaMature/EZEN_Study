package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day15_5 {

	//�޸� �����ϴ� ��� [ �ڷᱸ�� ]
	
	//���� : [LIFO : ���Լ���] : ���߿� ���� ��ü�� ���� ����  
		//���� Ŭ����
			//�Ա��� �ⱸ ����
			// �������̽�, CtrlZ
	//ť : [FIFO : ���Լ���] : ���� ���� ��ü�� �������� 
		//ť �������̽�
			//���ⱸ �ٸ�
			//��� ����ö
	//Ʈ�� :
	
	
	public static void main(String[] args) {
		//p.768~9 : ���� Ŭ���� //push pop
		//1. ���� ��ü ����
		Stack<Coin> coinbox = new Stack<>();
		//2. ���ÿ� ��ü �ֱ�
		coinbox.push(new Coin(100)); //Coin Ŭ���� value = 100 �Ǵ°���
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		System.out.println(coinbox);
		
		//3. ���� : pop() -> ���� ���߿� ���� ��ü���� ����
		System.out.println(coinbox.pop()); //10
		
		//4. �ݺ���
		while(!coinbox.isEmpty()) {
			//coinbox�� ������� �ʴٸ� // ������ 10�� ������ �� ���
			System.out.println("����:" + coinbox.pop());
		}
			
		//queue p.770
		//queue �������̽� //poll offer
			Queue<Coin> coinbox2 = new LinkedList<>();
			
			// queue�� ��ü �ֱ�
			coinbox2.offer(new Coin (100));
			coinbox2.offer(new Coin (50));
			coinbox2.offer(new Coin (500));
			coinbox2.offer(new Coin (10));
			
			System.out.println(coinbox2);
			// ����
			System.out.println(coinbox2.poll()); //100
			// �ݺ��� + ����
			while(!coinbox2.isEmpty()) {
				System.out.println("���� : " + coinbox2.poll());
			
		}
	}
}
