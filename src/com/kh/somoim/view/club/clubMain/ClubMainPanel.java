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
		
		// ���/�ߴ� �г� ����
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel(mainFrame, this);
		clubinfoPanel = new ClubInfo();	
		clubHiPanel = new ClubHi();
		
		// �г� ������ ����
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		
		// ���,�߾� �����ӿ� �߰�
		this.add(clubtopPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(clubcenterPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(clubinfoPanel, BorderLayout.SOUTH);    // ���� �г�
	
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
