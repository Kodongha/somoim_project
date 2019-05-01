package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
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

	ClubHi clubHiPanel;
	ClubChat clubChatPanel;
	ClubFree clubFreePanel;
	ClubPhoto clubPhotoPanel;
	ClubSchedule clubSchedulePanel;


	public ClubMainPanel(MainFrame mainFrame, ClubVO clubVO, MemberVO memberVO) {

		System.out.println("clubVO:::::::::" + clubVO);

		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		this.setBackground(Color.yellow);
		System.out.println("club mainPanel in");

		// 상단/중단 패널 생성
		clubtopPanel = new ClubTopPanel(mainFrame, this, clubVO, memberVO);
		clubcenterPanel = new ClubCenterPanel(mainFrame, this, clubVO, memberVO);
		clubinfoPanel = new ClubInfo(clubVO);	
		clubHiPanel = new ClubHi();

		clubChatPanel = new ClubChat(clubVO, memberVO);
		clubFreePanel = new ClubFree(this);


		// 패널 사이즈 조절
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		clubFreePanel.setPreferredSize(new Dimension(500, 650));

		// 상단,중앙 프레임에 추가
		this.add(clubtopPanel, BorderLayout.NORTH);		// 상단 패널
		this.add(clubcenterPanel, BorderLayout.CENTER);	// 중앙 패널
		this.add(clubinfoPanel, BorderLayout.SOUTH);    // 정보 패널

	}

	public ClubTopPanel getClubtopPanel() {
		return clubtopPanel;
	}

	public void setClubtopPanel(ClubTopPanel clubtopPanel) {
		this.clubtopPanel = clubtopPanel;
	}

	public ClubCenterPanel getClubcenterPanel() {
		return clubcenterPanel;

	}

	public void setClubcenterPanel(ClubCenterPanel clubcenterPanel) {
		this.clubcenterPanel = clubcenterPanel;
	}

	public ClubInfo getClubinfoPanel() {
		return clubinfoPanel;
	}

	public void setClubinfoPanel(ClubInfo clubinfoPanel) {
		this.clubinfoPanel = clubinfoPanel;
	}

	public ClubHi getClubHiPanel() {
		return clubHiPanel;
	}

	public void setClubHiPanel(ClubHi clubHiPanel) {
		this.clubHiPanel = clubHiPanel;
	}

	public ClubChat getClubChatPanel() {
		return clubChatPanel;
	}

	public void setClubChatPanel(ClubChat clubChatPanel) {
		this.clubChatPanel = clubChatPanel;
	}

	public ClubFree getClubFreePanel() {
		return clubFreePanel;
	}

	public void setClubFreePanel(ClubFree clubFreePanel) {
		this.clubFreePanel = clubFreePanel;
	}

	public ClubPhoto getClubPhotoPanel() {
		return clubPhotoPanel;
	}

	public void setClubPhotoPanel(ClubPhoto clubPhotoPanel) {
		this.clubPhotoPanel = clubPhotoPanel;
	}

	public ClubSchedule getClubSchedulePanel() {
		return clubSchedulePanel;
	}

	public void setClubSchedulePanel(ClubSchedule clubSchedulePanel) {
		this.clubSchedulePanel = clubSchedulePanel;
	}
	

}
