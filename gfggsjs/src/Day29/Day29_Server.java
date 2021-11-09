package Day29;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_Server {

	//통신용 서버 만들기
	public static void main(String[] args) {
		//소켓 : 네트워크 상에서 동작하는 프로그램들(PC) 간의 통신의 종착점
		// 		클라이언트 소켓에서 연결 요청(올바른 연결일 경우)을 하면 서버 소켓이 허락해서 통신할 수 있도록 연결
		
		//1. 서버소켓 만들기
		//2. 바인딩 하기
			// 바인딩 : 프로그램의 기본 단위가 가질 수 있는 구성요소의 구체적인 값과 성격을 확정하는 것
			// 서버에 IP 주소와 포트 번호를 설정
			// port : IP당 6만개 정도 설정된 번호
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. 서버소켓 만들기
			//2. 서버 소켓에 ip, port 번호 설정 (바인딩)
			serverSocket.bind(new InetSocketAddress("127.168.102.50",5000)); 
			while(true) {
				System.out.println("[서버에서 연결 대기중]");
				Socket socket =serverSocket.accept(); //3. .accept() : 클라이언트 요청시 수락
				//4. 수락된 클라이언트 소켓 확인
				InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
													//형변환
				System.out.println("[클라이언트와 연결이 되었습니다. 클라이언트 정보] : " + socketAddress.getHostName());
				
				//5. 데이터 수신하기
				InputStream inputStream = socket.getInputStream(); // 소켓 입력 스트림
				byte[] bytes = new byte[1000]; // 바이트 배열 선언
				inputStream.read(bytes); //입력 받은 내용을 읽어서 바이트배열에 저장
				System.out.println("클라이언트의 메시지 : " + new String(bytes)); //바이트 배열 -> 문자열 변환해서 출력
				
				
				
				//6. 작동법 서버 먼저 콘솔 실행 -> 클라이언트 클래스 콘솔 실행 -> 
				// 콘솔창 콘솔메뉴 클릭 클라이언트 선택 후 메시지 입력하면 서버 콘솔창에 메시지 송수신 됨 -> 
				// 그다음 서버 콘솔창에서 메시지 입력 -> 클라이언트 콘솔창에서 메시지 수신됨 
				
				//7. 클라이언트 콘솔로 데이터 송신하기 [보내기]
				Scanner scanner = new Scanner(System.in);
				System.out.println("보낼 메시지 : ");
				String msg = scanner.nextLine();
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				return; //무한 반복 금지
			}
		} catch (Exception e) {
			System.out.println("서버 연결 오류" + e.getMessage());
		}
		
	}
}
