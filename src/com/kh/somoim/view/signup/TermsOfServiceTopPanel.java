package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TermsOfServiceTopPanel extends JPanel {
	
	public TermsOfServiceTopPanel() {
	
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		JLabel createLabel = new JLabel(" < ��� ����");
		createLabel.setForeground(Color.WHITE); //�� �۾�������
		createLabel.setFont(createLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		createLabel.setLocation(10, 6);
		createLabel.setSize(100, 20);
		
		this.add(createLabel);
	}
}
	


