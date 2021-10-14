package Day11;



public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	// object 클래스 내 메소드[equals] 오버라이딩
	@Override
	public boolean equals(Object obj) {	// 비교할 객체를 인수로 받음 [비교대상]	Object가 객체의 부모클래스
		if(obj instanceof Member ) { // instanceof 상속 관계 확인 키워드
			// Member 클래스에 obj 포함되어 있는지 확인 [true, false]
			Member member = (Member)obj;
			// 인수의 객체를 강제형변환
			if (id.equals(member.id)) {
			// 현재 클래스 내 변수와 인수의 변수와 비교	
				return true;	
			}
		}
		return false;
	}
	
	@Override //오버라이딩 안하면 Day11_2메인메소드에 toString출력 메소드 값에 주소값 나옴
	public String toString() {
		// TODO Auto-generated method stub
		return "현재 객체 내 저장된 필드는 : " + this.id;
	}
}
