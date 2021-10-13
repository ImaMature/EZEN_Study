// 입력하는 법

package Day01;

import java.util.Scanner;

public class Day01_3 { // c s

	public static void main(String[] args) { // m s
	
		
		// 출력 클래스 : System
		System.out.println("입력 : "); // 출력 메소드 호출
		
		
		// scan + ctrl + 스페이스 바 
				// Scanner java.util 선택
		// 입력 클래스 : Scanner (대문자)
			// 1. 키보드로부터 입력받은 값을 메모리[저장장치] 객체 저장
			// 2. 다른 변수로 입력 값 옮기기
			// 3. 새로운 입력 값 받기
		// 객체 : scanner (소문자)
		Scanner scanner = new Scanner(System.in);
			// 객체 : 클래스 기반으로 생성된 메모리 공간
				// 객체 선언 : 클래스명, 객체명[임의] = new 생성자( );
					// new : 메모리를 할당하는 연산자 
					// System.out : 출력
					// System.in : 키보드로부터 입력 값을 가져옴
					// new 뒤의 Scanner 클래스 : 키보드로 부터 입력받은 값을 메모리[저장장치, 여기서는 new] 객체 저장
			// 객체에서 꺼내오기
				// .next() : 객체 내 저장된 문자열 호출 [ 띄어쓰기 X ]
				// .nextInt() : 객체 내 저장된 정수 호출
				// .nextLine() : 객체 내 저장된 문자열 호출 [ 띄어쓰기 O ]
				// 등등
			
			// 객체에서 가져오기
		String string1 = scanner.next();
			// 객체 내 저장된 입력 값을 변수에 저장
			// 문자열을 꺼내오는 변수가 next
		System.out.println("입력된 문자열은 : " + string1);
		
			// 두번째 입력 값 꺼내오기
		String string2 = scanner.next();
			// 출력
		System.out.println("입력된 두번째 문자열은 : " + string2);

		scanner.close(); //scanner 객체 끝내기
 }// m e

}// c e