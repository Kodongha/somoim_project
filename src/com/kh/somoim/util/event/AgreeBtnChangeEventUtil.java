package com.kh.somoim.util.event;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.signup.UserAuthentication;

public class AgreeBtnChangeEventUtil implements MouseListener{
	
	private String mode;
	private JButton button;
	private MainFrame mainFrame;
	private JPanel oldPanel;
	
	public AgreeBtnChangeEventUtil(String mode, JButton button) {
		this.mode = mode;
		this.button = button;
	}

	public AgreeBtnChangeEventUtil(String mode, JButton button, MainFrame mainFrame, JPanel oldPanel) {
		super();
		this.mode = mode;
		this.button = button;
		this.mainFrame = mainFrame;
		this.oldPanel = oldPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(mode.equals("agreeButton")) {
			ChangPanelUtil.CHANGE_PANEL(mainFrame, oldPanel, new UserAuthentication(mainFrame));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(mode.equals("agreeButton")) {
			button.setBackground(Color.orange);
			JButton agreeButton = (JButton) e.getSource();
		} 
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(mode.equals("agreeButton")) {
			button.setBackground(Color.gray);
			JButton agreeButton = (JButton) e.getSource();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
