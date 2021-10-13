package Day02;

public class Day02_3 {


		/* p.64 연산자 [ 연산시 사용되는 특수문자]
			 산술연산자 : + - * / %(나머지)
			 
			 연결연산자 : +
			 
			 비교연산자 : 결과 TURE or FALSE
			 	>= 이상 (크거나 같다)		> 초과 (크다)		== (같다)
			 	<= 이하 (작거나 같다)		< 미만 (작다)		!= (같지 않다)
			 	
			 논리연산자 : 비교연산자 2개 이상일 때
			 	&& AND (이면서, 면서, 이고, 그리고, *모두)
			 	|| OR  (이거나, 거나, 또는, *하나라도)
			 	!  NOT (부정, 반대) 
			 	
			 대입연산자 : 
			 	A = B	[ 오른쪽 값을 왼쪽에 대입 ]
			 	A += B	[ 오른쪽 값을 왼쪽 값에 더한 후 왼쪽에 대입 ]
			 	*=	/=	-=	&=
						 
			 증감연산자
			 	++	[ 1증가 ]
			 	--	[ 1감소 ]
			 	
			 조건연산자
			 	조건식 ? true(참) : false(거짓)
			 	쉽게 말하면 조건식이 맞으면 true 아니면 false
			 	:(콜론) 기준으로 함
		*/
	
	
	public static void main(String[] args) {
		//. P76. 산술연산자
		
		int 정수1 = 10; int 정수2 = 20; //정수1 정수2 초기값 선언
									 //변수와 변수끼리 계산 가능
		System.out.println(" 더하기 : " + 정수1 + 정수2); // 1020
							// 문자 + 숫자 + 숫자 => 연결연산자
		System.out.println(" 더하기 : " + (정수1 + 정수2)); //30
									   // (숫자 + 숫자)가 먼저 계산됨.
	
		System.out.println(" 빼기 : " + (정수1 - 정수2)); //-10
		System.out.println(" 곱하기 : " + (정수1 * 정수2)); //200
		System.out.println(" 나누기 : " + (정수1 / 정수2)); //0
		System.out.println(" 나머지 : " + (정수1 % 정수2)); //10
		
		// p.70 증감연산자 [++ : 1증가, -- : 1감소]
			// 1씩 증가/감소하는 변수 => 규칙적인 증가/감소 => 보통 반복문에서 자주 사용.
			// 정수1 = 정수1 + 1
			// 정수1 += 1
			// 정수1++ (이게 젤 순서가 빠름)
			// 왜냐면 컴퓨터는 더하기 먼저 하고 그걸 왼쪽 정수1에 대입하기 때문
		
		정수1++; System.out.println(" 증감 : " + 정수1);
		정수1--; System.out.println(" 감소 : " + 정수1);
			// 선위증가 [ ++변수명 ], 후위증가 [ 변수명++ ]
			// 후위증가 [ 앞에 명령 처리하고 그 뒤에 1 증가]
		System.out.println(" 선위증가 : " + ++정수1);		// 1증가
		System.out.println(" 확인 : " + 정수1);			// 확인 11
		System.out.println(" 후위증가 : " + 정수1++);		// 11, ++를 뒤에 넣으면 출력 먼저 하고 1이 증가함
		System.out.println(" 확인 : " + 정수1);			// 12
		
		System.out.println(" 선위감소 : " + --정수1);		// 1감소 11
		System.out.println(" 확인 : " + 정수1);			// 11
		System.out.println(" 후위감소 : " + 정수1--);		// 11 (1감소 걸어놓음)
		System.out.println(" 확인 : "+ 정수1);				// (걸어놓은거 출력)1감소 10
		 
			
		// p. 88 비교 연산자
		System.out.println(" 이상 : " + (정수1 >= 정수2));	// 정수1(=10) >= 정수2(=20) false 
		System.out.println(" 이하 : " + (정수1 <= 정수2));	// 10 <= 20	true
		System.out.println(" 초과 : " + (정수1 > 정수2));	// 10 > 20	false
		System.out.println(" 미만 : " + (정수1 < 정수2));	// 10 < 20	true
		System.out.println(" 같다 : " + (정수1 == 정수2));	// 10 == 20 false
		System.out.println(" 같지 않다 : " + (정수1 != 정수2)); // 10 != 20 true
		
		
		// p. 92 논리 연산자 AND /OR <비교대상이 2개 이상일 때>
			// AND : 2개 이상의 비교 연산자가 모두 TRUE => 결과도 TRUE, 하나라도 FALSE => 결과도 FALSE
			// OR : 2개 이상의 비교연산자가 하나라도 TRUE => 결과도 TRUE
		
		int 정수3 = 30; int 정수4 = 40; // 정수3 정수4 초기값 선언
		
		System.out.println(" AND : " + (정수1 >= 정수2 && 정수4 >= 정수3));  // F && T => F
		System.out.println(" OR : " + (정수1 >= 정수2 || 정수4 >= 정수3));	// F && T => T
		System.out.println(" NOT : " + !(정수1 >= 정수2 || 정수4 >= 정수3)); // !T => F
		
		// P.98 ~ 99 대입 연산자
		정수1 += 1;	System.out.println("정수1 += : " + 정수1);
		// 변수명 += 값; 오른쪽 값을 왼쪽 변수에 더한 후에 왼쪽 변수에 대입
		// 해당 식은 정수1 = 정수1 + 1 과 같다.
		정수1 *= 10; System.out.println("정수1 *= : " + 정수1);
		정수1 -= 10; System.out.println("정수1 -= : " + 정수1);
		정수1 /= 10; System.out.println("정수1 /= : " + 정수1);
		
		// p.100 조건 연산자 [형식] 조건식(비교연산자) ? 참(true) :(아니면) 거짓(false)
			int 점수 = 85;
			char 등급 = 점수 > 90 ? 'A' : 'B';	System.out.println(등급);
			char 등급2 = 점수 > 90 ? 'A' : 점수 >=80 ? 'B' : 'C';	System.out.println(등급2); 
			//점수가 90보다 높으면 A출력 아니고 점수가 80보다 높거나 같으면 B 출력, 아니면 C 출력
			// : => 아니면
		
		
	}

}
