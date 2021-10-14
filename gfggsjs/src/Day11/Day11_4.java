package Day11;

import java.io.IOException;

public class Day11_4 {//class start
	//p.496
	public static void main(String[] args) throws IOException {//main start
		
		//String 클래스
			//1. String 생성자 : 바이트를 문자열로 변환
		
		//키보드로부터 문자열 받아오는 원리
			//키보드 입력(a) => 입력값(a) [ 바이트가 입력됨 ] => 바이트(숫자) => 문자열 변환(a)
			// 						||(위아래 같은 말임)
			//키보드 [바이트] 입력 => 입력스트림 => 자바프로그램
		
		//p.497
			//1_ 바이트 배열에 정수 저장
			byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
					//유니코드: H   e    l    l    o  sp(띄어쓰기)    j   a    v    a
			
			//2_ 바이트 배열을 String 생성자에 넣기
			String str1 = new String(bytes);
			System.out.println(str1); // Hello java
			
			//3_							//s(start), c(count)
			String str2 = new String (bytes, 6, 4);
			System.out.println(str2);
			
		//p.498
			//1. 바이트 100개를 저장할 수 있는 배열
			byte[] bytes2 = new byte[100];
			
			System.out.print("입력 : ");
			//System.in.read();	// 무조건 예외처리 //입출력 관련 항상 예외 처리 발생
			int readcount = System.in.read(bytes2); 
			
			//System.in.read(배열명) : 키보드로부터 읽어온 바이트를 배열로 저장
			System.out.println(new String (bytes2, 0, readcount-2)); //scanner말고 read를 쓰면2를 깎아야됨
										//바이트열 -> 문자열 변환
			
		
		//p. 499
			//2. 문자 추출(chartAt())
			String ssn = "010624-1230123";
			char sex = ssn.charAt(7); //문자열에도 인덱스가 존재함. 여기서는 1
			//인덱스를 넣으면 해당위치에 있는 문자열을 빼온다.
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자 입니다."); break; //switch에서는 break중요.
			case '2':
			case '4':	
				System.out.println("여자 입니다."); break;
			}
			
		//p. 500
			//3. 문자열 비교
				//문자열 비교할 때 '=='연산자를 사용하면 원하지 않는 결과가 나올 수 있다.
			String strVar1 = new String ("신민철") ;
			String strVar2 = "신민철";
			String strVar3 = "신민철";
			
			//불가
			if(strVar1 == strVar2) {System.out.println("1같다");}
			else {System.out.println("1다르다");} 
			// 출력값 다르다. strVar1은 new연산자로 생성된 다른 String객체를 참조해서 다른 힙메모리에 저장되어있으므로 주소값이 다르다.
			// ==연산자는 변수에 저장된 번지를 비교하기 때문에 이러한 결과가 나옴.
			
			
			//가능
			if(strVar1.equals(strVar2)) {System.out.println("2같다.");}
			else {System.out.println("2다르다.");}
			
		//p.502
			//4. getBytes() : 문자열을 바이트열로 변환
			String str = "안녕하세요"; // 한글은 1개당 2바이트, 영어는 1개당 1바이트
			
			byte[] bytes3 = str.getBytes(); //String을 바이트로 변환
			System.out.println(bytes3.length); // 글자수*2바이트 = 10바이트
			
			//반대로 바이트 ---> 문자열
			System.out.println(new String(bytes3));
			
				//인코딩 종류
					//1. UTF-8 : 전세계 공용어
					//2. EUC-KR [CP-949] : 영문, 한글
			
		//p.504
			//5. indexOf() : 문자열 찾기 [ 인수 : 찾을 문자열 / 반환 : 찾은 인덱스의 위치 / 찾은 게 없으면 : -1 ]
			String subject = "자바 프로그래밍";
			System.out.println(subject.indexOf("프로그래밍")); // 출력값 : 3
			//프로그래밍 문자열의 인덱스위치가 3이라 3출력
			
			if(subject.indexOf("자바") != -1) { //"자바"라는 문자열이 subject객체에 없지 않다면(있다면).
									//인덱스가 -1 = 인덱스가 없다.
				System.out.println("자바와 관련된 책입니다.");
			}
			else {System.out.println("자바와 관련없는 책입니다.");
			}
			//5-2. contains 문자열 찾기 (인수 : 찾을 문자열 / 반환 : ture or false)
			//subject.contains(s);
			System.out.println(subject.contains("자바")); //true
			
			//contains와 indexOf의 차이
			//contains는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하여 true나 false값을 출력
			//indexOf는  대상 문자열에 특정 문자열이 포함되어 있는지 확인하여 인덱스 위치 출력
			
			
		//p.505
			//6. length() : 문자열의 길이
			System.out.println(subject.length());	//8칸(공백포함) : 인덱스 0~7
		
		//p.506 
			//7. replace("기존 문자열", "새로운 문자열") : 문자열 대치
			String oldstr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
			String newstr = oldstr.replace("자바", "java"); //자바 -> java
			System.out.println(newstr);
		
		//p.507
			//8. substring() : 문자열 잘라내기
			String ssn2 = "880815-1234567"; 
			System.out.println(ssn2.substring(0, 6)); // 시작인덱스, (끝-1)인덱스
			//0~5번째 인덱스 출력 6번째는 인덱스는 출력안됨
			System.out.println(ssn2.substring(7)); // 시작인덱스 7번째 ~ 다

			//9. split() : 문자열 분리
			String[] ssn3 = ssn2.split("-"); 
								// "-" 기준으로 분해 => 2개의 문자열
			System.out.println(ssn3[0]);
			System.out.println(ssn3[1]);
			
		//p.508 
			//10. toLowerCase() : 모두 소문자로 변환		toUpperCase() : 모두 대문자로 변환
			String str3 = "Java Programming";
			System.out.println(str3.toLowerCase()); // 다 소문자로 출력
			System.out.println(str3.toUpperCase()); // 다 대문자로 출력
			
		//p.509
			//11. trim() : 문자열 앞 뒤 공백 제거 [사이에 있는 공백 제거 불가]
			String str4 = "				자바   프로그래밍		";
			System.out.println(str4.trim());	
			
		//p.510
			//12. valueOf() : 기본타입을 문자열로 변환
			String str5 = String.valueOf(10); // 정수형 [int] => 문자열			"10" //숫자처럼 보여도 문자열임
			String str6 = String.valueOf(10.5); // 실수형 [double] => 문자열	"10.5"
			String str7 = String.valueOf(true); // 논리 -> 문자열 				"true" //문자열임
			
			System.out.println("문자열 3개 : "+str5+" "+str6+" "+str7);
	}//main end
}//class end
