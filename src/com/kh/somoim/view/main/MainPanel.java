package com.kh.somoim.view.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.mainFrame.MainFrame;

public class MainPanel extends JPanel{

	private TopPanel topPanel;
	private CenterPanel centerPanel;
	private BottomPanel bottomPanel;

	
	
	public MainPanel(MainFrame mainFrame, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());
		System.out.println("mainPanel in");
		
		// ������ �ֱ�!
	
		// ���/�ߴ�/�ϴ� �г� ����
		centerPanel = new CenterPanel(mainFrame, this,memberVO);
		bottomPanel = new BottomPanel(this);
		topPanel = new TopPanel(mainFrame, this, memberVO);

		// ���,�߾�,�ϴ� �����ӿ� �߰�
		this.add(topPanel, BorderLayout.NORTH);		// ��� �г�
		this.add(centerPanel, BorderLayout.CENTER);	// �߾� �г�
		this.add(bottomPanel, BorderLayout.SOUTH);	// �ϴ� �г�
		
	}

	public TopPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(TopPanel topPanel) {
		this.topPanel = topPanel;
	}

	public CenterPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(CenterPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public BottomPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(BottomPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}
	
}