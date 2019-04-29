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
		// �̹��� ũ��

		// JLabel signuppagelabel = new JLabel(new ImageIcon(icon));

		// signuppagelabel.setLocation(60, 50);
		// signuppagelabel.setSize(400, 400);

		JLabel signUpLabel = new JLabel("��Ȯ�� ���� �Ϸ� �Ǿ����ϴ�.");

		signUpLabel.setLocation(140, 270);
		signUpLabel.setSize(300, 300);

		signUpLabel.setFont(new Font("�������", Font.BOLD, 30));

		JLabel hiLabel = new JLabel("ȯ���մϴ�.");

		hiLabel.setLocation(100, 400);
		hiLabel.setSize(350, 150);

		hiLabel.setFont(new Font("�������", Font.BOLD, 15)); // ��Ʈ���� �� ����,����������
		hiLabel.setForeground(Color.GRAY);

		JButton nextButton = new JButton("����");

		nextButton.setLocation(190, 500); // ��ġ����
		nextButton.setSize(100, 50); // ũ������
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
