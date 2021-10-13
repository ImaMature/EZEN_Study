package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6_틱택토게임 {
	// 배열을 이용한 틱택토게임 (빙고 같은 거)
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cpu;
		
		// 1. 게임판 생성 [배열로 9칸 생성]
		// String객체 9개를 저장하는 배열 선언				// index 위치
		String [] 게임판 = {	"[ ]", "[ ]", "[ ]", 			// [0] [1] [2]
							"[ ]", "[ ]", "[ ]", 			// [3] [4] [5]
							"[ ]", "[ ]", "[ ]",};			// [6] [7] [8]
				
		String winner = " ";
		int count = 0;
		
		while(true) {
			
			
			
			// 2. 게임판 출력 [인덱스가 0번 부터 시작하기 때문에 for(int i) 의 초기값을 0부터 시작]
			for(int i = 0; i<게임판.length; i++) { 
			// 3칸씩 출력 후 줄바꿈
				
				System.out.print( 게임판[i] );
				if( i%3==2 ) System.out.println();
			}
			
			// 6. 승리자 나왔을 때 게임종료
				if(winner.equals("[O]")) {
					System.out.println(">>>> [[플레이어 승리]]");
					break;
				}else if (winner.equals("[X]")) {
					System.out.println(">>>>  [[컴퓨터 승리]]");
					break;
				}
			
			
			
			// 3. 플레이어가 위치를 선택하여 말 두기
			while(true) {
				System.out.println(" >>>>>>> [플레이어 순서] 위치 선택"); int index = scanner.nextInt();
				
				// 선택한 위치에 이미 알이 있을 경우에 다시 입력받기
				if (게임판[index].equals("[ ]")) {
					게임판[index] = "[O]"; // 해당위치 게임판 모양 변경
					count++; // 현재 알 개수 1 증가
					break;// 정상적인 알을 두었을때 반복문 종료
				}else {
				System.out.println(">> [이미 둔 자리입니다.] : 다시 선택");
				}
				
			}
			
				// 7. 9칸 알이 모두 존재했을 때
				if(count == 9) {
					
					System.out.println(">>> [무승부] <<<");
					break;
				}
		
			// 4. 컴퓨터 [0~9 사이 난수를 생성해서 알[X] 두기]
			System.out.println(" >>>>>>> [컴퓨터 순서] 위치 선택");
			while(true ) {
				Random random2 = new Random();
				int index = random2.nextInt(9);
				if (게임판[index].equals("[ ]")) {
					게임판[index] = "[X]"; break;
				}
			}
			
			// 5. 승리자 판단 // 0을 i라고 생각해보기
				// 1) 0 1 2	// 3 4 5 // 6 7 8	(가로)모두 모양이 같을 경우 해당 모양 승리
			//0 = i  , 1 = i+1, 2 = i+2
			for(int i = 0; i<=6; i+=3) {
				if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
					if(!게임판[i].equals("[ ]")) {
						// !:부정 [ true -> false ]
						winner = 게임판[i];
												
					}
						
				}
			}
				// 2) 0 3 6 // 1 4 7 // 2 5 8	(세로)모두 모양이 같을 경우 해당 모양 승리
			for(int i = 0; i<=2; i++) {
				if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
					if(!게임판[i].equals("[ ]")) { // 이 라인이 있어야됨 왜냐면 초기값이 다 [ ]이기 때문.
						// !:부정 [ true -> false ]
						winner = 게임판[i];
												
					}
						
				}
			}
				// 3) 0 4 8 // 2 4 6 			(대각선)모두 모양이 같을 경우 해당 모양 승리
			
				if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) { // 2개 뿐이라 반복문 안 쓰고 하기
					if(!게임판[0].equals("[ ]")) { // 이 라인이 있어야됨 왜냐면 초기값이 다 [ ]이기 때문.
						// !:부정 [ true -> false ]
						winner = 게임판[0];
				}
			}
			
				if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) { // 2개 뿐이라 반복문 안 쓰고 하기
					if(!게임판[2].equals("[ ]")) { // 이 라인이 있어야됨 왜냐면 초기값이 다 [ ]이기 때문.
						// !:부정 [ true -> false ]
						winner = 게임판[2];
				}
			}
			
		
		}
	
	}
		
}