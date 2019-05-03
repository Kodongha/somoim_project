package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import org.omg.Messaging.SyncScopeHelper;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class ClubInfo extends JPanel{
	JLabel infoLabel;
	JLabel[] memberLabel;
	JButton joinButton;
	JScrollPane infoScroll;
	JLabel clubMasterLabel;
	private JScrollPane scrollPane;
	private String membersNumberList = "";

	public ClubInfo(ClubVO clubVO) {

		ClubController clubInfoController = new ClubController();
		ArrayList<MemberVO> clubMemberList = clubInfoController.getClubMemberList(clubVO);

		this.setLayout(null);
		this.setBackground(Color.WHITE);

		// �г� ���п� �׵θ� (�ϼ��� ����)
		LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);

		// ���� ���� ��¿� ��
		infoLabel = new JLabel(clubVO.getInformation());
		infoLabel.setEnabled(false);
		infoLabel.setText("<html>�̷��� �������?<br> �Ǵ°ǰ� <br>" + "aoa <br>�ܹ߸Ӹ�<br> ���ðԿ�<br>" + "ª�� <br>ġ���� <br>�Ծ�� <br>�̰�����<br> ����ϴ� <br>�ð��� �� <br>" + "���õ��� <br>�Ӹ��� <br>������<br> �ȵ��~~ <br>" + "�ܹ߸Ӹ��� <br>�ϰ� �״븦<br> ������ <br></html> ");
		infoLabel.setBackground(Color.WHITE);
		infoLabel.setBounds(25, 20, 220, 280);

		//���� ���� ��ũ�ѹ�  
		scrollPane = new JScrollPane(infoLabel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setLocation(25, 20);
		scrollPane.setSize(220, 280);
		this.add(scrollPane);


		/*// ���� ���� �г� ��ũ�ѹ�
		infoScroll = new JScrollPane(infoPanel);
		infoScroll.setLocation(445,20);
		infoScroll.setSize(20,280);
		this.add(infoScroll);	*/

		// ���� ���� �г� �׵θ�
		//	LineBorder infoBorder = new LineBorder(Color.BLACK);
		//	infoLabel.setBorder(infoBorder);

		// ���� ��� ��¿� ��   
		
		int x = -1;
		int y = 0;
		
		JPanel memberListPanel = new JPanel();
		memberListPanel.setLayout(null);
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
			System.out.println("clubVO.getClupMasterNumber()::::"+clubVO.getClupMasterNumber());
			System.out.println("clubMemberList.get(i).getUserNumber():::"+clubMemberList.get(i).getUserNumber());
			if(j == clubMemberList.get(i).getUserNumber()) {
				clubMasterLabel = new JLabel("������ ");
				clubMasterLabel.setBounds(350, 0, 50, 50);
				memberLabel[i].add(clubMasterLabel);
			}
			
			memberLabel[i].add(memberProfileLabel);
			memberLabel[i].add(memberNameLabel);
			
			memberListPanel.add(memberLabel[i]);
			y += 60;
			
			
		}	
		memberListPanel.setBackground(Color.white);
		memberListPanel.setBounds(25, 310, 500, 280);	

		// �Ҹ��� Ÿ��Ʋ �̹��� 
		Image titleImagePathImage = new ImageIcon(clubVO.getTitleImagePath()).getImage().getScaledInstance(200, 280, Image.SCALE_SMOOTH);
		Image resizeTitleImage = titleImagePathImage.getScaledInstance(200, 280, Image.SCALE_SMOOTH);

		JLabel titleImageLabel = new JLabel(new ImageIcon(resizeTitleImage));
		titleImageLabel.setBounds(160,-90,400,500);
		this.add(titleImageLabel);

		
		/*// �����ϱ� ��ư
		joinButton = new JButton("�����ϱ⢽");
		joinButton.setLocation(190, 600);
		joinButton.setSize(100, 40);
		joinButton.setBackground(Color.ORANGE);
		joinButton.setForeground(Color.WHITE);*/		


		this.add(memberListPanel);
		this.add(joinButton);

	}
}
