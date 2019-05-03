package com.kh.somoim.view.home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.util.event.HoemPanelKeyEventUtil;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class HomePanel extends JPanel {

	private JLabel[] clubDetailLabel = null;
	private JPanel thisPanel;
	
	public HomePanel(MainFrame mainFrame, MainPanel mainpanel, CenterPanel centerPanel, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		this.thisPanel = this;
		
		HomeController homeController = new HomeController();
		ArrayList<ClubVO> myClubList = homeController.getMyClubList(memberVO);

		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		JPanel myClubListPanel = new JPanel();
		myClubListPanel.setLayout(null);
		
		
		myClubListPanel.setPreferredSize(new Dimension(500,100 * myClubList.size()));

		int x = -1;
		int y = 0;
		clubDetailLabel = new JLabel[myClubList.size()];

		for(int i=0; i<myClubList.size(); i++) {
			clubDetailLabel[i] = new JLabel();
			clubDetailLabel[i].setBounds(x, y, 500, 100);
			clubDetailLabel[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

			/* �Ҹ��� Ÿ��Ʋ �̹��� */
			Image originTitleImage = new ImageIcon(myClubList.get(i).getTitleImagePath()).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			Image resizeTitleImage = originTitleImage.getScaledInstance(90, 90, Image.SCALE_SMOOTH);

			JLabel titleImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
			titleImageLabel.setBounds(15,5,90,90);

			/* ī�װ� �̹��� */
			JLabel categoryImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
			categoryImageLabel.setBounds(120,10,20,20);

			/* �Ҹ��� �̸� */
			JLabel clubNameLabel = new JLabel();
			clubNameLabel.setText(myClubList.get(i).getName());
			clubNameLabel.setBounds(120,35,250,30);
			clubNameLabel.setFont(clubNameLabel.getFont().deriveFont(18.0f));

			/* �Ҹ��� ���� ���� */
			JLabel clubMeetingDayLabel = new JLabel();
			clubMeetingDayLabel.setBounds(120,70,150,20);

			Date meetingDay = myClubList.get(i).getMeetingDay();
			Calendar nowDay = Calendar.getInstance();

			/* ���� 00:00:00 ���� �����ϱ� ���� Year Month Date ���� */
			int year = nowDay.get(Calendar.YEAR);
			int month = nowDay.get(Calendar.MONTH);
			int date = nowDay.get(Calendar.DATE);
			Date nowDate = new Date(new GregorianCalendar(year, month, date).getTimeInMillis());

			/* ���� ��¥�� �̷��� ��� �� �߰� ���� */
			if(meetingDay.getTime() >= nowDate.getTime()) {
				String meetingString = "���� ���� : ";
				long diffDate = meetingDay.getTime() - nowDate.getTime();
				int day = (int) (diffDate / 1000 / 60 / 60 / 24);

				/* ����, ����, �𷹸� ������ ��¥�� ��¥�� ǥ��  */
				switch (day) {
				case 0:
					meetingString += "����";
					break;
				case 1:
					meetingString += "����";
					break;
				case 2:
					meetingString += "��";
					break;
				default:
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String meetingday = sdf.format(meetingDay.getTime());
					meetingString += meetingday;
					break;
				}
				clubMeetingDayLabel.setText(meetingString);
				clubDetailLabel[i].add(clubMeetingDayLabel);
			}

			/* �Ҹ��� �ο� �� */
			JLabel clubMemberCountLabel = new JLabel();
			clubMemberCountLabel.setText(myClubList.get(i).getMembersNumber().size() + "��");
			clubMemberCountLabel.setBounds(420,25,50,50);
			clubMemberCountLabel.setFont(clubMemberCountLabel.getFont().deriveFont(15.0f));

			clubDetailLabel[i].add(titleImageLabel);
			clubDetailLabel[i].add(categoryImageLabel);
			clubDetailLabel[i].add(clubNameLabel);
			clubDetailLabel[i].add(clubMemberCountLabel);

			myClubListPanel.add(clubDetailLabel[i]);

			/* ���� ��ǥ ��ġ���� */
			y += 100;
		}

		myClubListPanel.setBackground(Color.WHITE);
		JScrollPane clubDetailListScroll = new JScrollPane(myClubListPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		clubDetailListScroll.getVerticalScrollBar().setUnitIncrement(16);	// ��ũ�� �ӵ� ����
		clubDetailListScroll.setLocation(0,0);
		clubDetailListScroll.setSize(495,600);
		
		this.add(clubDetailListScroll);
		
//		Image createClubImage = new ImageIcon("images/createClubButton.png").getImage().getScaledInstance(495, 80, Image.SCALE_SMOOTH);
//		JLabel createClubLabel = new JLabel(new ImageIcon(createClubImage));
		JLabel createClubLabel = new JLabel("�Ҹ��� �����");
		createClubLabel.setHorizontalAlignment(JLabel.CENTER);
		createClubLabel.setBackground(Color.gray);
		createClubLabel.setOpaque(true);
		
		createClubLabel.setBounds(0,600,494,58);
		this.add(createClubLabel);
		
		/* �� �̺�Ʈ */
		for(int i=0; i<clubDetailLabel.length; i++) {
			clubDetailLabel[i].addMouseListener(new HoemPanelKeyEventUtil(mainFrame, mainpanel, clubDetailLabel, i, myClubList.get(i), memberVO));
		}
		
		createClubLabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				createClubLabel.setBackground(new Color(242,203,97));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				createClubLabel.setBackground(Color.gray);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				createClubLabel.setBackground(new Color(242,150,97));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
				createClubLabel.setBackground(new Color(242,203,97));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainpanel, centerPanel, new CreateClubPanel(mainFrame, mainpanel, memberVO));
			}
			
		});
		
		
		
	}

}
