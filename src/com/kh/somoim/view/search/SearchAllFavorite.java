package com.kh.somoim.view.search;

import java.awt.Color;
import java.awt.FlowLayout;
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
		AllFavoriteLabel2.setBackground(Color.WHITE);
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
		JLabel  cookingJLabel = new JLabel();
		cookingJLabel.setLayout(null);
		JLabel  carmotorcycleJLabel = new JLabel();
		carmotorcycleJLabel.setLayout(null);
		JLabel  musicJLabel = new JLabel();
		musicJLabel.setLayout(null);
		JLabel  danceJLabel = new JLabel();
		danceJLabel.setLayout(null);



		//전체관심사 버튼 설정 및 사이즈 조정
		JButton exerciseButton = new JButton();//운동.스포츠
		exerciseButton.setLayout(null);
		exerciseButton.setBounds(10, 9, 205, 45);
		exerciseButton.setBackground(Color.WHITE);
		exerciseButton.setBorderPainted(false);

		JButton  travelButton = new JButton();//여행.아웃도어
		travelButton.setLayout(null);
		travelButton.setBounds(7, 9, 205, 45);
		travelButton.setBackground(Color.WHITE);
		travelButton.setBorderPainted(false);


		JButton petButton = new JButton();//반려동물
		petButton.setLayout(null);
		petButton.setBounds(10, 9, 205, 45);
		petButton.setBackground(Color.WHITE);
		petButton.setBorderPainted(false);


		JButton  gameButton = new JButton();//게임.오락
		gameButton.setLayout(null);
		gameButton.setBounds(7, 9, 205, 45);
		gameButton.setBackground(Color.WHITE);
		gameButton.setBorderPainted(false);


		JButton  craftsButton = new JButton();//공예.만들기
		craftsButton.setLayout(null);
		craftsButton.setBounds(10, 9,205, 45);
		craftsButton.setBackground(Color.WHITE);
		craftsButton.setBorderPainted(false);

		

		JButton  societyButton = new JButton();//사교.인맥
		societyButton.setLayout(null);
		societyButton.setBounds(7, 9, 205, 45);
		societyButton.setBackground(Color.WHITE);
		societyButton.setBorderPainted(false);


		JButton  parentingButton = new JButton();//결혼.육아
		parentingButton.setLayout(null);
		parentingButton.setBounds(10, 9,205, 45);
		parentingButton.setBackground(Color.WHITE);
		parentingButton.setBorderPainted(false);


		JButton  volunteerButton = new JButton();//봉사활동
		volunteerButton.setLayout(null);
		volunteerButton.setBounds(7, 9, 205, 45);
		volunteerButton.setBackground(Color.WHITE);
		volunteerButton.setBorderPainted(false);


		JButton  cookingButton = new JButton();//요리
		cookingButton.setLayout(null);
		cookingButton.setBounds(10, 9,205, 45);
		cookingButton.setBackground(Color.WHITE);
		cookingButton.setBorderPainted(false);
		
		JButton  carmotorcycleButton = new JButton();//차.오토바이
		carmotorcycleButton.setLayout(null);
		carmotorcycleButton.setBounds(7, 9, 205, 45);
		carmotorcycleButton.setBackground(Color.WHITE);
		carmotorcycleButton.setBorderPainted(false);

		JButton  musicButton = new JButton();//음악.악기
		musicButton.setLayout(null);
		musicButton.setBounds(10,9 ,205, 43);
		musicButton.setBackground(Color.WHITE);
		musicButton.setBorderPainted(false);

		JButton  danceButton = new JButton();//댄스.무용
		danceButton.setLayout(null);
		danceButton.setBounds(7, 9, 205, 43);
		danceButton.setBackground(Color.WHITE);
		danceButton.setBorderPainted(false);

		//전체관심사  이미지 생성  
		Image  exerciseIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(55, 40, 0);//이미지 크기
		Image travelIcon = new ImageIcon("images/travel.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image petIcon = new ImageIcon("images/pet.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image gameIcon = new ImageIcon("images/game.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image craftsIcon = new ImageIcon("images/crafts.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image societyIcon = new ImageIcon("images/society.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image parentingIcon = new ImageIcon("images/parenting.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image volunteerIcon = new ImageIcon("images/volunteer.PNG").getImage().getScaledInstance(40, 40, 0);//이미지 크기
		Image cookingIcon = new ImageIcon("images/cooking.PNG").getImage().getScaledInstance(50, 50, 0);//이미지 크기
		Image carmotorcycleIcon = new ImageIcon("images/carmotorcycle.PNG").getImage().getScaledInstance(40, 50, 0);//이미지 크기
		Image musicIcon = new ImageIcon("images/music.PNG").getImage().getScaledInstance(30, 30, 0);//이미지 크기
		Image danceIcon = new ImageIcon("images/dance.PNG").getImage().getScaledInstance(50, 50, 0);//이미지 크기


		//이미지를 넣을 라벨  생성 및 사이즈 조정
		JLabel exerciseIconLabel = new JLabel(new ImageIcon(exerciseIcon));
		exerciseIconLabel.setLayout(null);
		exerciseIconLabel.setBounds(10,3, 40, 40);


		JLabel travelIconLabel = new JLabel(new ImageIcon(travelIcon));
		travelIconLabel.setLayout(null);
		travelIconLabel.setBounds(10,3, 40, 40);

		JLabel petIconLabel = new JLabel(new ImageIcon(petIcon));
		petIconLabel.setLayout(null);
		petIconLabel.setBounds(10,3, 40, 40);


		JLabel  gameIconLabel = new JLabel(new ImageIcon(gameIcon));
		gameIconLabel.setLayout(null);
		gameIconLabel.setBounds(10,3, 40, 40);


		JLabel craftsIconLabel = new JLabel(new ImageIcon(craftsIcon));
		craftsIconLabel.setLayout(null);
		craftsIconLabel.setBounds(10,3, 40, 40);


		JLabel societyIconLabel = new JLabel(new ImageIcon(societyIcon));
		societyIconLabel.setLayout(null);
		societyIconLabel.setBounds(10,3, 40, 40);


		JLabel parentingIconLabel = new JLabel(new ImageIcon(parentingIcon));
		parentingIconLabel.setLayout(null);
		parentingIconLabel.setBounds(10,3, 40, 40);


		JLabel volunteerIconLabel = new JLabel(new ImageIcon(volunteerIcon));
		volunteerIconLabel.setLayout(null);
		volunteerIconLabel.setBounds(10,3, 40, 40);


		JLabel cookingIconLabel = new JLabel(new ImageIcon(cookingIcon));
		cookingIconLabel.setLayout(null);
		cookingIconLabel.setBounds(10,3, 40, 40);


		JLabel carmotorcycleIcoLabel = new JLabel(new ImageIcon(carmotorcycleIcon));
		carmotorcycleIcoLabel.setLayout(null);
		carmotorcycleIcoLabel.setBounds(10,3, 40, 40);


		JLabel musicIconLabel = new JLabel(new ImageIcon(musicIcon));
		musicIconLabel.setLayout(null);
		musicIconLabel.setBounds(10,3, 40, 40);


		JLabel danceIconLabel = new JLabel(new ImageIcon(danceIcon));
		danceIconLabel.setLayout(null);
		danceIconLabel.setBounds(10,3, 40, 40);

		//관심사명 라벨 생성 
		JLabel exercisenameJLabel = new JLabel("운동/스포츠");
		exercisenameJLabel.setBounds(60, 3, 205, 45);
		exercisenameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel travelNameJLabel = new JLabel("아웃도어/여행");
		travelNameJLabel.setBounds(60, 3, 205, 45);
		travelNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  petnameJLabel = new JLabel("반려동물");
		petnameJLabel.setBounds(60, 3, 205, 45);
		petnameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  gameNameJLabel = new JLabel("게임/오락");
		gameNameJLabel.setBounds(60, 3, 205, 45);
		gameNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  craftsNameJLabel = new JLabel("공예/만들기");
		craftsNameJLabel.setBounds(60, 3, 205, 45);
		craftsNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  societyNameJLabel = new JLabel("사교/인맥");
		societyNameJLabel.setBounds(60, 3, 205, 45);
		societyNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  parentingNameJLabel = new JLabel("결혼/육아");
		parentingNameJLabel.setBounds(60, 3, 205, 45);
		parentingNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  volunteerNameJLabel = new JLabel("봉사활동");
		volunteerNameJLabel.setBounds(60, 3, 205, 45);
		volunteerNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  cookingNameJLabel = new JLabel("요리");
		cookingNameJLabel.setBounds(60, 3, 205, 45);
		cookingNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 
		
		JLabel  carmotorcycleNameJLabel = new JLabel("차/오토바이");
		carmotorcycleNameJLabel.setBounds(60, 3, 205, 45);
		carmotorcycleNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  musicNameJLabel = new JLabel("음악/악기");
		musicNameJLabel.setBounds(60, 3, 205, 45);
		musicNameJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		JLabel  danceNmaeJLabel = new JLabel("댄스/무용");
		danceNmaeJLabel.setBounds(60, 3, 205, 45);
		danceNmaeJLabel.setFont(new Font("나눔고딕",Font.PLAIN, 17)); 

		//전체관심사버튼에 이미지아이콘라벨 add
		exerciseButton.add(exerciseIconLabel);
		travelButton.add(travelIconLabel);
		petButton.add(petIconLabel);
		gameButton.add(gameIconLabel);
		craftsButton.add(craftsIconLabel);
		societyButton.add(societyIconLabel);
		parentingButton.add(parentingIconLabel);
		volunteerButton.add(volunteerIconLabel);
		cookingButton.add(cookingIconLabel);
		carmotorcycleButton.add(carmotorcycleIcoLabel);
		musicButton.add(musicIconLabel);
		danceButton.add(danceIconLabel);

		//전체관심사 라벨에 버튼 add
		exerciseJLabel.add(exerciseButton);
		travelJLabel.add(travelButton);
		petJLabel.add(petButton);
		gameJLabel.add(gameButton);
		craftsJLabel.add(craftsButton);
		societyJLabel.add(societyButton);
		parentingJLabel.add(parentingButton);
		volunteerJLabel.add(volunteerButton);
		cookingJLabel.add(cookingButton);
		carmotorcycleJLabel.add(carmotorcycleButton);
		musicJLabel.add(musicButton);
		danceJLabel.add(danceButton);

		//전체관심사 버튼에 관심사명 add
		exerciseButton.add(exercisenameJLabel);
		travelButton.add(travelNameJLabel);
		petButton.add(petnameJLabel);
		gameButton.add(gameNameJLabel);
		craftsButton.add(craftsNameJLabel);
		societyButton.add(societyNameJLabel);
		parentingButton.add(parentingNameJLabel);
		volunteerButton.add(volunteerNameJLabel);
		cookingButton.add(cookingNameJLabel);
		carmotorcycleButton.add(carmotorcycleNameJLabel);
		musicButton.add(musicNameJLabel);
		danceButton.add(danceNmaeJLabel);


		//그리드레이아웃에 설정한 라벨 add 
		AllFavoriteLabel2.add(exerciseJLabel);
		AllFavoriteLabel2.add(travelJLabel);
		AllFavoriteLabel2.add(petJLabel);
		AllFavoriteLabel2.add(gameJLabel);
		AllFavoriteLabel2.add(craftsJLabel);
		AllFavoriteLabel2.add(societyJLabel);
		AllFavoriteLabel2.add(parentingJLabel);
		AllFavoriteLabel2.add(volunteerJLabel);
		AllFavoriteLabel2.add(cookingJLabel);
		AllFavoriteLabel2.add(carmotorcycleJLabel);
		AllFavoriteLabel2.add(musicJLabel);
		AllFavoriteLabel2.add(danceJLabel);


		this.add(AllFavoriteLabel);
		this.add(AllFavoriteLabel2);


	}

}
