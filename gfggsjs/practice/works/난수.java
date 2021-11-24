package works;

import java.util.Random;

//차량번호 랜덤으로 0000~9999 사이의 난수 10개 생성
//
//조건	1. 모든 차량을 배열에 저장
//	* 차량 끝자리 번호가 홀수/짝수
//	2. 차량 끝자리 번호가 홀수 배열 생성
//	3. 차량 끝자리 번호가 짝수 배열 생성
	// [출력] 3개의 배열 모두 출력 
		// 난수 => 정수 0~9999 사이의 랜덤 생성
		// 정수 -> 4자릿수 문자열 변환

public class 난수 {

	public static void main(String[] args) {
		int[] car = new int [10];	// 모든 차량에 대한 배열. 난수가 10개 이므로 10으로 선언
		int car2 [] = new int [10]; // 차량 끝자리 번호가 홀수인 배열
		int car3 [] = new int [10]; // 차량 끝자리 번호가 짝수인 배열
		
		Random rand = new Random(); // 난수 객체 생성

			for(int i =0; i<car.length; i++) { 	//모든 차량의 배열 만큼 반복
				
				car[i] = rand.nextInt(10000);	//0~9999 난수 생성 배열에 저장
			
				//중복체크 하는 법을 모르겠습니다.
				
				String strnum = String.format("%04d", car[i]); 	//생성된 난수 스트링화
				//3자리 수 안나오게 String.format화 04d를 해야 0이 붙어 4자리수가 된다.
				car[i] = Integer.parseInt(strnum); 				//String화 한 값을 int로 강제 형변환 후 i번째 인덱스에 저장
															
				if(car[i] % 2 == 0 && car2[i] == 0) {	
						// 짝수 => 2로 나눴을 때 나머지가 0 	//그리고 car2배열이 비어있으면 X
					car2[i] = car[i];					
				}
				else if(car[i] % 2 ==1 && car3[i] == 0) { 
						// 홀수 => 2로 나눴을 때 나머지가 1		//그리고 car3배열이 비어있으면 X
					car3[i] = car[i];
				}	
			}
		System.out.println("모든 차량"); 		
		for(int i=0; i<car.length; i++) { 	// car2 배열길이만틈 반복
			System.out.print(car[i]+" ");	// car배열의 값 + 공백으로 보기 편하게
		}
		System.out.println("\n===================================================");
		
		System.out.println("짝수 차량");
		for(int i = 0; i<car2.length; i++) {
			if(car2[i] !=0) {		//car2 배열에 0이 있으면 나오지 않게 하기
				System.out.print(car2[i] + " ");					
			}
		}
		System.out.println("\n===================================================");
		
		System.out.println("홀수 차량");
		for(int i = 0; i<car3.length; i++) {
			if(car3[i] !=0) { 		//car3 배열에 0이 있으면 나오지 않게 하기
				System.out.print(car3[i] + " ");					
			}
		}
	}
}	
