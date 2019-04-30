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

	public SearchEngine (MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel,
			SearchPanel searchPanel,wholePanel wholepanel, MemberVO memberVO) {
		//�˻�â ������ ���� �� ����
		this.setLayout(null);
		this.setBackground(Color.pink);
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
				System.out.println("click!!");
				
				StringSearchClubList stringSearchClubList = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
			System.out.println("�輼��?");
				ChangPanelUtil.CHANGE_PANEL(  searchPanel, wholepanel, stringSearchClubList);
			}
		});
		
		
		iconLabel.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				super.keyReleased(e);

System.out.println("click!!");
				
				StringSearchClubList stringSearchClubList = new StringSearchClubList(mainFrame, mainpanel, centerPanel, searchPanel, searchText.getText(), memberVO);
			System.out.println("�輼��?");
				ChangPanelUtil.CHANGE_PANEL(  searchPanel, wholepanel, stringSearchClubList);
			}
			
			
			
			
		});
		
	}
}
