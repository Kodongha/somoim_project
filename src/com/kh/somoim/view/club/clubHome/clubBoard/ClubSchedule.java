package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ClubSchedule extends JPanel{
	
	JLabel noticeLabel;
	JLabel noticetitleLabel;
	JLabel scheduleLabel;
	JLabel scheduletitleLabel;
	JLabel schedulecontentsLabel;
	
	public ClubSchedule() {
		
		System.out.println("Schedule in ::::");
		
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
		noticetitleLabel = new JLabel("정모 일정 게시판입니다.");
		noticetitleLabel.setFont(noticetitleLabel.getFont().deriveFont(20.0f));
		noticetitleLabel.setSize(450, 50);
		noticetitleLabel.setLocation(50, 15);
		noticetitleLabel.setOpaque(true);
		noticetitleLabel.setBackground(Color.white);

		noticeLabel.add(noticetitleLabel);	
		
		// 정모일정  출력 라벨
		scheduleLabel = new JLabel();
		scheduleLabel.setSize(500, 60);
		scheduleLabel.setLocation(0, 80);
		scheduleLabel.setOpaque(true);
		scheduleLabel.setBackground(Color.white);
		
		LineBorder scheduleBorder = new LineBorder(Color.black);
		scheduleLabel.setBorder(scheduleBorder);
		
		// 정모일정 글  사진 라벨
		Image freeIcon = new ImageIcon("images/hi_test.PNG").getImage().getScaledInstance(80, 100, 0);
		JLabel freeIconLabel = new JLabel(new ImageIcon(freeIcon));
		freeIconLabel.setBounds(0, 0, 60, 60);
		scheduleLabel.add(freeIconLabel);
		
		LineBorder freeIconBorder = new LineBorder(Color.black);
		freeIconLabel.setBorder(freeIconBorder);
		
		
		// 정모일 제목  라벨
		scheduletitleLabel = new JLabel("정모 날짜는 5/7 ");
		scheduletitleLabel.setFont(scheduletitleLabel.getFont().deriveFont(17.0f));
		scheduletitleLabel.setSize(100, 15);
		scheduletitleLabel.setLocation(68, 10);
		scheduletitleLabel.setOpaque(true);
		scheduletitleLabel.setBackground(Color.white);
		
		scheduleLabel.add(scheduletitleLabel);
		
		// 정모일 내용 라벨
		schedulecontentsLabel = new JLabel("오늘 가입했어요 ");
		schedulecontentsLabel.setFont(schedulecontentsLabel.getFont().deriveFont(13.0f));
		schedulecontentsLabel.setSize(200,15);
		schedulecontentsLabel.setLocation(70, 35);
		schedulecontentsLabel.setOpaque(true);
		schedulecontentsLabel.setBackground(Color.white);
		
		scheduleLabel.add(schedulecontentsLabel);	
		
		this.add(noticeLabel);
		this.add(scheduleLabel);
		
	}

}
