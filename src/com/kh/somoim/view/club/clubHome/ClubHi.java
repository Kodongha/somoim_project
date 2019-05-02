package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.club.model.vo.BoardResponseVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class ClubHi extends JPanel{

	JLabel noticeLabel;	
	LineBorder noticeBorder;
	JLabel noticeiconLabel;
	JLabel noticetitleLabel;

	JLabel[] hiLabel = null;
	JLabel hititleLabel;
	JLabel hicontentsLabel;
	JLabel hiiconLabel;


	public ClubHi(ClubVO clubVO, MemberVO memberVO) {

		ClubController clubController = new ClubController();
		ArrayList<BoardResponseVO> boardResponseVOList = clubController.getFirstGreeting(clubVO, memberVO);

		System.out.println("boardResponseVOList!!!!!" + boardResponseVOList);
		System.out.println("boardResponseVOList.size()!!!!" + boardResponseVOList.size());

		this.setLayout(null);
		this.setBackground(Color.white);

		JPanel hiListPanel = new JPanel();
		hiListPanel.setLayout(null);
		hiListPanel.setPreferredSize(new Dimension(500, boardResponseVOList.size() * 80));

		this.add(hiListPanel);	

		/*// 공지사항 라벨
		noticeLabel = new JLabel();
		noticeLabel.setSize(500, 80);
		noticeLabel.setLocation(0, 0);
		noticeLabel.setOpaque(true);
		noticeLabel.setBackground(Color.white);

		// 공지사항 로고
		Image noticeIcon = new ImageIcon("images/noticeicon.PNG").getImage().getScaledInstance(50, 50, 0);
		JLabel iconLabel = new JLabel(new ImageIcon(noticeIcon));
		iconLabel.setBounds(5, 20, 40, 40);
		noticeLabel.add(iconLabel);

		// 공지사항 제목 라벨
		noticetitleLabel = new JLabel("ㅎㅇㅎㅇ");
		noticetitleLabel.setFont(noticetitleLabel.getFont().deriveFont(20.0f));
		noticetitleLabel.setSize(400, 50);
		noticetitleLabel.setLocation(50, 15);
		noticetitleLabel.setOpaque(true);
		noticetitleLabel.setBackground(Color.white);

		noticeLabel.add(noticetitleLabel);	

		this.add(noticeLabel);*/

		int x = -1;
		int y = 0;
		hiLabel = new JLabel[boardResponseVOList.size()];


		for(int i = 0; i < boardResponseVOList.size(); i++) {
			hiLabel[i] = new JLabel();
			hiLabel[i].setBounds(x, y, 500, 80);
			hiLabel[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

			Image hiIcon = new ImageIcon(boardResponseVOList.get(i).getImagePath()).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			hiiconLabel = new JLabel(new ImageIcon(hiIcon));
			hiiconLabel.setBounds(0, 0, 80, 80);

			LineBorder hiiconBorder = new LineBorder(Color.black);
			hiiconLabel.setBorder(hiiconBorder);

			hititleLabel = new JLabel();
			
			hititleLabel.setText(boardResponseVOList.get(i).getWriter());
			hititleLabel.setBounds(90, 10, 100, 20);
			hititleLabel.setFont(hititleLabel.getFont().deriveFont(18.0f));

			hicontentsLabel = new JLabel();
			hicontentsLabel.setText(boardResponseVOList.get(i).getTitle());
			hicontentsLabel.setBounds(93, 45, 200, 15);
			hicontentsLabel.setFont(hicontentsLabel.getFont().deriveFont(15.0f));

			hiLabel[i].add(hiiconLabel);
			hiLabel[i].add(hititleLabel);
			hiLabel[i].add(hicontentsLabel);

			hiListPanel.add(hiLabel[i]);

			y += 80;				

		}

		hiListPanel.setBackground(Color.white);
		JScrollPane thisPanelScroll = new JScrollPane(hiListPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		thisPanelScroll.getVerticalScrollBar().setUnitIncrement(16);
		thisPanelScroll.setLocation(0, 0);
		thisPanelScroll.setSize(495, 500);

		this.add(thisPanelScroll);
	}
}
