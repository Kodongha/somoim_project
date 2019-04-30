package com.kh.somoim.view.club.clubMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubTopPanel extends JPanel{

	JLabel shareLabel;
	JLabel backLabel;
	JLabel nameLabel;
	JLabel nameLabelGetName;

	public ClubTopPanel(MainFrame mainFrame, JPanel clubMainPanel, ClubVO clubVO, MemberVO memberVO) {

		this.setLayout(null);
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(500,60)); // 상단 패널 사이즈 조절

		// 라벨 테두리 지정
		/*LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);*/

		// 오른쪽 공유하기 아이콘
		Image shareIcon = new ImageIcon("images/shareimage.PNG").getImage().getScaledInstance(50, 50, 0);
		shareLabel = new JLabel(new ImageIcon(shareIcon));
		shareLabel.setBounds(430, 5, 50, 50);

		// 왼쪽 뒤로가기 아이콘
		Image backIcon = new ImageIcon("images/backimage.PNG").getImage().getScaledInstance(50, 50, 0);
		backLabel = new JLabel(new ImageIcon(backIcon));
		backLabel.setBounds(10, 5, 50, 50);

		// 중간에 소모임 이름 나올 부분
		nameLabel = new JLabel();
		nameLabel.setLayout(new FlowLayout(FlowLayout.CENTER));

		nameLabelGetName = new JLabel(clubVO.getName());
		nameLabelGetName.setFont(nameLabel.getFont().deriveFont(20.0f));

		nameLabel.add(nameLabelGetName);
		nameLabel.setBounds(100,10,300,60);

		this.add(shareLabel);
		this.add(backLabel);
		this.add(nameLabel);		

		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, clubMainPanel, new MainPanel(mainFrame, memberVO));

			}

		});
	}
}