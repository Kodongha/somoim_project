package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResetPasswordTopPanel extends JPanel {
	
	public ResetPasswordTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //상단 패널조절
		
		/*JLabel ResetPasswordTopLabel = new JLabel(" < 비밀번호 찾기");
		ResetPasswordTopLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		ResetPasswordTopLabel.setFont(ResetPasswordTopLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		ResetPasswordTopLabel.setLocation(10, 6);
		ResetPasswordTopLabel.setSize(200, 20);
		this.add(ResetPasswordTopLabel);	*/
	}
}
