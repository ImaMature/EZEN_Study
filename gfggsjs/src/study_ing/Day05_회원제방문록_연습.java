package study_ing;

import java.util.Scanner;

public class Day05_회원제방문록_연습 {

	public static void main(String[] args) {
		

		//2. 회원제 방문록 프로그램		
		// [조건1] : 최대 100명 저장할 수 있는 회원 배열 [아이디, 비밀번호 입력]
		// [조건2] : 메뉴	
				// 1. 로그인
				// 2. 회원가입
		// [회원가입 선택했을 때]
			// 1. 아이디와 비밀번호를 입력받아 배열에 저장
			// 2. 아이디 중복불가 [배열에 기존 아이디가 존재하면 회원가입 실패]
		// [로그인 선택했을 때]
			// 1. 아이디와 비번을 입력받아 배열 내 존재하면 로그인 성공
			// 2. 아니면 실패
		// [로그인 성공 시 메뉴]
			// 1. 방문록 쓰기
			// 2. (모든) 방문록 확인
			// 3. 로그아웃
		// [방문록 남기기 선택했을때]
			// 내용을 입력받아 배열에 저장 [작성자 아이디도 같이 저장]
		// [로그아웃]
			// 초기메뉴로 돌아가기	
		
//		Scanner sc = new Scanner(System.in);
//		String [][] customers = new String [100][2];
//		
//		while(true) { // while start
//			System.out.println("\n\n\t [회원제 목록]");
//			System.out.println("------------------------\n[[1.회원가입 2. 로그인 선택 :");
//			int chocie = sc.nextInt();
//			
//			switch(choice) { // switch start
//				case 1 : // 1번 입력시
//					System.out.println(" [[ 회원 가입 페이지 ]] ");
//					System.out.println("아이디 입력 : ");		String ID = sc.next();
//					System.out.println("비밀번호 입력 : ");		String PW = sc.next();
//				
//					boolean IDcheck = true;
//					for(int i = 0; i<customers.length; i++) {
//						if(customers[i][0] != null && customers[i][0].equals(ID)) {
//							System.out.println("[경고] 중복된 아이디가 존재합니다!!!");
//							IDcheck = false;
//							break;
//						}
//					}
//					if(IDcheck) {
//						for (int i =0; i<customers.length; i++) {
//							if(customers[i][0] == null) {
//								customers[i][0] = ID; customers[i][1] = PW;
//								System.out.println("[[알림]] : 회원가입 완료.");
//								break;
//							}
//						}
//					}
//					break;
//					
//				case 2 : // 2번 입력시 
//					//로그인 입력
//					System.out.println(" --- 로그인 페이지 ---");
//					System.out.println("아이디 입력 : ");		String ID2 = sc.next();
//					System.out.println("비밀번호 입력 : ");		String PW2 = sc.next();
//					// 배열내 존재하면 성공 (중복 체크)
//					boolean login = true;
//				
//					}
//					
					// 아님 실패
					
					
//			} // swtich end	
//		} // while end
	} // main end
} // class end
