package com.kh.somoim.view.search;
//검색창

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;


public class SearchEngine extends JLabel {
	public SearchEngine (MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel,SearchPanel searchPanel, MemberVO memberVO) {
		//검색창 사이즈 설정 및 조정
		this.setLayout(null);
		this.setLocation(100, 100); //위치
		this.setSize(465,50); //크기
		//검색이미지 생성  및 사이즈 조절 
		Image icon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);//이미지 크기
		//검색 이미지를 넣을 라벨  생성
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		//이미지라벨사이즈조정 
		iconLabel.setLocation(6,5); // 이미지의 위치 
		iconLabel.setSize(50,40);   //크기지정 
		
		//검색창 텍스트필드 설정 
		JTextField searchText= new JTextField(40);
		//검색창 텍스트필드 사이즈 설정
		searchText.setLocation(70,5); //이미지위치
		searchText.setSize(300,40); //크기지정
		//검색창 테두리 없애기
		searchText.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			
		
		
		iconLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
			StringSearchClubList st= new StringSearchClubList(mainFrame, mainpanel, centerPanel,searchPanel, searchText.getText(), memberVO);
			
			
				ChangPanelUtil.CHANGE_PANEL(mainFrame, searchPanel, st);
				
				
			}
		});

		this.add(iconLabel);
		this.add(searchText);


	}
}
