package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationFindTopPanel extends JPanel {
	
	public InformationFindTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		JLabel informationFindTopPanelLabel = new JLabel(" < ���� ã��");
		informationFindTopPanelLabel.setForeground(Color.WHITE); //�� �۾�������
		informationFindTopPanelLabel.setFont(informationFindTopPanelLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		informationFindTopPanelLabel.setLocation(10, 6);
		
		informationFindTopPanelLabel.setSize(100, 20);
		this.add(informationFindTopPanelLabel);
	}
}
