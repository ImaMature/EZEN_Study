package Day10;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		//void라 return으로 하지 않음
		System.out.println("오라클 DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB에서 삭제");
	}

}
