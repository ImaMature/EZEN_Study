package Day13;

public class soundThread {
	public static void main(String[] args) {
	
		DogTask dogTask = new DogTask();
		dogTask.start();
		
		CatTask catTask = new CatTask();
		catTask.start();
		
		TigerTask tigerTask = new TigerTask();
		tigerTask.start();
		
		 
			
		
	}
}
