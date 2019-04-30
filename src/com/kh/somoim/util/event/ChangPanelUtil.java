package com.kh.somoim.util.event;

import javax.swing.JPanel;

import com.kh.somoim.view.club.clubMain.ClubMainPanel;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.mainFrame.MainFrame;
import com.kh.somoim.view.search.SearchPanel;

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

	public static void CHANGE_PANEL(ClubMainPanel clubmainPanel, JPanel oldPanel, JPanel newPanel, String Layout) {
		clubmainPanel.remove(oldPanel);
		clubmainPanel.add(newPanel, Layout);
		clubmainPanel.revalidate();
		clubmainPanel.repaint();
	}

	public static void CHANGE_PANEL(SearchPanel searchpanel, JPanel op, JPanel np) {
		searchpanel.remove(op);
		searchpanel.add(np);
		searchpanel.revalidate();
		searchpanel.repaint();

	
	
	}
	

	public static void CHANGE_PANEL(JPanel searchPanel, JPanel op, JPanel np, String search) {
		System.out.println("CHANGE_PANEL!!");
		searchPanel.remove(op);
		searchPanel.add(np,search);
		
		searchPanel.revalidate();
		searchPanel.repaint();

	
	
	}
	
	
	
	
}





