package Day01;

public class Day01_2 { // 클래스 시작 ( c    s)
	
	public static void main(String[] args) { // (메인 시작)  m s
		
		// 1. 출력 
			// 1) print(출력할 문구) : only 출력
		// ex1) syso + ctrl + 스페이스 바
		System.out.print("java");
		System.out.print(12345); // 기계어라서 숫자에는 문자처리 X
		System.out.print("java10"); // 문자 + 숫자 -> 문자처리
		
			// System : 미리 만들어진 시스템이라는 클래스 
				// out : 출력 스트림
					// print (인수 : 출력하고 싶은 말) : 출력 함수
			// "." : 클래스 내 멤버 (함수, 변수) 접근 연산자 [특수문자]
			// " "(큰 따옴표) 와 ' '(작은 따옴표) 차이 ??
				// 큰 따옴표는 키워드[미리 작성된 단어], 변수 등 제외한 모든 문자에 문자처리하는데 쓰임
		
		// System.out.println() <- main 없이 실행 불가
		// main + ctrl + 스페이스 바
		// ";" : 변수 간 한 줄의 실행 코드 끝 [ 열처리 ]
		//ctrl + F11 = 컴파일
		
			// 2) println(출력할 문구) : 출력 후 줄 바꿈 [라인 바꿈]
		// ex2) sysout + ctrl + 스페이스바
		System.out.println("java");
		System.out.println(12345);
		System.out.println("java10");
		
			// 3) printf( 형식문자, 출력문구 ) : 형식문자 맞는 출력
				// f => format : 모양, 서식화된 출력을 하겠다는 의미
				// 형식문자
					// %d : 10진수 정수 형태의 출력
					// %f : 실수
					// %s : 문자열
					// %c : 문자
	
		// ex3)
		System.out.printf("java");
		System.out.printf("%d", 12345);
		System.out.printf("%s", "java10");
		System.out.printf("나이는 %d 입니다." , 20);
		// %d에 뒤 숫자를 대입하는 것
		System.out.printf("나이는 " + 20 + "살 입니다.");
			// + : 연결 연산자
		
			// 4) 제어문자 [ 교재 p.34 ]
				// \ : 엔터 위에 원화 기호
				// \n : 줄바꿈
				// \t : 탭 [들여쓰기 => 5칸]
				// \r : 리턴 [맨 앞으로 이동]
				// \\ : \ 하나 출력
		System.out.print("\njava\n"); //앞 뒤로 줄 바꿈
		System.out.print("\t 12345 "); // 들여쓰기
		System.out.print("\r java10"); // 맨 앞으로
		
		
			// 5) 문제 1
			/* 출력결과
			 * 					[[ 출석부 ]]
			 * -----------------------------------------------
			 * 이름		1교시		2교시		3교시		비고
			 * 강호동		출석		결석		출석
			 * 유재석		출석		결석		출석 
			 * -----------------------------------------------
			 */
		System.out.println("\n\n");
		System.out.println("\t\t\t [[ 출석부 ]]");
		System.out.print("------------------------------------------------------------");
		System.out.println("\n이름\t\t1교시\t\t2교시\t\t3교시\t\t비고");
		System.out.print("강호동\t출석\t\t결석\t\t출석");
		System.out.println("\n유재석\t출석\t\t결석\t\t출석");
		System.out.println("------------------------------------------------------------");
		
			// 6) 문제 2
			// 고양이 출력
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
			// 7) 문제3 
			// 개 출력
			// 큰 따옴표 출력하려면 큰 따옴표 앞에 \집어 넣기
		System.out.println("\n|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
	} // (메인 끝) m e
	// 출력

} // 클래스 끝 (c    e)
