package practiceTTT;

import java.util.ArrayList;
public class ArrayListTTT {

	public static void main(String[] args) {
		// 1. 게임판 생성 [배열로 9칸 생성] arraylist로 선언
		
		ArrayList<String> board = new ArrayList<>();
		// 2. 게임판 출력 [인덱스가 0번 부터 시작하기 때문에 for(int i) 의 초기값을 0부터 시작]
		for(int i =0; i<board.size(); i++) {
			
		}
		// 3. 플레이어가 위치를 선택하여 말 두기 플레이어는 [O], 컴퓨터는 [X]
		// 4. 컴퓨터 [0~9 사이 난수를 생성해서 알[X] 두기] Random난수 출력
		// 5. 승리자 판단 // 0을 i라고 생각해보기
		// 컴퓨터 승리일때, 사용자 승리일때
		//가로일 때
		//012 345 678
		//세로일 때
		//036 147 258
		//대각선일 때
		//048 246
	}
}
