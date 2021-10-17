package study_ing;

import java.util.Scanner;

public class 성적표 {
	/*
	 * 1. 데이터는 키보드로 입력받아 배열에저장
	 * 2. 성적 입력은 5명으로 하되 무제한 입력이 가능하도록
	 * 3. 번호, 이름, 국어, 영어, 수학 입력, 총점 평균구해서 출력
	 * 4. 평균은 소숫점 이하 2자리까지
	 * 5. 총점을 이용해 석차를 구하기
	 * 6. 입력 오류에 대해 예외발생 상황에 대한 처리하기
	 */
	static Scanner scanner = new Scanner(System.in);
	static 학생명단 [] arr = new 학생명단 [5];
	
	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			try {
				학생명단 학생명단 = new 학생명단();
				
				System.out.println("1. 성적입력 | 2. 출력 | 3. 프로그램 종료.");	int ch = scanner.nextInt();
				switch ( ch ) {
				case 1:
					System.out.println("성적을 입력하는 화면 입니다.");;
					학생명단.inputGrade();
					break;
				case 2:
					System.out.println("입력된 성적을 출력하는 화면 입니다.");
					학생명단.outputGrade();
					break;
				case 3:
					System.out.println("프로그램 종료.");
					run = false;
					break;
				}
				
				
			} catch(Exception e){ 
				System.out.println("에러 발생! 관리자에게 문의해 주세요." +"\n[에러내용: "+ e +"]");
				break;
			}
		}//while end
	}//main end
}//class end
