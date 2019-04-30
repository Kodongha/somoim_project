package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;

public class ClubFree extends JPanel {
	
	JLabel noticeLabel;
	JLabel noticetitleLabel;
	JLabel freeLabel;
	JLabel freecontentsLabel;
	JLabel freetitleLabel;
	
	JLabel listFreeLabel;
	JLabel listPhotoLabel;
	JLabel listScheduleLLabel;
	
	JPanel listPanel;
	ClubFree clubFreePanel;
	ClubPhoto clubPhotoPanel;
	ClubSchedule clubSchedulePanel;
	
	public ClubFree(ClubMainPanel clubmainPanel) {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		// 게시판 리스트 패널
		listPanel = new JPanel();
		listPanel.setLayout(null);
		listPanel.setBackground(Color.white);
		listPanel.setSize(500, 40);
		listPanel.setLocation(0, 0);
		
		this.add(listPanel);
		
		// 게시판 리스트 라벨
		listFreeLabel = new JLabel("자유게시판");
		listFreeLabel.setBounds(190, 0, 70, 40);
		listPanel.add(listFreeLabel);
		LineBorder listFreeBorder = new LineBorder(Color.black);
		listFreeLabel.setBorder(listFreeBorder);
		
		listPhotoLabel = new JLabel("사진게시판");
		listPhotoLabel.setBounds(265, 0, 70, 40);
		listPanel.add(listPhotoLabel);
		LineBorder listPhotoBorder = new LineBorder(Color.black);
		listPhotoLabel.setBorder(listPhotoBorder);
		
		listScheduleLLabel = new JLabel("정모일정");
		listScheduleLLabel.setBounds(340, 0, 60, 40);
		listPanel.add(listScheduleLLabel);
		LineBorder listScheduleBorder = new LineBorder(Color.BLACK);
		listScheduleLLabel.setBorder(listScheduleBorder);
		
		
		
		// 공지사항 라벨
		noticeLabel = new JLabel();
		noticeLabel.setSize(500, 80);
		noticeLabel.setLocation(0, 40);
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
		noticetitleLabel.setBackground(Color.white);

		noticeLabel.add(noticetitleLabel);	
		
		// 자유게시글 출력 라벨
		freeLabel = new JLabel();
		freeLabel.setSize(500, 60);
		freeLabel.setLocation(0, 120);
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
		
		clubPhotoPanel = new ClubPhoto();
		clubPhotoPanel.setSize(100,100 );

		clubSchedulePanel = new ClubSchedule();
		clubSchedulePanel.setPreferredSize(new Dimension(100, 650));
		
		listPhotoLabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == listPhotoLabel) {
					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubmainPanel.getClubFreePanel(), new ClubPhoto(), BorderLayout.SOUTH);
				}
			}
		});
		
	}
	

}
