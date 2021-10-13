package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner (System.in);
	// 무한루프 => while 이요한 무한반복
		// 키보드를 이용한 루프제어
		// 무한루프 종료 방법 : 1. 조건을 false 2.break
		
			while(true) {
//				System.out.println("무한루프");
//				int 선택 = scanner.nextInt();
//				if(선택 == 4) break;
			//}
		
	// 랜덤[난수] 생성
		// 1. 랜덤 클래스		// Math 클래스
			// Random 객체
				// .nextInt() : int형 표현할 수 단위만큼 난수 생성
				// .nextInt(숫자) : 0~숫자전까지 난수
				// .nextInt(10) + 초기값
		Random random =	new Random(); // 난수 객체 생성 Scanner처럼 사용
			System.out.println(random.nextInt(10));
			// 0~9까지 난수 생성, 10은 안나옴
			//System.out.println(random.nextInt(10) + 1); // 1~10까지 난수 생성
			//System.out.println(random.nextInt(10) + 4); // 4~13까지 난수 생성
		
//		System.out.println(random.nextInt());
//		System.out.println(random.nextDouble()); //소숫점자리까지 생성
//		System.out.println(random.nextBoolean()); //참 거짓
			
			
			
			
			
			
			
			}
			
	}
}
