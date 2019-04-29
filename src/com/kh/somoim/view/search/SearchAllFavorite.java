package com.kh.somoim.view.search;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchAllFavorite extends JPanel{
	public SearchAllFavorite() {
		this.setLayout(null);
		this.setLocation(100, 100); //위치
		this.setSize(465,390); //크기
		this.setBackground(Color.WHITE);

		//전체관심사타이틀 라벨 설정 및 사이즈 조정 
		JLabel AllFavoriteLabel = new JLabel("전체관심사");
		AllFavoriteLabel.setLocation(30,10); //이미지위치
		AllFavoriteLabel.setSize(300,40); //크기지정	
		AllFavoriteLabel.setBackground(Color.white);
		AllFavoriteLabel.setOpaque(true);
		//전체관심사 글꼴 설정 
		AllFavoriteLabel.setFont(new Font("나눔고딕",Font.BOLD, 25)); //폰트변경 및 굵게,사이즈조정 

		//전체관심사 라벨 설정 및 사이즈 변경

		JLabel AllFavoriteLabel2 = new JLabel();
		AllFavoriteLabel2.setLocation(10,50); //이미지위치
		AllFavoriteLabel2.setSize(445,330); //크기지정	
		AllFavoriteLabel2.setBackground(Color.blue);
		AllFavoriteLabel2.setOpaque(true);

		//전체관심사 그리드레이아웃 생성 
		AllFavoriteLabel2.setLayout(new GridLayout(6,2));//사이즈는뭘로 할지 꼭 적어줘야됨







		//전체관심사 라밸 설정
		JLabel exerciseJLabel = new JLabel();
		exerciseJLabel.setLayout(null);
		JLabel  travelJLabel = new JLabel();
		 travelJLabel.setLayout(null);
		JLabel  petJLabel = new JLabel();
		petJLabel.setLayout(null);
		JLabel  gameJLabel = new JLabel();
		 gameJLabel.setLayout(null);
		JLabel  craftsJLabel = new JLabel();
		craftsJLabel.setLayout(null);
		JLabel  societyJLabel = new JLabel();
		societyJLabel.setLayout(null);
		JLabel  parentingJLabel = new JLabel();
		parentingJLabel.setLayout(null);
		JLabel  volunteerJLabel = new JLabel();
		volunteerJLabel.setLayout(null);
		JLabel  cookJLabel = new JLabel();
		cookJLabel.setLayout(null);
		JLabel  carmotorcycleJLabel = new JLabel();
		carmotorcycleJLabel.setLayout(null);
		JLabel  musicJLabel = new JLabel();
		musicJLabel.setLayout(null);
		JLabel  danceJLabel = new JLabel();
		danceJLabel.setLayout(null);
		
		
		
		
		//전체관심사 버튼 설정 및 사이즈 조정
		JButton exerciseButton = new JButton();//운동.스포츠
		exerciseButton.setBounds(10, 10, 205, 70);
		
		JButton  travelButton = new JButton();//여행.아웃도어
		travelButton.setBounds(7, 10, 205, 70);
		
		JButton petButton = new JButton();//반려동물
		petButton.setBounds(10, 15, 205, 75);
		
		JButton  gameButton = new JButton();
		
		JButton  craftsButton = new JButton();
		
		JButton  societyButton = new JButton();
		
		JButton  parentingButton = new JButton();
		
		JButton  volunteerButton = new JButton();
		
		JButton  cookButton = new JButton();
		
		JButton  carmotorcycleButton = new JButton();
		
		JButton  musicButton = new JButton();
		
		JButton  danceButton = new JButton();


		//그리드레이아웃에 설정한 라벨 add 
		AllFavoriteLabel2.add(exerciseJLabel);
		AllFavoriteLabel2.add(travelJLabel);
		AllFavoriteLabel2.add(petJLabel);
		AllFavoriteLabel.add(gameJLabel);
		AllFavoriteLabel2.add(craftsJLabel);
		AllFavoriteLabel2.add(societyJLabel);
		AllFavoriteLabel2.add(parentingJLabel);
		AllFavoriteLabel2.add(volunteerJLabel);
		AllFavoriteLabel2.add(cookJLabel);
		AllFavoriteLabel2.add(carmotorcycleJLabel);
		AllFavoriteLabel2.add(musicJLabel);
		AllFavoriteLabel2.add(danceJLabel);
		


		//전체관심사 라벨에 버튼 add
		exerciseJLabel.add(exerciseButton);
		travelJLabel.add(travelButton);
		petJLabel.add(petButton);
		gameJLabel.add(gameButton);
		craftsJLabel.add(craftsButton);
		societyJLabel.add(societyButton);
		parentingJLabel.add(parentingButton);
		volunteerJLabel.add(volunteerButton);
		cookJLabel.add(cookButton);
		carmotorcycleJLabel.add(carmotorcycleButton);
		musicJLabel.add(musicButton);
		danceJLabel.add(danceButton);









		this.add(AllFavoriteLabel);
		this.add(AllFavoriteLabel2);


	}

}
