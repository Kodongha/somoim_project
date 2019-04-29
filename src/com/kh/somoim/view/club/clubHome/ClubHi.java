package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ClubHi extends JPanel{
	
	JLabel noticeLabel;	
	LineBorder noticeBorder;
	JLabel noticeiconLabel;
	
	public ClubHi() {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		// �г� ���п� �׵θ� (�ϼ��� ����)
		LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);
		
		// �������� ��
		noticeLabel = new JLabel();
		noticeLabel.setSize(500, 80);
		noticeLabel.setLocation(0, 0);
		noticeLabel.setOpaque(true);
		noticeLabel.setBackground(Color.white);
		
		// �������� �� �׵θ�
		noticeBorder = new LineBorder(Color.black);
		noticeLabel.setBorder(noticeBorder);
		
		// �������� �ΰ�
		Image noticeIcon = new ImageIcon("images/noticeicon.PNG").getImage().getScaledInstance(50, 50, 0);
		JLabel iconLabel = new JLabel(new ImageIcon(noticeIcon));
		iconLabel.setBounds(5, 20, 40, 40);
		noticeLabel.add(iconLabel);
				
		
		this.add(noticeLabel);
		
		
		
		
	}

}
