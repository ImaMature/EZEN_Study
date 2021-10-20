package Day15;

import java.util.Iterator;
import java.util.TreeSet;



public class Day15_9 {

	public static void main(String[] args) {
		//p.764
		//�������Ҷ� �� �� ����
		// tree �÷��� ����
		TreeSet < Person > treeSet = new TreeSet<>();
		
		// tree ��ü �ֱ�
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		// ���� �������� ��������
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) { 				//hasNext() ���� ��ü�� �ִ��� Ȯ��
			Person person = iterator.next(); 		// next(); ��ü ��������
			System.out.println(person.name + "\t" + person.age);
		}
	}
}
