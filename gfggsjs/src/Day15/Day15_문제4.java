package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4 {
/*
 * 문제4 : 스택 구조를 이용한 문자열 역순 출력
 * 	[조건1] Stack 구조
 * 	[조건2] 입력받은 문자열을 순서대로 스택에 저장
 * 		Char이나 String써도 됨
 * 	[조건3] 문자열 반대로 출력
 * 	[출력예시] 입력 : ABC
 * 			 출력 : CBA
 * 	//하나씩 빼오기
 */
	


	public static void main(String[] args) {
		Stack<Character> alphabet = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");  String input = sc.next();
		
		
		for(int i=0; i<input.length(); i++) {
			alphabet.push(input.charAt(i)); //charAt = 문자열을 쪼개서 하나씩 쌓기
		}
		//입력값이 하나씩 잘나오는지 확인하기
		System.out.println(alphabet);

			// 꺼내기
		for ( int i =0; i<input.length(); i++) {
			System.out.print(alphabet.pop()); // 앞에서부터 입력한 문자열 길이만큼 나옴
			// pop  은행에서 쓰는 동전케이스에서 동전 빼는거 생각하면됨
		}
		
	}
}
