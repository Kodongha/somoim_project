package com.kh.somoim.view.search;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SearchPanel extends JPanel {
	SearchEngine searchEngine;
	
	//this.add(new JLabel("Search!!"), "1");

	public SearchPanel() {
		this.setLayout(null);
		
		searchEngine = new SearchEngine();
		
		this.setBackground(Color.WHITE);
		
		
		
		//�˻�â ��ġ ���� 
		searchEngine.setLocation(10,10);
		searchEngine.setSize(470,50);
		//�˻�â�׵θ� ���� 
		searchEngine.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));
		


		
		
		
		
		
		
		this.add(searchEngine);
		
	
	}
	
}
