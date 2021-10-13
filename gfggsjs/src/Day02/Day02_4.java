package Day02;

import java.util.Scanner;

public class Day02_4 {// c s

	public static void main(String[] args) {// m s

		// 문제1 : 급여 명세서 
		/*
		 * [조건] 입력받기 : 기본급 , 수당 
		 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 * 
		 */
		
		//1) 입력객체 선언 = Scanner 클래스를 이용한 객체 선언		
		Scanner 입력객체 = new Scanner(System.in);
		
		/*
		//2) 입력객체에 저장된 값을 변수로 옮기기
		System.out.print(" 기본금 : ");		int 기본금 = 입력객체.nextInt();
		System.out.print(" 수당 : ");			int 수당 = 입력객체.nextInt();
		
		//3) 계산
			// 100% -> 1		10% -> 0.1		1% -> 0.01		10 -> 1000%
		int 세금 = (int)(기본금 * 0.1); 
						// int * double이라서 (0.1을 곱해서 실수가 되므로)강제변환하기
		//(= double 세금 = 기본급 * 0.1;)
		System.out.println(" 실수령액 : " + (기본금 + 수당 - 세금));
		
				
		// 문제2 : 지폐 개수 세기 
		/*
		 * [조건] : 십만원 단위의 금액을 입력받아 
		 * [출력] : 입력받은 금액의 지폐수 세기 
		 * [출력 예 ] : 356789  
		 * 		십만원 : 3장 
		 *		만원 : 5장 
		 * 		천원 : 6장 
		 * 		백원 : 7개
		 */
		
		// 1. 지폐 입력 받기
		//Scanner money2 = new Scanner(System.in); 
		//위에 입력받는게 있기 때문에 써도되고 안써도되고 쓰려면 money변수를 위와 이름 다르게 해야함
		//안쓰고 해보기
		/*
		System.out.println(" 금액 : "); 	int 금액 = 입력객체.nextInt();
			//1) 십만원권
			System.out.println("십만원 : " + (금액/100000) + "장");
				//금액 = 금액 - (금액/100000) * 100000 ; 위 아래 똑같은 것 다만 아래가 더 빠름
				금액 -= (금액/100000) * 100000 ; // 십만원 단위 제거
			//2) 만원권
			System.out.println("만원 : " + (금액/10000) + "장");
				금액 -= (금액/10000) * 10000; // 만원 단위 제거 
			//3) 천원권	
			System.out.println("천원 : " + (금액/1000) + "장");	
				금액 -= (금액/1000) * 1000; // 천원 단위 제거
			//4) 백원권	
			System.out.println("백원 : " + (금액/100) + "개");	
				
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			
			System.out.print(" 문제3 정수 입력 : "); 	int 문제3 = 입력객체.nextInt();
			//* 배수 찾기
				// 값 % 수 ==0		나머지가 0이면 값은 그 수의 배수
			
			System.out.println(" 7의 배수인지 : " + ( 문제3%7 == 0 ) );
			
		/*		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
			System.out.print(" 문제4 정수 입력 : "); 	int 문제4 = 입력객체.nextInt();
			// * 홀수 찾기
				// 값 %2 == 1	나누기 2를 했을 때 나머지가 0이면 값은 짝수 1이면 홀수
			System.out.println(" 홀수 인지 : " + ( 문제4%2 == 1 ) );
			
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
			System.out.print(" 문제5 정수 입력 : "); 	int 문제5 = 입력객체.nextInt();
			System.out.println(" 7의 배수 이면서 짝수 인지 : " + ( 문제5%7==0 && 문제5%2==0 ) );

		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
			System.out.print(" 문제6 정수 입력 1 : "); 	int 정수1 = 입력객체.nextInt();
			System.out.print(" 문제6 정수 입력 2 : "); 	int 정수2 = 입력객체.nextInt();
			System.out.println(" 정수 1이 정수 2보다 더 큰지 : " + (정수1 > 정수2));
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
			System.out.print(" 문제7 반지름 입력 : "); 	double 원넓이 = 입력객체.nextDouble();
			System.out.println(" 원 넓이 : " + (원넓이 * 원넓이 * 3.14));
		
		*/
		/*	
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
			System.out.print(" 문제8 실수 입력 1 : "); 	double 실수1 = 입력객체.nextDouble();
			System.out.print(" 문제8 실수 입력 2 : "); 	double 실수2 = 입력객체.nextDouble();
			double 비율 = (실수1/실수2) * 100;
			System.out.println(" 실수1의 실수2의 백분율 : " + 비율 + "%");
			// 소수점 단위를 형식 변경
			System.out.printf(" 실수1의 실수2의 백분율 : %.2f%%", 비율);
				//printf는 출력할 문구에 서식을 넣는 용도
				// , 뒤의 변수(비율)가 %.2f%에 대입됨
				// %를 표시하려면 %%라고 넣어야됨	// 형식문자 : %f (실수)	 // %f는 실수를 뜻함		
												// %.숫자f ( 숫자 : 소수점 자리수 )
												// %.2f   (소수점 2자리수)	
														
														
			
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
				//사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
			
			
					
			
			System.out.println("\n\n\n 문제 9 사다리꼴 넓이 구하기");
			System.out.print(" 윗변 : ");		double Top = 입력객체.nextDouble(); //double를 int로 해도됨 근데 int로 할려면 nextDouble를 nextInt로 바꿔야됨
			System.out.print(" 아랫변 : ");	double Low = 입력객체.nextDouble();
			System.out.print(" 높이 : ");		double Height = 입력객체.nextDouble();
			System.out.printf(" 사다리꼴 계산식 : %.3f ", (Top + Low) * Height / 2);
					
					
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
			System.out.println("\n\n\n 문제 10 정수를 입력받아 표준체중 출력하기");
			System.out.print(" 문제10 키 입력 : ");		double tall = 입력객체.nextInt();
			System.out.println(" 표준체중 계산식 : " + ( tall - 100 ) * 0.9);
			
			
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
			System.out.println("\n\n\n 문제 11 키와 몸무게를 입력받아 BMI 출력하기");
			System.out.print(" 문제11 몸무게 입력 : ");		double weight = 입력객체.nextDouble();
			System.out.printf(" BMI : %.1f \n" , ( weight / ( (tall/100) * (tall/100) ) ) );
		*/
		/*
		//문제12: inch 를 입력받아 cm 로 변환하기
			System.out.print(" 문제 12 inch 입력 : "); double inch = 입력객체.nextDouble();
			System.out.println(" cm 변환 값 : " + inch * 2.54);
			
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
			System.out.print(" 문제 13 중간고사 점수 : "); double 중간고사 = 입력객체.nextDouble();
			System.out.print(" 문제 13 기말고사 점수 : "); double 기말고사 = 입력객체.nextDouble();
			System.out.print(" 문제 13 수행평가 점수 : "); double 수행평가 = 입력객체.nextDouble();
			중간고사 *= 0.3; 기말고사 *= 0.3; 수행평가 *= 0.4; 
			System.out.printf(" 반영비율별 점수 : %.2f \n" , (중간고사 + 기말고사 + 수행평가));
			
			
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
			 	//int x = 10;
				//int y = x-- + 5 + --x;
				//printf(" x의 값 : %d , y의값 :  %d ", x, y)	
					//1) x-- +5 => 10+5  +가 우선이라서 x+5 = 15 
					//2) x-- => 10 -> 9   그다음 x = 10 에서 1을 빼서 x=9
					//3) + --x => 9 -> 8  여기서는 -- 먼저 그래서 x = 8
					//4) 15 + x = 15+8 = 23 
			
		*/	
		//p.102 ~ 105
		/* 3번 문제 풀이
			 * int x = 10;
			 * int y = 20;
			 * int z = (++x) + (y--);
			 * ++x 먼저 반영 => x=11
			 * 11+(y--)
			 * 11+y부터 반영 => 31
			 * z= 31
			 * 그후에 y--반영해야하지만 z값은 이미 31로 끝났으므로 (y--가 후위연산이므로 앞에 명령부터 처리하고 --를 후에 반영)
			 * z= 31
			 */
		/* 4번 문제 풀이
		 	#1. pencils/students
		 	#2. pencils%students
		 
		int v1 =534;
		int v2=30;
		int x1 = v1%v2;
		System.out.println(x1);
		*/
		
		/* 5번 문제 풀이
		 	value % 100
		 */
		/* 6번 문제 풀이
		int l = 5;
		int b = 10;
		int h = 7;
		double area = (double)(l+b)*h/2;
		System.out.println(area);
		답 : ( (double)( lengthTop + lengthBottom ) ) * height / 2
			( (double) lengthTop + lengthBottom ) )/2 * height
			항변화 먼저 시켜야 되므로 괄호 두개
		*/
		/* 7번 문제 풀이
		 x>7 => T, Y<=5 =T T && T => T, 답 :T
		 x%3 == 1 => F, y%2 = 1 => F, 답 : F
		 */
	} // m e

} // c e
