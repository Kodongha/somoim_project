package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationFindTopPassworkPanel extends JPanel {
	
	public InformationFindTopPassworkPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		JLabel informationFindTopPassworkLabel = new JLabel(" < ��й�ȣ ã��");
		informationFindTopPassworkLabel.setForeground(Color.WHITE); //�� �۾�������
		informationFindTopPassworkLabel.setFont(informationFindTopPassworkLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		informationFindTopPassworkLabel.setLocation(10, 6);
		
		informationFindTopPassworkLabel.setSize(200, 20);
		this.add(informationFindTopPassworkLabel);	
	}
}
