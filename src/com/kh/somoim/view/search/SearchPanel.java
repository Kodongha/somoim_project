package com.kh.somoim.view.search;
//�˻�â ���� 
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SearchPanel extends JPanel {
	//SearchEngine 
	SearchEngine searchEngine;

	//SearchFavorite
	SearchFavorite searchFavorite;

	//SearchAllFavorite
	SearchAllFavorite searchAllFavorite;

	public SearchPanel() {
		//SearchPanel ��ġ���� �� ����÷� ����
		this.setLayout(null);
		this.setBackground(Color.WHITE);	

		//�˻�â ��ġ(SearchEngine) ���� 
		searchEngine = new SearchEngine();
		searchEngine.setLocation(10,10);//��ġ
		//�˻�â �˻�â�׵θ� ���� 
		searchEngine.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));

		//�α�Ҹ��� (SearchFavorite) ��ġ����
		searchFavorite = new SearchFavorite(); 
		searchFavorite.setLocation(10,70);//��ġ
		//�α�Ҹ��� �˻�â�׵θ� ���� 
		searchFavorite.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));


		//��ü���ɻ� ��ġ ���� 
		
		
		
		
		
		//��ü ���ɻ�(SearchAllFavorite) ��ġ���� 
		searchAllFavorite = new SearchAllFavorite(); 
		searchAllFavorite.setLocation(10,250);//��ġ
		//��ü ���ɻ�(SearchAllFavorite) �˻�â�׵θ� ���� 
		searchAllFavorite.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));






		//�˻�â add
		this.add(searchEngine);	
		//�α�Ҹ��� add
		this.add(searchFavorite);
		//��ü���ɻ�
		this.add(searchAllFavorite);

	}


}
