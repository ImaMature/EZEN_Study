package study_ing;



import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ����ǥ {
	/*
	 * 1. �����ʹ� Ű����� �Է¹޾� �迭������
	 * 2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ���
	 * 3. ��ȣ, �̸�, ����, ����, ���� �Է�, ���� ��ձ��ؼ� ���
	 * 4. ����� �Ҽ��� ���� 2�ڸ�����
	 * 5. ������ �̿��� ������ ���ϱ�
	 * 6. �Է� ������ ���� ���ܹ߻� ��Ȳ�� ���� ó���ϱ�
	 */
	
	
	 
	public static void main(String[] args) {
		
		TreeSet<Students> studentList = new TreeSet<>();
		
		boolean flag = true;
		while(flag) {
			Scanner scanner = new Scanner(System.in);
			try {
			System.out.println("-------����ǥ ���α׷� �Դϴ�.-------");
			System.out.println("1. �Է��ϱ� 2. ���� ��� 3. �ʱ�ȭ 4. ����"); int ch = scanner.nextInt();
				if(ch == 1 ) {
					try{
						for(int i =0; i<5; i++) {
							System.out.println("---------------------------");
							System.out.print((i+1)+"��° �л� ��ȣ �Է��ϱ� > "); int num = scanner.nextInt();
							System.out.print("�̸� �Է��ϱ� > "); String name = scanner.next();
							System.out.print("���� ���� �Է��ϱ� > "); int kor = scanner.nextInt();
							System.out.print("���� ���� �Է��ϱ� > "); int eng = scanner.nextInt();
							System.out.print("���� ���� �Է��ϱ� > "); int math = scanner.nextInt();
							Students students = new Students(num, name, kor, eng, math);
							
							//����
							int sum = (kor+eng+math);
							students.setTotal(sum);
							int sw = 1;
							for(Students c : studentList) {
								sw++;
								students.setRank(sw);}
							
							//���
							double sum2 = ((kor+eng+math)/3);
							double average = Math.round((sum2*100)/100.00);
							students.setAve(average);
							
							studentList.add(students);
							//for�� �ȵ� arraylist��
							}
					}//try end
					catch(Exception e) {System.out.println("�ùٸ� ��ȣ�� �ٽ� �Է����ּ���. " + e);}
				}//if1	
				if(ch==2) {
							
							
							System.out.println("-----------------------------------------------------------");
							System.out.println("\t\t  ��        ��       ǥ");
							System.out.println("-----------------------------------------------------------");
							System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
							System.out.println("-----------------------------------------------------------");
					try {
							Iterator<Students> iterator = studentList.iterator();
							
							while(iterator.hasNext()) {
							for(Students s:studentList) {
								System.out.println(s.getNum() + "\t" + s.getName()+ "\t" + s.getKor() + "\t" + s.getEng() + "\t" + 
							s.getMath() + "\t" + s.getTotal() + "\t" + s.getAve() + "\t" + s.getRank());}	
							break;}
					}catch(Exception e) {
						System.out.println("����ǥ�� �Էµ� ������ �����ϴ�.");	
					}
				}//if2
				if(ch==3) {
					
					for(Students s : studentList) {
						studentList.removeAll(studentList);
						System.out.println("�ʱ�ȭ �Ǿ����ϴ�.");
						break;
						
					}
				}
				if(ch==4) {
					System.out.println("���α׷� ����.");
					flag = false;
					break;
				}
			}catch (Exception e) {System.out.println("������ �߻��߽��ϴ�. [" + e +"]" ); }
		
		}//while end
	}//main end
}//class end
