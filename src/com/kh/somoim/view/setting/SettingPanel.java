package com.kh.somoim.view.setting;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.setting.controller.SettingController;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SettingPanel extends JPanel {

	private JPanel thisPanel;


	public SettingPanel(MainFrame mainFrame, CenterPanel centerPanel, MainPanel mainPanel,MemberVO memberVO) {
		SettingController settingController = new SettingController();
		this.thisPanel = this;

		this.setLayout(new GridLayout(3, 1));

		this.setBackground(Color.WHITE);

		JPanel info = new JPanel();
		info.setBounds(100,80,300,200);
		info.setBackground(Color.white);

		info.setLayout(new GridLayout(1,2));

		Image profilepic = new ImageIcon(memberVO.getProfilePhotoPath()).getImage().getScaledInstance(160, 160, 0);
		JLabel profile = new JLabel(new ImageIcon(profilepic));

		JLabel labelgroup= new JLabel();

		labelgroup.setLayout(new GridLayout(4, 1));

		JLabel name= new JLabel("   이름:  "+ memberVO.getName());
		JLabel email= new JLabel("   이메일:  "+memberVO.getEmail());
		JLabel birth= new JLabel("   생년월일:  "+memberVO.getBirth());
		JLabel phone= new JLabel("   휴대폰 번호:  "+memberVO.getPhoneNumber());

		labelgroup.add(name);
		labelgroup.add(email);
		labelgroup.add(birth);
		labelgroup.add(phone);

		JPanel list = new JPanel();
		list.setLayout(new GridLayout(3, 1));
		list.setBackground(Color.WHITE);
		list.setBounds(100,80,400,400);

		JButton infocorrect= new JButton(" 개인 정보 수정");
		infocorrect.setBackground(Color.white);

		JButton notify= new JButton(" 공지사항");
		notify.setBackground(Color.white);
		JButton version= new JButton("버전                                                                                       1.1.0");
		version		.setBackground(Color.white);
		JPanel out= new JPanel();
		out.setBackground(Color.white);

		JButton button= new JButton("회원탈퇴");
		button.setBackground(Color.orange);

		out.add(button);

		button.setBounds(70, 100, 150, 150);

		infocorrect.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog(null, memberVO.getEmail() +  "\n비밀번호 입력", "개인정보 수정",JOptionPane.INFORMATION_MESSAGE);
				if(result != null && result.equals(memberVO.getPassword())) {
					centerPanel.getCardLayout().show(centerPanel.getInfomationCorrect().getParent(), "infomationCorrect");
				}  
			}
		});

		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String warning= "탈퇴 후에는 "+memberVO.getEmail()+"로 다시 가입할 수 없으며\n 이메일과 데이터는 복구할 수 없습니다.\n 정말로 탈퇴 하시겠습니까?";
				int result=	JOptionPane.showConfirmDialog(null, warning, "탈퇴할고얌?", JOptionPane.YES_NO_OPTION);

				if(result==JOptionPane.YES_OPTION) {
					settingController.removeMember(memberVO);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel,new LoginPanel(mainFrame) );
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



		JFrame window = new JFrame();
		JFileChooser fileChooser = new JFileChooser();
		//기본 Path의 경로 설정 (바탕화면)
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
		/*
		//필터링될 확장자
		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg 파일", "jpg");

		//필터링될 확장자 추가
		fileChooser.addChoosableFileFilter(filter);		
		 */


		profile.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if(e.getSource() == profile) {
					int result = fileChooser.showOpenDialog(window); 
					System.out.println(result); 
					if (result == JFileChooser.APPROVE_OPTION) { 
						//선택한 파일의 경로 반환 
						File selectedFile = fileChooser.getSelectedFile();
						String selectedFilePath = selectedFile.getPath();
						String[] extension = selectedFilePath.split("[.]");
						//선택한 파일의 경로 
						if(extension[1].toLowerCase().equals("png") 
							|| extension[1].toLowerCase().equals("gif")
							|| extension[1].toLowerCase().equals("jpg")) {
							settingController.setProfilePhoto(memberVO, selectedFilePath, extension[1]);
							JOptionPane.showMessageDialog(null, "프로필 변경이 완료되었습니다.","안내",JOptionPane.PLAIN_MESSAGE);
							
							MainPanel newMainPanel = new MainPanel(mainFrame, memberVO);
							ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel, newMainPanel);	 
							
							newMainPanel.getCenterPanel().getCardLayout().show(newMainPanel.getCenterPanel().getSettingPanel().getParent(), "setting");
							
						} else {
							JOptionPane.showMessageDialog(null, "png/gif/jpg 확장자만 선택하세요.","경고",JOptionPane.WARNING_MESSAGE);
						}

					}else {
						return;
					}
				} // end if
			} // end mouseClicked
		}); // end MouseAdapter
		
	}
}



