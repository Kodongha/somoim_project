package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.view.club.clubHome.ClubChat;
import com.kh.somoim.view.club.clubHome.ClubHi;
import com.kh.somoim.view.club.clubHome.ClubInfo;
import com.kh.somoim.view.club.clubHome.clubBoard.ClubFree;
import com.kh.somoim.view.club.clubHome.clubBoard.ClubPhoto;
import com.kh.somoim.view.club.clubHome.clubBoard.ClubSchedule;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubMainPanel extends JPanel{
	
	ClubTopPanel clubtopPanel;
	ClubCenterPanel clubcenterPanel;
	ClubInfo clubinfoPanel;
	ClubHi clubHi;
	ClubChat clubChat;
	ClubPhoto clubPhoto;
	ClubFree clubFree;
	ClubSchedule clubSchedule;

	public ClubMainPanel(MainFrame mainFrame, ClubVO clubVO) {
		
		System.out.println("clubVO:::::::::" + clubVO);
		
		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		System.out.println("club mainPanel in");
				
		// 상단/중단 패널 생성
		clubtopPanel = new ClubTopPanel(clubVO);
		clubcenterPanel = new ClubCenterPanel();
		clubinfoPanel = new ClubInfo(clubVO);	
		clubHi = new ClubHi();
		clubChat = new ClubChat();
		clubPhoto = new ClubPhoto();
		clubFree = new ClubFree();
		clubSchedule = new ClubSchedule();
		
		// 패널 사이즈 조절
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		clubHi.setPreferredSize(new Dimension(500, 650));
		clubChat.setPreferredSize(new Dimension(500, 650));
		clubPhoto.setPreferredSize(new Dimension(500, 650));
		clubFree.setPreferredSize(new Dimension(500, 650));
		clubSchedule.setPreferredSize(new Dimension(500, 650));
						
		// 상단,중앙 프레임에 추가
		this.add(clubtopPanel, BorderLayout.NORTH);		// 상단 패널
		this.add(clubcenterPanel, BorderLayout.CENTER);	// 중앙 패널
		this.add(clubinfoPanel, BorderLayout.SOUTH);    // 정보 패널
		//this.add(clubHi, BorderLayout.SOUTH);			// 가입인사 패널
		//this.add(clubChat, BorderLayout.SOUTH);		// 채팅 패널 
		//this.add(clubPhoto, BorderLayout.SOUTH);		// 정모 후기 패널 
		//this.add(clubFree, BorderLayout.SOUTH);
		//this.add(clubSchedule, BorderLayout.SOUTH);
		
		
		
		
	}

}
