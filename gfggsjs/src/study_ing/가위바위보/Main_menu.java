package study_ing.가위바위보;

public class Main_menu {
	//1. 필드 (게임 수, 플레이어가 이긴 수, 컴퓨터가 이긴 수,)
static int gameCount = 0;
int playerWin = 0;
int cpuWin = 0;



	public static void basicMenu() { // 메인메뉴
		System.out.println("메인 메뉴입니다.");
		System.out.println("가위바위보중 하나를 입력해주세요.");
		System.out.println("가위 [0], 바위 [1], 보 [2], 프로그램 종료[3]");	String ch = Main_가위바위보.sc.next();
		if (ch.equals("0")) { UserScissors.scissors();}	
		if (ch.equals("1")) { UserRock.rock();}
		if (ch.equals("2")) { UserPaper.papirus();}
		if (ch.equals("3")) { ProgramShutdown.userChoice(); }
		else { System.out.println("잘못된 선택입니다."); Main_가위바위보.flag = false;}
		
	}

}
