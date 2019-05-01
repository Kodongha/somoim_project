package com.kh.somoim.view.search;
//검색창

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;


public class SearchEngine extends JPanel {

	int a=1;
	StringSearchClubList stringSearchClubList;
	StringSearchClubList stringSearchClubList2;
	StringSearchClubList stringSearchClubList3;
	public SearchEngine (MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel, SearchPanel searchPanel,wholePanel wholepanel, MemberVO memberVO) {
		
		//검색창 사이즈 설정 및 조정
		this.setLayout(null);
		this.setBackground(Color.white);
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

		this.add(iconLabel);
		this.add(searchText);

		iconLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);

				if(a==1) {
					stringSearchClubList = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, wholepanel, stringSearchClubList);
					a=2;
				} 
				else if(a==2){
					stringSearchClubList2 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList, stringSearchClubList2);
					a=3;
				}
				else if(a==3) {
					stringSearchClubList3 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList2, stringSearchClubList3);
					a=2;
					stringSearchClubList=stringSearchClubList3;
				}

			}
		});
		searchText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent  e) {
				if(a==1) {
					stringSearchClubList = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, wholepanel, stringSearchClubList);
					a=2;
				} 
				else if(a==2){
					stringSearchClubList2 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList, stringSearchClubList2);
					a=3;
				}
				else if(a==3) {
					stringSearchClubList3 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList2, stringSearchClubList3);
					a=2;
					stringSearchClubList=stringSearchClubList3;
				}
			}
		});
	}
}
