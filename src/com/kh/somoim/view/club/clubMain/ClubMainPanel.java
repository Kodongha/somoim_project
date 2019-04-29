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
				
		// ���/�ߴ� �г� ����
		clubtopPanel = new ClubTopPanel(clubVO);
		clubcenterPanel = new ClubCenterPanel();
		clubinfoPanel = new ClubInfo(clubVO);	
		clubHi = new ClubHi();
		clubChat = new ClubChat();
		clubPhoto = new ClubPhoto();
		clubFree = new ClubFree();
		clubSchedule = new ClubSchedule();
		
		// �г� ������ ����
		clubinfoPanel.setPreferredSize(new Dimension(500, 650));
		clubHi.setPreferredSize(new Dimension(500, 650));
		clubChat.setPreferredSize(new Dimension(500, 650));
		clubPhoto.setPreferredSize(new Dimension(500, 650));
		clubFree.setPreferredSize(new Dimension(500, 650));
		clubSchedule.setPreferredSize(new Dimension(500, 650));
						
		// ���,�߾� �����ӿ� �߰�
		this.add(clubtopPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(clubcenterPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(clubinfoPanel, BorderLayout.SOUTH);    // ���� �г�
		//this.add(clubHi, BorderLayout.SOUTH);			// �����λ� �г�
		//this.add(clubChat, BorderLayout.SOUTH);		// ä�� �г� 
		//this.add(clubPhoto, BorderLayout.SOUTH);		// ���� �ı� �г� 
		//this.add(clubFree, BorderLayout.SOUTH);
		//this.add(clubSchedule, BorderLayout.SOUTH);
		
		
		
		
	}

}
