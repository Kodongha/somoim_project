package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class InformationFindPasswordPanel extends JPanel {
	
	private JPanel thisPanel;
	
	public InformationFindPasswordPanel (MainFrame mainFrame) {
		this.thisPanel = this;
	
		this.setLayout(null);
		this.setBackground(Color.white);
		
		JLabel passwordLabel = new JLabel("비밀번호를 찾고자 하는 아이디를 입력해 주세요");
		passwordLabel.setBounds(110,60, 350, 50);
		
		JTextField informationEmailTextField = new JTextField(15);
		informationEmailTextField.setBounds(110, 110, 300, 45);
		
		JButton nextButton = new JButton("확인");
		nextButton.setBounds(137, 600, 230, 50);
		
		nextButton.setBackground(Color.orange);
		
		JLabel informationFindTopPassworkLabel = new JLabel(" < 비밀번호 찾기");
		informationFindTopPassworkLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		informationFindTopPassworkLabel.setFont(informationFindTopPassworkLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		informationFindTopPassworkLabel.setLocation(10, 6);
		
		informationFindTopPassworkLabel.setSize(200, 20);
		this.add(informationFindTopPassworkLabel);	
		
		InformationFindTopPassworkPanel informationFindTopPassworkPanel = new InformationFindTopPassworkPanel();
		informationFindTopPassworkPanel.setBounds(0, 0, 500, 35);
		
		this.add(passwordLabel);
		this.add(informationEmailTextField);
		this.add(nextButton);
		this.add(informationFindTopPassworkPanel);
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new ResetPassword(mainFrame));
			}
		});
		
		informationFindTopPassworkLabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new InformationFindPanel(mainFrame));
			
			}
		});
	}
}
