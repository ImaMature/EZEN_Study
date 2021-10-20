package Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {

	//Map : Ű (key) + ��(value) = ��Ʈ��(Entry)
	//		 ��ü  	+	��ü		=	��ü		=> ���׸� 2��
	// ��Ʈ�� �ȿ� Ű(���׸�) ��(���׸�) �� 1����
	
	//p.743
	public static void main(String[] args) {
		//HashMap
		
		//1. Map ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
			//Map<Ű, ��> : ���׸� 2��(��Ƽ ���׸� )
		//map.put
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // ȫ�浿 Ű�� ���� ������ �� �������� ������ ������ ��ġ
		System.out.println("�� Entry �� :" + map.size());
		
		//��ü ã��
		System.out.println("\tȫ�浿 : "+map.get("ȫ�浿")); //95 ����� �� Entry �� ���
		
		
		
		//��ü �ϳ��� ó��
		Set <String> set = map.keySet();
		//map�� �ִ� key�� set������
		Iterator<String> iterator = set.iterator();
		//iterator�� map�� set�� �ִ� k,v�� �ϳ��� ��ȸ
		while(iterator.hasNext()) {
				//hasnext() : ���� ��ü�� �����ϴ��� ���� Ȯ��
			String key = iterator.next(); // Ű���� ������
			System.out.println("iterator�� Ű�� ����� : " + map.get(key)); // 
		}
		
		//map�� �ִ� key�� ������
		for(String key : map.keySet()) {
			System.out.println("for������ Ű�� ������ :" + map.get(key));
		}
		
		Set<Map.Entry<String, Integer> >entryset = map.entrySet(); // ��Ʈ�� 1���ۿ� ���޴µ� Map.Entry<>�� ���� �������� ���� �� ����
		
		//���� 
		map.remove("ȫ�浿"); // �ش� Ű�� ��Ʈ�� ����
		map.clear(); //��� ��Ʈ�� ����
		System.out.println(map);
				
		
	}
}
