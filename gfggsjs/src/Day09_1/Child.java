package Day09_1;

public class Child extends Parent{
	//Parent로부터 상속받은 Child

	private String name;
	

	public Child() { // 현재 클래스내 생성자
		this("홍길동"); // (홍길동,3)일경우? 밑 메소드에 필드에 int객체와 메소드에 int 객체가 생성되어야됨
		System.out.println("Child() call");
		
		
	}


	public Child(String name) {	//this에 넣은 인수만큼 출력됨
	this.name = name;
	System.out.println("Child(String name) call");

	}
}
