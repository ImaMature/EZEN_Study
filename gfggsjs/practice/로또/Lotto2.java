package 로또;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	//1. 로또 판별기
	// [조건1] : 1 ~ 45 사이의 수를 6개 입력받아 배열에 저장
			//단 중복불가, 1~45사이의 숫자만 가능
	// [조건2] : 추첨번호는 난수생성 1 ~ 45 사이의 숫자 6개 생성하여 배열에 저장		
	// [조건3] : 두 배열 내 동일한 숫자가 몇개 있는지 체크하여 등수 출력
	// [출력] : 몇개가 동일한지 출력하고 등수 출력
//			6개 모두 동일하면 1등
//			5개 동일하면 2등
//			4개 3등
//			3개 4등
//			그외 꽝
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int [] number = new int [6];
	int [] randomN = new int [6];
	
					for(int i =0; i<6; i++) {
						System.out.println("[1 ~ 45 사이의 숫자를 입력해주세요.]");
						int input = scanner.nextInt();
						
						if(input < 1 || input > 45) {
							System.out.println("[1 ~ 45 사이의 숫자를 입력해주세요.] 재입력 : ");
							i--;
							continue;
							
						}
						boolean check = true;
						for(int j =0; j<6; j++) { 
							if(number[j] == input) {
								System.out.println("[중복된 값 존재합니다.] 재입력 : ");
								check = false; // false로하면 어디로 이동??
								i--; //j--쓰면 안됨 이유는??
								break;
							}
							
						}
						
						if(check) {
							number[i] = input;
							System.out.println(number[i]);
						}else {
							continue;
						}
					}
						
						//랜덤난수생성
						for(int i2 = 0; i2<6; i2++) {
							Random random = new Random(); 
							int rand = random.nextInt(45)+1;
							
							boolean check2 = true;
							for(int j = 0; j < 6; j++) {
								if(rand == randomN[j]) {
									System.out.println("난수중복");
									check2= false;
									i2--;
								}
							}
							if(check2) {
								randomN[i2] = rand;
								System.out.println(randomN[i2]);
							}else {
								continue;
							}
						}
					
		
	}
}