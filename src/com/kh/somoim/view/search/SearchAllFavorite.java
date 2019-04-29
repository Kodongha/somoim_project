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
		AllFavoriteLabel2.setBackground(Color.WHITE);
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
		JLabel  cookingJLabel = new JLabel();
		cookingJLabel.setLayout(null);
		JLabel  carmotorcycleJLabel = new JLabel();
		carmotorcycleJLabel.setLayout(null);
		JLabel  musicJLabel = new JLabel();
		musicJLabel.setLayout(null);
		JLabel  danceJLabel = new JLabel();
		danceJLabel.setLayout(null);



		//��ü���ɻ� ��ư ���� �� ������ ����
		JButton exerciseButton = new JButton();//�.������
		exerciseButton.setLayout(null);
		exerciseButton.setBounds(10, 9, 205, 45);
		exerciseButton.setBackground(Color.WHITE);
		exerciseButton.setBorderPainted(false);

		JButton  travelButton = new JButton();//����.�ƿ�����
		travelButton.setLayout(null);
		travelButton.setBounds(7, 9, 205, 45);
		travelButton.setBackground(Color.WHITE);
		travelButton.setBorderPainted(false);


		JButton petButton = new JButton();//�ݷ�����
		petButton.setLayout(null);
		petButton.setBounds(10, 9, 205, 45);
		petButton.setBackground(Color.WHITE);
		petButton.setBorderPainted(false);


		JButton  gameButton = new JButton();//����.����
		gameButton.setLayout(null);
		gameButton.setBounds(7, 9, 205, 45);
		gameButton.setBackground(Color.WHITE);
		gameButton.setBorderPainted(false);


		JButton  craftsButton = new JButton();//����.�����
		craftsButton.setLayout(null);
		craftsButton.setBounds(10, 9,205, 45);
		craftsButton.setBackground(Color.WHITE);
		craftsButton.setBorderPainted(false);

		

		JButton  societyButton = new JButton();//�米.�θ�
		societyButton.setLayout(null);
		societyButton.setBounds(7, 9, 205, 45);
		societyButton.setBackground(Color.WHITE);
		societyButton.setBorderPainted(false);


		JButton  parentingButton = new JButton();//��ȥ.����
		parentingButton.setLayout(null);
		parentingButton.setBounds(10, 9,205, 45);
		parentingButton.setBackground(Color.WHITE);
		parentingButton.setBorderPainted(false);


		JButton  volunteerButton = new JButton();//����Ȱ��
		volunteerButton.setLayout(null);
		volunteerButton.setBounds(7, 9, 205, 45);
		volunteerButton.setBackground(Color.WHITE);
		volunteerButton.setBorderPainted(false);


		JButton  cookingButton = new JButton();//�丮
		cookingButton.setLayout(null);
		cookingButton.setBounds(10, 9,205, 45);
		cookingButton.setBackground(Color.WHITE);
		cookingButton.setBorderPainted(false);
		
		JButton  carmotorcycleButton = new JButton();//��.�������
		carmotorcycleButton.setLayout(null);
		carmotorcycleButton.setBounds(7, 9, 205, 45);
		carmotorcycleButton.setBackground(Color.WHITE);
		carmotorcycleButton.setBorderPainted(false);

		JButton  musicButton = new JButton();//����.�Ǳ�
		musicButton.setLayout(null);
		musicButton.setBounds(10,9 ,205, 43);
		musicButton.setBackground(Color.WHITE);
		musicButton.setBorderPainted(false);

		JButton  danceButton = new JButton();//��.����
		danceButton.setLayout(null);
		danceButton.setBounds(7, 9, 205, 43);
		danceButton.setBackground(Color.WHITE);
		danceButton.setBorderPainted(false);

		//��ü���ɻ�  �̹��� ����  
		Image  exerciseIcon = new ImageIcon("images/exercise.PNG").getImage().getScaledInstance(55, 40, 0);//�̹��� ũ��
		Image travelIcon = new ImageIcon("images/travel.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image petIcon = new ImageIcon("images/pet.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image gameIcon = new ImageIcon("images/game.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image craftsIcon = new ImageIcon("images/crafts.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image societyIcon = new ImageIcon("images/society.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image parentingIcon = new ImageIcon("images/parenting.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image volunteerIcon = new ImageIcon("images/volunteer.PNG").getImage().getScaledInstance(40, 40, 0);//�̹��� ũ��
		Image cookingIcon = new ImageIcon("images/cooking.PNG").getImage().getScaledInstance(50, 50, 0);//�̹��� ũ��
		Image carmotorcycleIcon = new ImageIcon("images/carmotorcycle.PNG").getImage().getScaledInstance(40, 50, 0);//�̹��� ũ��
		Image musicIcon = new ImageIcon("images/music.PNG").getImage().getScaledInstance(30, 30, 0);//�̹��� ũ��
		Image danceIcon = new ImageIcon("images/dance.PNG").getImage().getScaledInstance(50, 50, 0);//�̹��� ũ��


		//�̹����� ���� ��  ���� �� ������ ����
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

		//���ɻ�� �� ���� 
		JLabel exercisenameJLabel = new JLabel("�/������");
		exercisenameJLabel.setBounds(60, 3, 205, 45);
		exercisenameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel travelNameJLabel = new JLabel("�ƿ�����/����");
		travelNameJLabel.setBounds(60, 3, 205, 45);
		travelNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  petnameJLabel = new JLabel("�ݷ�����");
		petnameJLabel.setBounds(60, 3, 205, 45);
		petnameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  gameNameJLabel = new JLabel("����/����");
		gameNameJLabel.setBounds(60, 3, 205, 45);
		gameNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  craftsNameJLabel = new JLabel("����/�����");
		craftsNameJLabel.setBounds(60, 3, 205, 45);
		craftsNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  societyNameJLabel = new JLabel("�米/�θ�");
		societyNameJLabel.setBounds(60, 3, 205, 45);
		societyNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  parentingNameJLabel = new JLabel("��ȥ/����");
		parentingNameJLabel.setBounds(60, 3, 205, 45);
		parentingNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  volunteerNameJLabel = new JLabel("����Ȱ��");
		volunteerNameJLabel.setBounds(60, 3, 205, 45);
		volunteerNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  cookingNameJLabel = new JLabel("�丮");
		cookingNameJLabel.setBounds(60, 3, 205, 45);
		cookingNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 
		
		JLabel  carmotorcycleNameJLabel = new JLabel("��/�������");
		carmotorcycleNameJLabel.setBounds(60, 3, 205, 45);
		carmotorcycleNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  musicNameJLabel = new JLabel("����/�Ǳ�");
		musicNameJLabel.setBounds(60, 3, 205, 45);
		musicNameJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		JLabel  danceNmaeJLabel = new JLabel("��/����");
		danceNmaeJLabel.setBounds(60, 3, 205, 45);
		danceNmaeJLabel.setFont(new Font("�������",Font.PLAIN, 17)); 

		//��ü���ɻ��ư�� �̹��������ܶ� add
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

		//��ü���ɻ� �󺧿� ��ư add
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

		//��ü���ɻ� ��ư�� ���ɻ�� add
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


		//�׸��巹�̾ƿ��� ������ �� add 
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
