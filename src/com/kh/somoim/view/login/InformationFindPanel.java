package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.signup.SubscriptionInformationPanel;



public class InformationFindPanel extends JPanel {
	
	private JPanel thisPanel;
	
	public InformationFindPanel(MainFrame mainFrame ) {
		this.thisPanel = this;
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		/*JLabel informationFind = new JLabel("< 정보 찾기");
		informationFind.setBounds(180, 30, 100,25);*/
		
		JLabel idImage = new JLabel(new ImageIcon(new ImageIcon("images/id.PNG").getImage().getScaledInstance(75, 60, 0)));
		idImage.setBounds(100, 440, 100, 200);

		JLabel passwordImage = new JLabel(new ImageIcon(new ImageIcon("images/password.PNG").getImage().getScaledInstance(75, 60, 0)));
		passwordImage.setBounds(100, 540, 100, 200);
		
		JButton idInformationFindPanelButton = new JButton();
		idInformationFindPanelButton.setBounds(92, 500, 500, 200); //아이디  찾기 버튼
		idInformationFindPanelButton.setSize(310, 80);
		//idInformationFindPanelButton.setLocation(p);
		idInformationFindPanelButton.setContentAreaFilled(false);
	
		JButton passwordInformationFindPanelButton = new JButton();       //비밀번호  찾기 버튼
		passwordInformationFindPanelButton.setBounds(92, 600, 500, 200);
		passwordInformationFindPanelButton.setSize(310, 80);
		passwordInformationFindPanelButton.setContentAreaFilled(false);
		
		JLabel idInformationFindPanelLabel = new JLabel("아이디 찾기"); //라벨 글자 폰트 크기 조절
		idInformationFindPanelLabel.setFont(idInformationFindPanelLabel
											.getFont().deriveFont(20.0f));
		idInformationFindPanelLabel.setBounds(205, 440, 500, 200);
		
		JLabel passwordInformationFindPanelLabel = new JLabel("비밀번호 찾기"); //라벨 글자 폰트 크기 조절
		passwordInformationFindPanelLabel.setFont(passwordInformationFindPanelLabel
											.getFont().deriveFont(20.0f));
		passwordInformationFindPanelLabel.setBounds(205, 540, 500, 200);
		
		this.add(idInformationFindPanelLabel);
		this.add(passwordInformationFindPanelLabel);
		
		this.add(idInformationFindPanelButton);
		this.add(passwordInformationFindPanelButton);
		
		this.add(idImage);
		this.add(passwordImage);
		
		JLabel informationFindTopPanelLabel = new JLabel(" < 정보 찾기");
		informationFindTopPanelLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		informationFindTopPanelLabel.setFont(informationFindTopPanelLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		informationFindTopPanelLabel.setLocation(10, 6);
		
		informationFindTopPanelLabel.setSize(100, 20);
		this.add(informationFindTopPanelLabel);
		
		InformationFindTopPanel  informationFindTopPanel = new InformationFindTopPanel();
		informationFindTopPanel.setBounds(0, 0, 500, 35);
		//informationFindTopPanel.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		
		this.add(informationFindTopPanel);
		
		
		informationFindTopPanelLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				
			}
			
		});
		
		passwordInformationFindPanelButton.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new InformationFindPasswordPanel(mainFrame));
			}
		});
		
		idInformationFindPanelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new FindIdPanel(mainFrame));	
			}
		});
	}
}
