package com.kh.somoim.view.search;
//�˻�â

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class SearchEngine extends JLabel {
	public SearchEngine () {
		//�˻�â ������ ���� �� ����
		this.setLayout(null);
		this.setLocation(100, 100); //��ġ
		this.setSize(465,50); //ũ��



		//�˻��̹��� ����  �� ������ ���� 
		Image icon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);//�̹��� ũ��
		//�˻� �̹����� ���� ��  ����
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		//�̹����󺧻��������� 
		iconLabel.setLocation(6,5); // �̹����� ��ġ 
		iconLabel.setSize(50,40);   //ũ������ 
		
		





		this.add(iconLabel);


	}
}
