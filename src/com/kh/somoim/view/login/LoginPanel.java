package com.kh.somoim.view.login;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.somoim.login.controller.LoginController;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.signup.SignupPage;

public class LoginPanel extends JPanel {
	private MainFrame mainFrame;
	private JPanel thisPanel;
	
	public LoginPanel(MainFrame mainFrame) {
		LoginController loginController = new LoginController();
		this.mainFrame = mainFrame;
		this.thisPanel = this; 
		
this.setLayout(new BorderLayout());
		
		JPanel loginPanel = new JPanel();

		JLabel backgroundImage = new JLabel(new ImageIcon(new ImageIcon("images/backgroundImage.PNG").getImage().getScaledInstance(500, 800, 0)));
		backgroundImage.setBounds(0, 0, 500, 800);
		
		JLabel idLabel = new JLabel("ID :");
		idLabel.setLocation(110, 390); // 라벨 위치조정
		idLabel.setSize(150, 50);
		
		JTextField idTextField = new JTextField(15); 
		idTextField.setLocation(150, 400);
		idTextField.setSize(220, 30);
		
		JLabel pwdLabel = new JLabel("Pw : ");
		pwdLabel.setLocation(110, 488);
		pwdLabel.setSize(150, 50);
		
		JLabel label = new JLabel(" ");
		
		JTextField pwdTextField = new JTextField(15);
		pwdTextField.setLocation(150, 500);
		pwdTextField.setSize(220, 30);
		
		JButton loginButton = new JButton("로그인"); //로그인 버튼
		//loginbutton.setBounds(160, 80, 100, 25);
		loginButton.setLocation(150, 550);
		loginButton.setSize(200, 40);
		loginButton.setBackground(Color.ORANGE);
		
		JButton newCreateButton = new JButton("새 계정 만들기"); // 회원가입 버튼
		//newcreatebutton.setBounds(160, 80, 100, 25);
		newCreateButton.setLocation(150, 650);
		newCreateButton.setSize(200, 40);
		newCreateButton.setBackground(Color.red);
		
		
		JButton findIdPassword = new JButton("비밀번호를 잊으셨나요?"); // 회원가입 버튼
		//newcreatebutton.setBounds(160, 80, 100, 25);
		findIdPassword.setLocation(150, 600);
		findIdPassword.setSize(200, 40);
		//findIdPassword.setBackground(Color.gray);
		findIdPassword.setBorderPainted(false);
		findIdPassword.setContentAreaFilled(false);
		
		this.add(idLabel); //라벨
		this.add(pwdLabel);
		
		this.add(idTextField); //텍스트 필드
		this.add(pwdTextField);
		
		this.add(loginButton);
		this.add(newCreateButton);
		this.add(findIdPassword);
		
		
		mainFrame.add(this);

		this.add(loginPanel, "Center");
		this.add(backgroundImage);
		
		loginButton.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MemberVO memberVO = loginController.checkAccount(idTextField.getText(), pwdTextField.getText());
				if(memberVO != null) {
					ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new MainPanel(mainFrame, memberVO));
				} else {
					System.out.println("로그인 실패");
				}
			}
		});
		
		newCreateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new SignupPage(mainFrame));
			}
		});
		
		findIdPassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new InformationFindPanel(mainFrame));
				
			}
		});
		
		
	}
}