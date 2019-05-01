package com.kh.somoim.view.search;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.search.model.dao.SearchDAO;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SearchPanel extends JPanel {
	//SearchEngine 
	SearchEngine searchEngine;

	//SearchFavorite
	SearchFavorite searchFavorite;

	//SearchAllFavorite
	SearchAllFavorite searchAllFavorite;
	
	
	wholePanel wholepanel;
	
	//private 	 StringSearchClubList 	stringSearchClubList;
	private String searchString;
	
	public SearchPanel(MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel, MemberVO memberVO) {
	
		
	//	stringSearchClubList= new StringSearchClubList(mainFrame, mainpanel, centerPanel, this, searchString);
	
		//SearchPanel ��ġ���� �� ����÷� ����;
		this.setLayout(null);
		this.setBackground(Color.WHITE);	

		wholepanel=new wholePanel(mainFrame, centerPanel, mainpanel, this, memberVO);
		wholepanel.setBounds(10, 70, 450, 600);
		
		
		//�˻�â ��ġ(SearchEngine) ���� 
		searchEngine = new SearchEngine( mainFrame,  centerPanel,  mainpanel, this,wholepanel, memberVO);
		searchEngine.setLocation(10,10);//��ġ
		//�˻�â �˻�â�׵θ� ���� 
		searchEngine.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));







		//�˻�â add
	this.add(searchEngine);	
		this.add(wholepanel);

	}


}
