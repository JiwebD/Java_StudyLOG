package Ch22;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01ServerSocket {

	public static void main(String[] args) throws IOException {
		//자바 소캣 생성									//ncpa.cpl에서 Realtek인 이더넷에서 확인
		ServerSocket server = new ServerSocket(7000);	//192.168.16.42:7000  
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		//
		Socket client = server.accept();
		
		//
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out);
		
		dout.writeUTF("[INFO] WELCOME TO SERVER");
		
		dout.flush();
		dout.close();
		out.close();
		client.close();
		server.close();

		System.out.println("서버를 종료합니다.");
	}

}
