package Day13;

public class CalcThread extends Thread{

	//필드
	
	//생성자
	public CalcThread (String name) {
		super.setName(name);
		//super.메소드() : 부모 클래스 내 메소드에 접근하는 것
		//super() : 생성자
	}
	
	@Override
	public void run() {
		for(int i=0; i<200000000; i++) {
						//20억회 반복
		}
			System.out.println("반복문 종료 : " + getName());
	}
}
