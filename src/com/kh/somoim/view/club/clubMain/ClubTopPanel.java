package com.kh.somoim.view.club.clubMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kh.somoim.home.model.vo.ClubVO;

public class ClubTopPanel extends JPanel{
	
	JLabel shareLabel;
	JLabel backLabel;
	JLabel nameLabel;
	
	public ClubTopPanel(ClubVO clubVO) {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(500,60)); // ��� �г� ������ ����
		
		// �� �׵θ� ����
		/*LineBorder labelBorder = new LineBorder(Color.black);
		this.setBorder(labelBorder);*/
		
		// ������ �����ϱ� ������
		Image shareIcon = new ImageIcon("images/shareimage.PNG").getImage().getScaledInstance(50, 50, 0);
		shareLabel = new JLabel(new ImageIcon(shareIcon));
		shareLabel.setBounds(430, 5, 50, 50);
		
		// ���� �ڷΰ��� ������
		Image backIcon = new ImageIcon("images/backimage.PNG").getImage().getScaledInstance(50, 50, 0);
		backLabel = new JLabel(new ImageIcon(backIcon));
		backLabel.setBounds(10, 5, 50, 50);
		
		// �߰��� �Ҹ��� �̸� ���� �κ�
		nameLabel = new JLabel(clubVO.getName());
		nameLabel.setFont(nameLabel.getFont().deriveFont(20.0f));
		nameLabel.setBounds(180,0,380,60);

		
		this.add(shareLabel);
		this.add(backLabel);
		this.add(nameLabel);		
	}
}
