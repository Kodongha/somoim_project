package com.kh.somoim.view.setting;


import javax.swing.JPanel;


public class ChangePanel {
	
	private SettingPanel op;
	
	private InfomationCorrect np;
	
	
	
public static void changePanel(JPanel op,JPanel np) {
		
		
		
		op.remove(op);
		op.add(np);
		op.repaint();
	
		
		
		
	}
}
