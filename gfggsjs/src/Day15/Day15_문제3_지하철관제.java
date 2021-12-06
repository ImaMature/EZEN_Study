package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_문제3_지하철관제 {

/*	[조건1] 역 4개 (종점역 -> 용산 -> 서울 -> 구로 -> 종점역)
 * 	[조건2] 전철 3개 객체 [종점역에서 3개 전철 대기]
 *  [조건3] 출발 신호 받아서 해당역에서 출발해서 다음역으로 도착
 *  [조건4] 역 당 소요시간 2초
 *  [조건5] queue를 이용하기
 *  
 *  출발신호 메뉴
 *  1. 종점 2. 용산 3. 서울 4. 구로
 *  
 *  [예시]	1번 선택시 종점역에 먼저 들어온 전철을 다음역으로 이동
 *  [예시2]	만일 해당역에 전철이 없으면 없다 출력
 *  
 *  [예시]
 *  ----- 현 전철역 현황 -----
 *  종점역 : 전철3, 전철4
 *  용산역 : 전철2
 *  서울역 : 전철1
 *  구로역 : 전철X
 *  ---------출발 신호--------
 *  1.종점 2.용산 3.서울 4.구로
 */
	
	
	//객체구현 안하고 한 클래스에 다 때려박은거임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Train> 종점역 = new LinkedList<>();
		Queue<Train> 용산역 = new LinkedList<>();
		Queue<Train> 서울역 = new LinkedList<>();
		Queue<Train> 구로역 = new LinkedList<>();
	
		
		while(true) {
		
		
		System.out.println("1.종점 | 2.용산 | 3.서울 | 4.구로"); int ch = sc.nextInt();
		//객체 넣기
		
		종점역.offer(new Train("a1")); // 전철에 뭘 집어넣을지
		종점역.offer(new Train("b1"));
		종점역.offer(new Train("c1"));
	
		
	
			if(ch==1) {
				System.out.println("종점역");
				
				try {
					Thread.sleep(2000);
					용산역.offer(종점역.poll());
					System.out.println("현 전철 현황 : "+ 종점역.peek());
					System.out.println("용산으로 출발합니다.");
				} catch (InterruptedException e) {
					
					
				}
				
				
			}
			if(ch==2) {
				System.out.println("용산역");
				
				try {
					Thread.sleep(2000);
					종점역.offer(용산역.poll());
					System.out.println("현 전철 현황 : " + 용산역.peek());
					System.out.println("서울역으로 출발합니다.");
				} catch (InterruptedException e) {
					
				}
				
			}
			if(ch==3) {
				System.out.println("서울역");
				
				try {
					Thread.sleep(2000);
					용산역.offer(서울역.poll());
					System.out.println("현 전철 현황 : "+ 서울역.peek());
					System.out.println("구로역으로 출발합니다.");
				} catch (InterruptedException e) {
					
				}
				
			}
			if(ch==4) {
				System.out.println("구로역");
				
				try {
					Thread.sleep(2000);
					서울역.offer(종점역.poll());
					System.out.println("현 전철 현황 : "+ 종점역.peek());
					System.out.println("종점역으로 출발합니다.");
				} catch (InterruptedException e) {
				
				}
				
			}
		}
	}
}
