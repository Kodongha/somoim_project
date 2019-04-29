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
				
		// ���/�ߴ� �г� ����
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel();
		clubinfoPanel = new ClubInfo();	
		clubHi = new ClubHi();
		
		// �г� ������ ����
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		clubHi.setPreferredSize(new Dimension(500, 650));
						
		// ���,�߾� �����ӿ� �߰�
		this.add(clubtopPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(clubcenterPanel, BorderLayout.CENTER);	// �߾� �г�
		//this.add(clubinfoPanel, BorderLayout.SOUTH);    // ���� �г�
		this.add(clubHi, BorderLayout.SOUTH);			// �����λ� �г�
		
		
		
	}

}
