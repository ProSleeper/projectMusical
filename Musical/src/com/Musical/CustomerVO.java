package com.Musical;

import java.util.ArrayList;

public class CustomerVO {
	
	String id;
	String pw;
	String name;
	String birth;
	String gender;
	String mail;
	String phone;
	String point;
	BookTicketVO ph = null;
	//이 부분을 배열로 할것인지 리스트로 할것인지
	
	//BookTicketVO[] ph = null;
	//ArrayList<BookticketVO> ph = null;


	
	public CustomerVO() {
		
	}
	
	public CustomerVO(String id, String pw, String name, String birth, String gender, String mail, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.mail = mail;
		this.phone = phone;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		String str = String.format("%-12s %-4s %-5s %2s %5s",id,name,birth,gender,phone);
		
		return str;
	}
	public String printTicket() {
		System.out.printf("%-12s %-10s %-8s %5s %7s","제목","배우","날짜","시간","결제금액");
		int idx = 1;
		for (BookticketVO details : ph) {
			System.out.println(idx++ + ph.toString());
		}
		
		return str;
	}
}