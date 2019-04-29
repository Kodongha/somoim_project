package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;

public class CheckFavorites extends JPanel{
	
	private JPanel thisPanel;

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
	public CheckFavorites(MainFrame mainFrame) {
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
	  
	}
	
}
