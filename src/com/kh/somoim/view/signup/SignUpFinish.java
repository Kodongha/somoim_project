package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SignUpFinish extends JPanel {
	private JPanel thisPanel;

	public SignUpFinish(MainFrame mainFrame) {
		this.thisPanel = this;

		this.setBackground(Color.WHITE);

		this.setLayout(null);

		// Image icon = new
		// ImageIcon("images/singup.PNG").getImage().getScaledInstance(310, 300, 0);//
		// 이미지 크기

		// JLabel signuppagelabel = new JLabel(new ImageIcon(icon));

		// signuppagelabel.setLocation(60, 50);
		// signuppagelabel.setSize(400, 400);

		JLabel signUpLabel = new JLabel("소확행 가입 완료 되었습니다.");

		signUpLabel.setLocation(140, 270);
		signUpLabel.setSize(300, 300);

		signUpLabel.setFont(new Font("나눔고딕", Font.BOLD, 30));

		JLabel hiLabel = new JLabel("환영합니다.");

		hiLabel.setLocation(100, 400);
		hiLabel.setSize(350, 150);

		hiLabel.setFont(new Font("나눔고딕", Font.BOLD, 15)); // 폰트변경 및 굵게,사이즈조정
		hiLabel.setForeground(Color.GRAY);

		JButton nextButton = new JButton("다음");

		nextButton.setLocation(190, 500); // 위치지정
		nextButton.setSize(100, 50); // 크기지정
		nextButton.setBackground(Color.ORANGE);
		nextButton.setBorderPainted(false);

		// this.add(signuppagelabel);
		this.add(signUpLabel);
		this.add(hiLabel);
		this.add(nextButton);
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				
			}
		});
	}

}
