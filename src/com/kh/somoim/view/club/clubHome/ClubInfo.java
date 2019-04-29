package com.kh.somoim.view.club.clubHome;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import org.omg.Messaging.SyncScopeHelper;

import com.kh.somoim.home.model.vo.ClubVO;

public class ClubInfo extends JPanel{
	JLabel infoLabel;
	JLabel memberLabel;
	JButton joinButton;
	JScrollPane infoScroll;
	private String membersNumberList = "";
		
	public ClubInfo(ClubVO clubVO) {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		// 패널 구분용 테두리 (완성시 삭제)
		LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);
		
		// 모임 정보 출력용 라벨
		infoLabel = new JLabel(clubVO.getInformation());
		infoLabel.setBackground(Color.gray);
		infoLabel.setBounds(25, 20, 440, 280);
		
		/*// 모임 정보 패널 스크롤바
		infoScroll = new JScrollPane(infoPanel);
		infoScroll.setLocation(445,20);
		infoScroll.setSize(20,280);
		this.add(infoScroll);	*/
		
		// 모임 정보 패널 테두리
		LineBorder infoBorder = new LineBorder(Color.BLACK);
		infoLabel.setBorder(infoBorder);
		
		// 모임 멤버 출력용 라벨   
		
		for(int i = 0; i < clubVO.getMembersNumber().size(); i++) {
			membersNumberList += Integer.toString(clubVO.getMembersNumber().get(i)) + "\r\n";
		}
		
		memberLabel = new JLabel(membersNumberList);
		memberLabel .setBackground(Color.white);
		memberLabel .setBounds(25, 310, 440, 280);
		
		// 모임 멤버 패널 테두리
		LineBorder memberBorder = new LineBorder(Color.BLACK);
		memberLabel .setBorder(memberBorder);
		
		// 가입하기 버튼
		joinButton = new JButton("가입하기♡");
		joinButton.setLocation(190, 600);
		joinButton.setSize(100, 40);
		joinButton.setBackground(Color.ORANGE);
		joinButton.setForeground(Color.WHITE);		
		
		// 각 패널 스크롤바
		/*infoScroll = new JScrollBar();
		infoScroll.setBounds(40, 280, 30, 500);*/
		
		this.add(infoLabel);
		this.add(memberLabel);
		this.add(joinButton);
		
	}
}
