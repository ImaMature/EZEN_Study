package Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {

	//Map : 키 (key) + 값(value) = 엔트리(Entry)
	//		 객체  	+	객체		=	객체		=> 제네릭 2개
	// 엔트리 안에 키(제네릭) 값(제네릭) 각 1개씩
	
	//p.743
	public static void main(String[] args) {
		//HashMap
		
		//1. Map 객체 선언
		HashMap<String, Integer> map = new HashMap<>();
			//Map<키, 값> : 제네릭 2개(멀티 제네릭 )
		//map.put
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동 키가 같기 때문에 젤 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수 :" + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동")); //95 저장된 총 Entry 수 얻기
		
		
		
		//객체 하나씩 처리
		Set <String> set = map.keySet();
		//map에 있는 key를 set에저장
		Iterator<String> iterator = set.iterator();
		//iterator로 map의 set에 있는 k,v를 하나씩 순회
		while(iterator.hasNext()) {
				//hasnext() : 다음 객체에 존재하는지 여부 확인
			String key = iterator.next(); // 키값을 가져옴
			System.out.println("iterator로 키값 배오기 : " + map.get(key)); // 
		}
		
		//map에 있는 key를 빼오기
		for(String key : map.keySet()) {
			System.out.println("for문으로 키값 빼오기 :" + map.get(key));
		}
		
		Set<Map.Entry<String, Integer> >entryset = map.entrySet(); // 엔트리 1개밖에 못받는데 Map.Entry<>를 통해 여러개를 받을 수 있음
		
		//삭제 
		map.remove("홍길동"); // 해당 키의 엔트리 삭제
		map.clear(); //모든 엔트리 삭제
		System.out.println(map);
				
		
	}
}
