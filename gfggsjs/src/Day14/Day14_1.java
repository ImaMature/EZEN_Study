package Day14;

public class Day14_1 {
//Member 클래스와 관련
	//외부로부터 클래스 타입 정하기
	public static void main(String[] args) {
		
		Member<String, Integer> member = new Member();
		// 제네릭 : 타입변환
		// 멤버클래스 T에 String집어넣기 
		// 상속받은 자식은 자동 형변환 가능, 부모는 강제형변환\
		
		// p.660 제네릭 메소드
		Box<Integer> box1 = Util.<Integer>boxing(100);
		// Util.Box<T>에 <integer> 집어넣기, Box클래스 자료형이 다 int형으로 바뀜
		System.out.println(box1.getT());
		
	}
	
}
