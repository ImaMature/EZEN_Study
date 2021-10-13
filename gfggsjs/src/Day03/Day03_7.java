package Day03;

import java.util.Scanner;

public class Day03_7 { //c s

	//p.127:
		// 1. 무한루프로 입력을 계속 받기
			// 무한루프 계속하는 경우
				//1) while(true)
				//2) while(boolean 변수)
		// 2. 변수 제어
	
	
	
	public static void main(String[] args) { //m s
		
		boolean run = true;	// boolean : true 혹은 false만 저장하는 기본 자료형
		int keyCode = 0;	//입력 변수
		int speed = 0;		//속도 변수
		
		// 무한루프 [ 조건이 false 일때까지 계속 반복실행 ]
		while( run ) { // while s		//조건이 true 실행, false 실행X
			
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("1.증속 2.감속 3.중지");
				System.out.print("선택 : ");		
				keyCode = scanner.nextInt(); // 키보드로부터 입력받기
				
				// 1 입력시 [ speed 변수 1 증가 ]
				if( keyCode == 1) {	speed++; System.out.println("=== 현재속도 :"+ speed); }
				
				// 2 입력시 [ speed 변수 1 감소 ]
				if( keyCode == 2) {	speed--; System.out.println("=== 현재속도 :"+ speed); }
				
				// 3 입력시 무한루프 종료
				if( keyCode == 3) { // if s
					run=false; System.out.println("=== [[ 프로그램 중지 ] ===");
			} // if e
		} // while e
	} // m e

} // c e
