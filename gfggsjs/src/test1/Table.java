package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import test.Students2;

public class Table {

	public static void main(String[] args) {
	ArrayList<Students> array = new ArrayList<>();
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. 성적 등록 | 2. 성적표 출력 | 3. 프로그램 종료.");
				System.out.print("선택 > : "); int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("-----------------------[성적을 입력해주세요.]-----------------------");
					System.out.print("이름 : ");	String name = scanner.next();
					System.out.print("국어 : ");	int kor = scanner.nextInt();
					System.out.print("영어 : ");	int eng = scanner.nextInt();
					System.out.print("수학 : ");	int math = scanner.nextInt();
				
					int sum = ( kor + eng + math );
					double avg = sum/3;
					Students students = new Students(name, kor, eng, math, sum, avg);
					array.add(students);
					
				}else if (ch == 2) {
					System.out.println("--------------------------------------------------------------");
					System.out.println("\t\t\t성      적      표");
					System.out.println("--------------------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
					System.out.println("--------------------------------------------------------------");
					int i = 1;
					Collections.sort(array);
					
					for(Students z : array) {
						System.out.printf(i + "\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d", z.getName(), z.getKor(), z.getEng(), z.getMath(), z.getSum(), z.getAvg(), i);
						System.out.println(); i++;}
						
					System.out.println("--------------------------------------------------------------");
					
				}else if (ch == 3) {System.out.println("프로그램을 종료합니다."); break;
					
				}else { System.out.println("잘못된 입력입니다.");}
				
			}catch(Exception e) {
				System.out.println("[시스템 오류] 관리자에게 문의하세요. [" + e + "]");
			}
		}
	}

}
