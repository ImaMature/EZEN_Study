package Day03;

import java.util.Scanner;

public class Day03_3 {

	//p.116 switch 스위치 
	// switch와 if의 차이점 
		/*
		  ***switch는 if문 처럼 조건식이 true일 경우에 블록 내부의 실행문을 실행하는 것이 아니라, 변수의 값에 따라 실행문이 선택됨
		 
		 	if = 논리 제어 / switch = 데이터 제어
		 	경우의 수가 정해져 있는 경우 		=> 		switch가 속도 더 빠름
		 	경우의 수가 정해져 있지 않은 경우 	=> 		<if>
		 */
	/* switch의 형태 : switch ( key:검사대상 ) {
					 case 검사 : 실행문;
					 case 검사 : 실행문; 
					 case 검사 : 실행문; 
					 default : 실행문;
					 }
	*/
		// break : switch 혹은 반복문을 탈출시 사용되는 키워드 { 가장 가까운 중괄호 탈출 }
		// 반복문이 여러개 있으면 break도 여러개 써야됨
		// switch는 String 타입도 쓸 수 있다. (교재 p. 119)
		// char 타입도 가능 (p.118)
	
	public static void main(String[] args) {

		//예시1)
		int 점수 = 80;
		switch( 점수 ) { //점수는 검사!!!!
			//점수가 90이면
		case 90 : System.out.println("A등급 입니다.");					break;
			//점수가 80이면
		case 80 : System.out.println("B등급 입니다."); 					break;
		// 스위치는 if 처럼 밖으로 안나감 
		// [한 마디로 조건이 충족되면 검사된 case문부터 그 아래까지 다 실행함]
		
			//점수가 70이면
		case 70 : System.out.println("C등급 입니다.");					break;
			//그외
		default : System.out.println("탈락 입니다.");
				
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

			
			
			
			
		//예시2)	엘레베이터 이동
			int 버튼 = 3;
			switch( 버튼 ) {//switch start
				case 1 : 	System.out.println("1층으로 이동 "); break;
				case 2 :	System.out.println("2층으로 이동 "); break;
				case 3 : 	System.out.println("3층으로 이동 "); break;
				default : 	System.out.println("정지");
			}//switch end
			
			
		// p.118 char switch 문
		char grade = 'B';
		switch( grade ) {	//switch start	// 대소문자 관계없이 똑같은 알파벳이라면 동일하게 처리하기 	// char이라 작은따옴표 쓰기
			case 'A' :
			case 'a' :	
				System.out.println("우수 회원 입니다.");	break;
			case 'B' :
			case 'b' :
				System.out.println("일반 회원 입니다.");	break;
			default :
				System.out.println("손님 입니다.");
		} //switch end
		
		// p.119 String switch
		String position = "과장";	
		switch(position)	{ //switch start
				case "부장" : System.out.println("700만원"); break;
				case "과장" : System.out.println("500만원"); break;
				default : System.out.println("300만원");
		} // switch end
		
		//문제1 [switch] 국어, 영어, 수학 점수를 입력받아 평균이 90점 이상이면 "A등급" 80점 이상이면 "B등급" 나머지 "탈락"
		
		Scanner xx = new Scanner(System.in);
		System.out.print("국어 점수를 입력해 주세요 : "); int score1 = xx.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : "); int score2 = xx.nextInt();
		System.out.print("국어 점수를 입력해 주세요 : "); int score3 = xx.nextInt();
		
		int theAverage = (score1 + score2 + score3)/3;
				
		switch (theAverage/10) { //switch start
				// 1의 자리를 생략
		
			case 10 :
			case 9 : System.out.println("A등급");		break;
			case 8 : System.out.println("B등급");		break;
			default : System.out.println("탈락");
		 
		
		
		
		
		} //switch end
	} // m e
} // c e
