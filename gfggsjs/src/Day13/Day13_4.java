package Day13;

public class Day13_4 { //자식 클래스

	public static void main(String[] args) {
		
		//비제네릭 : 제네릭이 없을경우
			//1. 타입 변환
		//1. 객체 생성
		Box box = new Box();
		//2. 객체 메소드 호출
		box.set("홍길동");	//자식클래스는 부모클래스 껄 받아올 수 있음		
										//홍길동 [String] -> object [자동 형변환]
		String name = (String)box.get(); //object 		 -> String [강제 형변환]
		
		box.set(new Apple());
		Apple apple = (Apple)box.get(); //강제 형변환
		
		//제네릭 : 형변환이 많은 객체 클래스 사용시
		//p.658 BoxExample
		Box2<String> box2 = new Box2<>();
		//클래스명 <매개클래스> 변수명 = new 생성자<>();
		box2.set("hello");
		String str = box2.get(); // 저장된 hello를 str에 저장
		
		Box2<Integer> box22 = new Box2<>();
		box22.set(6);
		int value = box22.get();
		
	}
}
