package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Day15_1 {
	
	
	// �÷��� : [�迭 ���� ���� ]�ڷᱸ���� �������� ��ü�� ����, ����, ����, �˻� ��� ����
			// �⺻�� Arraylist ���, ��Ƽ�����带 ��� �Ѵ�? Vector
			//1. List : ����(�ε���)�� �����ϰ� ���� // �迭�� ���� // �ߺ� ���� ���� // �μ��� ��ȯ���� �� �˾ƾߵ�
				//1) Arraylist 2) Vector 3) Linkedlist  
					//p.724
					//a) ����Ʈ��.add(��ü��) : �ش� ��ü�� ����Ʈ�� ���� 
					//b) ����Ʈ��.contains(��ü��) : �ش� ��ü�� ����Ʈ�� ���翩��(true, false�� �˷���)
					//c) ����Ʈ��.indexOf(��ü��) : �ش� ��ü�� �ε��� ��ȣ
					//d) ����Ʈ��.get(�ε���) : �ش� �ε����� ��ü ȣ��
					//e) ����Ʈ��.isEmpty() : ����Ʈ�� ����ִ��� Ȯ�� (true, false) 
					//f) ����Ʈ��.size() : ����Ʈ�� ��ü ��
					//g) ����Ʈ��.clear() : ����Ʈ �ʱ�ȭ
					//h) ����Ʈ��.remove(�ε��� or ��ü��) : �ش� �ε����� ��ü�� ����
				
				//2) ������
					//�迭 ����Ʈ(ArrayList)
						// �������� ũ�Ⱑ ������ �ְ�(���Ͻ�����), �߰����� ���� ������ �Ͼ�� ������ �˻��� �ʿ�� �Ҷ� ����
					
					//����(Vector)
						// ��Ƽ������(����ȭ)
						 
					//��ũ�� ����Ʈ(LinkedList)
						// �������� ũ�Ⱑ ������ ���� �ʰ�(���Ͻ�����), ���� ������ ���� �Ͼ��, �˻��� ���� ��� ����
	
			//2. Set : ������ �������� �ʰ� ���� // �ߺ� ���� �Ұ�
				//1) HashSet 2) TreeSet
					//a) set��.add(��ü��) : �ش� ��ü�� set�� ����
					//b) set��.contains(��ü��) : �ش� ��ü�� set�� �����ϴ��� ���� Ȯ�� (true, false)
					//c) set��.isEmpty() : set�� ��� �ִ��� Ȯ�� (true, false)
					//**d) set��.iterator() : ����� ��ü�� �ϳ��� �������� �ݺ��� ����
							//d-1) hashNext() : ���� ��ü�� �����ϸ� true, ������ false
							//d-2) next() : ��ü �������� 
							//d-3) remove() : ��ü ����
					//e) set��.size() : set�� ��ü ��
					//f) set��.clear() : set �ʱ�ȭ
					//g) set��.remove(��ü) : �ش� �ε��� ��ü ����
				
			//3. Map : Ű-�� �ѽ����� ���� //
				//1)HashMap 2) Hashtable 3) TreeMap 4) Properties
	public static void main(String[] args) {
		//p.729
		//�ڹ� ����ȭ : ��������� ���ÿ� ������ �ʵ��� waiting��Ŵ
		//ArrayList : ����ȭ X -> ���� ������
		//Vector : ����ȭ O -> ��Ƽ������ (��Ƽ�̵�� ���α׷���)
		
		
		//1. ����Ʈ �����ϱ� [ ����Ʈ �ȿ� ���� �ڷ��� ����(���׸�)]
			// ����Ŭ������ �������
				// <���׸�> : ����Ʈ �ȿ� �� �ڷ�
			List<Board> boards = new Vector<>();
			
		//2. ����Ʈ ��ü �ֱ�
			//1) �޸𸮿� �ٷ� ����ֱ�
			boards.add( new Board ("����1", "����1", "�۾���1"));
		
			//2) ��ü�� ���� ��ü(�޸��� �ּҰ�)�� ����ֱ� (�� �Ʒ� ������ ����)
					//��ü(�޸� �ּҰ�)	//new ~ �޸��� ���ÿ����� �����
			Board board = new Board("����2", "����2", "�۾���2");
			boards.add(board);
		
			boards.add(new Board("����3", "����3", "�۾���3" ));
			boards.add(new Board("����4", "����4", "�۾���4" ));
			boards.add(new Board("����5", "����5", "�۾���5" ));
			
			System.out.println(boards);
			//����
			boards.remove(2); //2�� ��ü ������ => 2�� �ڷ� ��ĭ�� �����
			boards.remove(3); //3�� ��ü ������ => 3�� �ڷ� ��ĭ�� �����
			
			
			//���
			for(Board temp : boards) { //Board�� ����Ǿ��ֱ� ������ Board�� �ҷ�����, int or string�̷��ŷ� �ٲ� ���� ����
				//����Ʈ�� ���ʿ� ��ü �ϳ��� ����
				System.out.println(temp.subject);
				System.out.println(temp.content);
				System.out.println(temp.writer);
			}
			
			ArrayList<String> list1 = new ArrayList<>();
			LinkedList<String> list2 = new LinkedList<>();
			
			long startTime;
			long endTime;
			startTime = System.nanoTime();
			
			//Arraylist�� i�� 0�� �ε����� 10000�� ����
			for(int i = 0; i<10000; i++) {
				list1.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println(" arraylist 10000�� ���� �ð� : " + (endTime - startTime) + "ns");
			
			
			//LinkedList�� i�� 0�� �ε����� 10000�� ����
			for(int i = 0; i<10000; i++) {
				list2.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println(" Linkedlist 10000�� ���� �ð� : " + (endTime - startTime) + "ns");
			
	}
}
