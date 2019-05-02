package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserAuthenticationTopPanel extends JPanel {
	
	public UserAuthenticationTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		/*JLabel UserAuthenticationLabel = new JLabel(" < 실명 인증");
		UserAuthenticationLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		UserAuthenticationLabel.setFont(UserAuthenticationLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		UserAuthenticationLabel.setLocation(10, 6);
		
		UserAuthenticationLabel.setSize(100, 20);
		this.add(UserAuthenticationLabel);
		*/
		
		}
	}


