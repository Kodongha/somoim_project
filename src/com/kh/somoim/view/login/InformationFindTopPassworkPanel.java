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
		
		
		
		JLabel informationFindTopPanelLabel = new JLabel(" < ��й�ȣ ã��");
		informationFindTopPanelLabel.setForeground(Color.WHITE); //�� �۾�������
		informationFindTopPanelLabel.setFont(informationFindTopPanelLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		informationFindTopPanelLabel.setLocation(10, 6);
		
		informationFindTopPanelLabel.setSize(100, 20);
		this.add(informationFindTopPanelLabel);
		
		
		
	}

}
