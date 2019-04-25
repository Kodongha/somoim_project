package com.kh.somoim.view.setting;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.kh.somoim.view.main.CenterPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class InfomationCorrect extends JPanel {
	
	
	
	
	public InfomationCorrect(CenterPanel center) {
		
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
		text.setLocation(20,70);
		text.setSize(100, 100);
	
		result.add(text);

		
		
		
		JLabel password =new JLabel();
		password.setLocation(10,80);
		password.setSize(100,100);
		result.add(new JLabel("                ��й�ȣ:"));
		
		JPasswordField text2 = new JPasswordField(15);
		text.setLocation(20,900);
		text.setSize(100, 100);
		
		result.add(text2);
		
		JLabel passwordcheck =new JLabel();
		passwordcheck.setLocation(10,80);
		passwordcheck.setSize(100,100);
		result.add(new JLabel("                ��й�ȣ Ȯ��:"));
		
		JPasswordField text3 = new JPasswordField(15);
		text.setLocation(20,900);
		text.setSize(100, 100);
		
		result.add(text3);
		
		
		JLabel name =new JLabel();
		name.setLocation(10,80);
		name.setSize(100,100);
		result.add(new JLabel("                �̸�:"));
		JTextField text4 = new JTextField(15);
		text.setLocation(20,900);
		text.setSize(100, 100);
		
		result.add(text4);
		
		
		
		JLabel birth =new JLabel();
		birth.setLocation(10,80);
		birth.setSize(100,100);
		result.add(new JLabel("                �������:"));

		SpinnerNumberModel numberModel1 = new SpinnerNumberModel(1990, 1930, 2010, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
		JSpinner spinner1 = new JSpinner(numberModel1);
	
		SpinnerNumberModel numberModel2 = new SpinnerNumberModel(1, 1, 12, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
		JSpinner spinner2 = new JSpinner(numberModel2);

		SpinnerNumberModel numberModel3 = new SpinnerNumberModel(1, 1, 31, 1);	// ������ ��, �ּҰ�, �ִ밪, ������
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
		JRadioButton woman = new JRadioButton("��");
		woman.setBackground(Color.WHITE);
		ButtonGroup group= new ButtonGroup();
		group.add(man);
		group.add(woman);
		
		
		
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
		text.setLocation(20,900);
		text.setSize(100, 100);
		
		result.add(text5);
		
		
		
		JLabel city =new JLabel();
		birth.setLocation(10,80);
		birth.setSize(100,100);
		result.add(new JLabel("                ����:"));
		
		
		
		String[] cities = {"����", "����", "�뱸", "�λ�", "���", "����", "��õ", "����"};
		
		JComboBox animalList = new JComboBox<>(cities);
	
		animalList.setBackground(Color.white);
		result.add(animalList);

	
		
		
		

		
		JPanel result3= new JPanel();
		result3.setBounds(50,550,350,50);
		result3.setBackground(Color.WHITE);
		JButton next = new JButton("Ȯ��");
		next.setBackground(Color.ORANGE);
		result3.add(next);

		this.add(result);
		this.add(result3);
		
		
		
		
		
		

		
	
		
		
	}
	
	
	
	
	
	
	
	
	

}















