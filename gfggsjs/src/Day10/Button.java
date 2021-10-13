package Day10;

public class Button {
//p.402 형광펜으로 순서도 해놓음
	
	//객체에 인터페이스 넣어서 구현 객체(정의된 메소드) 만들기
	
	//중첩 인터페이스 : 클래스 내부에 인터페이스 선언
	interface OnClickListener{
		void onClick(); //추상메소드
	}
	//1. 필드 : 인터페이스 필드
	OnClickListener listner; 
	
	//2. 생성자
	
	//3. 메소드
	void setOnClickCListener(OnClickListener listener) {  //외부에서 불러온 매개변수를 인터페이스에 집어넣는것 // OnClicListener -> listener -> this.listner -> 필드로 이동
		this.listner = listener;
	}
	
	void touch() {
		listner.onClick();
	}
}
