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
import javax.swing.JTextField;

import com.kh.somoim.login.controller.LoginController;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class FindIdPanel extends JPanel {
	private JTextField textName;
	private JPanel thisPanel;
	int random;
	String random2="";

	boolean flag;

	public FindIdPanel(MainFrame mainFrame) {
		LoginController loginController = new LoginController();
		for(int j=0;j<5;j++) {
			for (int i = 0; i < 5; i++) {
				random = (int) (Math.random() * 10);
			}
			random2 += String.valueOf(random);
		}
		
		this.thisPanel = this;

		this.setLayout(null);

		this.setBackground(Color.WHITE);

		JLabel tf1 = new JLabel("<html>회원정보에 등록한 휴대전화 번호와 입력한 휴대전화 번호가 같아야, <br> 인증번호를 받을 수 있습니다. <br></html> ");
		tf1.setLocation(52, 120);
		tf1.setSize(400, 150);
		this.add(tf1);

		JLabel name = new JLabel("이름 : ");
		name.setLocation(50, 250);
		name.setSize(150, 40);
		this.add(name);

		textName = new JTextField(20);

		textName.setLocation(140, 250);
		textName.setSize(270, 40);	
		this.add(textName);

		JLabel phoneNumber = new JLabel("휴대폰번호 : ");
		phoneNumber.setLocation(50, 300);
		phoneNumber.setSize(150, 40);
		this.add(phoneNumber);	

	JTextField textPhone = new JTextField(25);
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
		
		this.add(textPhone);		

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
		
		JLabel FindIdLabel = new JLabel(" < 아이디 찾기");
		FindIdLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		FindIdLabel.setFont(FindIdLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		FindIdLabel.setLocation(10, 6);
		
		FindIdLabel.setSize(100, 20);
		this.add(FindIdLabel);


		FindIdTopPanel findIdTopPanel = new FindIdTopPanel();
		findIdTopPanel.setBounds(0, 0, 500, 35);
		this.add(findIdTopPanel);
		
		
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
					String myId = loginController.getMyId(textName.getText(), textPhone.getText());
					ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new informationFindIdPanel(mainFrame, myId));
				}

				
				else {

					JOptionPane.showMessageDialog(null, "인증번호가 일지하지 않습니다. 다시 입력해주세요", "ERROR", JOptionPane.ERROR_MESSAGE);
       
				}
			}
		});
		
		FindIdLabel.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new InformationFindPanel(mainFrame));
			}
		});
		
	}
}









