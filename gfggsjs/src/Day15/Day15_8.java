package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Day15_8 {
	public static void main(String[] args) {

	//1. map 컬렉션 객체 선언
	TreeMap <Integer, String> scores = new TreeMap<>();
			// 키
	
	//2. map에 객체 넣기 [ 자동 정렬 => 이진 트리
	scores.put(87, "홍길동");
	scores.put(98, "이동수");
	scores.put(75, "박실순");
	scores.put(95, "신용권");
	scores.put(80, "김자바");
	
	//3. 내림차순 [ scores.descendingMap(); 인터페이스에 연결 ]
		NavigableMap<Integer, String> desc = scores.descendingMap();
		// 내림차순으로 정렬된 Map.Entry의 N~~Map을 리턴
	
		//한번 더 쓸 필요가 없음
		//Set<Map.Entry<Integer, String>> set = desc.entrySet();
	
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
							//entry 자료형	: 정렬된 entry
			System.out.print(entry.getKey()+" "+entry.getValue() + "    ");
		}
		
		
	//3. 오름차순
		NavigableMap<Integer, String> asc = desc.descendingMap();
	
		for(Map.Entry<Integer, String> entry : asc.entrySet()) {
		System.out.print(entry.getKey()+" "+entry.getValue() + "    ");
		}
	}
}
