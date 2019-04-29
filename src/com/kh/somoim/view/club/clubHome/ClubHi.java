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
	JLabel noticetitleLabel;
	
	JLabel hiLabel;
	JLabel hititleLabel;
	JLabel hicontentsLabel;
	
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
		
		// �������� �ΰ�
		Image noticeIcon = new ImageIcon("images/noticeicon.PNG").getImage().getScaledInstance(50, 50, 0);
		JLabel iconLabel = new JLabel(new ImageIcon(noticeIcon));
		iconLabel.setBounds(5, 20, 40, 40);
		noticeLabel.add(iconLabel);
		
		// �������� ���� ��
		noticetitleLabel = new JLabel("��������");
		noticetitleLabel.setFont(noticetitleLabel.getFont().deriveFont(20.0f));
		noticetitleLabel.setSize(400, 50);
		noticetitleLabel.setLocation(50, 15);
		noticetitleLabel.setOpaque(true);
		noticetitleLabel.setBackground(Color.LIGHT_GRAY);

		noticeLabel.add(noticetitleLabel);	
		
		// �Ұ��� ��� ��
		hiLabel = new JLabel();
		hiLabel.setSize(500, 60);
		hiLabel.setLocation(0, 80);
		hiLabel.setOpaque(true);
		hiLabel.setBackground(Color.white);
		
		LineBorder hiBorder = new LineBorder(Color.black);
		hiLabel.setBorder(hiBorder);
		
		// �Ұ��� ���� ��
		Image hiIcon = new ImageIcon("images/hi_test.PNG").getImage().getScaledInstance(80, 100, 0);
		JLabel hiiconLabel = new JLabel(new ImageIcon(hiIcon));
		hiiconLabel.setBounds(0, 0, 60, 60);
		hiLabel.add(hiiconLabel);
		
		LineBorder hiiconBorder = new LineBorder(Color.black);
		hiiconLabel.setBorder(hiiconBorder);
		
		
		// �̸� ��
		hititleLabel = new JLabel("�����");
		hititleLabel.setFont(hititleLabel.getFont().deriveFont(17.0f));
		hititleLabel.setSize(100, 15);
		hititleLabel.setLocation(68, 10);
		hititleLabel.setOpaque(true);
		hititleLabel.setBackground(Color.white);
		
		hiLabel.add(hititleLabel);
		
		// �̸� ��� ��
		hicontentsLabel = new JLabel("�Ϳ��� �����");
		hicontentsLabel.setFont(hicontentsLabel.getFont().deriveFont(13.0f));
		hicontentsLabel.setSize(200,15);
		hicontentsLabel.setLocation(70, 35);
		hicontentsLabel.setOpaque(true);
		hicontentsLabel.setBackground(Color.white);
		
		hiLabel.add(hicontentsLabel);	
		
		this.add(noticeLabel);
		this.add(hiLabel);
		
		
		
		
	}

}
