package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {

	public static void main(String[] args) {
		//p.737 HashSet
		
		//1. set 객체 생성 [ set 객체에 넣을 자료형을 제네릭에 넣기 ] Set는 인덱스가 없다.
		HashSet<String> set = new HashSet<>();
		
		//2. set에 객체 넣기 [ 중복 허용 X, 순서 X ]
		set.add("java"); 
		set.add("jdbc"); 
		set.add("servlet/jsp");
		set.add("java");			//중복발생 [set는 자동적으로 중복 제거]1
		set.add("ibatis");
		
		//3. set 출력 [ 출력 순서는 없음 ]
		System.out.println(set); //[java, servlet/jsp, ibatis, jdbc]
		
		//4. Iterator 인터페이스를 이용한 set내 객체 호출 [ 인덱스가 존재하지 않기 때문에 ]
			//iterator : set내 객체를 하나씩 순회하는 반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // .hasnext() : 현재 다음 게 있으면 true, 없으면 false
			
			String element = iterator.next();
			System.out.println("\t" + element); 
			/*	java
				servlet/jsp
				ibatis
				jdbc
			*/
		}
		
		//5. for문을 이용한 출력
		for(String temp : set) { //인덱스가 없어도 반복이 됨
			System.out.println(temp);
		}
		//삭제
		set.remove("jdbc");
		set.remove("ibatis");
		System.out.println(set);
		
		//초기화
		set.clear();
		System.out.println(set);
	}
}
