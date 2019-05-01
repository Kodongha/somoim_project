package com.kh.somoim.view.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class TopPanel extends JPanel {

	private JLabel logoLabel;
	private JLabel profileLabel;
	private JLabel profileNameLabel;
	private JLabel profilePointLabel;
	private JLabel messengerLabel;
	
	public TopPanel(MainFrame mainFrame, JPanel mainPanel, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		
		System.out.println(memberVO);
		this.setLayout(null);
		this.setBounds(500,200,200,30);
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(500,60));
		
		Image logo = new ImageIcon("images/logo.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		logoLabel = new JLabel(new ImageIcon(logo));
		logoLabel.setBounds(5, 5, 50, 50);
		
		
		Image profilePhoto = new ImageIcon(memberVO.getProfilePhotoPath()).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		profileLabel = new JLabel(new ImageIcon(profilePhoto));
		profileLabel.setBounds(300, 5, 50, 50);
		
		profileNameLabel = new JLabel(memberVO.getName());
		profileNameLabel.setBounds(360, 10, 50, 15);
		
		profilePointLabel = new JLabel(String.valueOf(memberVO.getPoint()));
		profilePointLabel.setBounds(360, 25, 50, 15);
		 
		messengerLabel = new JLabel("쪽지함");
		messengerLabel.setBounds(360, 40, 50, 18);
		messengerLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		messengerLabel.setHorizontalAlignment(JLabel.CENTER);
		
//		messengerButton = new JButton("쪽지함");
//		messengerButton.setBounds(360, 45, 70, 15);
		
		JButton button = new JButton("abc");
		button.setLocation(5,5);
		
		this.add(logoLabel);
		this.add(profileLabel);
		this.add(profileNameLabel);
		this.add(profilePointLabel);
		this.add(messengerLabel);
		this.add(button);
		
		logoLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel, new MainPanel(mainFrame, memberVO));
			}
		});
		
	}
	
}
