package Day10;

public class Anonymous {

	//p.407 익명 자식 객체 생성
	
	//필드 초기값으로 대입
	Person person = new Person(); //객체
	
	//익명 자식 객체 : 1회성 객체 구현
	Person field = new Person() { //Person 클래스안에서 field라는 익명객체 구현
		
		//일반 메소드
		void work() {
			System.out.println("출근합니다.");
		}
		//오버라이딩 메소드
		@Override
		void wake() {
			System.out.println("6시에 일어납니다."); // Person클래스의 wake 오버라이딩
		}
	};// 익명객체 구현 끝
	
	
	// 생성자
	
	// 메소드
	void method1() {
		//로컬 변수값으로 대입 (메소드 안에 있는거)
		Person localvar = new Person() {
			void walk () {
				System.out.println("산책합니다.");
				
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
				
			}
		};
		//로컬 변수 사용
		localvar.wake();
	}
	
	
	void method2(Person person) {
		person.wake();
	}

}
