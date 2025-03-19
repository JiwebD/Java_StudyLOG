package Ch25;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ClientRecvThread implements Runnable{

	//InputStream
	DataInputStream din;
	Sgui gui;
	ClientRecvThread(DataInputStream din, Sgui gui){
		this.din = din;
		this.gui = gui;
	}
	
	ClientRecvThread(DataInputStream din){
		this.din = din;
	}
	@Override
	public void run() {
		String recv;
		
		try {
		while(true) {
			//CLIENT->SERVER (수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
//			System.out.println("[CLIENT ] : "+recv);
			gui.area.append("[SERVER] : " + recv+"\n");
		}
		}catch(Exception e) {
			System.out.println("[EXCEPTION] 예외발생 ClientRecvThread 종료");
		}finally {
			try {din.close();} catch(Exception e2) {}
		}
	}

}
