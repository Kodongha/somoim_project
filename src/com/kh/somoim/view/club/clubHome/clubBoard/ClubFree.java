package com.kh.somoim.view.club.clubHome.clubBoard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;

public class ClubFree extends JPanel {

	JLabel noticeLabel;
	JLabel noticetitleLabel;
	JLabel freeLabel;
	JLabel freecontentsLabel;
	JLabel freetitleLabel;

	JPanel listPanel;
	JPanel clubPhotoPanel;
	JPanel clubSchedulePanel;
	JPanel clubFreePanel;
	private JPanel thisPanel;

	public ClubFree(ClubMainPanel clubmainPanel) {
		this.thisPanel = this;
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);

		// �Խ��� ���� �г�
		listPanel = new JPanel();
		listPanel.setLocation(0,0);
		listPanel.setPreferredSize(new Dimension(500, 40));
		listPanel.setBackground(Color.white);
		listPanel.setLayout(null);
		this.add(listPanel, BorderLayout.NORTH);

		// �Խ��� ���� 
		String[] boardList = {"�����Խ���", "���� �ı�", "���� ����"};

		JComboBox boardListBox = new JComboBox(boardList);
		boardListBox.setBounds(0, 0, 495, 40);
		boardListBox.setBackground(Color.white);

		listPanel.add(boardListBox);

		//�Խ��� ��ü �г�
		clubFreePanel = new JPanel();
		clubFreePanel.setBounds(0, 40, 500, 650);
		clubFreePanel.setBackground(Color.white);
		clubFreePanel.setLayout(null);
		this.add(clubFreePanel, BorderLayout.CENTER);

		// �������� ��
		noticeLabel = new JLabel();

		noticeLabel.setOpaque(true);
		noticeLabel.setBounds(0, 0, 500, 80);
		noticeLabel.setBackground(Color.white);

		// �������� �ΰ�
		Image noticeIcon = new ImageIcon("images/noticeicon.PNG").getImage().getScaledInstance(50, 50, 0);
		JLabel iconLabel = new JLabel(new ImageIcon(noticeIcon));
		iconLabel.setBounds(5, 20, 40, 40);
		noticeLabel.add(iconLabel);

		// �������� ���� ��
		noticetitleLabel = new JLabel("�� �� �� �� ��  ");
		noticetitleLabel.setFont(noticetitleLabel.getFont().deriveFont(20.0f));
		noticetitleLabel.setSize(450, 50);
		noticetitleLabel.setLocation(50, 15);
		noticetitleLabel.setOpaque(true);
		noticetitleLabel.setBackground(Color.white);

		noticeLabel.add(noticetitleLabel);	

		// �����Խñ� ��� ��
		freeLabel = new JLabel();
		freeLabel.setBounds(0, 80, 500, 60);
		freeLabel.setOpaque(true);
		freeLabel.setBackground(Color.white);

		LineBorder hiBorder = new LineBorder(Color.black);
		freeLabel.setBorder(hiBorder);

		// �����Խ��� �� ���� ��
		Image freeIcon = new ImageIcon("images/hi_test.PNG").getImage().getScaledInstance(80, 100, 0);
		JLabel freeIconLabel = new JLabel(new ImageIcon(freeIcon));
		freeIconLabel.setBounds(0, 0, 60, 60);
		freeLabel.add(freeIconLabel);

		LineBorder freeIconBorder = new LineBorder(Color.black);
		freeIconLabel.setBorder(freeIconBorder);


		// �����Խ��� ����  ��
		freetitleLabel = new JLabel("�ȳ��ϼ� ");
		freetitleLabel.setFont(freetitleLabel.getFont().deriveFont(17.0f));
		freetitleLabel.setSize(100, 15);
		freetitleLabel.setLocation(68, 10);
		freetitleLabel.setOpaque(true);
		freetitleLabel.setBackground(Color.white);

		freeLabel.add(freetitleLabel);

		// �����Խ��� ���� ��
		freecontentsLabel = new JLabel("���� �����߾�� ");
		freecontentsLabel.setFont(freecontentsLabel.getFont().deriveFont(13.0f));
		freecontentsLabel.setSize(200,15);
		freecontentsLabel.setLocation(70, 35);
		freecontentsLabel.setOpaque(true);
		freecontentsLabel.setBackground(Color.white);

		freeLabel.add(freecontentsLabel);	

		clubFreePanel.add(noticeLabel);
		clubFreePanel.add(freeLabel);	

		ClubPhoto clubPhotoPanel = new ClubPhoto();
		clubPhotoPanel.setPreferredSize(new Dimension(500, 600));

		ClubSchedule clubSchedulePanel = new ClubSchedule();
		clubSchedulePanel.setPreferredSize(new Dimension(500, 600));


		boardListBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox bb = (JComboBox) e.getSource();
				String boardName = (String) bb.getSelectedItem();

				if(boardName.equals("���� �ı�")) {
					
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubFreePanel, clubPhotoPanel, BorderLayout.CENTER);
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubSchedulePanel, clubPhotoPanel, BorderLayout.CENTER);
					
				}else if(boardName.equals("���� ����")) {
					
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubFreePanel, clubSchedulePanel, BorderLayout.CENTER);
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubPhotoPanel, clubSchedulePanel, BorderLayout.CENTER);

				}else if(boardName.equals("�����Խ���")) {
					
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubSchedulePanel, clubFreePanel, BorderLayout.CENTER);
					ChangPanelUtil.CHANGE_PANEL2(thisPanel, clubPhotoPanel, clubFreePanel, BorderLayout.CENTER);
					
				}
			}

		});

	}
}
