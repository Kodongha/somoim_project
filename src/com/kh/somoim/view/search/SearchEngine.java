package com.kh.somoim.view.search;
//�˻�â

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
		//�˻�â ������ ���� �� ����
		this.setLayout(null);
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
