package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckFavoritesTopPanel extends JPanel {
	
	public CheckFavoritesTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		/*JLabel CheckFavoritesPanel = new JLabel(" < 관심사 선택(2개 선택하세요)");
		CheckFavoritesPanel.setForeground(Color.WHITE); //라벨 글씨색변경
		CheckFavoritesPanel.setFont(CheckFavoritesPanel  //라벨 글씨 크기 조절
				.getFont().deriveFont(15.0f));
		CheckFavoritesPanel.setLocation(10, 6); 
		
		CheckFavoritesPanel.setSize(250, 20);
		this.add(CheckFavoritesPanel);*/
	}
}