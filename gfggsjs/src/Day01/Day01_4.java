package Day01;

import java.util.Scanner;

public class Day01_4 { //c s

	public static void main(String[] args) { //m s
		
		// 1. 입력객체 선언 [ 키보드로부터 입력 값을 저장하는 객체]
		Scanner 입력객체 = new Scanner(System.in);
			// 객체선언 : 클래스명(Scanner) + 객체명[임의](입력객체) = new 생성자();
		
		
		// 2. 입력받은 값 꺼내와서 변수(저장상자)에 저장
			// 변수는 값을 저장할 수 있는 메모리 [ 기억장치 ] 
//		System.out.print("첫번째 입력 : ");
//		String 첫번째입력 = 입력객체.next();
//			// String : 문자열 클래스 : 문자열을 저장하는 객체
//		
//		System.out.print("두번째 입력 : ");
//		int 두번째입력 = 입력객체.nextInt();
//			//int : 정수형[숫자] 자료형 : 정수를 저장하는 변수 선언
//			//double : 실수형[숫자] 자료형 : 소수 등 실수 
//		
//		// 3. 변수 출력
//		System.out.println("첫번째 입력 값은 : " + 첫번째입력);
//		System.out.println("두번째 입력 값은 : " + 두번째입력);
//		
//		입력객체.close();
		
		
		// 문제1
		/*
		 * 
		 * 학생 1명의 이름과 1~3교시의 출력 여부를 입력받아 입력받은 값을 아래와 같이 출력
		 *  					[[ 출석부 ]]
		 * -----------------------------------------------
		 * 이름		1교시		2교시		3교시		비고
		 * 강호동		출석		결석		출석
		 * -----------------------------------------------
		 * 
		 */
		System.out.print(" 학생명 입력 : ");	String name = 입력객체.next();
		System.out.print(" 1교시 출석 : ");	String class_1 = 입력객체.next();
		System.out.print(" 2교시 출석 : ");	String class_2 = 입력객체.next();
		System.out.print(" 3교시 출석 : ");	String class_3 = 입력객체.next();
		
		System.out.println("\t\t [[ 출석부 ]]");
		System.out.println("--------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println(name + "\t" + class_1 + "\t" + class_2 + "\t" + class_3);
						// 변수 + 제어문자 + 변수 + 제어문자 + 변수 + 제어문자 + 변수
		System.out.println("--------------------------------------");
		// 변수 (name, class_1같은 것) 에는 ""를 붙여서는 안된다
		입력객체.close();
	}//m e
	
}//c e
