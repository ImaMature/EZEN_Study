package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

import javax.script.AbstractScriptEngine;

public class Day15_7 {

	//이진트리 : 하나의 노드 기준으로 왼쪽 / 오른쪽 자식 노드 가짐
		// 부모 노드 기준으로 낮은 값은 왼쪽에 / 큰값은 오른쪽에 저장
		
			//1. 트리명.first : 가장 작은 노드 
			//2. 트리명.last : 가장 큰 노드
	public static void main(String[] args) {
	//p.753	
		
		// 1. 이진 트리 객체 선언
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. 이진 트리에 객체 넣기
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		System.out.println("가장 낮은 점수 : " + scores.first()); // 75
		System.out.println("가장 높은 점수 : " + scores.last()); // 98
		System.out.println("95점 아래 점수 : " + scores.lower(95)); //87
		System.out.println("95점 위 점수 : " + scores.higher(95)); //98
		System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95)); //95 
		// 주어진 객체와 동등한게 있음 리턴, 아니면 바로 아래 객체를 리턴
		System.out.println("85점 이거나 바로 위 점수 : " + scores.ceiling(85)); //87
		// 주어진 객체와 동등한게 있음 리턴, 아니면 바로 위 객체를 리턴
		
		while(!scores.isEmpty()) {
			scores.pollFirst(); //가장 낮은 점수삭제
			System.out.println("남은 객체 수 : " + scores.size());
		}
		
		//p.755
		//내림차순
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		for(int score1 : decendingSet) {
			System.out.println(score1+"  ");
		}
		
		//오름차순
		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		for(int score1 : ascendingSet) {
			System.out.println(score1 + "  ");
		}
		
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println("남은 객체수 : " +scores.size());
		}
		
		
	}
}
