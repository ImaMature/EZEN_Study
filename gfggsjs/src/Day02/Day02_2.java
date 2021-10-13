package Day02;

public class Day02_2 {


		
		// 변수 : 하나의 값을 저장할 수 있는 메모리 공간 (=리터럴)
			// 메모리 [ 주기억장치 = RAM ] : 현재 실행 중인 프로그램 기억
				// 프로그램 <---- 프로세스[스레드] <---- 명령어[코드] 집합
			// 변수 개수 증가 ---> 용량 증가 ---> 속도 감소
			// 변수 효율성 => 자료형
		
		// 변수 선언
			// 자료형 변수명 [임의]
			// int age;
		
		// 변수명 규칙
			// 숫자로 시작 X  // 대소문자 구분
		
		// 변수값 저장 [ 오른쪽 값이 왼쪽에 대입 : 대입 연산자는 '=' ]
			// int score; // 변수 선언
			// score = 90; // 변수에 90값 대입
	
		// 변수는 선언된 블록 내에서만 가능 [ 괄호 안으로 이동 가능 // 괄호 밖으로 이동 불가 ]
	public static void main(String[] args) {	
		
		// 교재 p35 예제
		int value= 10 ; // int형 자료의 value 변수명을 갖는 변수 선언과 동시에 10 대입
		
		int result = value + 10; // 변수 + 값 가능, <변수는 연산이 가능>
		
		System.out.println(result);
		
		// p.38 자료형
			// 자료형 사용 목적 : 메모리 효율성 [ 적절한 사용 ]
			// 컴퓨터는 기계어 사용 [0 과 1] 단위 : bit => 0 혹은 1
				// 1bit * 8 => 8bit => 1byte		[ 01010101 => 1byte [ 8칸 ] ]
				// 1byte *1024 => 1024byte => 1kb 등등..
				// * 컴퓨터는 byte 단위로 용량을 처리함 예시) c드라이브 속성 -> 로컬 디스크 용량 확인
				
		/* [논리]
		 * boolean 1비트	=	true, false
		 * 
		 * [문자]
		 * char  2바이트	=	문자 [유니코드]
		 * 
		 * [정수]
		 * byte  1바이트	=	+-127
		 * short 2바이트	=	+-3만정도
		 * int	 4바이트	=	+-20억정도
		 * long	 8바이트	=	+-20억이상
		 * 
		 * [실수]
		 * float 4바이트	=	소숫점 8자리까지 표현
		 * double8바이트	=	소숫점 16자리까지 표현
		 * 
		 */
		
		
		//p.40 byte 
		
		//byte의 범위 [ -128 ~ +127 ]
		
		byte var1 = -128; System.out.println(var1); // 옆줄로 sysout을 해도 출력됨 ;가 코드를 종료 시켰기 때문
		byte var2 = -30; System.out.println(var2); 
		byte var3 = 30; System.out.println(var3);
		//byte var4 = 128; System.out.println(var4); // 오류
		byte var4 = 'j'; System.out.println(var4);
		
		//p.43 char
		// [한 글자]
		char c1 = 'A';		System.out.println(c1);
		char c2 = 65;		System.out.println(c2);
		char c3 = '\u0041';	System.out.println(c3);
		
		char c4 = '가';		System.out.println(c4);
		char c5 = 44032;	System.out.println(c5);
		char c6 = '\uac00';	System.out.println(c6);
		// 컴퓨터는 어떻게 문자를 처리하나???
			// 아스키 코드(ASCII) : 미국 [ 기계어 ---> 영어 ---> 기계어 ] => 128문자
			// 유니코드[java] : 전세계 모든 문자 표현, 자바는 유니코드를 기본으로 사용. 아스키코드보다 용량이 큼.
		
		char b = 'B';
		int uniCode = b;
		System.out.println(uniCode);
		//char 
		//------------------------------------------------------------------------------------------------------
		
		// p.44 ~ 45 short, int
		// short [ 2byte ], int [ *기본 정수 자료형, 4byte ] 타입
				
		short num1 = 30000;		System.out.println(num1);
		//short num2 = 40000; 	System.out.println(num2); //오류 용량초과로 실행안됨
		//short는 약 30000까지 정수 값을 저장 가능
		
		int num2 = 10;		System.out.println(num2);
		int num3 = 012;		System.out.println(num3); // 8진수라 10 나옴
		int num4 = 0xA;		System.out.println(num4); // 16진수 10
		int num4_1 = 0xB;		System.out.println(num4_1); // 16진수 11
		
			// 진수 목적 : 컴퓨터가 표현할 수 있는 단위 한계 해결하기 위함
			// 2진수 [ 0, 1 ] : 기계어
			// 8진수 [ 0 ~ 7 ]									[ 0 ]
			// 10진수 [ 0 ~ 9 ] : 사람
			// 16진수 [ 0 ~ 9, A, B, C, D ....] : 다양한 표현 단위		[ 0x ] 
		
		// p.46 : Long [ 8byte ] : 20억 이상
		Long num5 = 2000000000L; System.out.println(num5); 
		// int 타입의 저장범위 [20억]을 넘어서는 큰 정수는 반드시 정수값 뒤에 소문자나 대문자 L을 넣어야 함. 
		
		// p.47 ~ 48 : float [ 4byte ] , double [ *기본 실수 자료형 / 8byte ]
		
		double val = 3.14; 			System.out.println(val);
		//float val2 = 3.14; 	System.out.println(val2); // 오류! 3.14는 실수 double형, 그래서 float에 넣을 수 없음.
		float val2 = 3.14f;			System.out.println(val2); // 값 뒤에 f를 넣어주면 출력 가능
		
		double val3 = 0.1234567890123456789; System.out.println(val3); // 소숫점 18자리까지 표현 가능
		float val4 = 0.1234567890123456789f; System.out.println(val4); // 소숫점 8자리까지 표현 가능
		
		// boolean : 비트 [0(false), 1(true)]
		boolean bol = true; 		System.out.println(bol);
		//boolean bo2 = 10; 		System.out.println(bol2); 
		// 오류!! boolean은 true나 false 밖에 출력 못하기 때문에 숫자가 들어가면 안됨.
		
		// p.49 ~ 51 타입변환
			// 1. 자동 타입변환 [ 크기순 : 작은 상자에서 큰 상자로 이동 가능 ]
				// byte -> short/char -> int -> long -> float -> double
				// byte + byte => int / byte [x]
				// int + byte => int => int
			// int + float => int => float에 속할 수 있음
			// int + double => int => double에 속할 수 있음
				// * 큰 상자에서 작은 상자로 이동 불가 즉, ***반대는 불가!
				// char은 문자열이기 때문에 short로 형변환이 안됨.
				
		byte bytevalue1 = 10;
		int intvalue1 = bytevalue1; // 자동 형변환 [ 가능 ] byte -> int
		System.out.println("intvalue : " + intvalue1);
		//byte bytevalue2 = intvalue; // 불가!! int -> byte 
		
		
			// 2. 강제 타입변환 [ 메모리 손실 => 데이터 손실 ] => Casting
				// 자료형 변수명 = (자료형)변수명;
			// p.54 
		byte bytevalue2 = (byte)intvalue1;
		
		/*ex) int intValue3 = 1;
			  short shortvalue3 = (short) intValue3;
			  메모리가 큰 변수 (int>short) 앞에 변환하고자 하는 데이터 타입 (short) 투입
			*/
		int intValue3 = 1;
		  short shortValue3 = (short) intValue3;
		  System.out.println("shortValue3 : " + shortValue3);
		
			//p. 60
		//5번
//		byte byteValue = 10;
//		char charValue = 'A';
//		
//		int intValue = byteValue;
//		int intValue = charValue;
//		short shortVaule = charValue;
//		double doubleValue = byteValue;
		  /*short과 char은 모두 2 byte의 크기를 갖지만, 
		  short의 범위는 -215 ~ 215-1(-32768~32767)이고 
		  char의 범위는 0~216-1(0~65535)이므로 서로 범위가 달라서 
		  둘 중 어느 쪽으로의 형변환도 값 손실이 발생할 수 있으므로 
		  자동적으로 형변환이 수행될 수 없다.*/
		
		/*6번  
		  String형은 class라서 char형으로 변환될 수 없다.*/
		  
		// 7번
		//아스키코드에 공백이 없다. 그래서 문자
		//char char2 = ''; // 값 없음과 공백은 다른 것이다.
		//String 변수는 ""가능 char 초기화하려면 ' '이렇게 작은 따옴표 사이에 스페이스바 넣어야함
		
		// 8번
		// 5는 int
		// 왜냐면 정수이고 연산시 기본 타입은 int
		// 그래서 바이트 + 바이트 = int
		// int + float => int => float에 속할 수 있음
		// int + double => int => double에 속할 수 있음
		
		
		
		
//		float floatvalue = 2.5f;
//		float result1 = 5 + floatvalue;
//		System.out.println(result1);
		
		int amd = 1234567890;	// int 데이터 타입에서 float 데이터 타입으로 자동 형변환
		int nvidia = 1234567890;	// float 데이터 타입에서 int 데이터 타입으로 강제 형변환
		
		float intel = nvidia;
		nvidia = (int) intel;
		
		int lisasu = amd - nvidia;
		System.out.println(lisasu); // -46이 나옴
		 // 이는 int 값을 float으로 자동 형변환 하면서 문제가 발생했기 때문
		 // float이 아닌 double 데이터 타입을 사용해주면 문제 해결
		 // 0이 나옴
		
		int intV = 10;

		double doubleV = 5.5;

		double result2 = intV + doubleV;      
		
		System.out.println(result2);
		
		//참고 링크 https://stage-loving-developers.tistory.com/8
		
	}
}
