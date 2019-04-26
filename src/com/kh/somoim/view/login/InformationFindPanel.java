package com.kh.somoim.view.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;



public class InformationFindPanel extends JPanel {
	
	public InformationFindPanel(MainFrame mainFrame ) {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		
		
		/*JLabel informationFind = new JLabel("< ���� ã��");
		informationFind.setBounds(180, 30, 100,25);*/
		
		JLabel idImage = new JLabel(new ImageIcon(new ImageIcon("images/id.PNG").getImage().getScaledInstance(75, 60, 0)));
		idImage.setBounds(100, 440, 100, 200);
		
	
		JLabel passwordImage = new JLabel(new ImageIcon(new ImageIcon("images/password.PNG").getImage().getScaledInstance(75, 60, 0)));
		passwordImage.setBounds(100, 540, 100, 200);
		
		
		
		JButton idInformationFindPanelButton = new JButton();
		idInformationFindPanelButton.setBounds(92, 500, 500, 200); //���̵� ��ư
		idInformationFindPanelButton.setSize(310, 80);
		//idInformationFindPanelButton.setLocation(p);
		idInformationFindPanelButton.setContentAreaFilled(false);
		

		JButton passwordInformationFindPanelButton = new JButton();       //��й�ȣ ��ư
		passwordInformationFindPanelButton.setBounds(92, 600, 500, 200);
		passwordInformationFindPanelButton.setSize(310, 80);
		passwordInformationFindPanelButton.setContentAreaFilled(false);
		
		JLabel idInformationFindPanelLabel = new JLabel("���̵� ã��"); //�� ���� ��Ʈ ũ�� ����
		idInformationFindPanelLabel.setFont(idInformationFindPanelLabel
											.getFont().deriveFont(20.0f));
		idInformationFindPanelLabel.setBounds(205, 440, 500, 200);
		
		
		JLabel passwordInformationFindPanelLabel = new JLabel("��й�ȣ ã��"); //�� ���� ��Ʈ ũ�� ����
		passwordInformationFindPanelLabel.setFont(passwordInformationFindPanelLabel
											.getFont().deriveFont(20.0f));
		passwordInformationFindPanelLabel.setBounds(205, 540, 500, 200);
		
		
		this.add(idInformationFindPanelLabel);
		this.add(passwordInformationFindPanelLabel);
		
		this.add(idInformationFindPanelButton);
		this.add(passwordInformationFindPanelButton);
		
		this.add(idImage);
		this.add(passwordImage);
		
		
		InformationFindTopPanel  informationFindTopPanel = new InformationFindTopPanel();
		informationFindTopPanel.setBounds(0, 0, 500, 35);
		//informationFindTopPanel.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		this.add(informationFindTopPanel);
		
		
		

	}

}
