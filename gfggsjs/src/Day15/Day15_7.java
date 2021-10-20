package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

import javax.script.AbstractScriptEngine;

public class Day15_7 {

	//����Ʈ�� : �ϳ��� ��� �������� ���� / ������ �ڽ� ��� ����
		// �θ� ��� �������� ���� ���� ���ʿ� / ū���� �����ʿ� ����
		
			//1. Ʈ����.first : ���� ���� ��� 
			//2. Ʈ����.last : ���� ū ���
	public static void main(String[] args) {
	//p.753	
		
		// 1. ���� Ʈ�� ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. ���� Ʈ���� ��ü �ֱ�
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		System.out.println("���� ���� ���� : " + scores.first()); // 75
		System.out.println("���� ���� ���� : " + scores.last()); // 98
		System.out.println("95�� �Ʒ� ���� : " + scores.lower(95)); //87
		System.out.println("95�� �� ���� : " + scores.higher(95)); //98
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + scores.floor(95)); //95 
		// �־��� ��ü�� �����Ѱ� ���� ����, �ƴϸ� �ٷ� �Ʒ� ��ü�� ����
		System.out.println("85�� �̰ų� �ٷ� �� ���� : " + scores.ceiling(85)); //87
		// �־��� ��ü�� �����Ѱ� ���� ����, �ƴϸ� �ٷ� �� ��ü�� ����
		
		while(!scores.isEmpty()) {
			scores.pollFirst(); //���� ���� ��������
			System.out.println("���� ��ü �� : " + scores.size());
		}
		
		//p.755
		//��������
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		for(int score1 : decendingSet) {
			System.out.println(score1+"  ");
		}
		
		//��������
		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		for(int score1 : ascendingSet) {
			System.out.println(score1 + "  ");
		}
		
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println("���� ��ü�� : " +scores.size());
		}
		
		
	}
}
