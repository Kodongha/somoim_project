package com.kh.somoim.view.main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.CenterPanelChangeEventUtil;

public class BottomPanel extends JPanel{

	private JLabel homeLabel;
	private JLabel recommendLabel;
	private JLabel searchLabel;
	private JLabel settingLabel;
	
	public BottomPanel(MainPanel mainPanel) {
		// TODO Auto-generated constructor stub
		
		this.setLayout(new GridLayout(1, 4));
		this.setBackground(Color.WHITE);
		
		// �̹��� ���� 
		Image homeIcon = new ImageIcon("images/Home.PNG").getImage().getScaledInstance(50, 50, 0);
		Image recommendIcon = new ImageIcon("images/Recommend.PNG").getImage().getScaledInstance(50, 50, 0);
		Image searchIcon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);
		Image settingIcon = new ImageIcon("images/Setting.PNG").getImage().getScaledInstance(50, 50, 0);

		// �󺧿� �̹��� �ֱ�
		homeLabel = new JLabel(new ImageIcon(homeIcon));
		recommendLabel = new JLabel(new ImageIcon(recommendIcon));
		searchLabel = new JLabel(new ImageIcon(searchIcon));
		settingLabel = new JLabel(new ImageIcon(settingIcon));
		
		// �̹��� �� �߰�
		this.add(homeLabel);
		this.add(recommendLabel);
		this.add(searchLabel);
		this.add(settingLabel);
		
		// Mouse Event�� �̿��� ȭ�� ��ȯ
		homeLabel.addMouseListener(new CenterPanelChangeEventUtil(mainPanel.centerPanel, "homeLabel"));
		recommendLabel.addMouseListener(new CenterPanelChangeEventUtil(mainPanel.centerPanel, "recommendLabel"));
		searchLabel.addMouseListener(new CenterPanelChangeEventUtil(mainPanel.centerPanel, "searchLabel"));
		settingLabel.addMouseListener(new CenterPanelChangeEventUtil(mainPanel.centerPanel, "settingLabel"));
	}

}
