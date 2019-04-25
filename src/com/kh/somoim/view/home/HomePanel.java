package com.kh.somoim.view.home;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.home.controller.HomeController;
import com.kh.somoim.login.model.vo.MemberVO;

public class HomePanel extends JPanel {
	
	
	public HomePanel(MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		HomeController homeController = new HomeController();
		homeController.getMyClubList(memberVO);
		this.setBackground(Color.gray);
		this.add(new JLabel("Hoem!!"), "1");
		
		
		
		
	}
	
	
}
