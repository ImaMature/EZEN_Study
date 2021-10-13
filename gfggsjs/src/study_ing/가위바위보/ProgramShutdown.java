package study_ing.가위바위보;

public class ProgramShutdown extends Main_menu{

	public static void userChoice() { // 유저 선택 메소드 선택한 것을 y와 n에 담아서
		//객체선언 잘 모르겠음.			// y일때 "프로그램 종료." 출력 n일때 "계속 진행하겠습니다." 출력
		
		// String y or n을 굳이 선언할 필요 없는듯 해서 필드 생략
		
		boolean flag2 = true; //boolean 안쓸때는 break;로 탈출, 그럼 boolean은 어떤 때 사용? 
		while(flag2) {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.println("예[y] / 아니오[n]");	String ch2 = Main_가위바위보.sc.next();
		if (ch2.equals("y")) {
			System.out.println("프로그램 종료."); flag2 = false; Main_가위바위보.flag = false; 
			// 어떻게 main_가위바위보에 있는 boolean flag = false로 바꿀지
			// 만약에 입력객체 ch2가 main_가위바위보에 있다면
		}
		else if (ch2.equals("n")) {
			System.out.println("게임을 계속 진행합니다.");
			System.out.println("----------------\n"); flag2 = false;
			 // return은 언제쓰이는지 = void일때
			}
		else {System.out.println("잘못된 입력입니다.");}
		}
	}
}
