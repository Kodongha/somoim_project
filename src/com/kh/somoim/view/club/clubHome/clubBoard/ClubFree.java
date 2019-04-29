package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ClubFree extends JPanel {
	
	JLabel noticeLabel;
	JLabel noticetitleLabel;
	JLabel freeLabel;
	JLabel freecontentsLabel;
	JLabel freetitleLabel;
	
	public ClubFree() {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		// 공지사항 라벨
		noticeLabel = new JLabel();
		noticeLabel.setSize(500, 80);
		noticeLabel.setLocation(0, 0);
		noticeLabel.setOpaque(true);
		noticeLabel.setBackground(Color.white);
		
		// 공지사항 로고
		Image noticeIcon = new ImageIcon("images/noticeicon.PNG").getImage().getScaledInstance(50, 50, 0);
		JLabel iconLabel = new JLabel(new ImageIcon(noticeIcon));
		iconLabel.setBounds(5, 20, 40, 40);
		noticeLabel.add(iconLabel);
		
		// 공지사항 제목 라벨
		noticetitleLabel = new JLabel("집 가 고 싶 다  ");
		noticetitleLabel.setFont(noticetitleLabel.getFont().deriveFont(20.0f));
		noticetitleLabel.setSize(450, 50);
		noticetitleLabel.setLocation(50, 15);
		noticetitleLabel.setOpaque(true);
		noticetitleLabel.setBackground(Color.LIGHT_GRAY);

		noticeLabel.add(noticetitleLabel);	
		
		// 자유게시글 출력 라벨
		freeLabel = new JLabel();
		freeLabel.setSize(500, 60);
		freeLabel.setLocation(0, 80);
		freeLabel.setOpaque(true);
		freeLabel.setBackground(Color.white);
		
		LineBorder hiBorder = new LineBorder(Color.black);
		freeLabel.setBorder(hiBorder);
		
		// 자유게시판 글 사진 라벨
		Image freeIcon = new ImageIcon("images/hi_test.PNG").getImage().getScaledInstance(80, 100, 0);
		JLabel freeIconLabel = new JLabel(new ImageIcon(freeIcon));
		freeIconLabel.setBounds(0, 0, 60, 60);
		freeLabel.add(freeIconLabel);
		
		LineBorder freeIconBorder = new LineBorder(Color.black);
		freeIconLabel.setBorder(freeIconBorder);
		
		
		// 자유게시판 제목  라벨
		freetitleLabel = new JLabel("안녕하셈 ");
		freetitleLabel.setFont(freetitleLabel.getFont().deriveFont(17.0f));
		freetitleLabel.setSize(100, 15);
		freetitleLabel.setLocation(68, 10);
		freetitleLabel.setOpaque(true);
		freetitleLabel.setBackground(Color.white);
		
		freeLabel.add(freetitleLabel);
		
		// 자유게시판 내용 라벨
		freecontentsLabel = new JLabel("오늘 가입했어요 ");
		freecontentsLabel.setFont(freecontentsLabel.getFont().deriveFont(13.0f));
		freecontentsLabel.setSize(200,15);
		freecontentsLabel.setLocation(70, 35);
		freecontentsLabel.setOpaque(true);
		freecontentsLabel.setBackground(Color.white);
		
		freeLabel.add(freecontentsLabel);	
		
		this.add(noticeLabel);
		this.add(freeLabel);
		
		
		
	}
	

}
