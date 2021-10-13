package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		// 문제1 : 2개의 정수를 입력받아 더 큰 수 출력
		
		Scanner sf = new Scanner(System.in);
		/*System.out.println("<문제1> 정수1 입력 : ");		int number1 = sf.nextInt();
		System.out.println("<문제1> 정수2 입력 : ");		int number2 = sf.nextInt();
		
		if 		(number1>number2) 			System.out.println("더 큰수는 : " + number1);
		else if (number1 < number2) 		System.out.println("더 큰수는 : " + number2);
		else 								System.out.println("두 수는 같다.");
				
		// 문제2 : 3개의 정수를 입력받아 가장 큰 수 출력
		
		System.out.println("<문제2> 정수1 입력 : ");		int number3 = sf.nextInt();
		System.out.println("<문제2> 정수2 입력 : ");		int number4 = sf.nextInt();
		System.out.println("<문제2> 정수3 입력 : ");		int number5 = sf.nextInt();
		
		if 		(number3>number4 && number3>number5) 	{System.out.println("제일 큰 수는 : " + number3);}
		else if (number4>number3 && number4>number5) 	{System.out.println("제일 큰 수는 : " + number4);}
		else if	(number5>number3 && number5>number4)	{System.out.println("제일 큰 수는 : " + number5);} 
		else											 System.out.println("세 정수는 같다.");
		*/
		
		
		// 문제3 : 4개의 정수를 입력받아 가장 큰 수 출력
		/*
		System.out.println("<문제3> 정수1 입력 : ");		int num1 = sf.nextInt();
		System.out.println("<문제3> 정수2 입력 : ");		int num2 = sf.nextInt();
		System.out.println("<문제3> 정수3 입력 : ");		int num3 = sf.nextInt();
		System.out.println("<문제3> 정수4 입력 : ");		int num4 = sf.nextInt();
		
		/*if      (num1>num2 && num1>num3 & num1>num4) {System.out.println("제일 큰 수는 : " + num1);}
		else if (num2>num1 && num2>num3 & num2>num4) {System.out.println("제일 큰 수는 : " + num2);}
		else if (num3>num1 && num3>num2 & num3>num4) {System.out.println("제일 큰 수는 : " + num3);}
		else 										 {System.out.println("제일 큰 수는 : " + num4);}
		*/
		
		//다른 간편한 방법			// 스왑방식 (임시변수인 템프(Temp))를 만들어 사용하는 방식
		/*
		int maxim = num1; 
		// maxim 변수에 첫번재 값 넣기
		
		if( maxim < num2 ) maxim = num2;
		if( maxim < num3 ) maxim = num3;
		if( maxim < num4 ) maxim = num4;
		System.out.println("가장 큰 수는 : " + maxim);
			
		// 문제4 : 4개의 정수를 입력받아 오름차순 정렬
		
		System.out.println("<문제4> 정수1 입력 : ");		int n1 = sf.nextInt();
		System.out.println("<문제4> 정수2 입력 : ");		int n2 = sf.nextInt();
		System.out.println("<문제4> 정수3 입력 : ");		int n3 = sf.nextInt();
		System.out.println("<문제4> 정수4 입력 : ");		int n4 = sf.nextInt();
		
		int temp; // 교환시(Swap) 사용되는 임시변수
		
		 // 1) 1번째 변수와 2,3,4번째 변수와 비교 = 3번
		if( n1 > n2 ) { temp = n1 ; n1 = n2; n2 = temp; }		
		if( n1 > n3 ) { temp = n1 ; n1 = n3; n3 = temp; }
		if( n1 > n4 ) { temp = n1 ; n1 = n4; n4 = temp; }
		
		 // 2) 2번째 변수와 3,4번째 변수와 비교 = 2번
		if( n2 > n3 ) { temp = n2 ; n2 = n3; n3 = temp; }
		if( n2 > n4 ) { temp = n2 ; n2 = n4; n4 = temp; }
		 // 3) 3번재 변수와 4번째 변수와 비교 = 1번
		if( n3 > n4 ) { temp = n3 ; n3 = n4; n4 = temp; }
		 // 4) 4번재 변수는 비교를 3번 받았기 때문에 비교 X
		
		System.out.printf("오름차순 : %d %d %d %d \n", n1, n2, n3, n4);
		 //printf 사용하면 %d에 정수 순서대로 대입
		*/
		
//========================= 크면 뒤로 가는 것 => 오름차순 =====================================
		
		// 문제5 : 4개의 정수를 입력받아 내림차순 정렬		// 오름차순과 부등호만 반대로
		/*
		 // 1) 1번째 변수와 2,3,4번째 변수와 비교 = 3번
		if( n1 < n2 ) { temp = n1 ; n1 = n2; n2 = temp; }
		if( n1 < n3 ) { temp = n1 ; n1 = n3; n3 = temp; }
		if( n1 < n4 ) { temp = n1 ; n1 = n4; n4 = temp; }
				
		 // 2) 2번째 변수와 3,4번째 변수와 비교 = 2번
		if( n2 < n3 ) { temp = n2 ; n2 = n3; n3 = temp; }
		if( n2 < n4 ) { temp = n2 ; n2 = n4; n4 = temp; }
		 // 3) 3번재 변수와 4번째 변수와 비교 = 1번
		if( n3 < n4 ) { temp = n3 ; n3 = n4; n4 = temp; }
		 // 4) 4번재 변수는 비교를 3번 받았기 때문에 비교 X
				
		System.out.printf("내림차순 : %d %d %d %d \n", n1, n2, n3, n4);
		*/	
				
				
		// 문제6 : 로그인페이지
			// 입력 : 아이디와 비밀번호 입력받기
			// 조건 : 회원아이디 admin, 비번 1234일때 로그인 성공, 아님 실패 출력
		
		System.out.println("================로그인 페이지================");
		System.out.print("아이디 : "); 		String id = sf.next();
		System.out.print("비밀번호 : "); 	int password = sf.nextInt();
		
		//if( id == "admin") //admin은 사용 안됨
		if (id.equals("admin")) {
			// String 비교시 equals 메소드 사용		// id가 admin이면
			
			if (password == 1234) {	
				System.out.println(" >>>>>> 로그인 성공 <<<<<<");
				// return; // 가장 가까운 메소드(함수) 종료		// main 함수 종료	 //	return함수는 나중에 진도나갈때 알려줌
			}else { 
				System.out.println("[로그인 실패] 패스워드가 틀렸습니다.");
			}
			
		}	
		else { 
			System.out.println("[로그인 실패] 존재하지 않는 아이디입니다.");
			
		}
		
		//p. 115 한번 집에서 해보기
		
		
	}
}
