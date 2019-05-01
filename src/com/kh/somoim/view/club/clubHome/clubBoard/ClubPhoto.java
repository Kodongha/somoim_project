package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClubPhoto extends JPanel {
	
	public ClubPhoto() {
		
		System.out.println("photo in :::");
		
		this.setLayout(new GridLayout(3,3));
		this.setBackground(Color.white);
		
		JLabel[] label = new JLabel[9];
		
		for(int i = 0; i < 9; i++) {
			label[i] = new JLabel(i+"");
			label[i].setBackground(Color.blue);
			this.add(label[i]);
		}
		
		
		
	}
	
	

}
