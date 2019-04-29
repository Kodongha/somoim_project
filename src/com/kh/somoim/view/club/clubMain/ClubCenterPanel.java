
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

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubHome.ClubHi;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubCenterPanel extends JPanel{

	private JLabel IconLabel;
	JLabel clubHiLabel;
	JLabel clubBoardLabel;
	JLabel clubChatLabel;

	public ClubCenterPanel(MainFrame mainFrame, ClubMainPanel clubmainPanel) {

		System.out.println("club centerpanel in");

		this.setLayout(null);
		this.setBackground(Color.white);

		//clubtopPanel �ؿ� ī�װ��г� ����
		JPanel categoryPanel = new JPanel();
		categoryPanel.setLayout(null);
		categoryPanel.setBackground(Color.white);
		categoryPanel.setSize(500, 50);
		categoryPanel.setLocation(0, 0);

		//category�гξȿ� ���� �󺧵� 
		JLabel clubInfoLabel = new JLabel("����");
		//        clubInfoLabel.setFont(new Font("����",Font.BOLD, 14));
		clubInfoLabel.setBounds(70, 0, 50, 50);

		Image categoryIcon = new ImageIcon("images/categoryLine.PNG").getImage().getScaledInstance(50, 20, 0);
		IconLabel = new JLabel(new ImageIcon(categoryIcon));
		IconLabel.setBounds(60, 15, 50, 50);


		clubHiLabel = new JLabel("�����λ�");
		clubHiLabel.setBounds(160, 0, 100, 50); 

		clubBoardLabel = new JLabel("�Խ���");
		clubBoardLabel.setBounds(280, 0, 100, 50); 

		clubChatLabel = new JLabel("ä��");
		clubChatLabel.setBounds(400, 0, 100, 50); 

		categoryPanel.add(clubInfoLabel);
		categoryPanel.add(clubHiLabel);
		categoryPanel.add(clubBoardLabel);
		categoryPanel.add(clubChatLabel);
		categoryPanel.add(IconLabel);

		this.add(categoryPanel);

		clubHiLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(e.getSource() == clubHiLabel) {
					
					ClubHi clubHi = new ClubHi();
					clubHi.setPreferredSize(new Dimension(500, 650));

					ChangPanelUtil.CHANGE_PANEL(mainFrame, clubmainPanel, clubmainPanel.getClubinfoPanel(), clubHi, BorderLayout.SOUTH);

				}
			}

		});
	}

}