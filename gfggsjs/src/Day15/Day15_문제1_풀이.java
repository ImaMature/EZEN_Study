package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_문제1_풀이 {

	/* 
	 * 문제1. list 컬렉션 이용
	 * 		* 대기명단 프로그램
	 * 			[메뉴]		1. 명단 추가 (인원 수 입력받아 대기번호 반환)	
	 * 						2. 명단 취소 (대기번호 입력받아 명단 취소)
	 * 						3. 명단 입장 (대기1번부터 입장, 없음 없다고 하기)[관리자]
	 * 
	 * 
	 * 
	 * 문제2. set컬렉션
	 * 		로또 프로그램 
	 * 			1. 6개 숫자 입력받아서 set 컬렉션에 저장해 출력
	 * 			2. 중복값 사용 X
	 */
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//0. 리스트 객체에 Interger 객체들을 저장
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			//////////////////////////////////////////////////////////
			System.out.println("=-----------대기현황------------=");
			for(int i =0; i<list.size(); i++) {
				System.out.println("대기번호" + (i+1)+"번" +" 인원 :" + list.get(i));
			}
			
			System.out.println("--------------------------");
			System.out.println("[[대기명단 프로그램입니다.]]");
			System.out.println("[[1.명단 추가 | 2. 명단 취소 | 3. 명단 입장]]");
			System.out.print("숫자를 입력해 선택하여 주세요 > : "); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("--------------------------");
				System.out.println("[[명단 추가 메뉴입니다.]]");
				System.out.print("인원 수를 입력해주세요. > : "); int count = scanner.nextInt();
				System.out.println("추가된 인원 수는 "+count+"명 입니다.");
				//삽입
						list.add(count);
						System.out.println("고객님의 대기번호 : " + list.size());
						
					}
			}else if(ch==2) {
				System.out.println("--------------------------");
				System.out.println("[[명단 취소 메뉴입니다.]]");
				System.out.print("취소할 대기번호를 입력해주세요. > : "); int num = scanner.nextInt();
				//삭제
				list.remove(num-1); // -1을 깎는 이유 [ 대기번호는 1부터//인덱스 0부터)
				System.out.println("**취소되었습니다.");
				}
			}else if(ch==3) {
				System.out.println("--------------------------");
				System.out.println("[[명단 입장 메뉴입니다.]]");
				System.out.println("--------------------------");
				System.out.println("입장할 대기번호를 입력해주세요. > : "); int ch3 = scanner.nextInt();
				if(list.isEmpty()) {
					System.out.println("죄송합니다. 명단이 비어있습니다.");
					
				}else {
					System.out.println("대기번호 1번 입장");
					list.remove(0); //대기번호1번삭제
			}
		}//while end
	}//main end
}//class end

