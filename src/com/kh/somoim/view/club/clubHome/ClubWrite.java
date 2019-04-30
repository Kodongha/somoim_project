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
		
		// 글쓰기 취소, 등록 버튼 라벨   
		writeTopLabel = new JLabel();
		writeTopLabel.setSize(500, 50);
		writeTopLabel.setLocation(0, 0);
		writeTopLabel.setOpaque(true);
		writeTopLabel.setBackground(new Color(230, 230, 250));
		
		// 글쓰기 취소 로고   
		Image writeCancelIcon = new ImageIcon("images/cancel.PNG").getImage().getScaledInstance(15, 15, 0);
		JLabel cancelIconLabel = new JLabel(new ImageIcon(writeCancelIcon));
		cancelIconLabel.setBounds(10, 10, 30, 30);
		writeTopLabel.add(cancelIconLabel);
		
		// 글쓰기 등록 버튼
		Image writeIcon = new ImageIcon("images/writeRegistration.PNG").getImage().getScaledInstance(27, 27, 0);
		JLabel writeIconLabel = new JLabel(new ImageIcon(writeIcon));
		writeIconLabel.setBounds(460, 10, 30, 30);
		writeTopLabel.add(writeIconLabel);
		
		//사진 등록 버튼 
		Image photoFileIcon = new ImageIcon("images/photo.PNG").getImage().getScaledInstance(30, 30, 0);
		JButton button = new JButton(new ImageIcon(photoFileIcon));
		button.setBounds(420, 11, 30, 30);
		writeTopLabel.add(button);
		
		
		// 게시판 선택 
		String[] boardList = {"게시판 선택 ", "가입 인사  ", "자유게시판 ", "정모 후기 ", "정모 일정 "};
		
		JComboBox boardselect = new JComboBox(boardList);
		boardselect.setLocation(150, 10);
		boardselect.setSize(200, 35);
		writeTopLabel.add(boardselect);
		
		// 글 제목 
		writeTitle = new JTextArea();
		writeTitle.setBounds(60, 68, 500, 36);
		this.add(writeTitle);
		
		JLabel writeTitleLabel = new JLabel("제목 ");
		writeTitleLabel.setSize(50, 50);
		writeTitleLabel.setLocation(10, 52);
		this.add(writeTitleLabel);
		
		// 구역 나누기 
		JLabel jlabel = new JLabel();
		jlabel.setOpaque(true);
		jlabel.setBackground(new Color(216, 191, 216));
		jlabel.setLocation(0, 106);
		jlabel.setSize(500, 3);
		
		// 글 내용  
		writeArea = new JTextArea();
		writeArea.setBounds(60, 127, 500, 400);
		this.add(writeArea);
		
		JLabel writeAreaLabel = new JLabel("내용  ");
		writeAreaLabel.setSize(50, 50);
		writeAreaLabel.setLocation(10, 110);
		this.add(writeAreaLabel);
		
		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str= "사진 추가 어떻게 해야하나요 정말 모르겠습니다. 이 기능 필요한가요...";
				int result=	JOptionPane.showConfirmDialog(null, str, "정모 사진 추가 ", JOptionPane.YES_NO_OPTION);

			}
		});
		
		this.add(jlabel);
		this.add(writeTopLabel);
		
			
	}

}