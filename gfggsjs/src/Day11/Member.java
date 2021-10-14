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
			Member member = (Member)obj;
			// Member 클래스에 obj 포함되어 있는지 확인 [true, false]
			if (id.equals(member.id)) {
					return true;	
			}
		}
		return false;
	}
}
