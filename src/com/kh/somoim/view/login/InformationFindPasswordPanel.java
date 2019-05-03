package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.somoim.login.controller.LoginController;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class InformationFindPasswordPanel extends JPanel {
	
	private JPanel thisPanel;
	
	int random;
	String random2="";

	boolean flag;
	public InformationFindPasswordPanel (MainFrame mainFrame) {
		LoginController loginController = new LoginController();
		for(int j=0;j<5;j++) {
			for (int i = 0; i < 5; i++) {
				random = (int) (Math.random() * 10);
			}
			random2 += String.valueOf(random);
		}
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

		JLabel phoneNumber = new JLabel("휴대폰번호 : ");
		phoneNumber.setLocation(50, 300);
		phoneNumber.setSize(150, 40);
		this.add(phoneNumber);	

	JTextField textPhone = new JTextField(20);
		textPhone.setLocation(140, 380);
		textPhone.setSize(200, 40);
		textPhone.setBackground(Color.gray);
		textPhone.setText("000-0000-0000 형식으로 입력");
		this.add(textPhone);	
		
		
		textPhone.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
		
			
				super.mouseClicked(e);
				
				
				textPhone.setBackground(Color.WHITE);
				textPhone.setText("");
				
				
				
				
				         
			}
		});
		

		JTextField AuthenticationNo = new JTextField(20);
		AuthenticationNo.setLocation(140, 430);
		AuthenticationNo.setSize(200, 40);
		this.add(AuthenticationNo);	

		/*String[] countryCode = {"+82", "+1", "+2", "010"}; 

		JComboBox countryCodeList = new JComboBox(countryCode);
		countryCodeList.setLocation(232, 314); //139, 314
		countryCodeList.setSize(80, 25);
		countryCodeList.setBackground(Color.WHITE);

		this.add(countryCodeList);*/

		String[] tongsinsa = {"SK", "KT", "LG"}; 

		JComboBox tongsinsaList = new JComboBox(tongsinsa);
		tongsinsaList.setLocation(139, 314); //232, 314
		tongsinsaList.setSize(80, 40);
		tongsinsaList.setBackground(Color.WHITE);
		this.add(tongsinsaList);	

		JButton button1 = new JButton("인증 ");
		button1.setLocation(341, 380);
		button1.setSize(70, 40);
		button1.setBackground(Color.LIGHT_GRAY);
		this.add(button1);

		JButton button2 = new JButton("확인 ");
		button2.setLocation(341, 430);
		button2.setSize(70, 40);
		button2.setBackground(Color.LIGHT_GRAY);
		this.add(button2);
		
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
		
		
		button1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String str = String.valueOf(textPhone.getText());
				String a=  str.substring(0, 4);
				String b=  str.substring(4, 7);
				String c=  str.substring(7, 11);
				String str2 = a+"-"+b+"-"+c;
				super.mouseClicked(e);
				
				
				if (str2.length() == 13) {
					JOptionPane.showMessageDialog(null, "<html>인증번호를 발송했습니다. <br>인증번호가 오지 않으면 입력하신 정보가 회원정보와 일치하는지 확인해주세요 <br></html> ","인증 번호 발송",JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null,
							"인증번호는 "+random2+" 입니다"	, "인증번호",
							JOptionPane.NO_OPTION);


				} else {
					JOptionPane.showMessageDialog(thisPanel, "핸드폰 번호 11자리 입력해주세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}

				
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(AuthenticationNo.getText().equals(random2)) {


					JOptionPane.showMessageDialog(null, "인증되었습니다", "인증확인", JOptionPane.NO_OPTION);
					flag=true;
					}

				
				else {

					JOptionPane.showMessageDialog(null, "인증번호가 일지하지 않습니다. 다시 입력해주세요", "ERROR", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		
		
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				boolean result = loginController.getMyidForPassword(informationEmailTextField.getText());
				if(result&&flag==true) {
					ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new ResetPassword(mainFrame, informationEmailTextField.getText()));
				} else {
					JOptionPane.showMessageDialog(thisPanel, "등록된 아이디가 없습니다.", "경고", JOptionPane.ERROR_MESSAGE);
				}
				
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
