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
				
		
		/* 약관 동의 버튼 */	
		JCheckBox agree1 = new JCheckBox("소확행 이용 약관 동의(필수)");
		agree1.setLocation(85,90);
		agree1.setSize(300,20);
		agree1.setBackground(Color.white);
		agree1.setFont(agree1.getFont().deriveFont(15.0f));
		this.add(agree1);		
		
		/* 약관 텍스트 area */
		JTextArea agree1Text = new JTextArea("",0,0);		
		agree1Text.setLocation(85, 110);
		agree1Text.setSize(340,200);	
		agree1Text.setText("제 1 장 총 칙\r\n\n" + 
				"제 1 조 목적\r\n\n" + 
				"본 약관은 서비스 이용자가 주식회사 JVM(이하 “회사”라 합니다)이 제공하는 온라인상의 인터넷 서비스(이하 “서비스”라고 하며, 접속 가능한 유,무선 단말기의 종류와는 상관없이 이용 가능한 “회사”가 제공하는 모든 “서비스”를 의미합니다. 이하 같습니다)에 회원으로 가입하고 이를 이용함에 있어 회사와 회원(본 약관에 동의하고 회원등록을 완료한 서비스 이용자를 말합니다. 이하 “회원”이라고 합니다)의 권리의무 및 책임사항을 규정함을 목적으로 합니다.\r\n" + 
				"\r\n" + 
				"제 2 조 (약관의 명시, 효력 및 개정)\r\n" + 
				"\r\n" + 
				"회사는 이 약관의 내용을 회원이 쉽게 알 수 있도록 서비스 초기 화면에 게시합니다.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"회사는 온라인 디지털콘텐츠산업 발전법, 전자상거래 등에서의 소비자보호에 관한 법률, 약관의 규제에 관한 법률, 소비자기본법 등 관련법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"회사가 약관을 개정할 경우에는 기존약관과 개정약관 및 개정약관의 적용일자와 개정사유를 명시하여 현행약관과 함께 그 적용일자 일십오(15)일 전부터 적용일 이후 상당한 기간 동안, 개정 내용이 회원에게 불리한 경우에는 그 적용일자 삼십(30)일 전부터 적용일 이후 상당한 기간 동안 각각 이를 서비스 홈페이지에 공지하고 기존 회원에게는 회사가 부여한 이메일 주소로 개정약관을 발송하여 고지합니다.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"회사가 전항에 따라 회원에게 통지하면서 공지 고지일로부터 개정약관 시행일 7일 후까지 거부의사를 표시하지 아니하면 승인한 것으로 본다는 뜻을 명확하게 고지하였음에도 의사표시가 없는 경우에는 변경된 약관을 승인한 것으로 봅니다. 회원이 개정약관에 동의하지 않을 경우 회원은 제17조 제1항의 규정에 따라 이용계약을 해지할 수 있습니다.");
		agree1Text.setFont(agree1Text.getFont().deriveFont(15.0f));
		agree1Text.setLineWrap(true);
		agree1Text.setEditable(false);	
		agree1Text.setEnabled(true);
		JScrollPane scroll = new JScrollPane(agree1Text);
		scroll.setLocation(85,110);
		scroll.setSize(340,200);
		this.add(scroll);	
		
		/* 개인정보 수집 체크박스 */
		JCheckBox agree2 = new JCheckBox("개인정보 수집 및 이용에 대한 안내(필수)");
		agree2.setLocation(85, 340);
		agree2.setSize(300,20);
		agree2.setBackground(Color.white);
		agree2.setFont(agree2.getFont().deriveFont(15.0f));
		this.add(agree2);		
		
		JTextArea agree2Text = new JTextArea();
		agree2Text.setLocation(85, 360);
		agree2Text.setSize(340,200);		
		agree2Text.setText("(주)JVM은 아래의 목적으로 개인정보를 수집 및 이용하며, 회원의 개인정보를 안전하게 취급하는데 최선을 다합니다.\r\n\n" + 
				"1. 수집목적\r\n\n" + 
				" 이용자 식별, 원활한 의사소통, 부정이용 시 제재 및 기록 \r\n" + 
				" 회원제 서비스 제공, 문의사항 또는 불만 처리, 공지사항 전달 \r\n" + 
				" 유료 서비스 이용 시 요금 정산 \r\n" + 
				" 신규 서비스 개발, 이벤트 행사 시 정보 전달, 마케팅 및 광고 등에 활용 \r\n" + 
				" 서비스 이용 기록 및 통계 분석을 통한 서비스 개선 및 맞춤형 서비스 제공 \r\n" + 
				" 프라이버시 보호 측면의 서비스 환경 구축 \r\n" + 
				"2. 수집항목\r\n" + 
				"(필수) 아이디, 비밀번호, 이름, 연락처(휴대폰번호 또는 이메일 주소 중 1개 선택) \r\n" + 
				"3. 보유기간\r\n" + 
				"수집된 정보는 회원탈퇴 후 지체없이 파기됩니다. 다만 내부 방침에 의해 서비스 부정이용기록은 부정 가입 및 이용 방지를 위하여 회원 탈퇴 시점으로부터 최대 1년간 보관 후 파기하며, 관계법령에 의해 보관해야 하는 정보는 법령이 정한 기간 동안 보관한 후 파기합니다. \r\n" + 
				"\r\n" + 
				"서비스 제공을 위해 필요한 최소한의 개인정보이므로 동의를 해 주셔야 서비스 이용이 가능합니다. \r\n" + 
				"더 자세한 내용에 대해서는 개인정보처리방침을 참고하시기 바랍니다.");
		agree2Text.setEditable(false);	
		agree2Text.setEnabled(true);
		agree2Text.setFont(agree1Text.getFont().deriveFont(15.0f));
		agree2Text.setLineWrap(true);
		
		JScrollPane scroll2 = new JScrollPane(agree2Text);
		scroll2.setLocation(85,360);
		scroll2.setSize(340,200);
		this.add(scroll2);
		
		/* 이벤트 관련 체크박스 */
		JCheckBox agree3 = new JCheckBox("이벤트 등 프로모션 알림 메일 수신(선택)");
		agree3.setLocation(85, 570);
		agree3.setSize(300,20);
		agree3.setBackground(Color.white);
		agree3.setFont(agree3.getFont().deriveFont(15.0f));
		this.add(agree3);
		
		/* 동의 버튼 */
		agreeButton = new JButton("동의");
		agreeButton.setLocation(245, 620);
		agreeButton.setSize(140, 60);
		agreeButton.setBackground(Color.GRAY);
		this.add(agreeButton);
		
		agreeButton.addMouseListener(new AgreeBtnChangeEventUtil("agreeButton", agreeButton, mainFrame, this));
//		agreeButton.addMouseListener(new AgreeBtnChangeEventUtil("agreeButton", agreeButton));
		
		/* 미동의 버튼 */
		agreeButton2 = new JButton("미동의");
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
