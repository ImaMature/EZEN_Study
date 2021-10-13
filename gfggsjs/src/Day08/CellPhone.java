package Day08;
//p.290
public class CellPhone {
	
	//1. 필드
		String model;
		String color;
	
	//2. 생성자
		public CellPhone(String model, String color) {
			this.model = model;
			this.color = color;	
		}
		
	//3. 메소드 : 접근제한자 (생락 => default ) 반환타입 메소드(인수1, 인수2, 인수3 ...){실행코드} 
	void powerOn() {System.out.println("전원을 켭니다.");}
	
	
		//void : 반환이 없다 [return 없음]
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {	//외부로부터 입력받은 값을 클래스 내에서 사용하려면 인수(소괄호안의 내용)가 필요. 그래서 String message를 사용
		System.out.println("본인 : " + message);}
	
	//ex)
	void sendVoice() {//외부로부터 입력받는 인수가 없음.	
		String message = "금요일";//내부 변수
		System.out.println("본인 : " + message);}
	
	void receiveVoice (String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	
}