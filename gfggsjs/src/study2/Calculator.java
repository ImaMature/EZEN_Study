package study2;

public class Calculator {
	//필드
	private int memory;

	//인스턴스화?? MemberDao.getDao()...했던 것과 같은것 같습니다.
	public int getMemory() {
		return memory;
	}
	
	//메소드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		//동기화 : 우선 스레드가 끝날 때까지 다른 스레드는 대기합니다.
		//두 가지 이상의 값이 동시에 들어올 경우를 대비해서
		//한 가지를 먼저 실행시키고 나머지를 나중에 실행시킨다.
		//User1과 User가 이곳을 오버라이딩 합니다.
		try {
			Thread.sleep(2000);
			//2초간 멈춥니다.
		}catch(Exception e){
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
		//왜 100이나오고 50이 나오는지 모르겠습니다.
		//100이라는 숫자를 어디서 전달 받았는지 모르겠습니다.(해결)
		//User1클래스와 User2클래스에서 setMemory한거였습니다.
	}
	
}
