package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.club.model.vo.MemberInClubVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubInfo extends JPanel{
	JTextArea infotextArea;
	JLabel[] memberLabel;
	JButton joinButton;
	JScrollPane infoScroll;
	JScrollPane memberListScrollPane;
	JLabel clubMasterLabel;
	JScrollPane scrollPane;
	private String membersNumberList = "";

	public ClubInfo(MainFrame mainFrame, MainPanel mainPanel, JPanel clubMainPanel, ClubVO clubVO, MemberVO memberVO) {

		ClubController clubInfoController = new ClubController();
		ArrayList<MemberVO> clubMemberList = clubInfoController.getClubMemberList(clubVO);

		this.setLayout(null);
		this.setBackground(Color.WHITE);

		// 패널 구분용 테두리 (완성시 삭제)
		LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);

		// 모임 정보 출력용 라벨
		infotextArea = new JTextArea(clubVO.getInformation());
		infotextArea.setEnabled(false);
		infotextArea.setText(clubVO.getInformation().replace("††", "\n"));
		infotextArea.setBackground(Color.WHITE);
		infotextArea.setOpaque(true);
		infotextArea.setBounds(250, 20, 233, 280);
		
		//모임 정보 스크롤바
		scrollPane = new JScrollPane(infotextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setLocation(250, 20);

		LineBorder scrollBorder = new LineBorder(Color.WHITE);
		scrollPane.setBorder(scrollBorder);

		scrollPane.setSize(233, 280);
		this.add(scrollPane);

		// 가입하기 버튼
		joinButton = new JButton();
		joinButton.setLocation(14, 594);
		joinButton.setSize(472, 50);
		joinButton.setBackground(Color.ORANGE);
		//	joinButton.setForeground(Color.WHITE);	


		System.out.println("memberVO.getUserNumber()::::"+memberVO.getUserNumber());
		for(int i=0; i<clubVO.getMembersNumber().size(); i++) {
			System.out.println("clubVO.getMembersNumber().get(i)::::"+clubVO.getMembersNumber().get(i));
			
			if(memberVO.getUserNumber() == clubVO.getMembersNumber().get(i)) {
				joinButton.setText("탈퇴하기  ");
				break;
			} else {
				joinButton.setText("가입하기");
			}
		}

		this.add(joinButton);

		/*// 모임 정보 패널 스크롤바
		infoScroll = new JScrollPane(infoPanel);
		infoScroll.setLocation(445,20);
		infoScroll.setSize(20,280);
		this.add(infoScroll);	*/

		// 모임 정보 패널 테두리
		//	LineBorder infoBorder = new LineBorder(Color.BLACK);
		//	infoLabel.setBorder(infoBorder);

		// 모임 멤버 출력용 라벨   

		int x = -1;
		int y = 0;

		JLabel memberListLabel = new JLabel();
		memberListLabel.setLayout(null);
		memberListLabel.setPreferredSize(new Dimension(500,60 * clubMemberList.size()));
		memberLabel = new JLabel[clubMemberList.size()];

		for(int i = 0; i < clubMemberList.size(); i++) {			
			memberLabel[i] = new JLabel();
			memberLabel[i].setBounds(x, y, 500, 70);

			Image profileImage = new ImageIcon(clubMemberList.get(i).getProfilePhotoPath()).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			JLabel memberProfileLabel= new JLabel(new ImageIcon(profileImage));
			memberProfileLabel.setBounds(0, 0, 60, 60);

			JLabel memberNameLabel = new JLabel(clubMemberList.get(i).getName());
			memberNameLabel.setBounds(70, 0, 50, 50);

			int j = clubVO.getClupMasterNumber();

			// 모임장 출력 
			if(j == clubMemberList.get(i).getUserNumber()) {
				clubMasterLabel = new JLabel("모임장 ");
				clubMasterLabel.setBounds(350, 0, 50, 50);
				memberLabel[i].add(clubMasterLabel);
			}

			memberLabel[i].add(memberProfileLabel);
			memberLabel[i].add(memberNameLabel);

			memberListLabel.add(memberLabel[i]);
			y += 60;
		}	
		memberListLabel.setEnabled(false);
		memberListLabel.setBackground(Color.white);
		memberListLabel.setOpaque(true);
		memberListLabel.setBounds(14, 310, 470, 280);	

		//멤버 목록 스크롤바 

		memberListScrollPane = new JScrollPane(memberListLabel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		memberListScrollPane.setLocation(14, 310);

		LineBorder memberListScrollBorder = new LineBorder(Color.WHITE);
		memberListScrollPane.setBorder(memberListScrollBorder);

		memberListScrollPane.setSize(470, 280);
		this.add(memberListScrollPane);

		// 소모임 타이틀 이미지 
		Image titleImagePathImage = new ImageIcon(clubVO.getTitleImagePath()).getImage().getScaledInstance(220, 280, Image.SCALE_SMOOTH);
		Image resizeTitleImage = titleImagePathImage.getScaledInstance(220, 280, Image.SCALE_SMOOTH);

		JLabel titleImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
		titleImageLabel.setBounds(-80,-90,410,500);
		this.add(titleImageLabel);

		// 모임 멤버 패널 테두리
		//	LineBorder memberBorder = new LineBorder(Color.BLACK);
		//	memberLabel .setBorder(memberBorder);

		// 각 패널 스크롤바
		/*infoScroll = new JScrollBar();
		infoScroll.setBounds(40, 280, 30, 500);*/

		//		this.add(memberListPanel);

		joinButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(joinButton.getText().equals("탈퇴하기  ")) {
					MemberInClubVO memberInClubVO = new MemberInClubVO();
					memberInClubVO.setClubVO(clubVO);
					memberInClubVO.setMemberVO(memberVO);
					
					clubInfoController.leaveClub(memberInClubVO);
					
					ChangPanelUtil.CHANGE_PANEL(mainFrame, clubMainPanel, new MainPanel(mainFrame, memberVO));
					
				} else {
					MemberInClubVO memberInClubVO = new MemberInClubVO();
					memberInClubVO.setClubVO(clubVO);
					memberInClubVO.setMemberVO(memberVO);
					
					clubInfoController.signupClub(memberInClubVO);
					
					JOptionPane.showMessageDialog(null, "[" + clubVO.getName() + "]의 가입을 환영합니다.", "가입 완료", JOptionPane.NO_OPTION);
					
					/* 소모임 정보 새로 세팅 */
					ArrayList<Integer> memberList = clubVO.getMembersNumber();
					memberList.add(memberVO.getUserNumber());
					clubVO.setMembersNumber(memberList);
					
					ChangPanelUtil.CHANGE_PANEL(mainFrame, clubMainPanel, new ClubMainPanel(mainFrame, mainPanel, clubVO, memberVO));
				}
			}
		});
		
		
	}
}
