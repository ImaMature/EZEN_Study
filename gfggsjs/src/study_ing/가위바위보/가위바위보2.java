package study_ing.가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 {
	// 가위바위보
				// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
				// 2. 컴퓨터는 랜덤을 가위바위보 중 하나 선택
				// 3. 승리한 플레이어 호출
					// + : 만약에 종료를 입력[3]하면 게임 종료
					// + : 게임종료시 게임 수와 최종승리 [ 가장 많이 이긴 플레이어 호출]
	//클래스영역에서는 컴파일러가 자동으로 초기값을 설정해준다.
	//필드
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int cpuWin = 0; int playerWin = 0; int gameCount = 0;
	int cpu = 0;;
	//메소드 영역에는 자동으로 초기값이 할당되지 않기 때문에 초기화를 한다.
	//int a = 0; -> 선언과 동시에 초기화
		while(true) {
		System.out.println("-------------------------------");
		System.out.println("가위[0] 바위[1] 보[2] 프로그램 종료[3]");
		System.out.print("선택 > :");		int playerCh = scanner.nextInt();
		System.out.println("-------------------------------");
		
			if(playerCh == 3) {
				System.out.println("프로그램 종료. 총 게임 수 : " + gameCount);
				if 		(cpuWin < playerWin) {System.out.println("승리자 : 플레이어");}
				else if (cpuWin > playerWin) {System.out.println("승리자 : 컴퓨터");}
				else 	{System.out.println("무승부");}
				break;
			}
			
			else if(playerCh<0 && playerCh>3) {
				System.out.println("잘못된 입력입니다. 0~3 사이의 값을 입력해주세요.");
			}
			
			Random random = new Random();
			cpu = random.nextInt(3);
			//System.out.println("컴퓨터가 낸수 : " + cpu);
			
			if((playerCh == 0 && cpu == 1) || (playerCh == 1 && cpu == 2) || (playerCh == 2 && cpu == 0)) {
				System.out.println("컴퓨터의 승리입니다."); cpuWin++;}
			
			else if((playerCh == 0 && cpu == 2) || (playerCh == 1 && cpu == 0) || (playerCh == 2 && cpu == 1)) {
				System.out.println("플레이어의 승리입니다."); playerWin++;}
			
			else {System.out.println("무승부입니다.");}
			gameCount++;
		}// while end
	}// main end
}// class end
