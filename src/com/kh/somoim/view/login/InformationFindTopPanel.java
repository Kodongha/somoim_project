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
		
		
		
		JLabel informationFindTopPanelLabel = new JLabel(" �������");
		informationFindTopPanelLabel.setForeground(Color.WHITE); //�� �۾�������
		informationFindTopPanelLabel.setFont(informationFindTopPanelLabel
											.getFont().deriveFont(20.0f));
		//informationFindTopPanelLabel.setBounds(100, 100, 200, 300);
		informationFindTopPanelLabel.setSize(200, 20);
		this.add(informationFindTopPanelLabel);
		
		
		
	}

}
