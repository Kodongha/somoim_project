package com.kh.somoim.view.search;
//�˻�â

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
		
		//�˻�â ������ ���� �� ����
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setLocation(100, 100); //��ġ
		this.setSize(465,50); //ũ��
		//�˻��̹��� ����  �� ������ ���� 
		Image icon = new ImageIcon("images/Search.PNG").getImage().getScaledInstance(50, 50, 0);//�̹��� ũ��
		//�˻� �̹����� ���� ��  ����
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		//�̹����󺧻��������� 
		iconLabel.setLocation(6,5); // �̹����� ��ġ 
		iconLabel.setSize(50,40);   //ũ������ 

		//�˻�â �ؽ�Ʈ�ʵ� ���� 
		JTextField searchText= new JTextField(40);
		//�˻�â �ؽ�Ʈ�ʵ� ������ ����
		searchText.setLocation(70,5); //�̹�����ġ
		searchText.setSize(300,40); //ũ������
		//�˻�â �׵θ� ���ֱ�
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
