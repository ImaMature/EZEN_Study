package Day12;

import java.util.Random;
import java.util.Scanner;

// 차량번호 랜덤 생성문제
public class Day12_4_차량번호분배 {
	public static void main(String[] args) {
		
	//0. 설정 [초기값 1번 실행할 변수]
		Scanner scanner = new Scanner(System.in); // new가 들어가거나 메모리할당되는 건 메모리에 저장해야됨
		String [] carNumbers = new String[10]; // String 10개 저장할 수 있는 배열 선언
		String [] carNumbers_odd = new String[10]; // 홀수 차량들
		String [] carNumbers_even = new String[10]; // 짝수 차량들
		Random random = new Random(); // 난수 객체 생성
		
		while(true) { // 반복문에서 필수
			System.out.print("1. 차량 출입  : ");
			int ch = scanner.nextInt();
			if(ch==1) {
				int intnum = random.nextInt(10000); //0~9999의 난수 생성
				// 정수 -> 4자릿수 문자열로 변환
				String strnum = String.format("%04d", intnum); 
						// String.format(형식, 데이터) : 문자열 형식 메소드
							//%4d는 4자리 차지 근데 3자리수이면 공백이 추가됨 그래서 %04d를 사용해서 공백을 0으로 메꿈
								//형식 : %d -> 형식 대상의 데이터가 정수
									//%4d : 4자릿수
									//%04d : 비어있는 자릿수는 0으로 사용
				System.out.println(intnum); // 출력값이 3자리수 -> "공백"347 
				System.out.println(strnum); // 출력값이 3자리수 -> 0347 
				
				//차량번호 저장 [비어있는 배열에 저장 = for문]
				for(int i = 0 ; i<carNumbers.length; i++) {
					if(carNumbers[i] == null) { // 해당 인덱스가 비어있다면
						carNumbers[i] = strnum; // 해당 인덱스에 strnum값을 저장 (아직 문자열임)
							//홀짝 구분	[값%2 == 0 나머지가 0이면 짝수, 1이면 홀수]
								//1. 문자열 -> 정수 변환		2. 홀짝 구분1
						
						if(Integer.parseInt(strnum) %2 == 0) {	//문자열 -> 정수형 변환과 동시에 2로 나눌때 나머지가 0이면
								// 정수형 ( 차량번호 ) %2 == 0 이면 짝수
							for(int j = 0; j<carNumbers_even.length; j++) {
								if (carNumbers_even[j] == null) {
									carNumbers_even[j] = strnum; break;
								}
							}
							
						}else {for(int j = 0; j<carNumbers_odd.length; j++) {
								 //짝수가 아니라면 홀수
							if (carNumbers_odd[j] == null) {
								carNumbers_odd[j] = strnum; break; 
							}
						}
					}
						break; // 차량번호 저장하는 for문 탈출
				}
			}
////////////////////////////////// 차량 출력 저장 ////////////////////////////////////////////////////////////
				System.out.println("****** 현재 주차 중인 차량 ******");
				for(String num : carNumbers) {//인덱스 번호가 필요없는 반복일 경우
					//for(자료형 임시변수 : 배열명) -> 배열내 0번 인덱스부터 마지막 인덱스까지 임시변수에 대입
					if(num != null) 
					System.out.println(num);
					
					
					}
				System.out.println("****** 현재 주차 중인 홀수 차량 ******");
				for(String num : carNumbers_odd) {//인덱스 번호가 필요없는 반복일 경우
					//for(자료형 임시변수 : 배열명) -> 배열내 0번 인덱스부터 마지막 인덱스까지 임시변수에 대입
					if(num != null) 
					System.out.println(num);
					
					
				}
				System.out.println("****** 현재 주차 중인 짝수 차량 ******");
				for(String num : carNumbers_even) {//인덱스 번호가 필요없는 반복일 경우
					//for(자료형 임시변수 : 배열명) -> 배열내 0번 인덱스부터 마지막 인덱스까지 임시변수에 대입
					if(num != null) 
					System.out.println(num);
				}	
			}
			
				// 차량번호 저장 [비어있는 배열에 저장]
//		int carNumbers [] = new int [10]
//		Random random = new Random();
//		for(int i =0; i<10; i++) {
//			int carNumber1[i] = random.nextInt(10); 0~9 *1000 = 9000
//			int carNumber2[i] = random.nextInt(10);
//			int carNumber3[i] = random.nextInt(10);
//			int carNumber4[i] = random.nextInt(10);
//			System.out.println("랜덤난수 : " + carNumber1*1000);
		}
		
	}
}
