package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.kh.somoim.view.main.BottomPanel;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.TopPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubMainPanel extends JPanel{
	
	ClubTopPanel clubtopPanel;
	ClubCenterPanel clubcenterPanel;

	public ClubMainPanel(MainFrame mainFrame) {
		
		mainFrame.setTitle("club");
		this.setLayout(new BorderLayout());
		System.out.println("club mainPanel in");
		
		
		// 상단/중단 패널 생성
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel();

		// 상단,중앙 프레임에 추가
		this.add(clubtopPanel, BorderLayout.NORTH);		// 상단 패널
		this.add(clubcenterPanel, BorderLayout.CENTER);	// 중앙 패널
		
	}

}
