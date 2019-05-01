package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SignupPageTopPanel extends JPanel {
	private JPanel thisPanel;
	//private JPanel LoginPanel;
	
	
	public SignupPageTopPanel(MainFrame mainFrame) {
		this.thisPanel = this;
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		JLabel createLabel = new JLabel(" < ���� �����");
		createLabel.setForeground(Color.WHITE); //�� �۾�������
		createLabel.setFont(createLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		createLabel.setLocation(10, 6);
		
		createLabel.setSize(100, 20);
		this.add(createLabel);
		
		/*createLabel.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				
			}
		});*/
		
	}
}
