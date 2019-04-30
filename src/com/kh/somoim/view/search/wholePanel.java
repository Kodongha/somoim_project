package com.kh.somoim.view.search;

import java.awt.Color;

import javax.swing.JPanel;

public class wholePanel extends JPanel {
	SearchFavorite searchFavorite;
	 SearchAllFavorite searchAllFavorite;
	
	public wholePanel() {
	this.setBackground(Color.white);
	this.setLayout(null);
	
	
	
	 searchFavorite= new SearchFavorite();
	searchFavorite.setLocation(10, 10);
	searchFavorite.setSize(450, 160);
	
	
	
	 searchAllFavorite= new SearchAllFavorite();
	 searchAllFavorite.setLocation(10, 160);
	 searchAllFavorite.setSize(450, 500);
	 
	 
	 this.add(searchAllFavorite);
	 this.add(searchFavorite);
	 
	 
	
	 }

}
