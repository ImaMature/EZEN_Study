package Day12;

import java.util.Arrays; //import 다른패키지로부터클래스 가져오기
import java.util.Collections;

public class Day12_1 {

	public static void main(String[] args) {
		

	//p.521
	//1. Arrays 클래스	
	
	char [] arr1 = {'j','a','v','a'}; // 배열 선언
				//char : 기본자료형 ['문자']
				//String : 클래스 ["문자열"]
	
				//배열길이 = 배열명.length		: 필드
				//문자열길이 = 문자열.length()	: 메소드 ()자리는 인수자리
		//방법1
			//1-1) .copyOf(): 배열 복사 (원본배열, 복사할 길이) : 배열 복사
			char[] arr2 = Arrays.copyOf(arr1, arr1.length);
						//현재 클래스에서 다른 클래스 내 메소드 호출 가능
						//. : 접근제한자를 통한 메소드 호출
						//1_ 객체를 통한 메소드 호출
							// 클래스명 변수명 = new 생성자()
							// 객체명.메소드명()
					
						//2_ static 메소드 : 객체 없이 호출
							// 클래스명.메소드명()
			
			//1-2) Arrays.toString (배열) : 인덱스 순으로 데이터 출력
			System.out.println(Arrays.toString(arr2)); //출력값 : [j, a, v, a]
		
		//방법2
			//3) copyofRange(복사할 배열, 시작인덱스, 끝인덱스)
			char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //[1] ~ [2] 복사
			System.out.println(Arrays.toString(arr3)); //출력값 : [a, v]
		
		//방법3
			//4)System.arraycopy (원본배열, 시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수)	
			char[] arr4 = new char[arr1.length];
			System.arraycopy(arr1, 0, arr4, 0, arr1.length);
			System.out.println(Arrays.toString(arr4)); //출력값 : [j, a, v, a]
		
	//p.522
			//5) Arrays.equals(배열1, 배열2)	: 1차원 배열 비교
			//6) Arrays.deepEquals(배열1, 배열2) : 2차원 배열 비교
			System.out.println("1차 배열 비교 : " + Arrays.equals(arr1, arr2)); //출력값 : 1차 배열 비교 : true
			//System.out.println("2차 이상 배열 비교 : " + Arrays.deepEquals(arr1, arr2));//배열을 하나 더 추가해야됨		
			
			//7) Arrays.sort (배열명) : 해당 배열 내 오름차순 정렬
			Arrays.sort(arr1);
			System.out.println("배열 주소 정보 : "+ arr1.toString());
			System.out.println("배열내 데이터 정보 : "+ Arrays.toString(arr1));
			
			//8) Arrays.sort(배열명, Collections.reverseOrder()) : 배열 내 내림차순 정렬
				//*주의 : 클래스만 제공해서 해당 배열이 기본 자료형(int, byte 등)일 경우 오류 발생
			//Arrays.sort(arr1, Collections.reverseOrder()); //
			
	//p.526
			//9) Arrays.binarySearch(배열명, 데이터) : 해당 데이터의 인덱스 번호
				// * 주의!! 오름차순으로 정렬이 된 상태에서만 사용 가능
			System.out.println(Arrays.binarySearch(arr1, 'j'));	// {a,a,j,v}로 정렬되어있기 때문에 2출력
	}
}
