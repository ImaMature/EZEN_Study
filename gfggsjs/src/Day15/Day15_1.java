package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Day15_1 {
	
	
	// 컬렉션 : [배열 문제 보완 ]자료구조를 바탕으로 객체를 삽입, 수정, 삭제, 검색 등등 가능
			// 기본은 Arraylist 사용, 멀티스레드를 써야 한다? Vector
			//1. List : 순서(인덱스)를 유지하고 저장 // 배열과 유사 // 중복 저장 가능 // 인수와 반환값을 잘 알아야됨
				//1) Arraylist 2) Vector 3) Linkedlist  
					//p.724
					//a) 리스트명.add(객체명) : 해당 객체를 리스트에 저장 
					//b) 리스트명.contains(객체명) : 해당 객체가 리스트에 존재여부(true, false로 알려줌)
					//c) 리스트명.indexOf(객체명) : 해당 객체의 인덱스 번호
					//d) 리스트명.get(인덱스) : 해당 인덱스의 객체 호출
					//e) 리스트명.isEmpty() : 리스트가 비어있는지 확인 (true, false) 
					//f) 리스트명.size() : 리스트내 객체 수
					//g) 리스트명.clear() : 리스트 초기화
					//h) 리스트명.remove(인덱스 or 객체명) : 해당 인덱스나 객체를 삭제
				
				//2) 차이점
					//배열 리스트(ArrayList)
						// 데이터의 크기가 정해져 있고(단일스레드), 추가적인 삽입 삭제가 일어나지 않으며 검색을 필요로 할때 유리
					
					//벡터(Vector)
						// 멀티스레드(동기화)
						 
					//링크드 리스트(LinkedList)
						// 데이터의 크기가 정해져 있지 않고(단일스레드), 삽입 삭제가 많이 일어나며, 검색이 적은 경우 유리
	
			//2. Set : 순서를 유지하지 않고 저장 // 중복 저장 불가
				//1) HashSet 2) TreeSet
					//a) set명.add(객체명) : 해당 객체를 set에 저장
					//b) set명.contains(객체명) : 해당 객체가 set에 존재하는지 여부 확인 (true, false)
					//c) set명.isEmpty() : set가 비어 있는지 확인 (true, false)
					//**d) set명.iterator() : 저장된 객체를 하나씩 가져오는 반복자 리턴
							//d-1) hashNext() : 다음 객체가 존재하면 true, 없으면 false
							//d-2) next() : 객체 가져오기 
							//d-3) remove() : 객체 삭제
					//e) set명.size() : set내 객체 수
					//f) set명.clear() : set 초기화
					//g) set명.remove(객체) : 해당 인덱스 객체 삭제
				
			//3. Map : 키-값 한쌍으로 저장 //
				//1)HashMap 2) Hashtable 3) TreeMap 4) Properties
	public static void main(String[] args) {
		//p.729
		//자바 동기화 : 스레드들이 동시에 들어오지 않도록 waiting시킴
		//ArrayList : 동기화 X -> 단일 스레드
		//Vector : 동기화 O -> 멀티스레드 (멀티미디어 프로그래밍)
		
		
		//1. 리스트 선언하기 [ 리스트 안에 넣을 자료형 선언(제네릭)]
			// 벡터클래스로 만든거임
				// <제네릭> : 리스트 안에 들어갈 자료
			List<Board> boards = new Vector<>();
			
		//2. 리스트 객체 넣기
			//1) 메모리에 바로 집어넣기
			boards.add( new Board ("제목1", "내용1", "글쓴이1"));
		
			//2) 객체를 만들어서 객체(메모리의 주소값)에 집어넣기 (위 아래 동일한 거임)
					//객체(메모리 주소값)	//new ~ 메모리의 스택영역에 저장됨
			Board board = new Board("제목2", "내용2", "글쓴이2");
			boards.add(board);
		
			boards.add(new Board("제목3", "내용3", "글쓴이3" ));
			boards.add(new Board("제목4", "내용4", "글쓴이4" ));
			boards.add(new Board("제목5", "내용5", "글쓴이5" ));
			
			System.out.println(boards);
			//삭제
			boards.remove(2); //2번 객체 삭제시 => 2번 뒤로 한칸씩 당겨짐
			boards.remove(3); //3번 객체 삭제시 => 3번 뒤로 한칸씩 당겨짐
			
			
			//출력
			for(Board temp : boards) { //Board에 저장되어있기 때문에 Board로 불러오기, int or string이런거로 바뀔 수는 없음
				//리스트의 왼쪽에 객체 하나씩 대입
				System.out.println(temp.subject);
				System.out.println(temp.content);
				System.out.println(temp.writer);
			}
			
			ArrayList<String> list1 = new ArrayList<>();
			LinkedList<String> list2 = new LinkedList<>();
			
			long startTime;
			long endTime;
			startTime = System.nanoTime();
			
			//Arraylist에 i를 0번 인덱스에 10000개 삽입
			for(int i = 0; i<10000; i++) {
				list1.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println(" arraylist 10000개 삽입 시간 : " + (endTime - startTime) + "ns");
			
			
			//LinkedList에 i를 0번 인덱스에 10000개 삽입
			for(int i = 0; i<10000; i++) {
				list2.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println(" Linkedlist 10000개 삽입 시간 : " + (endTime - startTime) + "ns");
			
	}
}
