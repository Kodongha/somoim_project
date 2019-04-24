package com.kh.somoim.view.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TopPanel extends JPanel {

	private JLabel logoLabel;
	
	public TopPanel() {
		// TODO Auto-generated constructor stub
		
		this.setLayout(null);
		this.setBounds(500,200,200,30);
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(500,60));
		
		Image logo = new ImageIcon("images/logo.png").getImage().getScaledInstance(50, 50, 0);
		logoLabel = new JLabel(new ImageIcon(logo));
		
		logoLabel.setBounds(2, 2, 50, 50);
		
		JButton button = new JButton("abc");
		button.setLocation(5,5);
		
		this.add(logoLabel);
		this.add(button);
		
	}
	
}
