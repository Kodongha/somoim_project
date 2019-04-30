package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class ClubChat extends JPanel {

	private Socket socket;
	private JScrollPane scrollPane;
	private JTextArea chatArea;
	JTextField chatInput;
	ObjectOutputStream oos;
	
	public ClubChat(ClubVO clubVO, MemberVO memberVO) {
		
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		//채팅창 스크롤바 
		chatArea = new JTextArea();
		chatArea.setEditable(false);
				
		scrollPane = new JScrollPane(chatArea);
		scrollPane.setLocation(0, 0);
		scrollPane.setSize(500, 575);
		this.add(scrollPane);	
		
		chatInput = new JTextField();
		
	//  테투리 없애기 
		LineBorder chatInputBorder = new LineBorder(Color.black);
		chatInput.setBorder(chatInputBorder);
		chatInput.setLocation(0, 590);
		chatInput.setSize(450, 40);
		
		this.add(chatInput);
		
	//  채팅 입력 버튼 	
		JButton chatInputButton = new JButton("입력 ");
		LineBorder chatInputButtonBorder = new LineBorder(Color.black);
		chatInputButton.setBorder(chatInputButtonBorder);
		chatInputButton.setSize(50, 80);
		chatInputButton.setLocation(450, 570);
		this.add(chatInputButton);
		
		try {
			socket = new Socket("127.0.0.1", 8888);
			oos = new ObjectOutputStream(new DataOutputStream(socket.getOutputStream()));
			oos.writeObject(memberVO);
			oos.writeObject(clubVO);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		chatInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				super.keyReleased(arg0);
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					if(chatInput.getText().trim().length() > 0) {
						sendMessage(chatInput.getText().trim());
//						chatArea.append(chatInput.getText().trim() + "\n");
						chatInput.setText("");
					}
				}
			}
		});
		new ClientReceiver(socket).start();
	}
	
	public void sendMessage(String message) {
		try {
			oos.writeObject(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class ClientReceiver extends Thread {
		Socket socket;
		ObjectInputStream ois;
		String inputMessage;
		
		public ClientReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				ois = new ObjectInputStream(new DataInputStream(socket.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			while(ois != null) {
				try {
					inputMessage = (String)ois.readObject();
					System.out.println("inputMessage:::::"+inputMessage);
					chatArea.append(inputMessage + "\n");
					chatArea.setCaretPosition(chatArea.getText().length());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}