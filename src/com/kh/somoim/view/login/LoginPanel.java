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

	private JPanel thisPanel;

	public LoginPanel(MainFrame mainFrame) {
		LoginController loginController = new LoginController();

		this.thisPanel = this;

		this.setLayout(new BorderLayout());

		JPanel loginPanel = new JPanel();

		JLabel backgroundImage = new JLabel(new ImageIcon(new ImageIcon("images/backgroundImage.PNG").getImage().getScaledInstance(500, 800, 0)));
		backgroundImage.setBounds(0, 0, 500, 800);

		JLabel idLabel = new JLabel("ID :");
		idLabel.setLocation(110, 390); // �� �ġ��
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

		JButton loginButton = new JButton("�α���"); //�α��� ��ư
		//loginbutton.setBounds(160, 80, 100, 25);
		loginButton.setLocation(150, 550);
		loginButton.setSize(200, 40);
		loginButton.setBackground(Color.ORANGE);

		JButton newCreateButton = new JButton("�� ��� �����"); // ȸ���� ��ư
		//newcreatebutton.setBounds(160, 80, 100, 25);
		newCreateButton.setLocation(150, 650);
		newCreateButton.setSize(200, 40);
		newCreateButton.setBackground(Color.red);


		JButton findIdPassword = new JButton("��й�ȣ�� ����̳���?"); // ȸ���� ��ư
		//newcreatebutton.setBounds(160, 80, 100, 25);
		findIdPassword.setLocation(150, 600);
		findIdPassword.setSize(200, 40);
		//findIdPassword.setBackground(Color.gray);
		findIdPassword.setBorderPainted(false);
		findIdPassword.setContentAreaFilled(false);

		this.add(idLabel); //��
		this.add(pwdLabel);

		this.add(idTextField); //�ؽ�Ʈ �ʵ�
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

	}
}