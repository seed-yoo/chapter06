package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		// 서버소켓생성
		ServerSocket serverSocket = new ServerSocket();

		// 바인딩
		serverSocket.bind(new InetSocketAddress("192.168.0.59", 10001));

		// 서버시작
		System.out.println("<서버시작>");
		System.out.println("==================================");
		System.out.println("[연결을 기다리고 있습니다.]");

		// 클라이언트가 접속을 하면 accept()가 실행됨
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");

		// 로직
		// 메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		// 메세지 받기
		String msg = br.readLine();
		System.out.println("받은 메세지: " + msg);
		
		// 메세지 보내기
		System.out.print("입력: ");
		bw.write(sc.nextLine());
		bw.newLine();
		bw.flush();

		// 닫기
		bw.close();
		br.close();
		socket.close();
		serverSocket.close();
		sc.close();
	}
}
