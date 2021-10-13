package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
	
	public static void main(String[] args) { // m s
		
		// 문제 3 : 방문록 입력받아 출력하기
		/* [입력받기] : 작성자, 내용, 날짜
		 * [ 출력 ]
		 * ----------------- 방문록 ----------------
		 * 	|  순번	| 작성자 |	내용		| 날짜	|
		 * 	| 	1	| 강호동 |	안녕하세요	| 09-28 |
		 * ---------------------------------------
		 */
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.print("작성자 : ");		String your_name = sc2.next();
			sc2.nextLine();
		System.out.print("내용 : ");		String text = sc2.nextLine(); //공백 O
		// scanner.nextLin(); //next 다음으로 nextLine이면 문제가 생김
				// 해결법 next와 nextLine 사이에 변수.nextLine();을 하나 더 쓰기
		System.out.print("날짜 : ");		String date = sc2.next();
		
		System.out.println("----------------- 방문록 ----------------");
		System.out.println("| 순번 |  작성자  |  내용 \t |  날짜  |");
		System.out.println("|  1  |  " + your_name + "  |  "+ text + "  | " + date + " |");
		System.out.println("---------------------------------------");
		
		sc2.close();
	} // m e
} // c e
