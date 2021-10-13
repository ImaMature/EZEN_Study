package Day10;

public class Day10_5 {
	//p.408 자식객체 실행
		public static void main(String[] args) {
			
			Anonymous anony = new Anonymous();
			//익명 객체 필드 사용
			anony.field.wake(); // 6시에 일어납니다. 익명 자식 객체 내 메소드 호출
			anony.method1(); // 객체 내 메소드 호출 => 메소드 내 익명 객체
			anony.method2(
					new Person() {
						void study() {
							System.out.println("공부합니다.");
				}
					@Override
						void wake() {
							System.out.println("8시에 일어납니다.");
							study();
				}	
			}
		);
	}
}


///설명서
/*Day10_5 클래스가 메인클래스 여기서 실행

(*Line의 숫자는 따로 서술하지 않는 이상, 모두 메인클래스의 코드 줄)

Line7 : Anoymous클래스에서 사용할 anony 선언

Line9 : Anonymous로 클래스의 field객체로 이동-> 오버라이딩한 wake메소드 실행 (Anonymous클래스의 wake 메소드는 Person클래스의 wake 메소드를 오버라이딩(덮어쓰기))
	-> 산책합니다 출력

Line10 : (모두 Anonymous클래스의 method1내에서 실행되는것) method1메소드 실행 -> localvar.wake()메소드 실행 -> 오버라이딩한 wake메소드 실행 -> 7시에 일어납니다 출력 ->walk 메소드로 -> 산책합니다 출력

Line11 : method2실행 -> Anonymous클래스의 method2의 매개변수(Person person)으로 이동 해당 매개변수는 Day10_5클래스 Line 12의 생성자 new Person을 인수로 받아서 wake()메소드를 실행 ->
	Day10_5 클래스의 Line17의 오버라이딩된 wake 실행 -> 8시에 일어납니다. 출력 -> study 메소드 실행 -> 공부합니다 출력
*/
