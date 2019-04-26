package com.kh.somoim.view.search;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//�α�Ҹ���
public class SearchFavorite extends JLabel {
	public SearchFavorite() {
		this.setLayout(null);
		this.setLocation(100, 100); //��ġ
		this.setSize(465,160); //ũ��

		//�α�Ҹ��� ���� ����
		JLabel favoriteLabel= new JLabel("�α�Ҹ���");		  
		//�α�Ҹ���  �� ������ ����
		favoriteLabel.setLocation(30,10); //�̹�����ġ
		favoriteLabel.setSize(300,40); //ũ������		
		//�α�Ҹ��� ��Ʈ ���� (�������� �⺻ ��Ʈ�� �Ǵ°ǰ�?)
		favoriteLabel.setFont(new Font("�������",Font.BOLD, 25)); //��Ʈ���� �� ����,���������� 

		//�α�Ҹ��� ������ ����  �� ������ ���� 
		Image favoriteIcon = new ImageIcon("images/Favorite.PNG").getImage().getScaledInstance(35, 35, 0);//�̹��� ũ��
		//�α�Ҹ���  �̹����� ���� ��  ����
		JLabel iconLabel = new JLabel(new ImageIcon(favoriteIcon));
		//�α�Ҹ��� �̹����󺧻��������� 
		iconLabel.setLocation(145,3); // �̹����� ��ġ 
		iconLabel.setSize(50,40);   //ũ������ 

		//�/������ �� ���� 
		JLabel exerciseLabel = new JLabel("1. �/������");
		//�.������ �� ������ ���� 
		exerciseLabel.setLocation(60,50); // �̹����� ��ġ 
		exerciseLabel.setSize(120,40);   //ũ������ 
		//�.��������Ʈ ���� 
		exerciseLabel.setFont(new Font("�������",Font.PLAIN, 17)); //��Ʈ���� �� ����,���������� 

		//�ݷ����� �� ���� 
		JLabel petLabel = new JLabel("2. �ݷ�����");
		//�ݷ����� �� ������ ���� 
		petLabel.setLocation(60,80); // �̹����� ��ġ 
		petLabel.setSize(120,40);   //ũ������ 
		//�ݷ����� ��Ʈ ���� 
		petLabel.setFont(new Font("�������",Font.PLAIN, 17)); //��Ʈ���� �� ����,���������� 


		//�米.�θ� �� ���� 
		JLabel societyLabel = new JLabel("3. �米/�θ�");
		//�米.�θ� �� ������ ���� 
		societyLabel.setLocation(60,110); // �̹����� ��ġ 
		societyLabel.setSize(120,40);   //ũ������ 
		//�米.�θ� ��Ʈ ���� 
		societyLabel.setFont(new Font("�������",Font.PLAIN, 17)); //��Ʈ���� �� ����,���������� 

		//�ƿ�����.���� �� ���� 
		JLabel travelLabel = new JLabel("4. �ƿ�����/����");
		//�ƿ�����.����  �� ������ ���� 
		travelLabel.setLocation(270,50); // �̹����� ��ġ 
		travelLabel.setSize(170,40);   //ũ������ 
		//�ƿ�����.���� ��Ʈ ���� 
		travelLabel.setFont(new Font("�������",Font.PLAIN, 17)); //��Ʈ���� �� ����,���������� 

		//����.���� �� ���� 
		JLabel gameLabel = new JLabel("5. ����/����");
		//����.���� �� ������ ���� 
		gameLabel.setLocation(270,80); // �̹����� ��ġ 
		gameLabel.setSize(170,40);   //ũ������ 
		//����.���� ��Ʈ ���� 
		gameLabel.setFont(new Font("�������",Font.PLAIN, 17)); //��Ʈ���� �� ����,���������� 






		this.add(favoriteLabel);
		this.add(iconLabel);
		this.add(exerciseLabel);
		this.add(petLabel);
		this.add(societyLabel);
		this.add(travelLabel);
		this.add(gameLabel);



	}

}
