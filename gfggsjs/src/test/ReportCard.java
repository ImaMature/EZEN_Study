package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReportCard {
	/*
	 * 1. 데이터는 키보드로 입력받아 배열에저장
	 * 2. 성적 입력은 5명으로 하되 무제한 입력이 가능하도록
	 * 3. 번호, 이름, 국어, 영어, 수학 입력, 총점 평균구해서 출력
	 * 4. 평균은 소숫점 이하 2자리까지
	 * 5. 총점을 이용해 석차를 구하기
	 * 6. 입력 오류에 대해 예외발생 상황에 대한 처리하기
	 */
	
	public static void main(String[] args) {
	ArrayList<Students> array = new ArrayList<>();
		
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. 등록 | 2. 출력"); int ch = scanner.nextInt();
				if(ch==1) {
					
					System.out.println("등록화면입니다. 정보를 입력해 주세요.");
					System.out.print("이름 : "); String name = scanner.next();
					System.out.print("국어 : "); int kor_Grade = scanner.nextInt();
					System.out.print("영어 : "); int eng_Grade = scanner.nextInt();
					System.out.print("수학 : "); int math_Grade = scanner.nextInt();
	
					int sum = (kor_Grade+eng_Grade+math_Grade);
					double average = sum/3;
					Students a = new Students(name, kor_Grade, eng_Grade, math_Grade, sum, average);
					
					array.add(a);				
		
					System.out.println(a);
	
				}else if (ch==2) {
					System.out.println("출력 화면입니다.");
					System.out.println("----------------------------------------------------");
					System.out.println("\t\t  성    적    표");
					System.out.println("----------------------------1------------------------");
					System.out.println("번호\t이름\t국어\t영어\t1수학\t총점\t평균\t석차");
					System.out.println("----------------------------------------------------");
					int i = 1;
					Collections.sort(array);
						for(Students c : array) {
							System.out.printf(i+"\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d", c.getName(), c.getKor(),
									c.getEng(),c.getMath(),c.getSum(),c.getAverage(),i);
							System.out.println(); i++;
						}
					System.out.println("----------------------------------------------------");
					}
			}catch(Exception e) {System.out.println("잘못된 입력입니다. 관리자한테 가서 따지세요.");}
		}//while end
	}//main end
}//class end
