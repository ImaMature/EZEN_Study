package Day06;

public class Day06_3_Car4 {
 // p.223
	
	//필드
	int gas;//4.int gas = 5
	//생성자
	
	//메소드
	void setGas(int gas) { //2.car4.setGas(5) 받아서  int gas(매개변수)에 넣음
		this.gas = gas; //3. 매개변수 gas의 값인 5를 this.gas에 저장(필드 int gas = 5)
	}
	boolean isLeftGas() { //5.gas==5니까 //16. gas ==0이라 if 실행
		if(gas==0) {
			System.out.println("gas가 없습니다."); //17. 가스가 없습니다 출력
			return false; //18. boolean isLeftGas = false 반환
		}
		System.out.println("gas가 있습니다."); //7.gas가 있습니다 출력
		return true; //8. return true받음
	}
	
	void run () { //무한루프 //12. run 무한루프 실행
		while(true) {
			if(gas>0) { //13. gas = 5~ 0전 까지 무한루프 
				System.out.println("달립니다(gas잔량:" + gas + ")");
				gas-=1;
			} else {
				System.out.println("멈춥니다(gas잔량:" + gas + ")"); //14. gas =0일때 ""안 문구 출력
				return; // 15. void run() 메소드 강제종료 boolean으로 올라감
			}
		}
	} //void run() end
	
	/* [메소드 오버로딩] : 메소드명은 동일할 경우 인수 구분[타입, 개수, 순서]
	void run() 	   	 { }	// 메소드명이 같고 인수가 같은 run이 있어서 생성 <불가>
	void run(int x ) { }	// 위와 이름은 같지만 인수가 달라서(int x) 생성 <가능>
	* 요약 : 메소드 명이 같으면 사용불가, 인수 값이 다르다면 사용가능
	*/
	
	//내부 클래스 호출
	void start() {
		run();
	}

}
