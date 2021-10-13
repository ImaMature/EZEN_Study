package Day09_1;

public class ChildExample {
public static void main(String[] args) {
	Child child = new Child(); 
	// Parent로부터 상속받은 Child객체 생성시  -> 부모 클래스 생성자 먼저 실행
	//1.Parent 생성자 실행 2. Parent(STring nation) -> 3. Child생성자 -> Child(String name)
	
	
	// 결과물
//	Parent(String nation) call
//	Parent() call
//	Child(String name) call
//	Child() call

 }
}
