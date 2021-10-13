package study_ing.가위바위보;

import java.util.Random;

public class UserRock extends Main_menu{
	
	//Main_menu에 생성자를 생성하면 UserRock에 붉은 줄이 생김
	
	

	public static void rock() {
		// 유저가 바위 선언
		System.out.println("유저 선택 : 바위");
		// 컴퓨터 랜덤 난수 출력? // 잘 기억이 안나서 배웠던거 보고함
		Random random = new Random();	//컴퓨터가 낸 수 메소드 생성해보기
		int computer = random.nextInt(3);
		System.out.println("컴퓨터가 낸 수 : " + computer); //랜덤 난수 출력
		gameCount++;
	}

}
