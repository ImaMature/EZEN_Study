package study_ing;

public class BookList {

	 static String [] 도서목록 = {"된다! 네이버 블로그 & 포스트","스프링 부트 실전활용 마스터", "Tucker의 Go 언어 프로그래밍",	 "혼자 공부하는 C언어"};
	 
	 public static void main(String[] args) {
		
		if (도서목록.equals(도서목록[0])) { 
		System.out.println("된다! 네이버 블로그 & 포스트");}
		if (도서목록.equals(도서목록[1])) {
		System.out.println("스프링 부트 실전활용 마스터"); }
		if (도서목록.equals(도서목록[2])) {
		System.out.println("Tucker의 Go 언어 프로그래밍"); }
		if (도서목록.equals(도서목록[3])) {
		System.out.println("혼자 공부하는 C언어"); }
	}
}
