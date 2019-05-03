package com.kh.somoim.view.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import com.kh.somoim.login.controller.LoginController;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.signup.SignupPage;
import com.kh.somoim.view.signup.SignupPageTopPanel;

public class LoginPanel extends JPanel {

	private JPanel thisPanel;

	public LoginPanel(MainFrame mainFrame) {
		LoginController loginController = new LoginController();
		this.setBackground(Color.white);
		this.thisPanel = this; 
		this.setLayout(null);
//		JPanel loginPanel = new JPanel();
//		loginPanel.setBackground(Color.WHITE);
//		JLabel backgroundImage = new JLabel(new ImageIcon(new ImageIcon("images/backgroundImage.PNG").getImage().getScaledInstance(500, 800, 0)));
//		backgroundImage.setBounds(0, 0, 500, 800);
		
		Image logo = new ImageIcon("images/mainLogo.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		JLabel mainImageLabel = new JLabel(new ImageIcon(logo));
		mainImageLabel.setSize(300,300);
		mainImageLabel.setLocation(100,50);
		
		
		JLabel idLabel = new JLabel("  �� �� ��");
		idLabel.setBorder(new LineBorder(Color.GRAY,1));
		idLabel.setLocation(125, 400); // �� ��ġ����
		idLabel.setSize(250, 50);
		idLabel.setHorizontalAlignment(idLabel.LEFT);
		idLabel.setFont(new Font("", Font.PLAIN, 15));
		idLabel.setForeground(Color.GRAY);
		
		JTextField idTextField = new JTextField(15); 
		idTextField.setLocation(10, 10);
		idTextField.setSize(230, 30);
		idTextField.setOpaque(false);
		idTextField.setBorder(null);
		idLabel.add(idTextField); //�ؽ�Ʈ �ʵ�
		
		JLabel pwdLabel = new JLabel("  �� �� �� ȣ");
		pwdLabel.setBorder(new LineBorder(Color.GRAY,1));
		pwdLabel.setLocation(125, 480); // �� ��ġ����
		pwdLabel.setSize(250, 50);
		pwdLabel.setHorizontalAlignment(pwdLabel.LEFT);
		pwdLabel.setFont(new Font("", Font.PLAIN, 15));
		
		pwdLabel.setForeground(Color.GRAY);
		
		JPasswordField pwdTextField = new JPasswordField(15);
		pwdTextField.setLocation(10, 10);
		pwdTextField.setSize(230, 30);
		pwdTextField.setOpaque(false);
		pwdTextField.setBorder(null);
		pwdLabel.add(pwdTextField);

		JLabel alertLabel = new JLabel("�Է��Ͻ� ������ ��ġ���� �ʽ��ϴ�.");
		alertLabel.setLocation(125, 515); // �� ��ġ����
		alertLabel.setSize(250, 50);
		alertLabel.setHorizontalAlignment(idLabel.CENTER);
		alertLabel.setForeground(Color.RED);
		alertLabel.setVisible(false);

		JButton loginButton = new JButton("�α���"); //�α��� ��ư
		//loginbutton.setBounds(160, 80, 100, 25);
		loginButton.setLocation(150, 550);
		loginButton.setSize(200, 40);
//		loginButton.setBackground(Color.ORANGE);
		loginButton.setBorderPainted(false);
		loginButton.setContentAreaFilled(false);

		JButton newCreateButton = new JButton("�� ���� �����"); // ȸ������ ��ư
		//newcreatebutton.setBounds(160, 80, 100, 25);
		newCreateButton.setLocation(150, 650);
		newCreateButton.setSize(200, 40);
//		newCreateButton.setBackground(Color.red);
		newCreateButton.setBorderPainted(false);
		newCreateButton.setContentAreaFilled(false);
		
		

		JButton findIdPassword = new JButton("������ �����̳���?"); // ȸ������ ��ư
		//newcreatebutton.setBounds(160, 80, 100, 25);
		findIdPassword.setLocation(150, 600);
		findIdPassword.setSize(200, 40);
		//findIdPassword.setBackground(Color.gray);
		findIdPassword.setBorderPainted(false);
		findIdPassword.setContentAreaFilled(false);

		this.add(idLabel); //��
		this.add(pwdLabel);
		this.add(alertLabel);
		
		this.add(loginButton);
		this.add(newCreateButton);
		this.add(findIdPassword);

//		this.add(loginPanel, "Center");
//		this.add(backgroundImage);
		this.add(mainImageLabel);
		
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char [] passwordChar = pwdTextField.getPassword();
				String passwordStr = "";
				for(int i=0; i<passwordChar.length; i++) {
					passwordStr += passwordChar[i];
				}
				
				if(idTextField.getText().equals("") || idTextField.getText().length() == 0) {
					idLabel.setBorder(new LineBorder(Color.RED,2));
				} else {
					idLabel.setBorder(new LineBorder(Color.GRAY,1));
				}
				
				if(passwordStr.equals("") || passwordStr.length() == 0) {
					pwdLabel.setBorder(new LineBorder(Color.RED,2));
				} else {
					pwdLabel.setBorder(new LineBorder(Color.GRAY,1));
				}
				
				MemberVO memberVO = loginController.checkAccount(idTextField.getText(), passwordStr);
				if(memberVO != null) {
					alertLabel.setVisible(false);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new MainPanel(mainFrame, memberVO));
				} else {
					alertLabel.setVisible(true);
					System.out.println("�α��� ����");
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

		/* id �ؽ�Ʈ �ʵ� Ű �̺�Ʈ */
		idTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				super.keyReleased(e);
				
				if(idTextField.getText().length() > 0) {
					idLabel.setText("");
				} else {
					idLabel.setText("  �� �� ��");
				}
				
				if(e.getKeyCode() == 10) {
					char [] passwordChar = pwdTextField.getPassword();
					String passwordStr = "";
					for(int i=0; i<passwordChar.length; i++) {
						passwordStr += passwordChar[i];
					}
					
					if(idTextField.getText().equals("") || idTextField.getText().length() == 0) {
						idLabel.setBorder(new LineBorder(Color.RED,2));
					} else {
						idLabel.setBorder(new LineBorder(Color.GRAY,1));
					}
					
					if(passwordStr.equals("") || passwordStr.length() == 0) {
						pwdLabel.setBorder(new LineBorder(Color.RED,2));
					} else {
						pwdLabel.setBorder(new LineBorder(Color.GRAY,1));
					}
					
					MemberVO memberVO = loginController.checkAccount(idTextField.getText(), passwordStr);
					if(memberVO != null) {
						alertLabel.setVisible(false);
						ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new MainPanel(mainFrame, memberVO));
					} else {
						alertLabel.setVisible(true);
						System.out.println("�α��� ����");
					}
				}
			}
		});
		
		/* password �ؽ�Ʈ �ʵ� Ű �̺�Ʈ */
		pwdTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
				
				if(pwdTextField.getPassword().length > 0) {
					pwdLabel.setText("");
				} else {
					pwdLabel.setText("  �� �� �� ��");
				}
				
				if(e.getKeyCode() == 10) {
					char [] passwordChar = pwdTextField.getPassword();
					String passwordStr = "";
					for(int i=0; i<passwordChar.length; i++) {
						passwordStr += passwordChar[i];
					}
					
					if(idTextField.getText().equals("") || idTextField.getText().length() == 0) {
						idLabel.setBorder(new LineBorder(Color.RED,2));
					} else {
						idLabel.setBorder(new LineBorder(Color.GRAY,1));
					}
					
					if(passwordStr.equals("") || passwordStr.length() == 0) {
						pwdLabel.setBorder(new LineBorder(Color.RED,2));
					} else {
						pwdLabel.setBorder(new LineBorder(Color.GRAY,1));
					}
					
					MemberVO memberVO = loginController.checkAccount(idTextField.getText(), passwordStr);
					if(memberVO != null) {
						alertLabel.setVisible(false);
						ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new MainPanel(mainFrame, memberVO));
					} else {
						alertLabel.setVisible(true);
						System.out.println("�α��� ����");
					}
				}
			}
		});
	}
}