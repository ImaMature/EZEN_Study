package Day05;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {
		// p.181 확인문제
		
		// 1번 문제 답 : 2번
			//힙 : 변수 내 실제 값, 참조 타입 변수의 메모리 생성 위치
			// 3) ==, != 객체 주소값 비교 	[ 객체 내용물 비교 X ]
			// 		.equals 			[ 객체 내용물 비교 O ]
			// 스택 : 변수 이름 저장
				//int name = 100 : 스택, 100: 주
		
		// 2번 문제 답 : 3번
			// 1) 프로그램 종료시 메모리 초기화
			// 3) 참조되지 않는 객체는 자동 소멸
		
		// 3번 문제 답 : 2번
			// 2) 문자열(String) 비교시에는 ==가 아니라 .equals()사용해야됨
				// 문자열이 동일해도 객체가 다를 수 있기 때문에 == 을 사용 X
		
		// 4번 문제 답 : 2번 // ";"으로 끊어버렸기 때문
						// int array = {1, 2, 3}; 이렇게 고쳐야됨
						// (선언)			(값 생성)
						// 배열은 선언과 동시에 생성은 가능, 선언 따로 생성 따로 안됨
		
		// 5번 문제 답 : 3번
			// 3) boolean 타입 배열의 초기값은 false
			// 정수 = 0, 실수 = 0.0, 논리 = false, 문자열[객체] = null
			// String 타입 배열의 초기값은 null
		
		// 6번 문제
			// 배열명.length : 행길이
			// 배열명[행].length : 해당 행의 열 길이
		
			// 답 :array.length = 3, array[2].length = 5
				
		// 7번 문제
		
//		int max = 0;
//		int[] array = {1,5,3,8,2}; // 1차원 배열 array의 행의 길이는(array.length) 5
//		 for (int i =0; i<array.length; i++) { // i는 인덱스 0~4가지 1씩 증가하면서 반복
//			 if(array[i]>max) {	// i번째 인덱스 값이 max보다 크면 max에 i번재 인덱스 값 참조
//				 max = array[i];
//			 }
//		 }
//		
//		System.out.println("max : " + max);
//		
//		// 8번 문제
//		
//		int[][] array2 = {						
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		System.out.println(array2.length); // array2의 행의 길이는 3
		/*		j=0	j=1	j=2	j=3	j=4
		 * 	i=0	95	86		
		 * 	i=1	83	92	96
		 * 	i=2	78	83	93	87	88
		 */
		
//		int sum=0;
//		double avg=0.0;
//		int count = 0; // 점수 개수
//		
//		// 행 반복
//		for (int i =0; i<array2.length; i++) {
//			// 열 반복
//			for(int j=0; j<array2[i].length; j++) { //[0,0] [0,1] [0,2] 순으로 나가다가 [1,0] [1,1]순으로
//				// 해당인덱스 값 가져와서 sum 누적합계 더하기
//				sum += array2[i][j];
//			}
//			count += array2[i].length; // 2+3+5 
//		}
//		System.out.println("배열의 총합 : " + sum);
//		avg = (double)sum/count; // sum과 count가 int인데 avg는 double로 초기화해서 강제 형변환
//		System.out.println("배열의 평균 : " + avg);
		
		
		// 9번 문제
		
		boolean run = true;	// while 무한루프에 대한 제어 변수, 역할 ? =
		int studentNum = 0; //학생 수 => 배열의 길이 
		int[] scores = null; // 학생 점수 배열[ 초기값 null ]
		Scanner scanner = new Scanner(System.in);	// 입력객체
		//위와 같은 자료형들은 한번만 선언
		
		while(run) { // while(true) : 상수 (값 안바뀜)  while(run) : 정수 (값 바뀜)
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> : ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생 수를 입력해 주세요."); studentNum = scanner.nextInt();
				scores = new int [studentNum]; //입력받은 정수만큼 배열길이 할당.
				//if(studentNum >0) {
				//for (int i = 0; i<studentNum; i++) {
					//System.out.printf("학생수 : %d명\n", studentNum);
					//break;
					//}
				//}else {System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");}
			}
			
			else if (selectNo == 2) {
				System.out.println("점수를 입력해주세요."); 
				//배열 내 할당된 모든 인덱스에 값 넣기 => for
				for (int i = 0; i<studentNum; i++) {
					System.out.println(" scores[" + i + "] : ");
					scores[i] = scanner.nextInt();
					
				}	
			}
			else if (selectNo == 3) {
				for( int i = 0; i<studentNum; i++) {
					System.out.println("scores["+ i + "] : " + scores[i]); // i 번재 인덱스 값 출력
				}
				
			}else if (selectNo == 4) {
				int max = 0; int sum = 0; double avg = 0.0;
				for (int i =0; i<studentNum; i++) {
					if(scores[i] > max ) max = scores[i]; // i번재 인덱스 값이 max 보다 크면 max에 i번째 인덱스 값 넣기
					
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
				
			}else if (selectNo == 5) {
			run = false; // break 안써도 됨
			
			}
			
		}
		
		System.out.println("프로그램 종료");	
	}

}
