package study_ing.가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// 가위바위보
					// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
					// 2. 컴퓨터는 랜덤을 가위바위보 중 하나 선택
					// 3. 승리한 플레이어 호출
						// + : 만약에 종료를 입력[3]하면 게임 종료
						// + : 게임종료시 게임 수와 최종승리 [ 가장 많이 이긴 플레이어 호출]
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int cpu; int gameCount = 0; int playerWin = 0; int cpuWin = 0;
		
		while(true) {
		System.out.println("-------------------------");
		System.out.println("가위바위보 게임 메인 화면입니다.");
		System.out.println("가위[0] 바위[1] 보[2] 종료[3]");
		System.out.print("하나를 선택해주세요 > ");	int playerCh = scanner.nextInt();
		System.out.println("-------------------------");
			
			if (playerCh == 3) {
				System.out.println("프로그램 종료.");
				System.out.println("총 게임수 : " + gameCount);
				if (playerWin > cpuWin) {
					System.out.println("최종승리자 : " + playerWin);
				}else if (playerWin < cpuWin) {
					System.out.println("최종승리자 : " + cpuWin);
				}else {System.out.println("무승부 입니다.");}
			break;	
			}//if end
			
			if (playerCh < 0 && playerCh > 3) {
				System.out.println("알 수 없는 번호 입니다.");
			}
			
			cpu = random.nextInt(3);
			System.out.println("컴퓨터가 낸 수 : " + cpu);
			
			if((playerCh == 0 && cpu == 1) || (playerCh == 1 && cpu == 2) || (playerCh == 2 && cpu == 0)) {
				System.out.println("컴퓨터의 승리");
				cpuWin++;
			}
			
			if((playerCh == 0 && cpu == 2) || (playerCh == 1 && cpu == 0) || (playerCh == 2 && cpu == 1)) {
				System.out.println("컴퓨터의 승리");
				cpuWin++;
			}else {
				System.out.println("무승부");
			}
			gameCount++;
		}//while end
	}//main end
}//class end
