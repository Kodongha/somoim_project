package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SignupPageTopPanel extends JPanel {
	
	public SignupPageTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		JLabel createLabel = new JLabel(" < 계정 만들기");
		createLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		createLabel.setFont(createLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		createLabel.setLocation(10, 6);
		
		createLabel.setSize(100, 20);
		this.add(createLabel);
		
		
	}
}
