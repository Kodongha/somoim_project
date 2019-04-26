package com.kh.somoim.view.home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.kh.somoim.home.controller.HomeController;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class HomePanel extends JPanel {


	public HomePanel(MemberVO memberVO) {
		// TODO Auto-generated constructor stub

		HomeController homeController = new HomeController();
		ArrayList<ClubVO> myClubList = homeController.getMyClubList(memberVO);

		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());

		JPanel myClubListPanel = new JPanel();
		myClubListPanel.setLayout(null);
		myClubListPanel.setPreferredSize(new Dimension(500,90));

		JLabel clubDetailLabel = new JLabel();
		clubDetailLabel.setBounds(-1,0,500,100);
		clubDetailLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		// 소모임 타이틀 이미지
		Image originTitleImage = new ImageIcon(myClubList.get(0).getTitleImagePath()).getImage().getScaledInstance(50, 50, 0);
		Image resizeTitleImage = originTitleImage.getScaledInstance(90, 90, Image.SCALE_SMOOTH);

		JLabel titleImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
		titleImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		titleImageLabel.setBounds(15,5,90,90);

		// 카테고리 이미지
		JLabel categoryImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
		categoryImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		categoryImageLabel.setBounds(120,10,20,20);

		// 소모임 이름
		JLabel clubNameLabel = new JLabel();
		clubNameLabel.setText(myClubList.get(0).getName());
		clubNameLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		clubNameLabel.setBounds(120,35,250,30);
		clubNameLabel.setFont(clubNameLabel.getFont().deriveFont(18.0f));

		// 소모임 정모 정보
		JLabel clubMeetingDayLabel = new JLabel();
		clubMeetingDayLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		clubMeetingDayLabel.setBounds(120,70,100,20);
		
		Date meetingDay = myClubList.get(0).getMeetingDay();
		Date nowDate = new Date();
		
		String meetingString = "다음 정모 : ";
		if(meetingDay.getTime() > nowDate.getTime()) {
			long diffDate = meetingDay.getTime() - nowDate.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("dd");
			String date = sdf.format(diffDate);
			System.out.println("date:::::::::::"+date);
			
			switch (date) {
			case "00":
				
				break;
				
			default:
				break;
			}
			if(date.equals("01")){
				System.out.println("내일");
			}
			
		} else {
			
		}
		clubMeetingDayLabel.setText("다음 정모 : ");
		
		
		clubDetailLabel.add(titleImageLabel);
		clubDetailLabel.add(categoryImageLabel);
		clubDetailLabel.add(clubNameLabel);
		clubDetailLabel.add(clubMeetingDayLabel);


		myClubListPanel.add(clubDetailLabel);

		myClubListPanel.setBackground(Color.WHITE);
		JScrollPane clubDetailListScroll = new JScrollPane(myClubListPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		this.add(clubDetailListScroll);

	}


}
