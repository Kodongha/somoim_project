package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResetPasswordTopPanel extends JPanel {
	
	public ResetPasswordTopPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(500, 60)); //��� �г�����
		
		/*JLabel ResetPasswordTopLabel = new JLabel(" < ��й�ȣ ã��");
		ResetPasswordTopLabel.setForeground(Color.WHITE); //�� �۾�������
		ResetPasswordTopLabel.setFont(ResetPasswordTopLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		ResetPasswordTopLabel.setLocation(10, 6);
		ResetPasswordTopLabel.setSize(200, 20);
		this.add(ResetPasswordTopLabel);	*/
	}
}
