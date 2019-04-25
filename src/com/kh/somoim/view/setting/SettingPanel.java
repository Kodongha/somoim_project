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

public class SettingPanel extends JPanel {
	public SettingPanel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(3, 1));

		this.setBackground(Color.WHITE);

		JPanel info = new JPanel();
		info.setBounds(100,80,300,200);
		info.setBackground(Color.white);

		info.setLayout(new GridLayout(1,2));

		Image profilepic = new ImageIcon("images/프로필이미지.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel profile = new JLabel(new ImageIcon(profilepic));


		JLabel labelgroup= new JLabel();


		String inputname= "차은우";
		String inputemail= "dmsdn@gmail.com";
		String inputbirth= "1992.05.06";
		String inputphone= "010-1234-5678";


		labelgroup.setLayout(new GridLayout(4, 1));
		JLabel name= new JLabel("   이름:  "+inputname);

		JLabel email= new JLabel("   이메일:  "+inputemail);

		JLabel birth= new JLabel("   생년월일:  "+inputbirth);

		JLabel phone= new JLabel("   휴대폰 번호:  "+inputphone);


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


				String result = JOptionPane.showInputDialog(null, inputemail +  "\n비밀번호 입력", "개인정보 수정",JOptionPane.INFORMATION_MESSAGE);


				if(result.equals("abc")) {

						
					new ChangePanel();
					
					
					

				}


			}
		});



		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				String warning= "탈퇴 후에는 "+inputemail+"로 다시 가입할 수 없으며\n 이메일과 데이터는 복구할 수 없습니다.";

				JOptionPane.showConfirmDialog(null, warning,"경고", JOptionPane.INFORMATION_MESSAGE);


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
