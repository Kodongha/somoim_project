package com.kh.somoim.view.search;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchAllFavorite extends JPanel{
	public SearchAllFavorite() {
		this.setLayout(null);
		this.setLocation(100, 100); //��ġ
		this.setSize(465,390); //ũ��
		this.setBackground(Color.WHITE);

		//��ü���ɻ� �� ���� �� ������ ���� 
		JLabel AllFavoriteLabel = new JLabel("��ü���ɻ�");
		AllFavoriteLabel.setLocation(30,10); //�̹�����ġ
		AllFavoriteLabel.setSize(300,40); //ũ������		
		//��ü���ɻ� �۲� ���� 
		AllFavoriteLabel.setFont(new Font("�������",Font.BOLD, 25)); //��Ʈ���� �� ����,���������� 


		//��ü���ɻ� �׸��巹�̾ƿ� ���� 
		JPanel AllFavoritechoicePannel = new JPanel();
	
		
		
		

		this.add(AllFavoriteLabel);



	}

}
