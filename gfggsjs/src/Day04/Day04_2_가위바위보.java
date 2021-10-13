package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2_가위바위보 { // class start // 안보고 짤 수 있다 ? 제어문 이해한거

	public static void main(String[] args) { // main start
		// 가위바위보
			// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
			// 2. 컴퓨터는 랜덤을 가위바위보 중 하나 선택
			// 3. 승리한 플레이어 호출
				// + : 만약에 종료를 입력[3]하면 게임 종료
				// + : 게임종료시 게임 수와 최종승리 [ 가장 많이 이긴 플레이어 호출]
		
		
		Scanner scanner = new Scanner(System.in);
		
		int player; int computer; int 게임수=0;
		int 플레이어승리수 = 0; int 컴퓨터승리수 = 0;
		
		while(true ) { //while start
			// 1. 사용자로부터 입력 받기
			System.out.print("\n가위[0] 바위[1] 보[2] 종료[3] 중 하나를 입력해 주세요 : ");	
			player = scanner.nextInt();
			
			//. 4 3번 입력 시 게임 종료
			if (player == 3) { // if start
				System.out.println("\n--- 프로그램 종료 --- ");
				System.out.println("\n총 게임수 > " + 게임수);
				
				if (플레이어승리수 > 컴퓨터승리수) {
					System.out.println("\n최종 승리자 : 플레이어, 플레이어 이긴 횟수 : " + 플레이어승리수);
				} else if (플레이어승리수 < 컴퓨터승리수) {
					System.out.println("\n최종 승리자 : 컴퓨터, 컴퓨터 이긴 횟수 : " + 컴퓨터승리수);
				} else {
					System.out.println("\n최종 승리자 : 무승부");
					
					} break;	//가장 가까운 반복문 탈주
				} // if end
				
			
			
			//5. 0~3외 숫자 입력시
			if( player<0 || player>3) {
				System.out.println(" >>> [알 수 없는 번호입니다. 다시입력하기.]");
				continue; //가장 가까운 반복문으로 이동
			}
						
			// 2. 컴퓨터로부터 난수 생성
			
			Random random = new Random(); // 난수 객체
			computer = random.nextInt(3); // 0 ~ 2 사이의 난수
			System.out.println("\n컴퓨터가 낸수 : " + computer);
			
			
			// 3. 승리자 판단 플 = 0(가위) && 컴 = 보(2) 이거나 플 = 바위(1) && 컴 = 0 이거나 플 = 2 && 컴 = 1) 
			if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1))	{  
				System.out.println("\n>>>>> 플레이어 승리");
				플레이어승리수++;
			}
			
			// 무승부 판단
			else if ((player == 0 && computer == 0) || (player == 1 && computer == 1) || (player == 2 && computer == 2))	{  
				System.out.println("\n>>>>> 무승부");
			}
			
			
			else {  // 컴퓨터 승리
				System.out.println("\n>>>>> 컴퓨터 승리");	
				컴퓨터승리수++;
			}
			
			게임수++; // 게임수 증가
			
		} //while end
		
		scanner.close();
	} // main end

} // class end
