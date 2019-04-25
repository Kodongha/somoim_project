package com.kh.somoim.view.mainFrame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.main.MainPanel;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		// BorderLayout 설정
		super("소확행");
		this.setBounds(200, 30, 500, 800);
		this.setLayout(new BorderLayout());

		
//		this.add(new LoginPanel(this));
//		this.add(new TermsOfServicePanel());
//		this.add(new signupPage(this));
		MemberVO memberVO = new MemberVO();
		this.add(new MainPanel(this, memberVO));
		
		// Frame 설정
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
