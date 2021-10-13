package Day04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5_점수관리 {//class start

	// 배열을 이용한 점수관리 프로그램
		//1. 학생수를 입력받아 학생수만큼 배열의 길이할당
		//2. 메뉴 [ 1. 학생수 2. 점수입력 3. 분석[등수, 평균] 4. 종료]
	
	public static void main(String[] args) {//main start
		
		Scanner scanner = new Scanner(System.in);
		
		int[] 학생점수목록 = null; //null => 배열 선언 후 공백	//0도 값이 될 수 있기 때문에 null 사용해서 초기화
		
		while(true) {//while start
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			if ( ch==1 ) {
				System.out.println("학생 수 입력[배열길이] : "); int size = scanner.nextInt();
				// 배열에 메모리 할당
				학생점수목록 = new int[size]; //입력받은 수 만큼 메모리 할당
				System.out.println(size + "만큼 학생목록 생성");
			}
			if ( ch==2 ) {
				//학생 수만큼 점수 입력 받기		//배열명.length => 배열의 길이 
											// length는 배열의 크기를 갖게 해주는 속성
											// 배열의 크기가 변경되도 자동적으로 배열의 크기를 갖게 해준다.
											// 배열의 크기가 바뀌는 경우(입력값을 넣는다던가) 사용한다.
				for(int i=0; i<학생점수목록.length; i++) {
					System.out.println(i + "번째 학생의 점수 입력  : ");
					학생점수목록[i] = scanner.nextInt();
				}
			}
			if ( ch==3 ) {
				//1-1.내림차순 (코드 안보고 칠 수 있어야됨)
//				for(int i =0; i<학생점수목록.length; i++) {
//					for(int j = i+1; j<학생점수목록.length; j++) {
//						if (학생점수목록[i] < 학생점수목록[j]) {
//							//스왑 [교체]
//							int temp = 학생점수목록[j];
//							학생점수목록[j] = 학생점수목록[i];
//							학생점수목록[i] = temp;
//						}
//					}
//				}
				// 정렬 순서도 
				// i = 0 		j = 1 		j = 1 2 3 
				// i = 1 		j = 2 		j = 2 3 
				// i = 2		j = 3		j = 3 
				// i = 3		j = 4		실행x
				
				//1-2. 클래스를 이용한 정렬		// Arrays 클래스 사용
//				Arrays.sort(학생점수목록);	// 오름차순, 편하다
				//Arrays.sort(학생점수목록, Collections.reverseOrder()); 
				// 순서 뒤집기 // 기본자료형(int)은 불가, 객체만 가능
				// 클래스 (intgeral)
				
				
				//2.출력
				int sum = 0;
				for(int i =0; i<학생점수목록.length; i++) {
					System.out.println((i+1) + "등 점수 :" + 학생점수목록[i]);
					sum += 학생점수목록[i];
					
				}
				System.out.println("모든 학생들의 점수 평균 : " + sum/학생점수목록.length);
			}
			if ( ch==4 ) {
				System.out.println("프로그램 종료"); break;
			}
		}//while end
	}//main end
	
}//class end
