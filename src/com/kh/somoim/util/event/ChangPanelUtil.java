package com.kh.somoim.util.event;

import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;

public class ChangPanelUtil {
	
	private MainFrame mainFrame;
	private JPanel oldPanel;
	
	public ChangPanelUtil(MainFrame mainFrame, JPanel oldPanel) {
		super();
		this.mainFrame = mainFrame;
		this.oldPanel = oldPanel;
	}

	// change Panel ¿€º∫
	public static void CHANGE_PANEL(MainFrame mainFrame, JPanel oldPanel, JPanel newPanel) {
		mainFrame.remove(oldPanel);
		mainFrame.add(newPanel);
		mainFrame.repaint();
		mainFrame.setVisible(true);
	}
	
}
