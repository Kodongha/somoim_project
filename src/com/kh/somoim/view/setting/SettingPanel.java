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

		Image profilepic = new ImageIcon("images/�������̹���.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel profile = new JLabel(new ImageIcon(profilepic));


		JLabel labelgroup= new JLabel();


		String inputname= "������";
		String inputemail= "dmsdn@gmail.com";
		String inputbirth= "1992.05.06";
		String inputphone= "010-1234-5678";


		labelgroup.setLayout(new GridLayout(4, 1));
		JLabel name= new JLabel("   �̸�:  "+inputname);

		JLabel email= new JLabel("   �̸���:  "+inputemail);

		JLabel birth= new JLabel("   �������:  "+inputbirth);

		JLabel phone= new JLabel("   �޴��� ��ȣ:  "+inputphone);


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


				String result = JOptionPane.showInputDialog(null, inputemail +  "\n��й�ȣ �Է�", "�������� ����",JOptionPane.INFORMATION_MESSAGE);


				if(result.equals("abc")) {

						
					new ChangePanel();
					
					
					

				}


			}
		});



		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				String warning= "Ż�� �Ŀ��� "+inputemail+"�� �ٽ� ������ �� ������\n �̸��ϰ� �����ʹ� ������ �� �����ϴ�.";

				JOptionPane.showConfirmDialog(null, warning,"���", JOptionPane.INFORMATION_MESSAGE);


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
