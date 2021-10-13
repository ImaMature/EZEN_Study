package Day10;

//Button CallListener MessageListener 메인메소드
public class Day10_4 {

	public static void main(String[] args) {
			//button 객체 내 인터페이스(OnClickListener가 존재)
		Button button = new Button(); 
		button.setOnClickCListener(new CallListener()); // 이걸 실행하면 CallListener클래스 실행 -> Button.java의 메소드 실행
		button.touch();
		System.out.println("객체 내 인터페이스와 연결된 구현객체 변경");
		button.setOnClickCListener(new MessageListener());
		button.touch();
	}
}
