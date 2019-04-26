package com.kh.somoim.view.search;
//검색창 메인 
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SearchPanel extends JPanel {
	//SearchEngine 
	SearchEngine searchEngine;

	//SearchFavorite
	SearchFavorite searchFavorite;

	//SearchAllFavorite
	SearchAllFavorite searchAllFavorite;

	public SearchPanel() {
		//SearchPanel 위치조정 및 배경컬러 설정
		this.setLayout(null);
		this.setBackground(Color.WHITE);	

		//검색창 위치(SearchEngine) 조정 
		searchEngine = new SearchEngine();
		searchEngine.setLocation(10,10);//위치
		//검색창 검색창테두리 설정 
		searchEngine.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));

		//인기소모임 (SearchFavorite) 위치조정
		searchFavorite = new SearchFavorite(); 
		searchFavorite.setLocation(10,70);//위치
		//인기소모임 검색창테두리 설정 
		searchFavorite.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));


		//전체관심사 위치 조정 
		
		
		
		
		
		//전체 관심사(SearchAllFavorite) 위치조정 
		searchAllFavorite = new SearchAllFavorite(); 
		searchAllFavorite.setLocation(10,250);//위치
		//전체 관심사(SearchAllFavorite) 검색창테두리 설정 
		searchAllFavorite.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));






		//검색창 add
		this.add(searchEngine);	
		//인기소모임 add
		this.add(searchFavorite);
		//전체관심사
		this.add(searchAllFavorite);

	}


}
