package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;

public class InformationFindPasswordPanel extends JPanel {
	
	private MainFrame mainFrame;
	private JPanel InformationFindPasswordPanel;
	private JPanel InformationFindTopPassworkPanel; 
	
	public InformationFindPasswordPanel () {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		JLabel passwordLabel = new JLabel("비밀번호를 찾고자 하는 아이디를 입력해 주세요");
		passwordLabel.setBounds(20, 20, 500, 100);
		
		TextField informationEmailTextField = new TextField();
		
		
		
		
		this.add(passwordLabel);
		
	}
	
	
	
	
	
	
	
	
	

}
