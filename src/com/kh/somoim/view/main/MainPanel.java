package com.kh.somoim.view.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.kh.somoim.view.mainFrame.MainFrame;

public class MainPanel extends JPanel{

	TopPanel topPanel;
	CenterPanel centerPanel;
	BottomPanel bottomPanel;

	public MainPanel(MainFrame mainFrame) {
		// TODO Auto-generated constructor stub
		
		mainFrame.setTitle("aaa");
		this.setLayout(new BorderLayout());
		System.out.println("mainPanel in");
		
		// ������ �ֱ�!
		System.out.println("19038120938123091asdasd");
		
		// ���/�ߴ�/�ϴ� �г� ����
		topPanel = new TopPanel();
		centerPanel = new CenterPanel();
		bottomPanel = new BottomPanel(this);

		// ���,�߾�,�ϴ� �����ӿ� �߰�
		this.add(topPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(centerPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(bottomPanel, BorderLayout.SOUTH);	// �ϴ� �г�
		
	}

}
