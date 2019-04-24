package com.kh.somoim.util.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.kh.somoim.view.main.CenterPanel;

public class CenterPanelChangeEventUtil implements MouseListener{

	private CenterPanel centerPanel;
	private String flag;
	
	public CenterPanelChangeEventUtil(CenterPanel centerPanel, String flag) {
		// TODO Auto-generated constructor stub
		this.centerPanel = centerPanel;
		this.flag = flag;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(flag.equals("homeLabel")) {
			System.out.println("homeLabel in!!!");
			centerPanel.getCardLayout().show(centerPanel.getHomePanel().getParent(), "home");
		} else if(flag.equals("recommendLabel")) {
			System.out.println("recommendLabel in!!!");
			centerPanel.getCardLayout().show(centerPanel.getRecommendPanel().getParent(), "recommend");
		} else if(flag.equals("searchLabel")) {
			System.out.println("searchLabel in!!!");
			centerPanel.getCardLayout().show(centerPanel.getSearchPanel().getParent(), "search");
		} else if(flag.equals("settingLabel")) {
			System.out.println("settingLabel in!!!");
			centerPanel.getCardLayout().show(centerPanel.getSettingPanel().getParent(), "setting");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

// =======================================================================================
	
}
