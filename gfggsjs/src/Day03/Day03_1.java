//제어문(조건문, 반복문)

package Day03;

public class Day03_1 { // c s

	
		
		
		//제어문 : if(논리 제어), switch(데이터 제어) // 사용하는 코드에 따라 용도가 다름
	
		//컴퓨터는 기계어를 사용한다. 이런 컴퓨터를 좀 더 똑똑하게 만들어주는 명령어가 바로 제어문
	
		//목적 [ 경우의 수에 따른 코드 처리 ]
			// 예시) 학생에게 1000원 주고 콜라 심부름
				// 1) 가장 가까운 편의점 => 콜라 X => false
				// 2) 다음 가까운 편의점 => 콜라가 만약 비싸다면? => false
				// 3) 다음 가까운 편의점 => 콜라 구매 => true
						// if (A 편의점 == 콜라 && 콜라가격 <= 1000 )	{ 구매 }
						// else if (B 편의점 == 콜라 && 콜라가격 <= 1000 ) { 구매 }
						// else if (C 편의점 == 콜라 && 콜라가격 <= 1000 ) { 구매 }
						// else { 복귀 }
	
			// 예시2) 엘레베이터 버튼 [ if(만약에 상승 버튼을 눌렀다면) ]
		
		
		//p108. if문
		// if는 true, false만 제어 가능		// 비교연산자나 관계연산자		// 컴퓨터가 어떤 판단을 할 때 경우의 수를 처리하는 명령문
		// 실행문 2개 이상일 때는 중괄호{} 사용
	
			// 형태1 : if(논리) true 실행문
					//여기서 논리 : true나 false
			// 형태2 : if(논리) true 실행문
			// 		  else false 실행문
			
			// 형태3 : if(논리) {실행문; 실행문;}	
	
			// 형태4 :	if ( 논리 ) {		}
			//			else if ( 논리2 )	 {		}
			//			else if ( 논리3 )	 {		}
			//			else if ( 논리4 )	 {		}
			// 			else { 논리 }
	
	
		public static void main(String[] args) { // m s
			
			
			//예시1) true 이면 실행문 실행
				if( 3 > 1 )  System.out.println("3이 1보다 크다."); // true
				// if 조건 하나일 때(코드가 한 줄일 때)는 if조건문 마지막에 세미콜론(;)을 넣어도 되지만, 
				// 여러 조건식일 때는 세미콜론을 넣으면 따로 실행이 안됨
			
			//예시2) false이면 실행문 실행 X
				if( 3 > 5 )  System.out.println("3이 1보다 크다."); // false 출력 안됨
		
			//예시3) true false 이면 실행문 실행
				if( 3 > 5 )  System.out.println("3이 1보다 크다."); // false
				else System.out.println("예3) 3이 5보다 작다"); // 출력
		
			//예시4) { }가 사용되는 경우 => 실행문 2개 이상일 때
				if( 3 > 2 )  { // if start
					System.out.println("true이면 실행되는 자리"); // false
					System.out.println("예3) 3이 2보다 크다"); // 출력
				} // if end
				else { // if start
					System.out.println("false이면 실행되는 자리");
					System.out.println("3이 2보다 작다");
				} // if end
				
			//예시5) 다양한 경우의 수에 따른 제어
				if( 3 > 5 )  System.out.println("3이 5보다 크다."); // false 	// 하나의 true값을 출력할때 else if 사용
				else if( 3 > 4 )System.out.println("예5)3이 4보다 크다"); // false
				else if( 3 > 3 )System.out.println("예5)3이 3보다 크다"); // false
				else if( 3 > 2 )System.out.println("예5)3이 2보다 크다"); // true 출력
				else System.out.println("true가 없다");
		
			//예시5_2)
				if( 3 > 5 )  System.out.println("3이 5보다 크다."); // false 	// 다양한 경우의 수를 따지고 싶을때는 if if if if
				if( 3 > 4 )System.out.println("예5)3이 4보다 크다"); // false
				if( 3 > 3 )System.out.println("예5)3이 3보다 크다"); // false
				if( 3 > 2 )System.out.println("예5_2)3이 2보다 크다"); // true 출력
				else System.out.println("true가 없다");
		
		
		
		// p.109 ~ 112, 115 그림 체크
		// p.109 예제
			int score = 93;
			// 점수가 90보다 크기 때문에 실행
			if( score >= 90 ) { System.out.println("점수가 90보다 큽니다."); System.out.println("등급은 A 입니다."); }
			// 점수가 90미만이 아니기 때문에 실행 X
			if( score < 90 ) { System.out.println("점수가 90보다 작습니다."); System.out.println("등급은 B 입니다."); }	
			
		// p.111 예제  이 예제가 위에 예제보다 더 바르다 = 효율이 더 좋다
			int score2 = 85;
			if( score2 >= 90 ) { System.out.println("점수가 90보다 큽니다."); System.out.println("등급은 A 입니다."); }
			else { System.out.println("점수가 90보다 작습니다."); System.out.println("등급은 B 입니다."); }
			
		// p.112 예제 
			int score3 = 75;
			if( score3 >= 90 ) 		{ System.out.println("점수가 100~90 입니다."); System.out.println("등급은 A 입니다."); }
			else if( score3 >=80 )  { System.out.println("점수가 80~89 입니다.");  System.out.println("등급은 B 입니다."); }
			else if( score3 >=70 )  { System.out.println("점수가 70~79 입니다.");  System.out.println("등급은 C 입니다."); }
			else 					{ System.out.println("점수가 70 미만 입니다.");  System.out.println("등급은 D 입니다."); }
		
		
		
		
	} // m e

} // c e
