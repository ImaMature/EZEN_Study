package ƽ����;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int cpu;
		int count = 0;
		String winner = " ";
		// 1. ������ ���� [�迭�� 9ĭ ����]
		String [] board =  {"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]"};
		
		
		// 2. ������ ��� 
		while(true) {
			for(int i =0; i<board.length; i++) {
				//System.out.print("[]");
				System.out.print(board[i]);//"[ ]"�� ��������
				if(i%3==2)System.out.println();
			}
			
			// 3. �÷��̾ ��ġ�� �����Ͽ� �� �α�
			while(true) {
				System.out.println("�÷��̾� ��ġ ���� > : ");
				int ch = scanner.nextInt();
					if(board[ch].equals("[ ]")) {
						board[ch] = "[O]";
						count++;
						//System.out.println(ticTacToe[ch]);
						break; //�ѹ� �÷��̾ �ΰ� ��ǻ�Ϳ��� ���� �ѱ�� ���� break���?
				}else {System.out.println("�ߺ��� �����Դϴ�.");}
			}
			
			
			// 4. ��ǻ�� [0~9 ���� ������ �����ؼ� ��[X] �α�]
			System.out.println("��ǻ�� ���� ����");
			while(true) {	
				Random random = new Random();
				int cpuNum = random.nextInt(9);
					if(board[cpuNum].equals("[ ]")) {
						board[cpuNum] = "[X]"; 
						//System.out.println(ticTacToe[cpuNum]);
						break;
					}
				}
			//�¸��� �Ǵ� 012 345 678
				//���ΰ� �Ȱ��� ���
				for(int i = 0;i<6;i+=3) {
					if(board[i].equals(board[i+1]) && board[i+1].equals(board[i+2])) {
						if(!board[i].equals("[ ]")) {
							winner = board[i]; 
						}
					}
				}
				//012 
				//345 
				//678
				//���ΰ� �Ȱ��� ���
				for(int i = 0; i<2; i++) {
					if(board[i].equals(board[i+3]) && board[i+3].equals(board[i+6])) {
						if(!board[i].equals("[ ]")) {
							winner = board[i]; //board[i] = "[O]" or "[X]"
						}
					}
				}
				//�밢���� ���� ��� 048, 246
				if(board[0].equals(board[4]) && board[4].equals(board[8])) {
					if(!board[0].equals("[ ]")) {
						winner = board[0];
					}
				}
				
				if(board[2].equals(board[4]) && board[4].equals(board[6])) {
					if(!board[2].equals("[ ]")) {
						winner = board[2];
					}
				}
				
				//�¸��� �Ǵ�
				if(winner.equals("[O]")) {
					System.out.println("�÷��̾��� �¸�");
					break; //break �Ȱɾ��ָ� �� ������ - while�� Ż�� ���߱� ����
				}else if(winner.equals("[X]")) {
					System.out.println("��ǻ���� �¸�");
					break; //break �Ȱɾ��ָ� �� ������ - while�� Ż�� ���߱� ����
				}
				
				if(count == 9) { //count 9�� �ɾ��ִ� ������?
					System.out.println("���º�");
					break;
				}

		}//while end
	}///main end
}//class end
