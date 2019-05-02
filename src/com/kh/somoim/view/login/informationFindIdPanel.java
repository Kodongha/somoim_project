package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class informationFindIdPanel extends JPanel {

	private JPanel thisPanel;

	public informationFindIdPanel(MainFrame mainFrame) {
		this.thisPanel = this;

		this.setLayout(null);
		this.setBackground(Color.white);

		JLabel idLabel = new JLabel("회원님의 정보와 일치하는 아이디 입니다");
		idLabel.setBounds(110, 60, 350, 50);

		JTextField informationEmailTextField = new JTextField(15);
		informationEmailTextField.setBounds(110, 110, 300, 45);

		JButton nextButton = new JButton("확인");
		nextButton.setBounds(137, 600, 230, 50);

		nextButton.setBackground(Color.orange);

		JLabel FindIdLabel = new JLabel(" < 아이디 찾기");
		FindIdLabel.setForeground(Color.WHITE); // 라벨 글씨색변경
		FindIdLabel.setFont(FindIdLabel // 라벨 글씨 크기 조절
				.getFont().deriveFont(15.0f));
		FindIdLabel.setLocation(10, 6);

		FindIdLabel.setSize(100, 20);
		this.add(FindIdLabel);

		this.add(idLabel);
		this.add(informationEmailTextField);
		this.add(nextButton);

		FindIdTopPanel findIdTopPanel = new FindIdTopPanel();
		findIdTopPanel.setBounds(0, 0, 500, 35);
		this.add(findIdTopPanel);

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));

			}
		});
		findIdTopPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new FindIdPanel(mainFrame));
			}

		});

	}
}
