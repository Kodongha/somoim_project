package com.kh.somoim.home.model.vo;

import java.util.ArrayList;
import java.util.Date;

public class ClubVO {

	private String name;		// �Ҹ��� �̸�(�ߺ� X)
	private String information;	// �Ҹ��� ����
	private String clupMaster;	// ������
	private Date meetingDay;	// ���� ���� ����
	private ArrayList<String> members;		// �ɹ� ���
	
	public ClubVO() {
		// TODO Auto-generated constructor stub
	}

	public ClubVO(String name, String information, String clupMaster, Date meetingDay, ArrayList<String> members) {
		super();
		this.name = name;
		this.information = information;
		this.clupMaster = clupMaster;
		this.meetingDay = meetingDay;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getClupMaster() {
		return clupMaster;
	}

	public void setClupMaster(String clupMaster) {
		this.clupMaster = clupMaster;
	}

	public Date getMeetingDay() {
		return meetingDay;
	}

	public void setMeetingDay(Date meetingDay) {
		this.meetingDay = meetingDay;
	}

	public ArrayList<String> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<String> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "ClubVO [name=" + name + ", information=" + information + ", clupMaster=" + clupMaster + ", meetingDay="
				+ meetingDay + ", members=" + members + "]";
	}
	
}
