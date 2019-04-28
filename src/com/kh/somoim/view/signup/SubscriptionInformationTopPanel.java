package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubscriptionInformationTopPanel extends JPanel {
	
	public SubscriptionInformationTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		JLabel SubscriptionInformationLanbel = new JLabel(" < 가입 정보 입력");
		SubscriptionInformationLanbel.setForeground(Color.WHITE); //라벨 글씨색변경
		SubscriptionInformationLanbel.setFont(SubscriptionInformationLanbel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		SubscriptionInformationLanbel.setLocation(10, 6);
		
		SubscriptionInformationLanbel.setSize(120, 20);
		this.add(SubscriptionInformationLanbel);
		
		
		}
		
	}

