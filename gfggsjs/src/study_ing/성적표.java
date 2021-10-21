package study_ing;



import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class 성적표 {
	/*
	 * 1. 데이터는 키보드로 입력받아 배열에저장
	 * 2. 성적 입력은 5명으로 하되 무제한 입력이 가능하도록
	 * 3. 번호, 이름, 국어, 영어, 수학 입력, 총점 평균구해서 출력
	 * 4. 평균은 소숫점 이하 2자리까지
	 * 5. 총점을 이용해 석차를 구하기
	 * 6. 입력 오류에 대해 예외발생 상황에 대한 처리하기
	 */
	
	
	 
	public static void main(String[] args) {
		
		TreeSet<Students> studentList = new TreeSet<>();
		
		boolean flag = true;
		while(flag) {
			Scanner scanner = new Scanner(System.in);
			try {
			System.out.println("-------성적표 프로그램 입니다.-------");
			System.out.println("1. 입력하기 2. 성적 출력 3. 초기화 4. 종료"); int ch = scanner.nextInt();
				if(ch == 1 ) {
					try{
						for(int i =0; i<5; i++) {
							System.out.println("---------------------------");
							System.out.print((i+1)+"번째 학생 번호 입력하기 > "); int num = scanner.nextInt();
							System.out.print("이름 입력하기 > "); String name = scanner.next();
							System.out.print("국어 성적 입력하기 > "); int kor = scanner.nextInt();
							System.out.print("영어 성적 입력하기 > "); int eng = scanner.nextInt();
							System.out.print("수학 성적 입력하기 > "); int math = scanner.nextInt();
							Students students = new Students(num, name, kor, eng, math);
							
							//총점
							int sum = (kor+eng+math);
							students.setTotal(sum);
							int sw = 1;
							for(Students c : studentList) {
								sw++;
								students.setRank(sw);}
							
							//평균
							double sum2 = ((kor+eng+math)/3);
							double average = Math.round((sum2*100)/100.00);
							students.setAve(average);
							
							studentList.add(students);
							//for문 안들어감 arraylist라서
							}
					}//try end
					catch(Exception e) {System.out.println("올바른 번호를 다시 입력해주세요. " + e);}
				}//if1	
				if(ch==2) {
							
							
							System.out.println("-----------------------------------------------------------");
							System.out.println("\t\t  성        적       표");
							System.out.println("-----------------------------------------------------------");
							System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
							System.out.println("-----------------------------------------------------------");
					try {
							Iterator<Students> iterator = studentList.iterator();
							
							while(iterator.hasNext()) {
							for(Students s:studentList) {
								System.out.println(s.getNum() + "\t" + s.getName()+ "\t" + s.getKor() + "\t" + s.getEng() + "\t" + 
							s.getMath() + "\t" + s.getTotal() + "\t" + s.getAve() + "\t" + s.getRank());}	
							break;}
					}catch(Exception e) {
						System.out.println("성적표에 입력된 내용이 없습니다.");	
					}
				}//if2
				if(ch==3) {
					
					for(Students s : studentList) {
						studentList.removeAll(studentList);
						System.out.println("초기화 되었습니다.");
						break;
						
					}
				}
				if(ch==4) {
					System.out.println("프로그램 종료.");
					flag = false;
					break;
				}
			}catch (Exception e) {System.out.println("오류가 발생했습니다. [" + e +"]" ); }
		
		}//while end
	}//main end
}//class end
