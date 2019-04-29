package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ResetPassword extends JPanel {
	
	private JPanel thisPanel;
	
	public ResetPassword(MainFrame mainFrame) {
		this.thisPanel = this;
		
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		JLabel passwordLanl = new JLabel("비밀번호");
		passwordLanl.setBounds(70, 80, 100, 100);
		
		JLabel checkPasswordLanl = new JLabel("비밀번호 확인");
		checkPasswordLanl.setBounds(70, 150, 100, 100);
		
		JPasswordField passwordTextField = new JPasswordField(15);
		passwordTextField.setBounds(170, 105, 250, 45);
		
		JPasswordField resetPasswordTextField = new JPasswordField(15);
		resetPasswordTextField.setBounds(170, 175, 250, 45);
		
		JButton nextButton = new JButton("확인");
		nextButton.setBounds(137, 600, 230, 50);
		
		nextButton.setBackground(Color.orange);
		
		ResetPasswordTopPanel resetPasswordTopPanel = new ResetPasswordTopPanel();
		resetPasswordTopPanel.setBounds(0, 0, 500, 35);
		
		this.add(resetPasswordTextField);
		this.add(passwordTextField);
		
		this.add(checkPasswordLanl);
		this.add(passwordLanl);
		this.add(resetPasswordTopPanel);
		
		this.add(nextButton);
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				
			}
		});
	}

}
