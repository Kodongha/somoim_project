package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.club.model.vo.BoardResponseVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;

public class ClubFree extends JPanel {

	private final String CATEGORY = "자유게시판";

	JLabel[] freeLabel = null;;
	JLabel freephotoLabel;
	JLabel freetitleLabel;
	JLabel freecontentLabel;
	JLabel freewriterLabel;
	JLabel freetimeLabel;
	JLabel freeimageLabel;

	JPanel listPanel;
	JPanel clubPhotoPanel;
	JPanel clubSchedulePanel;
	JPanel clubFreePanel;
	String nowPanel = "clubFreePanel";
	JScrollPane thisPanelScroll;
	private JPanel thisPanel;

	public ClubFree(ClubMainPanel clubmainPanel, ClubVO clubVO, MemberVO memberVO) {
		
		ClubController clubController = new ClubController();
		ArrayList<BoardResponseVO> boardResponseVOList = clubController.getFirstGreeting(clubVO, memberVO, CATEGORY);

		ClubController clubInfoController = new ClubController();
		ArrayList<MemberVO> clubMemberList = clubInfoController.getClubMemberList(clubVO);

		System.out.println("boardResponseVOList!!!!!" + boardResponseVOList);
		System.out.println("boardResponseVOList.size()!!!!" + boardResponseVOList.size());

		
		this.thisPanel = this;
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);

		// 게시판 선택 패널
		listPanel = new JPanel();
		listPanel.setLocation(0,0);
		listPanel.setPreferredSize(new Dimension(500, 40));
		listPanel.setBackground(Color.white);
		listPanel.setLayout(null);
		this.add(listPanel, BorderLayout.NORTH);

		// 게시판 선택 
		String[] boardList = {"자유게시판", "정모 후기", "정모 일정"};

		JComboBox boardListBox = new JComboBox(boardList);
		boardListBox.setBounds(0, 0, 495, 40);
		boardListBox.setBackground(Color.white);

		listPanel.add(boardListBox);

		clubFreePanel = new JPanel();
		clubFreePanel.setLayout(null);
		clubFreePanel.setPreferredSize(new Dimension(500, boardResponseVOList.size() * 80));
		clubFreePanel.setBackground(Color.WHITE);
		this.add(clubFreePanel, BorderLayout.CENTER);

		int x = -1;
		int y = 0;
		
		freeLabel = new JLabel[boardResponseVOList.size()];	
		
		String photoPath = "";
		
		for(int i = 0; i < boardResponseVOList.size(); i++) {
			freeLabel[i] = new JLabel();
			freeLabel[i].setBounds(x, y, 500, 120);
			freeLabel[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			
			for(MemberVO vo : clubMemberList) {
				if(vo.getName().equals(boardResponseVOList.get(i).getWriter())) {
					photoPath = vo.getProfilePhotoPath();
				}
			}
			Image freeImage = new ImageIcon(photoPath).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			freephotoLabel = new JLabel(new ImageIcon(freeImage));
			freephotoLabel.setBounds(10, 5, 50, 50);

			LineBorder freeiconBorder = new LineBorder(Color.black);
			freephotoLabel.setBorder(freeiconBorder);		
			
			freewriterLabel = new JLabel();
			freewriterLabel.setText(boardResponseVOList.get(i).getWriter());
			freewriterLabel.setBounds(70, 15, 50, 20);
			freewriterLabel.setFont(freewriterLabel.getFont().deriveFont(14.0f));
			
			freetimeLabel = new JLabel();		
			
			SimpleDateFormat tFormat = new SimpleDateFormat("hh:mm:ss");
			String date = tFormat.format(boardResponseVOList.get(i).getWriteDay());	
			
			freetimeLabel.setText(date);
			freetimeLabel.setBounds(70, 35, 100, 20);
			freetimeLabel.setForeground(Color.LIGHT_GRAY);
			
			freetitleLabel = new JLabel();
			freetitleLabel.setText(boardResponseVOList.get(i).getTitle());
			freetitleLabel.setBounds(10, 70, 300, 18);
			freetitleLabel.setFont(freetitleLabel.getFont().deriveFont(18.0f));

			freecontentLabel = new JLabel();
			freecontentLabel.setText(boardResponseVOList.get(i).getContent());
			freecontentLabel.setBounds(10, 100, 400, 15);
			freecontentLabel.setFont(freecontentLabel.getFont().deriveFont(14.0f));
			freecontentLabel.setForeground(Color.LIGHT_GRAY);
			
			Image freePhoto = new ImageIcon(boardResponseVOList.get(i).getImagePath()).getImage().getScaledInstance(115, 80, Image.SCALE_SMOOTH);
			freeimageLabel = new JLabel(new ImageIcon(freePhoto));
			freeimageLabel.setBounds(350, 10, 115, 80);			
			
			freeLabel[i].add(freephotoLabel);
			freeLabel[i].add(freetitleLabel);
			freeLabel[i].add(freewriterLabel);
			freeLabel[i].add(freetimeLabel);
			freeLabel[i].add(freecontentLabel);
			freeLabel[i].add(freeimageLabel);

			clubFreePanel.add(freeLabel[i]);	

			y += 120;
		}		

		thisPanelScroll = new JScrollPane(clubFreePanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		thisPanelScroll.getVerticalScrollBar().setUnitIncrement(16);
		thisPanelScroll.setLocation(0, 0);
		thisPanelScroll.setSize(495, 650);
		
		this.add(thisPanelScroll);
		
		boardListBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox bb = (JComboBox) e.getSource();
				String boardName = (String) bb.getSelectedItem();
				System.out.println("inininininininininininininin");
				if(boardName.equals("정모 후기")) {
					
					if(nowPanel.equals("clubFreePanel")) {
						clubPhotoPanel = new ClubPhoto();
						clubPhotoPanel.setPreferredSize(new Dimension(500, 600));
						System.out.println("clubFreePanel");
						ChangPanelUtil.CHANGE_PANEL2(thisPanel, thisPanelScroll, clubPhotoPanel);
					} else {
						clubSchedulePanel = new ClubSchedule();
						clubSchedulePanel.setPreferredSize(new Dimension(500, 600));
						ChangPanelUtil.CHANGE_PANEL2(thisPanel, thisPanelScroll, clubSchedulePanel);
//						ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubSchedulePanel, clubPhotoPanel, BorderLayout.CENTER);
					}
					nowPanel = "clubPhotoPanel";
					
					
				}else if(boardName.equals("정모 일정")) {
					
					if(nowPanel.equals("clubPhotoPanel")) {
						ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubPhotoPanel, clubSchedulePanel, BorderLayout.CENTER);
					} else {
						ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubFreePanel, clubSchedulePanel, BorderLayout.CENTER);
					}

				}else if(boardName.equals("자유게시판")) {

					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubSchedulePanel, clubFreePanel, BorderLayout.CENTER);
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubPhotoPanel, clubFreePanel, BorderLayout.CENTER);

				}			
			}

		});

	}
}
