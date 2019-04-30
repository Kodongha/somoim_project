package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import com.kh.somoim.signup.model.vo.SignupRequestVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.signup.SignupPage.MyMounseAdapter;

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
		this.thisPanel = thisPanel;
		
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
				//signupRequestVO.setFavorite(favorite);
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