package com.kh.somoim.util.event;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class HoemPanelKeyEventUtil implements MouseListener{

	private JLabel[] clubDetailLabel;
	private int i;
	private MainPanel mainPanel;
	private MainFrame mainFrame;
	private ClubVO clubVO;
	private MemberVO memberVO;
	
	public HoemPanelKeyEventUtil(MainFrame mainFrame, MainPanel mainPanel, JLabel[] clubDetailLabel, int i, ClubVO clubVO, MemberVO memberVO) {

		// TODO Auto-generated constructor stub
		this.mainFrame = mainFrame;
		this.mainPanel = mainPanel;
		this.clubDetailLabel = clubDetailLabel; 
		this.i = i;
		this.clubVO = clubVO;
		this.memberVO = memberVO;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel, new ClubMainPanel(mainFrame, clubVO, memberVO));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		clubDetailLabel[i].setBackground(new Color(234,234,234));
		clubDetailLabel[i].setOpaque(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		clubDetailLabel[i].setBackground(Color.white);
		clubDetailLabel[i].setOpaque(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		clubDetailLabel[i].setBackground(new Color(189,189,189));
		clubDetailLabel[i].setOpaque(true);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		clubDetailLabel[i].setBackground(new Color(234,234,234));
		clubDetailLabel[i].setOpaque(true);
	}

}
