package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;
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
	ClubHi clubHi;

	public ClubMainPanel(MainFrame mainFrame, ClubVO clubVO) {
		
		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		System.out.println("club mainPanel in");
				
		// 상단/중단 패널 생성
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel();
		clubinfoPanel = new ClubInfo();	
		clubHi = new ClubHi();
		
		// 패널 사이즈 조절
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		clubHi.setPreferredSize(new Dimension(500, 650));
						
		// 상단,중앙 프레임에 추가
		this.add(clubtopPanel, BorderLayout.NORTH);		// 상단 패널
		this.add(clubcenterPanel, BorderLayout.CENTER);	// 중앙 패널
		//this.add(clubinfoPanel, BorderLayout.SOUTH);    // 정보 패널
		this.add(clubHi, BorderLayout.SOUTH);			// 가입인사 패널
		
		
		
	}

}
