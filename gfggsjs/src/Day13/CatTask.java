package Day13;

public class CatTask extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			
			try {Thread.sleep(1000);}
			catch(Exception e) {}
			System.out.println("고양이소리"+i);
		}
		
	}
}
