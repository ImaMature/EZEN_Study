package 틱택토;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int cpu;
		int count = 0;
		String winner = " ";
		// 1. 게임판 생성 [배열로 9칸 생성]
		String [] board =  {"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]"};
		
		
		// 2. 게임판 출력 
		while(true) {
			for(int i =0; i<board.length; i++) {
				//System.out.print("[]");
				System.out.print(board[i]);//"[ ]"을 찍으려고
				if(i%3==2)System.out.println();
			}
			
			// 3. 플레이어가 위치를 선택하여 말 두기
			while(true) {
				System.out.println("플레이어 위치 선택 > : ");
				int ch = scanner.nextInt();
					if(board[ch].equals("[ ]")) {
						board[ch] = "[O]";
						count++;
						//System.out.println(ticTacToe[ch]);
						break; //한번 플레이어가 두고 컴퓨터에게 턴을 넘기기 위해 break사용?
				}else {System.out.println("중복된 선택입니다.");}
			}
			
			
			// 4. 컴퓨터 [0~9 사이 난수를 생성해서 알[X] 두기]
			System.out.println("컴퓨터 난수 생성");
			while(true) {	
				Random random = new Random();
				int cpuNum = random.nextInt(9);
					if(board[cpuNum].equals("[ ]")) {
						board[cpuNum] = "[X]"; 
						//System.out.println(ticTacToe[cpuNum]);
						break;
					}
				}
			//승리자 판단 012 345 678
				//가로가 똑같을 경우
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
				//세로가 똑같을 경우
				for(int i = 0; i<2; i++) {
					if(board[i].equals(board[i+3]) && board[i+3].equals(board[i+6])) {
						if(!board[i].equals("[ ]")) {
							winner = board[i]; //board[i] = "[O]" or "[X]"
						}
					}
				}
				//대각선이 같을 경우 048, 246
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
				
				//승리자 판단
				if(winner.equals("[O]")) {
					System.out.println("플레이어의 승리");
					break; //break 안걸어주면 또 선택함 - while문 탈출 안했기 때문
				}else if(winner.equals("[X]")) {
					System.out.println("컴퓨터의 승리");
					break; //break 안걸어주면 또 선택함 - while문 탈출 안했기 때문
				}
				
				if(count == 9) { //count 9를 걸어주는 이유는?
					System.out.println("무승부");
					break;
				}

		}//while end
	}///main end
}//class end
