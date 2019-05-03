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
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubMainPanel extends JPanel{

	ClubTopPanel clubtopPanel;
	ClubCenterPanel clubcenterPanel;
	ClubInfo clubinfoPanel;
	public ClubFree clubFreePanel;

	public ClubMainPanel(MainFrame mainFrame, MainPanel mainPanel, ClubVO clubVO, MemberVO memberVO) {

		System.out.println("clubVO:::::::::" + clubVO);

		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		this.setBackground(Color.yellow);
		System.out.println("club mainPanel in");

		// ���/�ߴ� �г� ����
		clubtopPanel = new ClubTopPanel(mainFrame, this, clubVO, memberVO);
		clubcenterPanel = new ClubCenterPanel(mainFrame, this, clubVO, memberVO);
		clubinfoPanel = new ClubInfo(mainFrame, mainPanel, this, clubVO, memberVO);	

		// �г� ������ ����
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));

		// ���,�߾� �����ӿ� �߰�
		this.add(clubtopPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(clubcenterPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(clubinfoPanel, BorderLayout.SOUTH);    // ���� �г�
		
	}

}
