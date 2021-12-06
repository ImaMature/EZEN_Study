package test1;

import java.util.Iterator;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		
		
		// add() �޼ҵ带 �̿��� ����� ����
		
		ts.add(30);
		
		ts.add(40);
		
		ts.add(20);
		
		ts.add(10);
		
		
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		
		for (int e : ts) {
			
			System.out.println(e + " ");
			
		}
		
		
		
		// remove() �޼ҵ带 �̿��� ����� ����
		
		ts.remove(40);
		
		
		
		// iterator() �޼ҵ带 �̿��� ����� ���
		
		Iterator<Integer> iter = ts.iterator();
		
		while (iter.hasNext()) {
			
			System.out.print(iter.next() + " ");
			
		}
		
		
		
		// size() �޼ҵ带 �̿��� ����� �� ����
		
		System.out.println("���� �˻� Ʈ���� ũ�� : " + ts.size());
		
		
		
		// subSet() �޼ҵ带 �̿��� �κ� ������ ���
		
		System.out.println(ts.subSet(10, 20));
		
		System.out.println(ts.subSet(10, true, 20, true));
	}
}
