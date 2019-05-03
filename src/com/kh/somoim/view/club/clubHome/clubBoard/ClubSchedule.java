package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.text.SimpleDateFormat;
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
import com.kh.somoim.view.club.clubMain.ClubMainPanel;

public class ClubSchedule extends JPanel{

	private final String CATEGORY = "정모 일정";

	JPanel clubSchedulePanel;

	JLabel[] scheduleLabel = null;
	JLabel schedulephotoLabel;
	JLabel scheduleWriterLabel;
	JLabel scheduleTimeLabel;
	JLabel scheduleTitleLabel;
	JLabel scheduleContentsLabel;

	public ClubSchedule(ClubMainPanel clubmainPanel, ClubVO clubVO, MemberVO memberVO) {

		System.out.println("Schedule in ::::");

		ClubController clubController = new ClubController();
		ArrayList<BoardResponseVO> boardResponseVOList = clubController.getFirstGreeting(clubVO, memberVO, CATEGORY);

		ClubController clubInfoController = new ClubController();
		ArrayList<MemberVO> clubMemberList = clubInfoController.getClubMemberList(clubVO);

		this.setLayout(null);
		this.setBackground(Color.white);

		clubSchedulePanel = new JPanel();
		clubSchedulePanel.setLayout(null);
		clubSchedulePanel.setPreferredSize(new Dimension(500, boardResponseVOList.size() * 80));
		clubSchedulePanel.setBackground(Color.white);
		
		this.add(clubSchedulePanel, BorderLayout.CENTER);

		int x = -1;
		int y = 0;

		scheduleLabel = new JLabel[boardResponseVOList.size()];

		String photoPath = "";

		for(int i = 0; i < boardResponseVOList.size(); i++) {
			scheduleLabel[i] = new JLabel();
			scheduleLabel[i].setBounds(x, y, 500, 120);
			scheduleLabel[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));

			for(MemberVO vo : clubMemberList) {
				if(vo.getName().equals(boardResponseVOList.get(i).getWriter())) {
					photoPath = vo.getProfilePhotoPath();
				}
			}

			Image scheduleImage = new ImageIcon(photoPath).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			schedulephotoLabel = new JLabel(new ImageIcon(scheduleImage));
			schedulephotoLabel.setBounds(10, 5, 50, 50);

			LineBorder scheduleImageBorder = new LineBorder(Color.BLACK);
			schedulephotoLabel.setBorder(scheduleImageBorder);

			scheduleWriterLabel = new JLabel();
			scheduleWriterLabel.setText(boardResponseVOList.get(i).getWriter());
			scheduleWriterLabel.setBounds(70, 15, 50, 20);
			scheduleWriterLabel.setFont(scheduleWriterLabel.getFont().deriveFont(14.0f));

			scheduleTimeLabel = new JLabel();

			SimpleDateFormat sFormat = new SimpleDateFormat("hh:mm:ss");
			String date = sFormat.format(boardResponseVOList.get(i).getWriteDay());

			scheduleTimeLabel.setText(date);
			scheduleTimeLabel.setBounds(70, 35, 100, 20);
			scheduleTimeLabel.setForeground(Color.LIGHT_GRAY);

			scheduleTitleLabel = new JLabel();
			scheduleTitleLabel.setText(boardResponseVOList.get(i).getTitle());
			scheduleTitleLabel.setBounds(10, 70, 300, 18);
			scheduleTitleLabel.setFont(scheduleTitleLabel.getFont().deriveFont(18.0f));

			scheduleContentsLabel = new JLabel();
			scheduleContentsLabel.setText(boardResponseVOList.get(i).getContent());
			scheduleContentsLabel.setBounds(10, 100, 400, 15);
			scheduleContentsLabel.setFont(scheduleContentsLabel.getFont().deriveFont(14.0f));
			scheduleContentsLabel.setForeground(Color.LIGHT_GRAY);

			scheduleLabel[i].add(schedulephotoLabel);
			scheduleLabel[i].add(scheduleWriterLabel);
			scheduleLabel[i].add(scheduleTimeLabel);
			scheduleLabel[i].add(scheduleTitleLabel);
			scheduleLabel[i].add(scheduleContentsLabel);
			
			clubSchedulePanel.add(scheduleLabel[i]);

			y += 120;

		}

		JScrollPane schedulePanelScroll = new JScrollPane(clubSchedulePanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		schedulePanelScroll.getVerticalScrollBar().setUnitIncrement(16);
		schedulePanelScroll.setLocation(0, 0);
		schedulePanelScroll.setSize(495, 650);

		this.add(schedulePanelScroll);	

	}

}
