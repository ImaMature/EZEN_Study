package sound;

public class EE {

	private static void printsound(Soundable soundable) { //생성자 (인터페이스타입 매개변수)
		System.out.println(soundable.sound()); //soundable은 매개변수 추상메소드 호출 Cat,Dog클래스의 sound메소드 실행
		//return값 야옹,멍멍 출력
	}
	
	public static void main(String[] args) {
		printsound(new Cat()); //printsound 메소드 호출,cat 클래스의 메모리를 매개변수로 받아와 반환값 출력
		printsound(new Dog()); //printsound 메소드 호출,Dog 클래스의 메모리를 매개변수로 받아와 반환값 출력
	}
}
