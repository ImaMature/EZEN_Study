package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Day15_8 {
	public static void main(String[] args) {

	//1. map �÷��� ��ü ����
	TreeMap <Integer, String> scores = new TreeMap<>();
			// Ű
	
	//2. map�� ��ü �ֱ� [ �ڵ� ���� => ���� Ʈ��
	scores.put(87, "ȫ�浿");
	scores.put(98, "�̵���");
	scores.put(75, "�ڽǼ�");
	scores.put(95, "�ſ��");
	scores.put(80, "���ڹ�");
	
	//3. �������� [ scores.descendingMap(); �������̽��� ���� ]
		NavigableMap<Integer, String> desc = scores.descendingMap();
		// ������������ ���ĵ� Map.Entry�� N~~Map�� ����
	
		//�ѹ� �� �� �ʿ䰡 ����
		//Set<Map.Entry<Integer, String>> set = desc.entrySet();
	
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
							//entry �ڷ���	: ���ĵ� entry
			System.out.print(entry.getKey()+" "+entry.getValue() + "    ");
		}
		
		
	//3. ��������
		NavigableMap<Integer, String> asc = desc.descendingMap();
	
		for(Map.Entry<Integer, String> entry : asc.entrySet()) {
		System.out.print(entry.getKey()+" "+entry.getValue() + "    ");
		}
	}
}
