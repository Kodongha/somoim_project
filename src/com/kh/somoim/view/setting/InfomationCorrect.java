package com.kh.somoim.view.setting;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.setting.controller.SettingController;
import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class InfomationCorrect extends JPanel {

	private MainPanel mainpanel;
	private MainFrame mainframe;
	private CenterPanel centerPanel;
	private String passwordStr="";
	private String passwordStr2="";
	public InfomationCorrect(CenterPanel centerPanel, MemberVO memberVO) {
		this.centerPanel = centerPanel;
		SettingController settingController = new SettingController();

		this.setLayout(null);
		this.setBackground(Color.WHITE);
		JPanel result2= new JPanel();
		result2.setBounds(10,20,460,680);

		JPanel result = new JPanel();
		result.setLayout(new GridLayout(8, 2));
		result.setBounds(50,100,350,400);
		result.setBackground(Color.WHITE);

		JLabel email =new JLabel();
		email.setLocation(10,50);
		email.setSize(200,100);

		result.add(new JLabel("                �̸���: "));

		JTextField text = new JTextField(15);

		text.setText(memberVO.getEmail());

		result.add(text);

		JLabel password =new JLabel();
		password.setLocation(10,80);
		password.setSize(100,100);
		result.add(new JLabel("                ��й�ȣ ����:"));

		JPasswordField text2 = new JPasswordField(15);

		result.add(text2);

		JLabel passwordcheck =new JLabel();
		passwordcheck.setLocation(10,80);
		passwordcheck.setSize(100,100);
		result.add(new JLabel("                ��й�ȣ ����Ȯ��:"));

		JPasswordField text3 = new JPasswordField(15);

		result.add(text3);


		JLabel name =new JLabel();
		name.setLocation(10,80);
		name.setSize(100,100);
		result.add(new JLabel("                �̸�:"));
		JTextField text4 = new JTextField(15);

		text4.setText(memberVO.getName());

		String newname;


		result.add(text4);

		JLabel birth =new JLabel();
		birth.setLocation(10,80);
		birth.setSize(100,100);
		result.add(new JLabel("                �������:"));

		String year= memberVO.getBirth().substring(0, 4);
		int year1=Integer.parseInt(year);

		SpinnerNumberModel numberModel1 = new SpinnerNumberModel(year1, 1930, 2010, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
		JSpinner spinner1 = new JSpinner(numberModel1);

		String month= memberVO.getBirth().substring(4, 6);
		int month1=Integer.parseInt(month);

		SpinnerNumberModel numberModel2 = new SpinnerNumberModel(month1, 1, 12, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
		JSpinner spinner2 = new JSpinner(numberModel2);

		String day= memberVO.getBirth().substring(6, 8);
		int day1=Integer.parseInt(day);

		SpinnerNumberModel numberModel3 = new SpinnerNumberModel(day1, 1, 31, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
		JSpinner spinner3 = new JSpinner(numberModel3);

		JPanel groupPanel2 = new JPanel();
		groupPanel2.add(spinner1);
		groupPanel2.add(spinner2);
		groupPanel2.add(spinner3);
		groupPanel2.setBackground(Color.WHITE);
		result.add(groupPanel2);


		JLabel gender= new JLabel("                ����");
		gender.setLocation(10,80);
		gender.setSize(100,100);

		result.add(gender);

		JRadioButton man = new JRadioButton("��");
		man.setBackground(Color.WHITE);
		ButtonModel model = man.getModel();
		JRadioButton woman = new JRadioButton("��");
		woman.setBackground(Color.WHITE);
		ButtonModel model2 = woman.getModel();
		ButtonGroup group= new ButtonGroup();
		group.add(man);
		group.add(woman);
		String manstr="��";
		String womanstr="��";

		if(memberVO.getGender().equals(manstr)){
			man.setSelected(true);
		}
		else {

			woman.setSelected(true);
		}

		JPanel groupPanel = new JPanel();
		groupPanel.add(man);
		groupPanel.add(woman);
		groupPanel.setBackground(Color.WHITE);

		result.add(groupPanel);

		JLabel phonenumber =new JLabel();
		passwordcheck.setLocation(10,80);
		passwordcheck.setSize(100,100);
		result.add(new JLabel("                �ڵ��� ��ȣ:"));

		JTextField text5 = new JTextField(15);

		text5.setText(memberVO.getPhoneNumber());
		result.add(text5);

		JLabel city =new JLabel();
		birth.setLocation(10,80);
		birth.setSize(100,100);
		result.add(new JLabel("                ����:"));

		String[] cities = {"����", "����", "�뱸", "�λ�", "���", "����", "��õ", "����"};

		JComboBox locallist = new JComboBox<>(cities);

		locallist.setBackground(Color.white);

		locallist.setSelectedItem(memberVO.getAddress());
		result.add(locallist);

		JPanel result3= new JPanel();
		result3.setBounds(50,550,350,50);
		result3.setBackground(Color.WHITE);
		JButton next = new JButton("Ȯ��");
		next.setBackground(Color.ORANGE);
		result3.add(next);

		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				char[] pass = text2.getPassword();
				for(int i=0; i<pass.length; i++) {
					passwordStr += pass[i];
				}

				char[] pass2 = text3.getPassword();
				for(int i=0; i<pass2.length; i++) {
					passwordStr2 += pass2[i];
				}

				if(passwordStr.equals(passwordStr2)) {

					int year=(int)numberModel1.getValue();
					int month=(int)numberModel2.getValue();
					int day=(int)numberModel3.getValue();

					String gender = null;

					if(man.isSelected()){
						gender=man.getText();
					}
					if(woman.isSelected()) {

						gender=woman.getText();

					}

					settingController.setInformation(memberVO,text.getText(),  passwordStr ,year,month,day,text4.getText(),
							text5.getText(),locallist.getSelectedItem().toString(),gender);

					centerPanel.getCardLayout().show(centerPanel.getSettingPanel().getParent(), "setting");

					System.out.println(memberVO);
				}
				else {
					String nono= "��й�ȣ�� ��й�ȣ Ȯ���� ��ġ���� �ʽ��ϴ� \n �ٽ� �Է����ּ���";
					JOptionPane.showMessageDialog(null, nono);
				}
			}
		});

		this.add(result);
		this.add(result3);
	}

}