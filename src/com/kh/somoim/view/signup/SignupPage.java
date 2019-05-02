package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SignupPage extends JPanel{
	
	private JPanel thisPanel;
	//private JPanel SignupPageTopPanel;
	//private MainFrame mainFrame;
	
	public SignupPage(MainFrame mainFrame) {
		this.thisPanel = this;
		//this.SignupPageTopPanel = signupPageTopPanel;
		//this.mainFrame = mainFrame;
		
		//�÷� ȭ��Ʈ�� ���� 
		this.setBackground(Color.WHITE);

		//���̾ƿ� ������ null�� ����
		this.setLayout(null);

		//�����̹��� ����  �� ������ ���� 
		Image icon = new ImageIcon("images/singup.PNG").getImage().getScaledInstance(310, 300, 0);//�̹��� ũ��

		//�̹����� ���� ��  ���� 
		JLabel signuppagelabel = new JLabel(new ImageIcon(icon));

		//�̹����󺧻��������� 
		signuppagelabel .setLocation(60, 50); // �̹����� ��ġ 
		signuppagelabel .setSize(400,400);   //ũ������ 

		//��Ȯ�๮�� �󺧻���
		JLabel so= new JLabel("��Ȯ�� �����ϱ�");		  
		//��Ȯ�๮�� �� ������ ����
		so.setLocation(140, 270); // ��ġ����
		so.setSize(300,300); //ũ������
		//��Ʈ ���� (�������� �⺻ ��Ʈ�� �Ǵ°ǰ�?)
		so.setFont(new Font("�������",Font.BOLD, 30)); //��Ʈ���� �� ����,���������� 

		//�ϴܹ��� �� ����
		JLabel so2 = new JLabel("������ �ܰ踦 ���� �� ������ ���� �� �ֽ��ϴ� ");	
		//�ϴܹ��� �� ������ ���� 
		so2.setLocation(100, 400); // ��ġ���� 
		so2.setSize(350,150); //ũ������
		//��Ʈ ���� 
		so2.setFont(new Font("�������",Font.BOLD, 15)); //��Ʈ���� �� ����,���������� 
		so2.setForeground(Color.GRAY); //�۲� �÷�����
		
		//���� ��ư �����	
		JButton nextbutton = new JButton("����");
		//������ư ������ ���� 
		nextbutton.setLocation(190,500); //��ġ���� 
		nextbutton.setSize(100,50); //ũ������
		//��ư �÷� ����
		nextbutton.setBackground(Color.ORANGE);
		//��ư �ܰ��� ���ֱ�
		nextbutton.setBorderPainted(false);
		
		JLabel createLabel = new JLabel(" < ���� �����");
		createLabel.setForeground(Color.WHITE); //�� �۾�������
		createLabel.setFont(createLabel  //�� �۾� ũ�� ����
											.getFont().deriveFont(15.0f));
		createLabel.setLocation(10, 6);
		
		createLabel.setSize(100, 20);
		this.add(createLabel);

		//���� �ҳڿ� ���� 
		this.add(signuppagelabel); //�̹���
		this.add(so); //��Ȯ�๮��
		this.add(so2);//��Ȯ�� �ϴ� ����
		this.add(nextbutton);//������ư
		
		//signupPageTopPanel.add(this);

		
		SignupPageTopPanel signupPageTopPanel = new SignupPageTopPanel(mainFrame);
		signupPageTopPanel.setBounds(0, 0, 500, 35);
		this.add(signupPageTopPanel);
		
		


		nextbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new TermsOfServicePanel(mainFrame));
			}
		});
		
		createLabel.addMouseListener(new MouseAdapter() {	
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			
			ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
			
		}
	});


	}
	/*class MyMounseAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new TermsOfServicePanel(mainFrame));
		}
		
	}
*/	
	
}
