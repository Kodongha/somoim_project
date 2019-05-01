package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import com.kh.somoim.signup.controller.SignupController;
import com.kh.somoim.signup.model.vo.SignupRequestVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class CheckFavorites extends JPanel{

	private JPanel thisPanel;

	private Map<String, String> map = new HashMap<String, String>();
	private Border border  = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.GREEN, Color.GREEN);
	private Border border2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY);

	/*private JLabel gamelabel; //게임
	private JLabel travellabel; //여행
	private JLabel petlabel; // 반려동물
	private JLabel craftslabel; // 공예
	private JLabel societylabel; // 사교
	private JLabel parentinglabel; // 육아
	private JLabel volunteer; ///봉사활동
	private JLabel cooking; // 요리
	private JLabel carmotorcycle; //차/오토바이
	private JLabel music; //음악 
	private JLabel dance; //  
	 */	
	public CheckFavorites(MainFrame mainFrame, SignupRequestVO signupRequestVO) {
		SignupController signupController = new SignupController();
		this.thisPanel = this;

		this.setLayout(null);
		this.setBackground(Color.WHITE);
		this.setBounds(200, 20, 500, 800);

		JPanel imagePanel = new JPanel();
		imagePanel.setLayout(new GridLayout(6, 2));
		imagePanel.setBackground(Color.white);
		imagePanel.setBounds(98,110,300,500); //x, y 가로버튼크기 / 세로버튼크기 

		JButton exerciseButton = new JButton(new ImageIcon("images/exercise.PNG")); //운동버튼
		exerciseButton.setSize(50, 50);
		imagePanel.add(exerciseButton);
		exerciseButton.setBackground(Color.WHITE);
		//exercisebutton.setBorderPainted(true);

		JButton gameButton = new JButton(new ImageIcon("images/game.PNG")); //게임 버튼
		imagePanel.add(gameButton);
		gameButton.setBackground(Color.WHITE);

		JButton travelButton = new JButton(new ImageIcon("images/travel.PNG")); //여행버튼
		imagePanel.add(travelButton);
		travelButton.setBackground(Color.WHITE);

		JButton petButton = new JButton(new ImageIcon("images/pet.PNG")); //애완동물 버튼
		imagePanel.add(petButton);
		petButton.setBackground(Color.WHITE);

		JButton craftsButton = new JButton(new ImageIcon("images/crafts.PNG")); //공예 버튼
		imagePanel.add(craftsButton);
		craftsButton.setBackground(Color.WHITE);

		JButton societyButton = new JButton(new ImageIcon("images/society.PNG")); //사교 버튼
		imagePanel.add(societyButton);
		societyButton.setBackground(Color.WHITE);

		JButton parentingButton = new JButton(new ImageIcon("images/parenting.PNG")); //결혼 유아 버튼
		imagePanel.add(parentingButton);
		parentingButton.setBackground(Color.WHITE);

		JButton volunteerButton = new JButton(new ImageIcon("images/volunteer.PNG")); //봉사활동 버튼
		volunteerButton.setSize(50, 50);
		imagePanel.add(volunteerButton);
		volunteerButton.setBackground(Color.WHITE);

		JButton cookingButton = new JButton(new ImageIcon("images/cooking.PNG")); //요리 버튼
		imagePanel.add(cookingButton);
		cookingButton.setBackground(Color.WHITE);

		JButton carMotorcycleButton = new JButton(new ImageIcon("images/carmotorcycle.PNG")); //차, 오토바이 버튼
		imagePanel.add(carMotorcycleButton);
		carMotorcycleButton.setBackground(Color.WHITE);

		JButton musicButton = new JButton(new ImageIcon("images/music.PNG")); // 뮤직
		imagePanel.add(musicButton);
		musicButton.setBackground(Color.WHITE);

		JButton danceButton = new JButton(new ImageIcon("images/dance.PNG")); //댄스 버튼
		imagePanel.add(danceButton);
		danceButton.setBackground(Color.WHITE);

		this.add(imagePanel);

		CheckFavoritesTopPanel checkFavoritesTopPanel = new CheckFavoritesTopPanel();
		checkFavoritesTopPanel.setBounds(0, 0, 500, 35);
		this.add(checkFavoritesTopPanel);

		JButton nextButton = new JButton("다음");
		//다음버튼 사이즈 조정 
		nextButton.setBounds(137, 663, 230, 50);
		nextButton.setBackground(Color.ORANGE);
		this.add(nextButton);

		exerciseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(exerciseButton, "exerciseButton");

			}
		});;

		gameButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(gameButton, "gameButton");
			}
		});;		

		travelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(travelButton, "travelButton");
			}
		});;		

		petButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(petButton, "petButton");
			}
		});;		

		craftsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(craftsButton, "craftsButton") ;
			}
		});;		

		societyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(societyButton, "societyButton");
			}
		});;		

		parentingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder( parentingButton, "parentingButton" );
			}
		});;		

		volunteerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(volunteerButton, "volunteerButton");
			}
		});;		

		cookingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder(cookingButton, "cookingButton");
			}
		});;		

		carMotorcycleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder( carMotorcycleButton, "carMotorcycleButton" );
			}
		});;		

		musicButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder( musicButton, "musicButton" );
			}
		});;		

		danceButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeBorder( danceButton, "danceButton" );
			}
		});;

		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				if( map.size() == 2 ) {
					System.out.println("만족");
					Set keys = map.keySet();
					Iterator it = keys.iterator();
					ArrayList<String> favoriteList = new ArrayList<String>();
					while(it.hasNext()) {
						
						String favorite = it.next().toString();
						/*
						게임/오락
						결혼/육아
						공예/만들기
						댄스/무용
						반려동물
						봉사활동
						사교/인맥
						아웃도어/여행
						요리
						운동/스포츠
						음악/악기
						차/오토바이
						*/
						switch (favorite) {
						case "danceButton":
							favoriteList.add("댄스/무용");
							break;
						case "musicButton":
							favoriteList.add("음악/악기");
							break;
						case "carMotorcycleButton":
							favoriteList.add("차/오토바이");
							break;
							
						case "cookingButton":
							favoriteList.add("요리");
							break;
							
						case "volunteerButton":
							favoriteList.add("봉사활동");
							break;
							
						case "parentingButton":
							favoriteList.add("결혼/육아");
							
						case "societyButton":
							favoriteList.add("사교/인맥");
							break;
						
						case "craftsButton":
							favoriteList.add("공예/만들기");
							break;
							
						case "petButton":
							favoriteList.add("반려동물");
							break;
							
						case "travelButton":
							favoriteList.add("아웃도어/여행");
							break;
							
						case "gameButton":
							favoriteList.add("게임/오락");
							break;
							
						case "exerciseButton":
							favoriteList.add("운동/스포츠");
							break;
						}
						System.out.println("모임" + favorite);
						signupRequestVO.setFavorite(favoriteList);
					}
					
					signupController.setSignup(signupRequestVO);
					JOptionPane.showMessageDialog( thisPanel, "가입이 완료되었습니다.", "가입 완료", JOptionPane.PLAIN_MESSAGE);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				}
				else {
					JOptionPane.showMessageDialog( thisPanel, "2개 선택 하세요", "ERROR", JOptionPane.ERROR_MESSAGE); 
					System.out.println("부족");
				}

			}
		});;

		/*nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new SignUpFinish(mainFrame));

			}
		});*/
	}

	public void changeBorder(JButton button, String key)
	{
		if(map.containsKey(key)) {

			button.setBorder(border2);
			map.remove(key);

		}else {

			button.setBorder(border);
			map.put(key, key);
		}
	}
}