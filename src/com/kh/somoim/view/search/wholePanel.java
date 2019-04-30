package com.kh.somoim.view.search;

import java.awt.Color;

import javax.swing.JPanel;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class wholePanel extends JPanel {
	SearchFavorite searchFavorite;
	 SearchAllFavorite searchAllFavorite;
	 
	 MainFrame mainFrame;
	 CenterPanel centerPanel;
	 MainPanel mainpanel;
	 
				SearchPanel searchPanel;
				MemberVO memberVO;
	
	public wholePanel( MainFrame mainFrame,CenterPanel centerPanel, MainPanel mainpanel,SearchPanel searchPanel,MemberVO memberVO) {
	this.setBackground(Color.white);
	this.setLayout(null);
	
	
	
	 searchFavorite= new SearchFavorite();
	searchFavorite.setLocation(10, 10);
	searchFavorite.setSize(450, 160);
	
	
	
	 searchAllFavorite= new SearchAllFavorite(mainFrame, centerPanel, mainpanel,searchPanel, this,  memberVO);
	 searchAllFavorite.setLocation(10, 160);
	 searchAllFavorite.setSize(450, 500);
	 
	 
	 this.add(searchAllFavorite);
	 this.add(searchFavorite);
	 
	 
	
	 }

}
