package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationFindTopPassworkPanel extends JPanel {
	
	public InformationFindTopPassworkPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		JLabel informationFindTopPassworkLabel = new JLabel(" < 비밀번호 찾기");
		informationFindTopPassworkLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		informationFindTopPassworkLabel.setFont(informationFindTopPassworkLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		informationFindTopPassworkLabel.setLocation(10, 6);
		
		informationFindTopPassworkLabel.setSize(200, 20);
		this.add(informationFindTopPassworkLabel);	
	}
}
