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
		
		// �г� ���п� �׵θ� (�ϼ��� ����)
		LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);
		
		// ���� ���� ��¿� ��
		infoLabel = new JLabel(clubVO.getInformation());
		infoLabel.setBackground(Color.gray);
		infoLabel.setBounds(25, 20, 440, 280);
		
		/*// ���� ���� �г� ��ũ�ѹ�
		infoScroll = new JScrollPane(infoPanel);
		infoScroll.setLocation(445,20);
		infoScroll.setSize(20,280);
		this.add(infoScroll);	*/
		
		// ���� ���� �г� �׵θ�
		LineBorder infoBorder = new LineBorder(Color.BLACK);
		infoLabel.setBorder(infoBorder);
		
		// ���� ��� ��¿� ��   
		
		for(int i = 0; i < clubVO.getMembersNumber().size(); i++) {
			membersNumberList += Integer.toString(clubVO.getMembersNumber().get(i)) + "\r\n";
		}
		
		memberLabel = new JLabel(membersNumberList);
		memberLabel .setBackground(Color.white);
		memberLabel .setBounds(25, 310, 440, 280);
		
		// ���� ��� �г� �׵θ�
		LineBorder memberBorder = new LineBorder(Color.BLACK);
		memberLabel .setBorder(memberBorder);
		
		// �����ϱ� ��ư
		joinButton = new JButton("�����ϱ⢽");
		joinButton.setLocation(190, 600);
		joinButton.setSize(100, 40);
		joinButton.setBackground(Color.ORANGE);
		joinButton.setForeground(Color.WHITE);		
		
		// �� �г� ��ũ�ѹ�
		/*infoScroll = new JScrollBar();
		infoScroll.setBounds(40, 280, 30, 500);*/
		
		this.add(infoLabel);
		this.add(memberLabel);
		this.add(joinButton);
		
	}
}
