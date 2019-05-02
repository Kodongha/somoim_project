package com.kh.somoim.view.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ResetPassword extends JPanel {

	private JPanel thisPanel;

	public ResetPassword(MainFrame mainFrame) {
		this.thisPanel = this;

		this.setLayout(null);
		this.setBackground(Color.WHITE);

		JLabel newPasswordLabel  = new JLabel("���ο� ��й�ȣ�� �Է����ּ��� ");
		newPasswordLabel.setBounds(70, 20, 200, 100);

		JLabel passwordLanl = new JLabel("��й�ȣ");
		passwordLanl.setBounds(70, 80, 100, 100);

		JLabel checkPasswordLanl = new JLabel("��й�ȣ Ȯ��");
		checkPasswordLanl.setBounds(70, 150, 100, 100);

		JPasswordField passwordTextField = new JPasswordField(15);
		passwordTextField.setBounds(170, 105, 250, 45);

		JPasswordField resetPasswordTextField = new JPasswordField(15);
		resetPasswordTextField.setBounds(170, 175, 250, 45);

		JButton nextButton = new JButton("Ȯ��");
		nextButton.setBounds(137, 600, 230, 50);

		nextButton.setBackground(Color.orange);
		
		JLabel ResetPasswordTopLabel = new JLabel(" < ��й�ȣ ã��");
		ResetPasswordTopLabel.setForeground(Color.WHITE); //�� �۾�������
		ResetPasswordTopLabel.setFont(ResetPasswordTopLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		ResetPasswordTopLabel.setLocation(10, 6);
		ResetPasswordTopLabel.setSize(200, 20);
		this.add(ResetPasswordTopLabel);	

		ResetPasswordTopPanel resetPasswordTopPanel = new ResetPasswordTopPanel();
		resetPasswordTopPanel.setBounds(0, 0, 500, 35);

		this.add(newPasswordLabel);
		this.add(resetPasswordTextField);
		this.add(passwordTextField);

		this.add(checkPasswordLanl);
		this.add(passwordLanl);
		this.add(resetPasswordTopPanel);

		this.add(nextButton);

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				JOptionPane.showMessageDialog(null, "��й�ȣ�� ����Ǿ����ϴ�", "�� ������ �޼���", JOptionPane.PLAIN_MESSAGE);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
				
			}
		});
		
		ResetPasswordTopLabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new InformationFindPasswordPanel(mainFrame));
			
			}
		});
	}

}
