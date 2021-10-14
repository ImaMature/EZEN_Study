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
			// Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ�� [true, false]
			Member member = (Member)obj;
			// �μ��� ��ü�� ��������ȯ
			if (id.equals(member.id)) {
			// ���� Ŭ���� �� ������ �μ��� ������ ��	
				return true;	
			}
		}
		return false;
	}
	
	@Override //�������̵� ���ϸ� Day11_2���θ޼ҵ忡 toString��� �޼ҵ� ���� �ּҰ� ����
	public String toString() {
		// TODO Auto-generated method stub
		return "���� ��ü �� ����� �ʵ�� : " + this.id;
	}
}
