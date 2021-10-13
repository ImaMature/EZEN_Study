package study_ing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class check_Day04 { // c s

	public static void main(String[] args) { // m s
		Scanner scsc = new Scanner(System.in);
		//1. 로또 판별기
		// [조건1] : 1 ~ 45 사이의 수를 6개 입력받아 배열에 저장
			//	단 중복불가, 1~45사이의 숫자만 가능
		// [조건2] : 추첨번호는 난수생성 1 ~ 45 사이의 숫자 6개 생성하여 배열에 저장		
		// [조건3] : 두 배열 내 동일한 숫자가 몇개 있는지 체크하여 등수 출력
		// [출력] : 몇개가 동일한지 출력하고 등수 출력
//				6개 모두 동일하면 1등
//				5개 동일하면 2등
//				4개 3등
//				3개 4등
//				그외 꽝
		//[조건 1] 1.
		int[] number = new int [6]; // int형 6개 변수를 저장할 수 있는 배열
		int[] random = new int [6];
		
		
		for(int i=0; i<6; i++) { 
		  System.out.print( i+"번째 번호[1~45] 선택 :"); 
		  
		  int num = scsc.nextInt();
		  if( num < 1 || num >45) { // 0 ~ 45가 아닐 경우
			  System.out.println(" [[ 알림 ]] : 0 ~ 45 사이만 입력 가능합니다.");
			  i--; // 정상적인 입력이 아니기 때문에 i 차감
			  continue;
		  }
		 //[조건 2]
		  Boolean check = true;
		  // 중복체크 !!! : 만약에 입력한 값과 배열내 동일한 값이 존재한다면 다시 입력하기
		  for( int j = 0; j<6; j++) { 
			  if(num == number[j]) { // 중복찾기 성공
				  System.out.println("[[ 알림 ]] : 선택한 수는 이미 존재합니다 : 다시 입력");
				  i--; // 정상적인 입력이 아니기 때문에 i 차감
				  check = false;
				  break; //여기서 continue하면 for로 다시 올라감
			  }
		   } 
		  
		  // 2. 1~45 사이의 수 이면서 중복수가 아니면 i번째 배열에 저장
		  number[i] = num;
		}
		//[조건3] 출력
		System.out.print(" 사용자가 선택한 수 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// 3. 6개 난수 생성해서 배열에 저장 [중복체크까지]
		for(int i=0; i<6; i++) {
			Random random2 = new Random();
			int num = random2.nextInt(45)+1; // 난수 객체에서 1~45 사이의 난수 가져오기
			
			Boolean check = true;	// 중복여부 확인 체크
			for ( int j = 0; j<6; j++) {	// 반복하면서 배열내 중복 값 찾기
				if(num==random[j]) {	// 만약에 난수가 기존 배열 내 값과 동일하면
					i--;
					check = false;
					break;
				}
			}
			if (check) number[i] = num;	// 중복값이 없을 경우 i번째에 난수 넣기
				
		}
		
		// 4. 6가지 난수(추첨번호) 출력
		
		System.out.print(" 이번주 추첨 번호 수 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		
		// 5. 두 배열 내 동일한 수 체크
		int count = 0;
		for ( int i = 0; i<6; i++) { // i는 number 배열의 인덱스
			for ( int j=0; j<6; j++) { // j는 random 배열의 인덱스 => 36번 비교 [ i 1개당 j는 6번씩 비교]
				if(number[i] == random[j]){
					count++;
				}
			}
		}
		
		System.out.println("추첨 결과 : " + count);
	} // m e

} // c e
