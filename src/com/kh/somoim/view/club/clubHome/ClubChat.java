package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ClubChat extends JPanel {

	public ClubChat() {
		
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		//채팅창 스크롤바 
		JTextArea chatArea = new JTextArea();
		chatArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(chatArea);
		scrollPane.setLocation(0, 0);
		scrollPane.setSize(500, 575);
		this.add(scrollPane);	
		
		JTextField chatInput = new JTextField();
	//	채팅입력창 크기 확인용 
	//	chatInput.setBackground(Color.black);
	//  테투리 없애기 
		LineBorder chatInputBorder = new LineBorder(Color.WHITE);
		chatInput.setBorder(chatInputBorder);
		chatInput.setLocation(0, 560);
		chatInput.setSize(440, 95);
		
		this.add(chatInput);
		
	//  채팅 입력 버튼 	
		JButton chatInputButton = new JButton("입력 ");
		LineBorder chatInputButtonBorder = new LineBorder(Color.WHITE);
		chatInputButton.setBorder(chatInputButtonBorder);
		chatInputButton.setSize(50, 75);
		chatInputButton.setLocation(450, 570);
		this.add(chatInputButton);
		
		chatInputButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chatArea.setText(chatInput.getText());
				
				//텍스트상자로 다시 포커스 가져가기
				chatInput.requestFocus();
			}});
		
		this.add(chatInputButton);
		
		//chatArea.append(log);
		//chatArea.setCaretPosition(txtLog.getDocument().getLength());  // 스크롤 항상 아래
		
	}
	
}