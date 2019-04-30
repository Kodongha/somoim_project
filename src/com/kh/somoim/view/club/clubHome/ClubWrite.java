package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;

public class ClubWrite extends JPanel {
	
	JLabel writeTopLabel;
	JButton writeRegistration;
	JTextArea writeTitle;
	JTextArea writeArea;
	JButton button;
	
	
	public ClubWrite() {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		
		// �۾��� ���, ��� ��ư ��   
		writeTopLabel = new JLabel();
		writeTopLabel.setSize(500, 50);
		writeTopLabel.setLocation(0, 0);
		writeTopLabel.setOpaque(true);
		writeTopLabel.setBackground(new Color(230, 230, 250));
		
		// �۾��� ��� �ΰ�   
		Image writeCancelIcon = new ImageIcon("images/cancel.PNG").getImage().getScaledInstance(15, 15, 0);
		JLabel cancelIconLabel = new JLabel(new ImageIcon(writeCancelIcon));
		cancelIconLabel.setBounds(10, 10, 30, 30);
		writeTopLabel.add(cancelIconLabel);
		
		// �۾��� ��� ��ư
		Image writeIcon = new ImageIcon("images/writeRegistration.PNG").getImage().getScaledInstance(27, 27, 0);
		JLabel writeIconLabel = new JLabel(new ImageIcon(writeIcon));
		writeIconLabel.setBounds(460, 10, 30, 30);
		writeTopLabel.add(writeIconLabel);
		
		//���� ��� ��ư 
		Image photoFileIcon = new ImageIcon("images/photo.PNG").getImage().getScaledInstance(30, 30, 0);
		JButton button = new JButton(new ImageIcon(photoFileIcon));
		button.setBounds(420, 11, 30, 30);
		writeTopLabel.add(button);
		
		
		// �Խ��� ���� 
		String[] boardList = {"�Խ��� ���� ", "���� �λ�  ", "�����Խ��� ", "���� �ı� ", "���� ���� "};
		
		JComboBox boardselect = new JComboBox(boardList);
		boardselect.setLocation(150, 10);
		boardselect.setSize(200, 35);
		writeTopLabel.add(boardselect);
		
		// �� ���� 
		writeTitle = new JTextArea();
		writeTitle.setBounds(60, 68, 500, 36);
		this.add(writeTitle);
		
		JLabel writeTitleLabel = new JLabel("���� ");
		writeTitleLabel.setSize(50, 50);
		writeTitleLabel.setLocation(10, 52);
		this.add(writeTitleLabel);
		
		// ���� ������ 
		JLabel jlabel = new JLabel();
		jlabel.setOpaque(true);
		jlabel.setBackground(new Color(216, 191, 216));
		jlabel.setLocation(0, 106);
		jlabel.setSize(500, 3);
		
		// �� ����  
		writeArea = new JTextArea();
		writeArea.setBounds(60, 127, 500, 400);
		this.add(writeArea);
		
		JLabel writeAreaLabel = new JLabel("����  ");
		writeAreaLabel.setSize(50, 50);
		writeAreaLabel.setLocation(10, 110);
		this.add(writeAreaLabel);
		
		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str= "���� �߰� ��� �ؾ��ϳ��� ���� �𸣰ڽ��ϴ�. �� ��� �ʿ��Ѱ���...";
				int result=	JOptionPane.showConfirmDialog(null, str, "���� ���� �߰� ", JOptionPane.YES_NO_OPTION);

			}
		});
		
		this.add(jlabel);
		this.add(writeTopLabel);
		
			
	}

}