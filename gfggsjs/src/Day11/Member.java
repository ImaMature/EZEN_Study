package Day11;



public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	// object Ŭ���� �� �޼ҵ�[equals] �������̵�
	@Override
	public boolean equals(Object obj) {	// ���� ��ü�� �μ��� ���� [�񱳴��]	Object�� ��ü�� �θ�Ŭ����
		if(obj instanceof Member ) { // instanceof ��� ���� Ȯ�� Ű����
			Member member = (Member)obj;
			// Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ�� [true, false]
			if (id.equals(member.id)) {
					return true;	
			}
		}
		return false;
	}
}
