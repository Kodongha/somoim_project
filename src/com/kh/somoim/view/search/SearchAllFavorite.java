package com.kh.somoim.view.search;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
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
		JButton exerciseButton = new JButton();
		exerciseButton.setBounds(10, 9, 205, 45);

		JButton  travelButton = new JButton();//여행.아웃도어
		travelButton.setBounds(7, 9, 205, 45);

		JButton petButton = new JButton();//반려동물
		petButton.setBounds(10, 9, 205, 45);

		JButton  gameButton = new JButton();//게임.오락
		gameButton.setBounds(7, 9, 205, 45);

		JButton  craftsButton = new JButton();//공예.만들기
		craftsButton.setBounds(10, 9,205, 45);

		JButton  societyButton = new JButton();//사교.인맥
		societyButton.setBounds(7, 9, 205, 45);

		JButton  parentingButton = new JButton();//결혼.육아
		parentingButton.setBounds(10, 9,205, 45);

		JButton  volunteerButton = new JButton();//봉사활동
		volunteerButton.setBounds(7, 9, 205, 45);

		JButton  cookButton = new JButton();//요리
		cookButton.setBounds(10, 9,205, 45);

		JButton  carmotorcycleButton = new JButton();//차.오토바이
		carmotorcycleButton.setBounds(7, 9, 205, 45);

		JButton  musicButton = new JButton();//음악.악기
		musicButton.setBounds(10,9 ,205, 43);

		JButton  danceButton = new JButton();//댄스.무용
		danceButton.setBounds(7, 9, 205, 43);

		
		
		
		//전체관심사  이미지 생성  
		Image  exerciseIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image travelIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image petIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image gameIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image craftsIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image societIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image parentingIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image volunteerIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image cookIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image carmotorcycleIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image musicIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image danceIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		
		
		//이미지를 넣을 라벨  생성 
		JLabel exerciseIconLabel = new JLabel(new ImageIcon(exerciseIcon));
		
		


		
		//전체관심사버튼에 이미지아이콘라벨 add
		exerciseButton.add(exerciseIconLabel);



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




		//전체관심사 버튼에 이미지 삽입
		/*	Image exerciseIcon = new ImageIcon("images/Exercise.PNG").getImage().getScaledInstance(30 30, 0);//이미지 크기
		exerciseJLabel.add(exerciseIcon);*/


		//그리드레이아웃에 설정한 라벨 add 
		AllFavoriteLabel2.add(exerciseJLabel);
		AllFavoriteLabel2.add(travelJLabel);
		AllFavoriteLabel2.add(petJLabel);
		AllFavoriteLabel2.add(gameJLabel);
		AllFavoriteLabel2.add(craftsJLabel);
		AllFavoriteLabel2.add(societyJLabel);
		AllFavoriteLabel2.add(parentingJLabel);
		AllFavoriteLabel2.add(volunteerJLabel);
		AllFavoriteLabel2.add(cookJLabel);
		AllFavoriteLabel2.add(carmotorcycleJLabel);
		AllFavoriteLabel2.add(musicJLabel);
		AllFavoriteLabel2.add(danceJLabel);


		this.add(AllFavoriteLabel);
		this.add(AllFavoriteLabel2);


	}

}
