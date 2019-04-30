package com.kh.somoim.view.search;
//伊事但

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
	public SearchEngine (MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel,
			SearchPanel searchPanel,wholePanel wholepanel, MemberVO memberVO) {
		//伊事但 紫戚綜 竺舛 貢 繕舛
		this.setLayout(null);
		this.setBackground(Color.pink);
		this.setLocation(100, 100); //是帖
		this.setSize(465,50); //滴奄
		//伊事戚耕走 持失  貢 紫戚綜 繕箭 
		Image icon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);//戚耕走 滴奄
		//伊事 戚耕走研 隔聖 虞婚  持失
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		//戚耕走虞婚紫戚綜繕舛 
		iconLabel.setLocation(6,5); // 戚耕走税 是帖 
		iconLabel.setSize(50,40);   //滴奄走舛 

		//伊事但 努什闘琶球 竺舛 
		JTextField searchText= new JTextField(40);
		//伊事但 努什闘琶球 紫戚綜 竺舛
		searchText.setLocation(70,5); //戚耕走是帖
		searchText.setSize(300,40); //滴奄走舛
		//伊事但 砺砧軒 蒸蕉奄
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
					System.out.println("亜写蟹推?");
					a=2;
				} 
				else if(a==2){
					stringSearchClubList2 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					System.out.println("域淑艦猿ばばばばばば");
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList, stringSearchClubList2);
					a=3;
				}
				else if(a==3) {
					stringSearchClubList3 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					System.out.println("域淑艦猿ばばばばばば");
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList2, stringSearchClubList3);
					a=2;
					stringSearchClubList=stringSearchClubList3;
					
				}
			
				
			
				

			}
			
			
		});
		
		
		
		
		searchText.addKeyListener(new KeyAdapter() {
			
			
			
			@Override
			public void keyTyped(KeyEvent  e) {
				
		//super.mouseClicked(e);

				

				if(a==1) {
					stringSearchClubList = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, wholepanel, stringSearchClubList);
					System.out.println("亜写蟹推?");
					a=2;
				} 
				else if(a==2){
					stringSearchClubList2 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					System.out.println("域淑艦猿ばばばばばば");
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList, stringSearchClubList2);
					a=3;
				}
				else if(a==3) {
					stringSearchClubList3 = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
					System.out.println("域淑艦猿ばばばばばば");
					ChangPanelUtil.CHANGE_PANEL(  searchPanel, stringSearchClubList2, stringSearchClubList3);
					a=2;
					stringSearchClubList=stringSearchClubList3;
					
				}
			
				
				
				
			}
			
			
		});
		
		
		
		
		
	}
}
