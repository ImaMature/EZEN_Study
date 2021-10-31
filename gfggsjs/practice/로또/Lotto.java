package 로또;


import java.util.Random;
import java.util.Scanner;



public class Lotto {

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
		int [] number = new int [6]; // 숫자 입력받을 배열
		int [] rand = new int [6]; // 랜덤 난수 배열
		int count = 0; // 두 배열 내 동일한 숫자 체크하는 객체
		
		try{
			for(int i=0; i<6; i++) {
			
				System.out.println("[1~45 사이의 숫자를 입력해주세요.]");	
				int inputNumber = scanner.nextInt();
				if(inputNumber < 1 || inputNumber > 45) {
					System.out.println("[잘못된 숫자입니다. 1 ~ 45 사이의 숫자를 입력해주세요.]");
					i--;
					continue;
				}
				else {
					boolean check = true;
					for(int j = 0; j<6; j++) {
						if(number[j] == inputNumber) {
							System.out.println("[중복된 숫자가 이미 존재합니다. 다시 입력해주세요.]");
							i--;
							check = false;
							break;
							}
						}
					if(check) {
						number[i] = inputNumber;
						//System.out.println(number[i]);
					}else {
						continue;
					}
				}
				
			}//숫자입력 for문 끝
			
			//랜덤난수 생성, 중복값 체크
			for(int i = 0; i<6; i++) {
			Random random = new Random();
			int randNumber = random.nextInt(45)+1;
				
				boolean check2 = true;
				for(int j =0; j< 6; j++) {
					if(randNumber == rand[j]) {
						i--;
						check2 = false;					
					}
				}
				
				if(check2) {
					rand[i] =randNumber;
				}else {
					continue;
				}
			}//난수생성 for문 끝
			
			System.out.println("이번주 당첨번호");
			for(int i =0; i<6; i++) {
				System.out.print(rand[i]+ " ");
			}
			
			for(int i =0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(number[i] == rand[j]) {
						count++;
					}
				}
			}
			System.out.println();
			System.out.println("동일한 숫자 개수 : " + count);
			if(count == 3) {
				System.out.println("축하드립니다! 4등에 당첨되였습니다!");
			}
			else if(count == 4) {
				System.out.println("축하드립니다! 3등에 당첨되였습니다!");
			}
			else if(count == 5) {
				System.out.println("축하드립니다! 2등에 당첨되였습니다!");
			}
			else if(count == 6) {
				System.out.println("축하드립니다! 1등에 당첨되였습니다!");
			}
			else {
				System.out.println("꽝입니다! 다음 기회에...");
			}
		}catch (Exception e) {
			System.out.println("시스템 오류입니다. 관리자에게 문의하세요." + e);
		}
		scanner.close();
	}//main end
}//class end
