package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {

	public static void main(String[] args) {
		//p.737 HashSet
		
		//1. set ��ü ���� [ set ��ü�� ���� �ڷ����� ���׸��� �ֱ� ] Set�� �ε����� ����.
		HashSet<String> set = new HashSet<>();
		
		//2. set�� ��ü �ֱ� [ �ߺ� ��� X, ���� X ]
		set.add("java"); 
		set.add("jdbc"); 
		set.add("servlet/jsp");
		set.add("java");			//�ߺ��߻� [set�� �ڵ������� �ߺ� ����]1
		set.add("ibatis");
		
		//3. set ��� [ ��� ������ ���� ]
		System.out.println(set); //[java, servlet/jsp, ibatis, jdbc]
		
		//4. Iterator �������̽��� �̿��� set�� ��ü ȣ�� [ �ε����� �������� �ʱ� ������ ]
			//iterator : set�� ��ü�� �ϳ��� ��ȸ�ϴ� �ݺ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // .hasnext() : ���� ���� �� ������ true, ������ false
			
			String element = iterator.next();
			System.out.println("\t" + element); 
			/*	java
				servlet/jsp
				ibatis
				jdbc
			*/
		}
		
		//5. for���� �̿��� ���
		for(String temp : set) { //�ε����� ��� �ݺ��� ��
			System.out.println(temp);
		}
		//����
		set.remove("jdbc");
		set.remove("ibatis");
		System.out.println(set);
		
		//�ʱ�ȭ
		set.clear();
		System.out.println(set);
	}
}
