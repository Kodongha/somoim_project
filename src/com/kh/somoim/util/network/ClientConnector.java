package com.kh.somoim.util.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConnector {

	public ClientConnector() {
		// TODO Auto-generated constructor stub
	}

	public Object sendServer(String mode, Object obj) {

		System.out.println("mode : " + mode);
		System.out.println("object : " + obj.toString());

		final String SERVER_IP = "127.0.0.1";
		final int PORT = 7777;
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object responseObj = null;

		try {
			socket = new Socket(SERVER_IP, PORT);
			System.out.println("서버 연결 완료!");

			oos = new ObjectOutputStream(new DataOutputStream(socket.getOutputStream()));
			ois = new ObjectInputStream(new DataInputStream(socket.getInputStream()));
			System.out.println("클라이언트 데이터 송수신 준비 완료");

			/* 1. 첫 번째 서버로 전송하는 것은 어떤 메소드를 호출할지에 대한 String 값 */
			oos.writeObject(mode); // mode 전송

			/* 2. 두 번째 서버로 전송하는 것은 전달할 객체 */
			oos.writeObject(obj);

			/* 3. 서버에서 처리완료하여 전달한 값을 받아온다. */
			responseObj = ois.readObject();

		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}

				if(ois != null) {
					ois.close();
				}

				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return responseObj;
	}

}
