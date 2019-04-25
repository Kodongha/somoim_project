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
		
		// ������ �ֱ�!
		System.out.println("aaa");
		
		// ���/�ߴ�/�ϴ� �г� ����
		topPanel = new TopPanel(mainFrame, memberVO);
		centerPanel = new CenterPanel(mainFrame, this, memberVO);
		bottomPanel = new BottomPanel(this);

		// ���,�߾�,�ϴ� �����ӿ� �߰�
		this.add(topPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(centerPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(bottomPanel, BorderLayout.SOUTH);	// �ϴ� �г�
		
	}

}