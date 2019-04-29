package com.kh.somoim.view.signup;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.kh.somoim.util.event.AgreeBtnChangeEventUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class TermsOfServicePanel extends JPanel{
	
	private JButton agreeButton;
	private JButton agreeButton2;
	
	public TermsOfServicePanel(MainFrame mainFrame) {
		
		this.setBackground(Color.white);
		this.setLayout(null);
				
		
		/* ��� ���� ��ư */	
		JCheckBox agree1 = new JCheckBox("��Ȯ�� �̿� ��� ����(�ʼ�)");
		agree1.setLocation(85,90);
		agree1.setSize(300,20);
		agree1.setBackground(Color.white);
		agree1.setFont(agree1.getFont().deriveFont(15.0f));
		this.add(agree1);		
		
		/* ��� �ؽ�Ʈ area */
		JTextArea agree1Text = new JTextArea("",0,0);		
		agree1Text.setLocation(85, 110);
		agree1Text.setSize(340,200);	
		agree1Text.setText("�� 1 �� �� Ģ\r\n\n" + 
				"�� 1 �� ����\r\n\n" + 
				"�� ����� ���� �̿��ڰ� �ֽ�ȸ�� JVM(���� ��ȸ�硱�� �մϴ�)�� �����ϴ� �¶��λ��� ���ͳ� ����(���� �����񽺡���� �ϸ�, ���� ������ ��,���� �ܸ����� �����ʹ� ������� �̿� ������ ��ȸ�硱�� �����ϴ� ��� �����񽺡��� �ǹ��մϴ�. ���� �����ϴ�)�� ȸ������ �����ϰ� �̸� �̿��Կ� �־� ȸ��� ȸ��(�� ����� �����ϰ� ȸ������� �Ϸ��� ���� �̿��ڸ� ���մϴ�. ���� ��ȸ�����̶�� �մϴ�)�� �Ǹ��ǹ� �� å�ӻ����� �������� �������� �մϴ�.\r\n" + 
				"\r\n" + 
				"�� 2 �� (����� ���, ȿ�� �� ����)\r\n" + 
				"\r\n" + 
				"ȸ��� �� ����� ������ ȸ���� ���� �� �� �ֵ��� ���� �ʱ� ȭ�鿡 �Խ��մϴ�.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ȸ��� �¶��� ��������������� ������, ���ڻ�ŷ� ����� �Һ��ں�ȣ�� ���� ����, ����� ������ ���� ����, �Һ��ڱ⺻�� �� ���ù��� �������� �ʴ� �������� �� ����� ������ �� �ֽ��ϴ�.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ȸ�簡 ����� ������ ��쿡�� ��������� ������� �� ��������� �������ڿ� ���������� ����Ͽ� �������� �Բ� �� �������� �Ͻʿ�(15)�� ������ ������ ���� ����� �Ⱓ ����, ���� ������ ȸ������ �Ҹ��� ��쿡�� �� �������� ���(30)�� ������ ������ ���� ����� �Ⱓ ���� ���� �̸� ���� Ȩ�������� �����ϰ� ���� ȸ�����Դ� ȸ�簡 �ο��� �̸��� �ּҷ� ��������� �߼��Ͽ� �����մϴ�.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ȸ�簡 ���׿� ���� ȸ������ �����ϸ鼭 ���� �����Ϸκ��� ������� ������ 7�� �ı��� �ź��ǻ縦 ǥ������ �ƴ��ϸ� ������ ������ ���ٴ� ���� ��Ȯ�ϰ� �����Ͽ������� �ǻ�ǥ�ð� ���� ��쿡�� ����� ����� ������ ������ ���ϴ�. ȸ���� ��������� �������� ���� ��� ȸ���� ��17�� ��1���� ������ ���� �̿����� ������ �� �ֽ��ϴ�.");
		agree1Text.setFont(agree1Text.getFont().deriveFont(15.0f));
		agree1Text.setLineWrap(true);
		agree1Text.setEditable(false);	
		agree1Text.setEnabled(true);
		JScrollPane scroll = new JScrollPane(agree1Text);
		scroll.setLocation(85,110);
		scroll.setSize(340,200);
		this.add(scroll);	
		
		/* �������� ���� üũ�ڽ� */
		JCheckBox agree2 = new JCheckBox("�������� ���� �� �̿뿡 ���� �ȳ�(�ʼ�)");
		agree2.setLocation(85, 340);
		agree2.setSize(300,20);
		agree2.setBackground(Color.white);
		agree2.setFont(agree2.getFont().deriveFont(15.0f));
		this.add(agree2);		
		
		JTextArea agree2Text = new JTextArea();
		agree2Text.setLocation(85, 360);
		agree2Text.setSize(340,200);		
		agree2Text.setText("(��)JVM�� �Ʒ��� �������� ���������� ���� �� �̿��ϸ�, ȸ���� ���������� �����ϰ� ����ϴµ� �ּ��� ���մϴ�.\r\n\n" + 
				"1. ��������\r\n\n" + 
				" �̿��� �ĺ�, ��Ȱ�� �ǻ����, �����̿� �� ���� �� ��� \r\n" + 
				" ȸ���� ���� ����, ���ǻ��� �Ǵ� �Ҹ� ó��, �������� ���� \r\n" + 
				" ���� ���� �̿� �� ��� ���� \r\n" + 
				" �ű� ���� ����, �̺�Ʈ ��� �� ���� ����, ������ �� ���� � Ȱ�� \r\n" + 
				" ���� �̿� ��� �� ��� �м��� ���� ���� ���� �� ������ ���� ���� \r\n" + 
				" �����̹��� ��ȣ ������ ���� ȯ�� ���� \r\n" + 
				"2. �����׸�\r\n" + 
				"(�ʼ�) ���̵�, ��й�ȣ, �̸�, ����ó(�޴�����ȣ �Ǵ� �̸��� �ּ� �� 1�� ����) \r\n" + 
				"3. �����Ⱓ\r\n" + 
				"������ ������ ȸ��Ż�� �� ��ü���� �ı�˴ϴ�. �ٸ� ���� ��ħ�� ���� ���� �����̿����� ���� ���� �� �̿� ������ ���Ͽ� ȸ�� Ż�� �������κ��� �ִ� 1�Ⱓ ���� �� �ı��ϸ�, ������ɿ� ���� �����ؾ� �ϴ� ������ ������ ���� �Ⱓ ���� ������ �� �ı��մϴ�. \r\n" + 
				"\r\n" + 
				"���� ������ ���� �ʿ��� �ּ����� ���������̹Ƿ� ���Ǹ� �� �ּž� ���� �̿��� �����մϴ�. \r\n" + 
				"�� �ڼ��� ���뿡 ���ؼ��� ��������ó����ħ�� �����Ͻñ� �ٶ��ϴ�.");
		agree2Text.setEditable(false);	
		agree2Text.setEnabled(true);
		agree2Text.setFont(agree1Text.getFont().deriveFont(15.0f));
		agree2Text.setLineWrap(true);
		
		JScrollPane scroll2 = new JScrollPane(agree2Text);
		scroll2.setLocation(85,360);
		scroll2.setSize(340,200);
		this.add(scroll2);
		
		/* �̺�Ʈ ���� üũ�ڽ� */
		JCheckBox agree3 = new JCheckBox("�̺�Ʈ �� ���θ�� �˸� ���� ����(����)");
		agree3.setLocation(85, 570);
		agree3.setSize(300,20);
		agree3.setBackground(Color.white);
		agree3.setFont(agree3.getFont().deriveFont(15.0f));
		this.add(agree3);
		
		/* ���� ��ư */
		agreeButton = new JButton("����");
		agreeButton.setLocation(245, 620);
		agreeButton.setSize(140, 60);
		agreeButton.setBackground(Color.GRAY);
		this.add(agreeButton);
		
		agreeButton.addMouseListener(new AgreeBtnChangeEventUtil("agreeButton", agreeButton, mainFrame, this));
//		agreeButton.addMouseListener(new AgreeBtnChangeEventUtil("agreeButton", agreeButton));
		
		/* �̵��� ��ư */
		agreeButton2 = new JButton("�̵���");
		agreeButton2.setLocation(85, 620);
		agreeButton2.setSize(140, 60);
		agreeButton2.setBackground(Color.gray);
		this.add(agreeButton2);
		
		agreeButton2.addMouseListener(new AgreeBtnChangeEventUtil("agreeButton2", agreeButton2));
		
		TermsOfServiceTopPanel termsOfServiceTopPanel = new TermsOfServiceTopPanel();
		termsOfServiceTopPanel.setBounds(0, 0, 500, 35);
		this.add(termsOfServiceTopPanel);
				
	}
}
