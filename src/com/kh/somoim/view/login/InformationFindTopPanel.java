package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationFindTopPanel extends JPanel {
	
	public InformationFindTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		JLabel informationFindTopPanelLabel = new JLabel(" < 정보 찾기");
		informationFindTopPanelLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		informationFindTopPanelLabel.setFont(informationFindTopPanelLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		informationFindTopPanelLabel.setLocation(10, 6);
		
		informationFindTopPanelLabel.setSize(100, 20);
		this.add(informationFindTopPanelLabel);
	}
}
