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
		this.setLocation(100, 100); //��ġ
		this.setSize(465,390); //ũ��
		this.setBackground(Color.WHITE);

		//��ü���ɻ�Ÿ��Ʋ �� ���� �� ������ ���� 
		JLabel AllFavoriteLabel = new JLabel("��ü���ɻ�");
		AllFavoriteLabel.setLocation(30,10); //�̹�����ġ
		AllFavoriteLabel.setSize(300,40); //ũ������	
		AllFavoriteLabel.setBackground(Color.white);
		AllFavoriteLabel.setOpaque(true);
		//��ü���ɻ� �۲� ���� 
		AllFavoriteLabel.setFont(new Font("�������",Font.BOLD, 25)); //��Ʈ���� �� ����,���������� 

		//��ü���ɻ� �� ���� �� ������ ����

		JLabel AllFavoriteLabel2 = new JLabel();
		AllFavoriteLabel2.setLocation(10,50); //�̹�����ġ
		AllFavoriteLabel2.setSize(445,330); //ũ������	
		AllFavoriteLabel2.setBackground(Color.blue);
		AllFavoriteLabel2.setOpaque(true);

		//��ü���ɻ� �׸��巹�̾ƿ� ���� 
		AllFavoriteLabel2.setLayout(new GridLayout(6,2));//������¹��� ���� �� ������ߵ�

		//��ü���ɻ� ��� ����
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



		//��ü���ɻ� ��ư ���� �� ������ ����
		JButton exerciseButton = new JButton();
		exerciseButton.setBounds(10, 9, 205, 45);

		JButton  travelButton = new JButton();//����.�ƿ�����
		travelButton.setBounds(7, 9, 205, 45);

		JButton petButton = new JButton();//�ݷ�����
		petButton.setBounds(10, 9, 205, 45);

		JButton  gameButton = new JButton();//����.����
		gameButton.setBounds(7, 9, 205, 45);

		JButton  craftsButton = new JButton();//����.�����
		craftsButton.setBounds(10, 9,205, 45);

		JButton  societyButton = new JButton();//�米.�θ�
		societyButton.setBounds(7, 9, 205, 45);

		JButton  parentingButton = new JButton();//��ȥ.����
		parentingButton.setBounds(10, 9,205, 45);

		JButton  volunteerButton = new JButton();//����Ȱ��
		volunteerButton.setBounds(7, 9, 205, 45);

		JButton  cookButton = new JButton();//�丮
		cookButton.setBounds(10, 9,205, 45);

		JButton  carmotorcycleButton = new JButton();//��.�������
		carmotorcycleButton.setBounds(7, 9, 205, 45);

		JButton  musicButton = new JButton();//����.�Ǳ�
		musicButton.setBounds(10,9 ,205, 43);

		JButton  danceButton = new JButton();//��.����
		danceButton.setBounds(7, 9, 205, 43);

		
		
		
		//��ü���ɻ�  �̹��� ����  
		Image  exerciseIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image travelIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image petIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image gameIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image craftsIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image societIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image parentingIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image volunteerIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image cookIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image carmotorcycleIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image musicIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image danceIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		
		
		//�̹����� ���� ��  ���� 
		JLabel exerciseIconLabel = new JLabel(new ImageIcon(exerciseIcon));
		
		


		
		//��ü���ɻ��ư�� �̹��������ܶ� add
		exerciseButton.add(exerciseIconLabel);



		//��ü���ɻ� �󺧿� ��ư add
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




		//��ü���ɻ� ��ư�� �̹��� ����
		/*	Image exerciseIcon = new ImageIcon("images/Exercise.PNG").getImage().getScaledInstance(30 30, 0);//�̹��� ũ��
		exerciseJLabel.add(exerciseIcon);*/


		//�׸��巹�̾ƿ��� ������ �� add 
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
