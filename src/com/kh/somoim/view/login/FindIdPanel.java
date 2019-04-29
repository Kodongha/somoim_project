package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class FindIdPanel extends JPanel {
	private JTextField textName;
	private JPanel thisPanel;

	public FindIdPanel(MainFrame mainFrame) {
		this.thisPanel = this;

		this.setLayout(null);
		
		this.setBackground(Color.WHITE);
		
		JLabel tf1 = new JLabel("<html>회원정보에 등록한 휴대전화 번호와 입력한 휴대전화 번호가 같아야, <br> 인증번호를 받을 수 있습니다. <br></html> ");
		tf1.setLocation(52, 120);
		tf1.setSize(400, 150);
		this.add(tf1);
		
		JLabel name = new JLabel("이름 : ");
		name.setLocation(50, 250);
		name.setSize(150, 50);
		this.add(name);
		
		textName = new JTextField(20);
		textName.setText("이름");
	
	    //textName.addMouseListener(new Event("tf", textName));

		textName.setLocation(140, 250);
		textName.setSize(200, 50);	
		this.add(textName);
		
		JLabel phoneNumber = new JLabel("휴대폰번호 : ");
		phoneNumber.setLocation(50, 300);
		phoneNumber.setSize(150, 50);
		this.add(phoneNumber);	
		
		JTextField textPhone = new JTextField(20);
		textPhone.setLocation(140, 355);
		textPhone.setSize(200, 50);
		this.add(textPhone);		
		
		JTextField AuthenticationNo = new JTextField(20);
		AuthenticationNo.setLocation(140, 420);
		AuthenticationNo.setSize(200, 50);
		this.add(AuthenticationNo);	
		
		String[] countryCode = {"+82", "+1", "+2", "010"}; 
	
		JComboBox countryCodeList = new JComboBox(countryCode);
		countryCodeList.setLocation(232, 314); //139, 314
		countryCodeList.setSize(80, 25);
		countryCodeList.setBackground(Color.WHITE);
		
		this.add(countryCodeList);
		
		String[] tongsinsa = {" ", "SK", "KT", "LG"}; 
		
		JComboBox tongsinsaList = new JComboBox(tongsinsa);
		tongsinsaList.setLocation(139, 314); //232, 314
		tongsinsaList.setSize(80, 25);
		tongsinsaList.setBackground(Color.WHITE);
		this.add(tongsinsaList);	
	
		JRadioButton email1 = new JRadioButton("회원정보에 등록한 휴대전화로 인증 ");
		email1.setLocation(42, 115);
		email1.setSize(300, 50);	
		email1.setBackground(Color.WHITE);
		
		JTextField phoneNober = new JTextField(12);
		phoneNober.setSize(70, 25);
		phoneNober.setLocation(325,315);
		this.add(phoneNober);
		
		/*JRadioButton email2 = new JRadioButton("본인확인 이메일로 인증 ");
		email2.setLocation(42, 530);
		email2.setSize(300, 50);
		email2.setBackground(Color.WHITE);*/
		
		ButtonGroup emailList = new ButtonGroup();
		emailList.add(email1);
		///emailList.add(email2);
		
		this.add(email1);
		//this.add(email2);
	
		JButton button1 = new JButton("인증 ");
		button1.setLocation(341, 354);
		button1.setSize(70, 50);
		button1.setBackground(Color.LIGHT_GRAY);
		this.add(button1);
		
		JButton button2 = new JButton("확인 ");
		button2.setLocation(341, 420);
		button2.setSize(70, 50);
		button2.setBackground(Color.LIGHT_GRAY);
		this.add(button2);
		
		FindIdTopPanel findIdTopPanel = new FindIdTopPanel();
		findIdTopPanel.setBounds(0, 0, 500, 35);
		this.add(findIdTopPanel);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new informationFindIdPanel(mainFrame) );
			}
		});
	}
}
