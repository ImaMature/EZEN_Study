package Day13;
//p.615
public class PrintThread1 extends Thread{

	private boolean stop;
	
	public void setStop (boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {

		try {
		while(stop) {
			System.out.println("실행중!");
			Thread.sleep(1); //일부러 예외를 만들어서 끝내기
			}
		}catch(Exception e) {
			
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
