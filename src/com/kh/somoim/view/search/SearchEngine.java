package com.kh.somoim.view.search;
//검색창

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class SearchEngine extends JLabel {
	public SearchEngine () {
		//검색창 사이즈 설정 및 조정
		this.setLayout(null);
		this.setLocation(100, 100); //위치
		this.setSize(465,50); //크기



		//검색이미지 생성  및 사이즈 조절 
		Image icon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);//이미지 크기
		//검색 이미지를 넣을 라벨  생성
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		//이미지라벨사이즈조정 
		iconLabel.setLocation(6,5); // 이미지의 위치 
		iconLabel.setSize(50,40);   //크기지정 
		
		





		this.add(iconLabel);


	}
}
