package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ClubPhoto extends JPanel {
	
	public ClubPhoto() {
		
		this.setLayout(new GridLayout(3,3));
		
		Set set = new LinkedHashSet();
		
		while(set.size() < 9) {
			set.add(new Random().nextInt(9) + 1);
		}
		
	
		Object[] obj = set.toArray();
		
		for(int i = 0; i < obj.length; i++) {
			String str = new Integer((int)obj[i]).toString();
			this.add(new JButton(str));
		}
		
		
		
	}
	
	

}
