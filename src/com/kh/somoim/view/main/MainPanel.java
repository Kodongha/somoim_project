package com.kh.somoim.view.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.mainFrame.MainFrame;

public class MainPanel extends JPanel{

	TopPanel topPanel;
	CenterPanel centerPanel;
	BottomPanel bottomPanel;

	public MainPanel(MainFrame mainFrame, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		
		this.setLayout(new BorderLayout());
		System.out.println("mainPanel in");
		
		// 아이콘 넣기!
		System.out.println("aaa");
		
		// 상단/중단/하단 패널 생성
		topPanel = new TopPanel(mainFrame, memberVO);
		centerPanel = new CenterPanel(mainFrame, this, memberVO);
		bottomPanel = new BottomPanel(this);

		// 상단,중앙,하단 프레임에 추가
		this.add(topPanel, BorderLayout.NORTH);		// 상단 패널
		this.add(centerPanel, BorderLayout.CENTER);	// 중앙 패널
		this.add(bottomPanel, BorderLayout.SOUTH);	// 하단 패널
		
	}

}