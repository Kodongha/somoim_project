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

	public FindIdPanel(MainFrame mainFrame) {
		LoginController loginController = new LoginController();
		
		
		this.thisPanel = this;

		this.setLayout(null);

		this.setBackground(Color.WHITE);

		JLabel tf1 = new JLabel("<html>ȸ�������� ����� �޴���ȭ ��ȣ�� �Է��� �޴���ȭ ��ȣ�� ���ƾ�, <br> ������ȣ�� ���� �� �ֽ��ϴ�. <br></html> ");
		tf1.setLocation(52, 120);
		tf1.setSize(400, 150);
		this.add(tf1);

		JLabel name = new JLabel("�̸� : ");
		name.setLocation(50, 250);
		name.setSize(150, 40);
		this.add(name);

		textName = new JTextField(20);

		textName.setLocation(140, 250);
		textName.setSize(270, 40);	
		this.add(textName);

		JLabel phoneNumber = new JLabel("�޴�����ȣ : ");
		phoneNumber.setLocation(50, 300);
		phoneNumber.setSize(150, 40);
		this.add(phoneNumber);	

		JTextField textPhone = new JTextField(20);
		textPhone.setLocation(140, 380);
		textPhone.setSize(200, 40);
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

		JTextField phoneNober = new JTextField(20);
		phoneNober.setSize(180, 40);
		phoneNober.setLocation(230,315);
		this.add(phoneNober);


		JButton button1 = new JButton("���� ");
		button1.setLocation(341, 380);
		button1.setSize(70, 40);
		button1.setBackground(Color.LIGHT_GRAY);
		this.add(button1);

		JButton button2 = new JButton("Ȯ�� ");
		button2.setLocation(341, 430);
		button2.setSize(70, 40);
		button2.setBackground(Color.LIGHT_GRAY);
		this.add(button2);
		
		JLabel FindIdLabel = new JLabel(" < ���̵� ã��");
		FindIdLabel.setForeground(Color.WHITE); //�� �۾�������
		FindIdLabel.setFont(FindIdLabel  //�� �۾� ũ�� ����
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
				super.mouseClicked(e);
				if(e.getSource() == button1) {
					JOptionPane.showMessageDialog(null, "<html>������ȣ�� �߼��߽��ϴ�. <br>������ȣ�� ���� ������ �Է��Ͻ� ������ ȸ�������� ��ġ�ϴ��� Ȯ�����ּ��� <br></html> ","�� ������ �޼���",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String myId = loginController.getMyId(textName.getText(), phoneNober.getText());
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new informationFindIdPanel(mainFrame, myId));
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









