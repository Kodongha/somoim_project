
package com.kh.somoim.view.club.clubMain;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.view.club.clubHome.ClubInfo;

public class ClubCenterPanel extends JPanel{

	private JLabel IconLabel;
	JLabel clubHiLabel;
	JLabel clubBoardLabel;
	JLabel clubChatLabel;

	public ClubCenterPanel() {

		System.out.println("club centerpanel in");

		this.setLayout(null);
		this.setBackground(Color.white);

		//clubtopPanel 밑에 카테고리패널 생성
		JPanel categoryPanel = new JPanel();
		categoryPanel.setLayout(null);
		categoryPanel.setBackground(Color.white);
		categoryPanel.setSize(500, 50);
		categoryPanel.setLocation(0, 0);

		//category패널안에 넣을 라벨들 
		JLabel clubInfoLabel = new JLabel("정보");
		//        clubInfoLabel.setFont(new Font("돋움",Font.BOLD, 14));
		clubInfoLabel.setBounds(70, 0, 50, 50);

		Image categoryIcon = new ImageIcon("images/categoryLine.PNG").getImage().getScaledInstance(50, 20, 0);
		IconLabel = new JLabel(new ImageIcon(categoryIcon));
		IconLabel.setBounds(60, 15, 50, 50);


		clubHiLabel = new JLabel("가입인사");
		clubHiLabel.setBounds(160, 0, 100, 50); 

		clubBoardLabel = new JLabel("게시판");
		clubBoardLabel.setBounds(280, 0, 100, 50); 

		clubChatLabel = new JLabel("채팅");
		clubChatLabel.setBounds(400, 0, 100, 50); 

		categoryPanel.add(clubInfoLabel, "info");
		categoryPanel.add(clubHiLabel, "hi");
		categoryPanel.add(clubBoardLabel, "board");
		categoryPanel.add(clubChatLabel, "chat");
		categoryPanel.add(IconLabel);

		this.add(categoryPanel);
		
	} 
	
	
}