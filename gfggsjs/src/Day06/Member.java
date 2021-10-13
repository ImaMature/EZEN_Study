package Day06;

public class Member {
//p.280
	//13번 필드
		String name;
		String id;
		String password;
		int age;
		
	//14번 생성자
		Member(String name, String id) {
			this.name = name;
			this.id= id;
		}
		
	//15번 메소드 (로그인, 로그아웃)
		// 1. 로그인 메소드 [ 인수 : id, password 반환 : true ]
		boolean login(String id, String password) {
			if (id.equals("hong") && password.equals("12345")) { 
				return true;
			}else { 
				return false;
			}
		}
		// 2. 로그아웃 메소드 [ 인수 : id, 반환 X ]
		void logout(String id) {
			System.out.println(id + "님 로그아웃 되었습니다.");
		}
}
