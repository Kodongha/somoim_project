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
		
		
		// ���/�ߴ� �г� ����
		clubtopPanel = new ClubTopPanel();
		clubcenterPanel = new ClubCenterPanel();

		// ���,�߾� �����ӿ� �߰�
		this.add(clubtopPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(clubcenterPanel, BorderLayout.CENTER);	// �߾� �г�
		
	}

}
