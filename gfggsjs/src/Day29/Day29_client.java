package Day29;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {

	//통신용 클라이언트 만들기
	public static void main(String[] args) {
		
		//1. 소켓 만들기
		Socket socket = new Socket();
		while (true) {
			try {
				//2. 서버와 연결하기 (객체명.connect)
				socket.connect(new InetSocketAddress("127.168.102.50",5000)); //예외처리
				System.out.println("[서버와 연결 성공]");
				
				//2. 데이터 송신하기 [ 보내기 ] : 스트림 이요한 외부 네트워크 통신
				Scanner scanner = new Scanner(System.in);
				System.out.println("서버에게 보낼 메시지 : ");
				String msg = scanner.nextLine(); //띄어쓰기까지 입력됨 nextLine
				
				OutputStream outputStream = socket.getOutputStream(); //소켓 출력 스트림
				outputStream.write(msg.getBytes()); //입력받은 문자열 -> 바이트로 변경후 출력
				System.out.println("서버에게 메시지 전송 성공");
				
				//3. 서버 콘솔에서 보낸 데이터 수신하기 [받기]
				InputStream inputStream = socket.getInputStream();
				byte [] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println("서버의 메시지 : " + new String(bytes));
				return; //무한 반복 금지
			} catch (Exception e) {
				System.out.println("소켓 오류" + e.getMessage());
			}
			
		}
		
		//콘솔 2개만들기 콘솔창 띄워서 노란색 별모양 아이콘 콘솔 추가
	}
}
