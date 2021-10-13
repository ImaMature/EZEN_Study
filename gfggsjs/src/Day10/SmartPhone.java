package Day10;

public class SmartPhone extends Phone{
//추상클래스는 상속을 사용
//추상클래스 한번 상속 받고 끝 더이상 못받음
//반면 인터페이스는 여러번 받을 수 있음
	
	
	public SmartPhone(String owner) {
		super(owner);
		//내용물이 있는 생성자가 있음 super클래스 먼저 사용
		//super(); 슈퍼클래스의 생성자 호출
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	@Override
	public void sound() {
		//sound 오버라이딩
		
	}
}
