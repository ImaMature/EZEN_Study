package study_ing;

import java.util.ArrayList;
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
	public static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
	ArrayList<Students> studentList = new ArrayList<>();

		while(true) {
			System.out.println("-------성적표 프로그램 입니다.-------");
			System.out.println("1. 입력하기 2. 종료"); int ch = scanner.nextInt();
			if(ch == 1 ) {
			System.out.print("번호 입력하기 >"); int num = scanner.nextInt();
			System.out.print("이름 입력하기 >"); String name = scanner.next();
			System.out.print("국어 성적 입력하기 >"); int kor = scanner.nextInt();
			System.out.print("영어 성적 입력하기 >"); int eng = scanner.nextInt();
			System.out.print("수학 성적 입력하기 >"); int math = scanner.nextInt();
			
			Students students = new Students(num, name, kor, eng, math);
			studentList.add(students);
			}
			
			
		}//while end
	}//main end
}//class end
