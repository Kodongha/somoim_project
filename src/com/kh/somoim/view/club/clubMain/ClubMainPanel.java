package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.view.club.clubHome.ClubHi;
import com.kh.somoim.view.club.clubHome.ClubInfo;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubMainPanel extends JPanel{
	
	ClubTopPanel clubtopPanel;
	ClubCenterPanel clubcenterPanel;
	ClubInfo clubinfoPanel;
	ClubHi clubHiPanel;

	public ClubMainPanel(MainFrame mainFrame, ClubVO clubVO) {
		
		System.out.println("clubVO:::::::::" + clubVO);
		
		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		this.setBackground(Color.yellow);
		System.out.println("club mainPanel in");
		
		// 상단/중단 패널 생성
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel(mainFrame, this);
		clubinfoPanel = new ClubInfo();	
		clubHiPanel = new ClubHi();
		
		// 패널 사이즈 조절
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		
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
	
	

}
