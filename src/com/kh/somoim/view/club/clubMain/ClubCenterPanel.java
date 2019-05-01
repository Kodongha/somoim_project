package com.kh.somoim.view.club.clubMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubHome.ClubChat;
import com.kh.somoim.view.club.clubHome.ClubHi;
import com.kh.somoim.view.club.clubHome.ClubWrite;
import com.kh.somoim.view.club.clubHome.clubBoard.ClubFree;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubCenterPanel extends JPanel{

	private JLabel IconLabel;
	JLabel clubHiLabel;
	JLabel clubBoardLabel;
	JLabel clubChatLabel;
	JLabel clubInfoLabel;
	JLabel clubWriteLabel;

	JPanel clubHiPanel;
	JPanel clubBoardPanel;
	JPanel clubChatPanel;
	JPanel clubInfoPanel;
	JPanel clubFreePanel;
	JPanel clubWritePanel;


	public ClubCenterPanel(MainFrame mainFrame, ClubMainPanel clubmainPanel, ClubVO clubVO, MemberVO memberVO) {

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
		clubInfoLabel = new JLabel("정보");
		//        clubInfoLabel.setFont(new Font("돋움",Font.BOLD, 14));
		clubInfoLabel.setBounds(40, 0, 50, 50);

		Image categoryIcon = new ImageIcon("images/categoryLine.PNG").getImage().getScaledInstance(50, 20, 0);
		IconLabel = new JLabel(new ImageIcon(categoryIcon));
		IconLabel.setBounds(30, 15, 50, 50);


		clubHiLabel = new JLabel("가입인사");
		clubHiLabel.setBounds(130, 0, 100, 50); 

		clubBoardLabel = new JLabel("게시판");
		clubBoardLabel.setBounds(235, 0, 100, 50); 

		clubChatLabel = new JLabel("채팅");
		clubChatLabel.setBounds(340, 0, 100, 50); 
		
		clubWriteLabel = new JLabel("글쓰기 ");
		clubWriteLabel.setBounds(425, 0, 100, 50);

		categoryPanel.add(clubInfoLabel);
		categoryPanel.add(clubHiLabel);
		categoryPanel.add(clubBoardLabel);
		categoryPanel.add(clubChatLabel);
		categoryPanel.add(clubWriteLabel);
		categoryPanel.add(IconLabel);

		this.add(categoryPanel);


		clubHiPanel = new ClubHi(clubVO, memberVO);
		clubHiPanel.setPreferredSize(new Dimension(500, 650));

		clubChatPanel = new ClubChat(clubVO, memberVO);
		clubChatPanel.setPreferredSize(new Dimension(100, 650));
		
		clubFreePanel = new ClubFree(clubmainPanel);
		clubFreePanel.setPreferredSize(new Dimension(500, 650));
		
		clubWritePanel = new ClubWrite(clubVO, memberVO);
		clubWritePanel.setPreferredSize(new Dimension(500, 650));
		
		
		
		// 마우스 클릭 이벤트(화면 전환)
		clubInfoLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubInfoLabel) {

					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubHiPanel, clubmainPanel.clubinfoPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(30, 15, 50, 50);

				}
				
				if(e.getSource() == clubInfoLabel) {

					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubFreePanel, clubmainPanel.clubinfoPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(30, 15, 50, 50);
					

				}
				
				if(e.getSource() == clubInfoLabel) {

					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubChatPanel, clubmainPanel.clubinfoPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(30, 15, 50, 50);
					

				}
				if(e.getSource() == clubInfoLabel) {

					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubWritePanel, clubmainPanel.clubinfoPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(30, 15, 50, 50);
					

				}
			}
		});


		clubHiLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubHiLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubmainPanel.clubinfoPanel, clubHiPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(130, 15, 50, 50);
				}
				if(e.getSource() == clubHiLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubFreePanel, clubHiPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(130, 15, 50, 50);

				}	
				if(e.getSource() == clubHiLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubChatPanel, clubHiPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(130, 15, 50, 50);

				}
				if(e.getSource() == clubHiLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubWritePanel, clubHiPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(130, 15, 50, 50);

				}	
			}

		});	
		
		clubBoardLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubBoardLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubmainPanel.clubinfoPanel, clubFreePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(230, 15, 50, 50);

				}
				if(e.getSource() == clubBoardLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubHiPanel, clubFreePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(230, 15, 50, 50);

				}	
				if(e.getSource() == clubBoardLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubChatPanel, clubFreePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(230, 15, 50, 50);

				}	
				if(e.getSource() == clubBoardLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubWritePanel, clubFreePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(230, 15, 50, 50);

				}	
			}
		});

		clubChatLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubChatLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubmainPanel.clubinfoPanel, clubChatPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(330, 15, 50, 50);

				}
				if(e.getSource() == clubChatLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubHiPanel, clubChatPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(330, 15, 50, 50);

				}	
				if(e.getSource() == clubChatLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubFreePanel, clubChatPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(330, 15, 50, 50);

				}
				if(e.getSource() == clubChatLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubWritePanel, clubChatPanel, BorderLayout.SOUTH);
					IconLabel.setBounds(330, 15, 50, 50);

				}	
			}
		});
		
		clubWriteLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubWriteLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubmainPanel.clubinfoPanel, clubWritePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(420, 15, 50, 50);

				}
				if(e.getSource() == clubWriteLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubHiPanel, clubWritePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(420, 15, 50, 50);

				}	
				if(e.getSource() == clubWriteLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubFreePanel, clubWritePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(420, 15, 50, 50);

				}	
				if(e.getSource() == clubWriteLabel) { 


					ChangPanelUtil.CHANGE_PANEL(clubmainPanel, clubChatPanel, clubWritePanel, BorderLayout.SOUTH);
					IconLabel.setBounds(420, 15, 50, 50);

				}
			}
		});

		
	}
}