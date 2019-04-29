package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;

import com.kh.somoim.signup.model.vo.SignupRequestVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class UserAuthentication extends JPanel {
	private JPanel thisPanel;
	
	public UserAuthentication(MainFrame mainFrame) {
		
		this.thisPanel = this;
		
		//���̾ƿ�����
		this.setLayout(null);
		//�÷� ȭ��Ʈ�� ���� 
		this.setBackground(Color.WHITE);

		//�̸� �� ����
		JLabel name = new JLabel("�̸�");
		//�̸��� ������ ���� 
		name.setLocation(60,60);//��ġ����
		name.setSize(100,100);//ũ�� ����
		//�̸��� ��Ʈ ���� 
		name.setFont(new Font("�������",Font.BOLD, 17)); //��Ʈ���� �� ����,���������� 		
		//�̸��Է� �� ����
		JTextField nametext= new JTextField(30);
		//�̸��Է� �� ������ ����
		nametext.setLocation(170, 80);
		nametext.setSize(200,50);

		//������� �� ����
		JLabel birth = new JLabel("�������");
		//������϶� ������ ����
		birth.setLocation(60,125);
		birth.setSize(100,100);
		//������� ��Ʈ ���� 
		birth.setFont(new Font("�������",Font.BOLD,17));//��Ʈ���� �� ���� ����������
	
		//��������� �⵵����Ʈ
		Calendar yearcalendar = Calendar.getInstance();
		Date value = yearcalendar.getTime(); //���糯¥���� 
		yearcalendar.add(yearcalendar.YEAR, -50); //���簪���� -50������
		Date start =yearcalendar.getTime();
		yearcalendar.add(yearcalendar.YEAR, 100);//����ð����� 50�� ����
		Date end = yearcalendar.getTime();
		SpinnerDateModel dateModel  = new SpinnerDateModel(value, start, end,  yearcalendar.YEAR);
		JSpinner spinner3 = new JSpinner(dateModel);
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy")); 
		//������� �⵵ ����Ʈ ������ ����
		spinner3.setLocation(170,150);
		spinner3.setSize(80,50);


		//��������� �� ����Ʈ
		Calendar monthcalendar = Calendar.getInstance();
		Date value1 = monthcalendar.getTime(); //���糯¥���� 
		monthcalendar.add(monthcalendar.MONTH,1); 
		Date start1 =monthcalendar.getTime();
		monthcalendar.add(monthcalendar.MONTH,10 );
		Date end1 = monthcalendar.getTime();
		SpinnerDateModel dateModel1  = new SpinnerDateModel(value1, start, end,  yearcalendar.MONTH);
		JSpinner spinner4 = new JSpinner(dateModel1);
		spinner4.setEditor(new JSpinner.DateEditor(spinner4, "mm")); 
		//������� �� ����Ʈ ������ ����
		spinner4.setLocation(260,150);
		spinner4.setSize(80,50);

		//��������� �� ����Ʈ
		Calendar daycalendar = Calendar.getInstance();
		Date value2 = daycalendar.getTime(); //���糯¥���� 
		daycalendar.add(daycalendar.DAY_OF_MONTH, -1); 
		Date start2 =daycalendar.getTime();
		daycalendar.add(yearcalendar.DAY_OF_MONTH, 100);
		Date end2 = monthcalendar.getTime();
		SpinnerDateModel dateModel2  = new SpinnerDateModel(value2, start, end,  daycalendar.DAY_OF_MONTH);
		JSpinner spinner5 = new JSpinner(dateModel2);
		spinner4.setEditor(new JSpinner.DateEditor(spinner4, "dd")); 
		//������� �� ����Ʈ ������ ����
		spinner5.setLocation(350,150);
		spinner5.setSize(80,50);

		//�޴�����ȣ �� ����
		JLabel phonenumber = new JLabel("�޴��� ��ȣ");
		phonenumber.setLocation(60,195);
		phonenumber.setSize(100,100);
		//�޴�����ȣ ��Ʈ ���� 
		phonenumber.setFont(new Font("�������",Font.BOLD,17));//��Ʈ���� �� ���� ����������

		//��Ż� ����
		String [] items = {"SK","KT","LG","������Ż�"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner tong = new JSpinner(listModel);
		//��Ż� ������ ���� 
		tong.setLocation(260,220);
		tong.setSize(80,50);

		//������ȭ ���� 
		String [] item = {"+82","+1","+86","+44"};

		SpinnerListModel listModel1 = new SpinnerListModel(item);
		JSpinner internationalnumber = new JSpinner(listModel1);
		//������ȭ ������ ����
		internationalnumber.setLocation(170,220);
		internationalnumber.setSize(80,50);

		//������ȣ �ؽ�Ʈ ���� 
		JTextField numbertext = new JTextField(20);
		numbertext.setLocation(170,300);
		numbertext.setSize(230, 50);

		//������ư ����
		JButton authenticationbutton =new JButton("����");
		//������ư ������ ����
		authenticationbutton.setLocation(410,300);
		authenticationbutton.setSize(60, 50);	
		//������ư �÷� ����
		authenticationbutton.setBackground(Color.ORANGE);
		//������ư �ܰ��� ���ֱ�
		authenticationbutton.setBorderPainted(false);


		//������ȣȮ�� �ؽ�Ʈ ���� 
		JTextField resulttext = new JTextField(20);
		resulttext.setLocation(170,352);
		resulttext.setSize(230, 50);
		//������ȣ���� ����
		JButton resultbutton =new JButton("Ȯ��");
		//������ȣȮ�ι�ư ������ ����
		resultbutton.setLocation(410,352);
		resultbutton.setSize(60, 50);	
		//Ȯ�ι�ư �÷� ����
		resultbutton.setBackground(Color.ORANGE);
		//Ȯ�ι�ư �ܰ��� ���ֱ�
		resultbutton.setBorderPainted(false);

		//���� ��ư �����	
		JButton nextbutton = new JButton("����");
		//������ư ������ ���� 
		nextbutton.setLocation(136,600); //��ġ���� 
		nextbutton.setSize(230,50); //ũ������  
		//��ư �÷� ����
		nextbutton.setBackground(Color.ORANGE);
		//��ư �ܰ��� ���ֱ�
		nextbutton.setBorderPainted(false);
		
		UserAuthenticationTopPanel userAuthenticationTopPanel = new UserAuthenticationTopPanel();
		userAuthenticationTopPanel.setBounds(0, 0, 500, 35);
		this.add(userAuthenticationTopPanel);
	
		this.add(name);
		this.add(nametext);
		this.add(birth);
		this.add(spinner3);
		this.add(spinner4);
		this.add(spinner5);
		this.add(phonenumber);
		this.add(tong);
		this.add(numbertext);
		this.add(authenticationbutton);
		this.add(resulttext);
		this.add(resultbutton);
		this.add(nextbutton);
		this.add(internationalnumber);
		
		nextbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new SubscriptionInformationPanel(mainFrame));
			}
		});
	}
}
