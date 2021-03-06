package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day15_5 {

	//메모리 저장하는 방법 [ 자료구조 ]
	
	//스택 : [LIFO : 후입선출] : 나중에 넣은 객체가 먼저 나감  
		//스택 클래스
			//입구와 출구 동일
			// 동전케이스, CtrlZ
	//큐 : [FIFO : 선입선출] : 먼저 들어온 객체가 먼저나감 
		//큐 인터페이스
			//입출구 다름
			//대기 지하철
	//트리 :
	
	
	public static void main(String[] args) {
		//p.768~9 : 스택 클래스 //push pop
		//1. 스택 객체 생성
		Stack<Coin> coinbox = new Stack<>();
		//2. 스택에 객체 넣기
		coinbox.push(new Coin(100)); //Coin 클래스 value = 100 되는거임
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		System.out.println(coinbox);
		
		//3. 삭제 : pop() -> 가장 나중에 들어온 객체부터 삭제
		System.out.println(coinbox.pop()); //10
		
		//4. 반복문
		while(!coinbox.isEmpty()) {
			//coinbox가 비어있지 않다면 // 삭제된 10을 제외한 값 출력
			System.out.println("제거:" + coinbox.pop());
		}
			
		//queue p.770
		//queue 인터페이스 //poll offer
			Queue<Coin> coinbox2 = new LinkedList<>();
			
			// queue에 객체 넣기
			coinbox2.offer(new Coin (100));
			coinbox2.offer(new Coin (50));
			coinbox2.offer(new Coin (500));
			coinbox2.offer(new Coin (10));
			
			System.out.println(coinbox2);
			// 삭제
			System.out.println(coinbox2.poll()); //100
			// 반복문 + 삭제
			while(!coinbox2.isEmpty()) {
				System.out.println("제거 : " + coinbox2.poll());
			
		}
	}
}
