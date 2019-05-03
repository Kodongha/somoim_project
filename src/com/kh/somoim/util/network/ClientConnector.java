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
			System.out.println("���� ���� �Ϸ�!");

			oos = new ObjectOutputStream(new DataOutputStream(socket.getOutputStream()));
			ois = new ObjectInputStream(new DataInputStream(socket.getInputStream()));
			System.out.println("Ŭ���̾�Ʈ ������ �ۼ��� �غ� �Ϸ�");

			/* 1. ù ��° ������ �����ϴ� ���� � �޼ҵ带 ȣ�������� ���� String �� */
			oos.writeObject(mode); // mode ����

			/* 2. �� ��° ������ �����ϴ� ���� ������ ��ü */
			oos.writeObject(obj);

			/* 3. �������� ó���Ϸ��Ͽ� ������ ���� �޾ƿ´�. */
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
