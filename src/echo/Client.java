package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket();

		System.out.println("<클라이언트 시작>");
		System.out.println("===========================");

		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("192.168.0.59", 10001));

		System.out.println("[서버에 연결 되었습니다.]");

		// 로직
		// 메세지 보내기
		// out
//		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
//		BufferedWriter bw = new BufferedWriter(osw);

		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		// 메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 메세지 보내기
		System.out.print("입력: ");
		bw.write(sc.nextLine());
		bw.newLine();
		bw.flush();
		// 메세지 받기
		
		String reMsg = br.readLine();
		System.out.println("다시 받은 메세지: " + reMsg);
		

		// 닫기
		br.close();
		bw.close();
		socket.close();
		sc.close();
	}
}
