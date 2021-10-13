package study_ing.가위바위보;

import java.util.Scanner;

public class Main_가위바위보 {
	
public static Scanner sc = new Scanner(System.in);
public static boolean flag;
//가위바위보
			// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
			// 2. 컴퓨터는 랜덤을 가위바위보 중 하나 선택
			// 3. 승리한 플레이어 호출
				// + : 만약에 종료를 입력[3]하면 게임 종료
				// + : 게임종료시 게임 수와 최종승리 [ 가장 많이 이긴 플레이어 호출]


	public static void main(String[] args) {
		
		flag= true; // boolean이 반복문 제어할 때 쓰는것은 알고 있지만, 그 앞에 접근제한자를 뭘 써야할지
		while(flag) {
		Main_menu.basicMenu(); // 메인메뉴로 이동
		
		
		}
	}
}
