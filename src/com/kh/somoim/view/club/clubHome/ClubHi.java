package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

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

	private final String CATEGORY = "가입 인사";
	
	JLabel noticeLabel;	
	LineBorder noticeBorder;
	JLabel noticeiconLabel;
	JLabel noticetitleLabel;

	JLabel[] hiLabel = null;
	JLabel hititleLabel;
	JLabel hicontentsLabel;
	JLabel hiiconLabel;
	JLabel hitimeLabel;
	


	public ClubHi(ClubVO clubVO, MemberVO memberVO) {

		ClubController clubController = new ClubController();
		ArrayList<BoardResponseVO> boardResponseVOList = clubController.getFirstGreeting(clubVO, memberVO, CATEGORY);

		System.out.println("boardResponseVOList!!!!!" + boardResponseVOList);
		System.out.println("boardResponseVOList.size()!!!!" + boardResponseVOList.size());

		this.setLayout(null);
		this.setBackground(Color.white);

		JPanel hiListPanel = new JPanel();
		hiListPanel.setLayout(null);
		hiListPanel.setPreferredSize(new Dimension(500, boardResponseVOList.size() * 80));

		this.add(hiListPanel);	

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
						
			hitimeLabel = new JLabel();	
			
			SimpleDateFormat yearFormat = new SimpleDateFormat("hh:mm:ss");
			String date = yearFormat.format(boardResponseVOList.get(i).getWriteDay());
						
			hitimeLabel.setText(date);
			hitimeLabel.setBounds(430, 10, 100, 20);
			hitimeLabel.setFont(hicontentsLabel.getFont().deriveFont(15.0f));			
			
			hiLabel[i].add(hiiconLabel);
			hiLabel[i].add(hititleLabel);
			hiLabel[i].add(hicontentsLabel);
			hiLabel[i].add(hitimeLabel);
			
			hiListPanel.add(hiLabel[i]);

			y += 80;	
					
		}

		hiListPanel.setBackground(Color.white);
		hiListPanel.revalidate();
		hiListPanel.repaint();
		
		JScrollPane thisPanelScroll = new JScrollPane(hiListPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		thisPanelScroll.getVerticalScrollBar().setUnitIncrement(16);
		thisPanelScroll.setLocation(0, 0);
		thisPanelScroll.setSize(495, 650);

		this.add(thisPanelScroll);
	}
}
