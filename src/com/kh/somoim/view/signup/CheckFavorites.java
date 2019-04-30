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

	/*private JLabel gamelabel; //����
	private JLabel travellabel; //����
	private JLabel petlabel; // �ݷ�����
	private JLabel craftslabel; // ����
	private JLabel societylabel; // �米
	private JLabel parentinglabel; // ����
	private JLabel volunteer; ///����Ȱ��
	private JLabel cooking; // �丮
	private JLabel carmotorcycle; //��/�������
	private JLabel music; //���� 
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
		imagePanel.setBounds(98,110,300,500); //x, y ���ι�ưũ�� / ���ι�ưũ�� 
		
		JButton exerciseButton = new JButton(new ImageIcon("images/exercise.PNG")); //���ư
		exerciseButton.setSize(50, 50);
		imagePanel.add(exerciseButton);
		exerciseButton.setBackground(Color.WHITE);
		//exercisebutton.setBorderPainted(true);
		
		JButton gameButton = new JButton(new ImageIcon("images/game.PNG")); //���� ��ư
		imagePanel.add(gameButton);
		gameButton.setBackground(Color.WHITE);
		
		JButton travelButton = new JButton(new ImageIcon("images/travel.PNG")); //�����ư
		imagePanel.add(travelButton);
		travelButton.setBackground(Color.WHITE);
		
		JButton petButton = new JButton(new ImageIcon("images/pet.PNG")); //�ֿϵ��� ��ư
		imagePanel.add(petButton);
		petButton.setBackground(Color.WHITE);
		
		JButton craftsButton = new JButton(new ImageIcon("images/crafts.PNG")); //���� ��ư
		imagePanel.add(craftsButton);
		craftsButton.setBackground(Color.WHITE);
		
		JButton societyButton = new JButton(new ImageIcon("images/society.PNG")); //�米 ��ư
		imagePanel.add(societyButton);
		societyButton.setBackground(Color.WHITE);
		
		JButton parentingButton = new JButton(new ImageIcon("images/parenting.PNG")); //��ȥ ���� ��ư
		imagePanel.add(parentingButton);
		parentingButton.setBackground(Color.WHITE);
		
		JButton volunteerButton = new JButton(new ImageIcon("images/volunteer.PNG")); //����Ȱ�� ��ư
		volunteerButton.setSize(50, 50);
		imagePanel.add(volunteerButton);
		volunteerButton.setBackground(Color.WHITE);
		
		JButton cookingButton = new JButton(new ImageIcon("images/cooking.PNG")); //�丮 ��ư
		imagePanel.add(cookingButton);
		cookingButton.setBackground(Color.WHITE);
		
		JButton carMotorcycleButton = new JButton(new ImageIcon("images/carmotorcycle.PNG")); //��, ������� ��ư
		imagePanel.add(carMotorcycleButton);
		carMotorcycleButton.setBackground(Color.WHITE);
		
		JButton musicButton = new JButton(new ImageIcon("images/music.PNG")); // ����
		imagePanel.add(musicButton);
		musicButton.setBackground(Color.WHITE);
		
		JButton danceButton = new JButton(new ImageIcon("images/dance.PNG")); //�� ��ư
		imagePanel.add(danceButton);
		danceButton.setBackground(Color.WHITE);
	
		this.add(imagePanel);
		
		CheckFavoritesTopPanel checkFavoritesTopPanel = new CheckFavoritesTopPanel();
		checkFavoritesTopPanel.setBounds(0, 0, 500, 35);
		this.add(checkFavoritesTopPanel);
		
		JButton nextButton = new JButton("����");
		//������ư ������ ���� 
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
				System.out.println("����");
				//signupRequestVO.setFavorite(favorite);
			}
			else {
				JOptionPane.showMessageDialog( thisPanel, "2�� ���� �ϼ���", "ERROR", JOptionPane.ERROR_MESSAGE); 
				System.out.println("����");
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