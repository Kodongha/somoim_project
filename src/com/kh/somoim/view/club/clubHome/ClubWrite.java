package com.kh.somoim.view.club.clubHome;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.club.model.vo.BoardVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class ClubWrite extends JPanel {

	JLabel writeTopLabel;
	JButton writeRegistration;
	JTextField writeTitle;
	JTextArea writeArea;
	JButton button;
	JPanel thisPanel;

	public ClubWrite(MainFrame mainFrame, ClubMainPanel clubmainPanel, MainPanel mainPanel, ClubVO clubVO, MemberVO memberVO) {
		this.thisPanel = this;
		ClubController clubController = new ClubController();

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
		String[] boardList = {"�Խ��� ����", "���� �λ�", "�����Խ���"};

		JComboBox boardselect = new JComboBox(boardList);
		boardselect.setLocation(150, 10);
		boardselect.setSize(200, 35);
		writeTopLabel.add(boardselect);

		// �� ���� 
		writeTitle = new JTextField();
		writeTitle.setBounds(60, 60, 500, 36);
		writeTitle.setBorder(new LineBorder(Color.white));
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

		
		//��ũ��
		
		JScrollPane scrollPane = new JScrollPane(writeArea);
		scrollPane.setBounds(0, 150, 495, 500);
		scrollPane.setBorder(null);
		this.add(scrollPane);
		


		JLabel writeAreaLabel = new JLabel("����  ");
		writeAreaLabel.setSize(50, 50);
		writeAreaLabel.setLocation(10, 110);


		this.add(writeAreaLabel);

		this.add(jlabel);
		this.add(writeTopLabel);

		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str= "���� �߰� ��� �ؾ��ϳ��� ���� �𸣰ڽ��ϴ�. �� ��� �ʿ��Ѱ���...(�׳� ���� ������..)";
				JOptionPane.showMessageDialog(null, str,"���",JOptionPane.PLAIN_MESSAGE);

			}
		});

		cancelIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				writeTitle.setText("");
				writeArea.setText("");
			}
			
		});
		
		writeIconLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);

				if(boardselect.getSelectedItem().equals("�Խ��� ����")) {
					JOptionPane.showMessageDialog(thisPanel, "�Խ����� �������ּ���.", "���", JOptionPane.ERROR_MESSAGE);

				} else {

					BoardVO boardVO = new BoardVO();
					boardVO.setClubNumber(clubVO.getClubNumber());
					boardVO.setTitle(writeTitle.getText());
					// �ٹٲ��� �����ڸ� �ּ� �� �ٷ� ����
					String contents = writeArea.getText().replace("\n", "�Ӣ�");
					boardVO.setContent(contents);
					boardVO.setWriter(memberVO.getUserNumber());
					boardVO.setWriteDay(new Date());
					boardVO.setBoardSelect(boardselect.getSelectedItem().toString());
					boardVO.setImagePath("");

					clubController.insertBoard(boardVO);

					writeTitle.setText("");
					writeArea.setText("");
					JOptionPane.showMessageDialog(thisPanel, "�Խñ��� ��ϵǾ����ϴ�.", "", JOptionPane.PLAIN_MESSAGE);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, clubmainPanel, new ClubMainPanel(mainFrame, mainPanel, clubVO, memberVO));
				}
			}
		});
	}
}



