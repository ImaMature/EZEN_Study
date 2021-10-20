package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day_15_문제2_풀이 {

	//문제2 : set 컬렉션
	// * 로또 프로그램
	// 1. 6개 입력받아 set컬렉션에 저장하여 
	// [ 조건 ] 중복값 허용X
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.println("1~45 숫자 선택 ( 중복 불가 ) : ");
			int num = sc.nextInt();
			
			if(num < 1 || num > 45) {
				System.out.println("선택할 수 없는 숫자입니다.");
			}
			else{
				//중복확인
				if(set.contains(num)) {
					System.out.println("**중복번호 입니다.");
				}else {
					set.add(num); // 저장
					System.out.println("확인 : " + set); // 확인하기
				}
			}
			//무한루프 끝나는 조건 : 6개의 숫자 입력
			if(set.size()==6) break;
		}
	}
}
