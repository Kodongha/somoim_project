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
		
		JLabel passwordLabel = new JLabel("��й�ȣ�� ã���� �ϴ� ���̵� �Է��� �ּ���");
		passwordLabel.setBounds(20, 20, 500, 100);
		
		TextField informationEmailTextField = new TextField();
		
		
		
		
		this.add(passwordLabel);
		
	}
	
	
	
	
	
	
	
	
	

}
