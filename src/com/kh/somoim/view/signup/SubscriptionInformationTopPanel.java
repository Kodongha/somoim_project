package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubscriptionInformationTopPanel extends JPanel {
	
	public SubscriptionInformationTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		JLabel SubscriptionInformationLanbel = new JLabel(" < ���� ���� �Է�");
		SubscriptionInformationLanbel.setForeground(Color.WHITE); //�� �۾�������
		SubscriptionInformationLanbel.setFont(SubscriptionInformationLanbel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		SubscriptionInformationLanbel.setLocation(10, 6);
		
		SubscriptionInformationLanbel.setSize(120, 20);
		this.add(SubscriptionInformationLanbel);
		
		
		}
		
	}

