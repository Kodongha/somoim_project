package com.kh.somoim.util.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.kh.somoim.view.club.clubMain.ClubCenterPanel;

public class ClubCenterPanelChangeEventUtil implements MouseListener{
	ClubCenterPanel clubcenterPanel;
	String flag;
	
	public ClubCenterPanelChangeEventUtil(ClubCenterPanel clubCenterPanel, String flag) {
		this.clubcenterPanel = clubCenterPanel;
		this.flag = flag;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(flag.equals("info")) {
			System.out.println("info in !!!!!");
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
