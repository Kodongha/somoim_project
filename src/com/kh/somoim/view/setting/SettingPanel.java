package com.kh.somoim.view.setting;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.setting.controller.SettingController;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SettingPanel extends JPanel {

	private JPanel thisPanel;

	public SettingPanel(MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainpanel,MemberVO memberVO) {
		SettingController settingController = new SettingController();
		this.thisPanel = this;

		this.setLayout(new GridLayout(3, 1));

		this.setBackground(Color.WHITE);

		JPanel info = new JPanel();
		info.setBounds(100,80,300,200);
		info.setBackground(Color.white);

		info.setLayout(new GridLayout(1,2));

		Image profilepic = new ImageIcon("images/����profile.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel profile = new JLabel(new ImageIcon(profilepic));

		JLabel labelgroup= new JLabel();

		labelgroup.setLayout(new GridLayout(4, 1));

		JLabel name= new JLabel("   �̸�:  "+ memberVO.getName());
		JLabel email= new JLabel("   �̸���:  "+memberVO.getEmail());
		JLabel birth= new JLabel("   �������:  "+memberVO.getBirth());
		JLabel phone= new JLabel("   �޴��� ��ȣ:  "+memberVO.getPhoneNumber());

		labelgroup.add(name);
		labelgroup.add(email);
		labelgroup.add(birth);
		labelgroup.add(phone);

		JPanel list = new JPanel();
		list.setLayout(new GridLayout(3, 1));
		list.setBackground(Color.WHITE);
		list.setBounds(100,80,400,400);

		JButton infocorrect= new JButton(" ���� ���� ����");
		infocorrect.setBackground(Color.white);

		JButton notify= new JButton(" ��������");
		notify.setBackground(Color.white);
		JButton version= new JButton("����                                                                                       1.1.0");
		version		.setBackground(Color.white);
		JPanel out= new JPanel();
		out.setBackground(Color.white);

		JButton button= new JButton("ȸ��Ż��");
		button.setBackground(Color.orange);

		out.add(button);

		button.setBounds(70, 100, 150, 150);

		infocorrect.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog(null, memberVO.getEmail() +  "\n��й�ȣ �Է�", "�������� ����",JOptionPane.INFORMATION_MESSAGE);
				if(result.equals(memberVO.getPassword())) {
					centerPanel.getCardLayout().show(centerPanel.getInfomationCorrect().getParent(), "infomationCorrect");
				}
			}
		});

		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String warning= "Ż�� �Ŀ��� "+memberVO.getEmail()+"�� �ٽ� ������ �� ������\n �̸��ϰ� �����ʹ� ������ �� �����ϴ�.\n ������ Ż�� �Ͻðڽ��ϱ�?";
				int result=	JOptionPane.showConfirmDialog(null, warning, "Ż���Ұ��?", JOptionPane.YES_NO_OPTION);

				if(result==JOptionPane.YES_OPTION) {
					settingController.removeMember(memberVO);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, mainpanel,new LoginPanel(mainFrame) );
				}
			}
		});

		list.add(infocorrect);
		list.add(notify);
		list.add(version);

		info.add(profile);
		info.add(labelgroup);

		this.add(info);
		this.add(list);
		this.add(out);
	}





}