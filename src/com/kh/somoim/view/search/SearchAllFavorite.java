package com.kh.somoim.view.search;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchAllFavorite extends JPanel{
	public SearchAllFavorite() {
		this.setLayout(null);
		this.setLocation(100, 100); //위치
		this.setSize(465,390); //크기
		this.setBackground(Color.WHITE);

		//전체관심사 라벨 설정 및 사이즈 조정 
		JLabel AllFavoriteLabel = new JLabel("전체관심사");
		AllFavoriteLabel.setLocation(30,10); //이미지위치
		AllFavoriteLabel.setSize(300,40); //크기지정		
		//전체관심사 글꼴 설정 
		AllFavoriteLabel.setFont(new Font("나눔고딕",Font.BOLD, 25)); //폰트변경 및 굵게,사이즈조정 


		//전체관심사 그리드레이아웃 생성 
		JPanel AllFavoritechoicePannel = new JPanel();
	
		
		
		

		this.add(AllFavoriteLabel);



	}

}
