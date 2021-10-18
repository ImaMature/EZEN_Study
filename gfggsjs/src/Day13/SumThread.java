package Day13;
//p.607 1~100까지 합을 계산하는 스레드
public class SumThread extends Thread{

	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i = 1; i<10; i++) {
			sum+=i;
		}
	}
}
