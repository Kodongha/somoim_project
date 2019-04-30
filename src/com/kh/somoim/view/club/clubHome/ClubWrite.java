package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class ClubWrite extends JPanel {
	
	JLabel writeTopLabel;
	JButton writeRegistration;
	JTextArea writeTitle;
	JTextArea writeArea;
	
	
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
		writeIconLabel.setBounds(450, 10, 30, 30);
		writeTopLabel.add(writeIconLabel);
		
		
		// �Խ��� ���� 
		String[] boardList = {"�Խ��� ���� ", "���� �λ�  ", "�����Խ��� ", "���� �ı� ", "���� ���� "};
		
		JComboBox boardselect = new JComboBox(boardList);
		boardselect.setLocation(0, 45);
		boardselect.setSize(500, 35);
		this.add(boardselect);
		
		
		// �� ���� 
		writeTitle = new JTextArea("����  ");
		writeTitle.setBounds(10, 95, 500, 36);
		this.add(writeTitle);
		
		// ���� ������ 
		JLabel jlabel = new JLabel("");
		jlabel.setOpaque(true);
		jlabel.setBackground(new Color(216, 191, 216));
		jlabel.setLocation(0, 132);
		jlabel.setSize(500, 4);
		
		// �� ����  
		writeArea = new JTextArea();
		writeArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(writeArea);
		scrollPane.setLocation(10, 138);
		scrollPane.setSize(500, 500);
		this.add(scrollPane);

	
		
		this.add(jlabel);
		this.add(writeTopLabel);
		
		
	}

}