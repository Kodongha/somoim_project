package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	
	public TopPanel() {
		
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60));   // ��� �г� ������ ����	
		this.setLayout(null);
				
		JLabel back = new JLabel("<  �������");
		back.setForeground(Color.white);
		back.setFont(back.getFont().deriveFont(20.0f));
		back.setLocation(10, 20);	
		back.setSize(200, 20);
		this.add(back);
		
		
		
		
	}
}
