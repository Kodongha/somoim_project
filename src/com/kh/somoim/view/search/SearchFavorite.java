package com.kh.somoim.view.search;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//인기소모임
public class SearchFavorite extends JLabel {
	public SearchFavorite() {
		this.setLayout(null);
		this.setLocation(100, 100); //위치
		this.setSize(465,160); //크기

		//인기소모임 문구 생성
		JLabel favoriteLabel= new JLabel("인기소모임");		  
		//인기소모임  라벨 사이즈 조정
		favoriteLabel.setLocation(30,10); //이미지위치
		favoriteLabel.setSize(300,40); //크기지정		
		//인기소모임 폰트 설정 (윈도우즈 기본 폰트만 되는건가?)
		favoriteLabel.setFont(new Font("나눔고딕",Font.BOLD, 25)); //폰트변경 및 굵게,사이즈조정 

		//인기소모임 아이콘 생성  및 사이즈 조절 
		Image favoriteIcon = new ImageIcon("images/Favorite.PNG").getImage().getScaledInstance(35, 35, 0);//이미지 크기
		//인기소모임  이미지를 넣을 라벨  생성
		JLabel iconLabel = new JLabel(new ImageIcon(favoriteIcon));
		//인기소모임 이미지라벨사이즈조정 
		iconLabel.setLocation(145,3); // 이미지의 위치 
		iconLabel.setSize(50,40);   //크기지정 

		//운동/스포츠 라벨 생성 
		JLabel exerciseLabel = new JLabel("1. 운동/스포츠");
		//운동.스포츠 라벨 사이즈 조정 
		exerciseLabel.setLocation(60,50); // 이미지의 위치 
		exerciseLabel.setSize(120,40);   //크기지정 
		//운동.스포츠폰트 설정 
		exerciseLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); //폰트변경 및 굵게,사이즈조정 

		//반려동물 라벨 생성 
		JLabel petLabel = new JLabel("2. 반려동물");
		//반려동물 라벨 사이즈 조정 
		petLabel.setLocation(60,80); // 이미지의 위치 
		petLabel.setSize(120,40);   //크기지정 
		//반려동물 폰트 설정 
		petLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); //폰트변경 및 굵게,사이즈조정 


		//사교.인맥 라벨 생성 
		JLabel societyLabel = new JLabel("3. 사교/인맥");
		//사교.인맥 라벨 사이즈 조정 
		societyLabel.setLocation(60,110); // 이미지의 위치 
		societyLabel.setSize(120,40);   //크기지정 
		//사교.인맥 폰트 설정 
		societyLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); //폰트변경 및 굵게,사이즈조정 

		//아웃도어.여행 라벨 생성 
		JLabel travelLabel = new JLabel("4. 아웃도어/여행");
		//아웃도어.여행  라벨 사이즈 조정 
		travelLabel.setLocation(270,50); // 이미지의 위치 
		travelLabel.setSize(170,40);   //크기지정 
		//아웃도어.여행 폰트 설정 
		travelLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); //폰트변경 및 굵게,사이즈조정 

		//게임.오락 라벨 생성 
		JLabel gameLabel = new JLabel("5. 게임/오락");
		//게임.오락 라벨 사이즈 조정 
		gameLabel.setLocation(270,80); // 이미지의 위치 
		gameLabel.setSize(170,40);   //크기지정 
		//게임.오락 폰트 설정 
		gameLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); //폰트변경 및 굵게,사이즈조정 






		this.add(favoriteLabel);
		this.add(iconLabel);
		this.add(exerciseLabel);
		this.add(petLabel);
		this.add(societyLabel);
		this.add(travelLabel);
		this.add(gameLabel);



	}

}
