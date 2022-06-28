package com.Musical;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookticketImpl implements Bookticket{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String currCustomer = null;
	String pickTitle = null;
	BookTicketVO ph = new BookTicketVO();
	HashMap<String, TitleVO> titleMap = null;
	
	public BookticketImpl(String pCustomer, HashMap<String, TitleVO> pTitleMap) {
		currCustomer = pCustomer;
		this.titleMap = pTitleMap;
	}

	public BookTicketVO ViewMenu(){
		//ȸ�������� �޾ƿ;���.
		//�� �޼��尡 ���Ź�ư�� �����ų� ���� ��û�� �޴� �Ŷ�� ��������.
		
		pickTitle = selectMusical();
		selectActor();
		selectDate();
		selectTime();
		payMoney();
		
		System.out.println();
		System.out.println();
		System.out.println("���� ���� ����");
		System.out.println(ph.toString());
		
		return ph;
	}


	@Override
	public String selectMusical() {
		try {

			ArrayList<String> arrTitle = new ArrayList<>();
			System.out.println("��ǰ�� �����ϼ���.");

			int titleIdx = 1;

			for (String strKey : titleMap.keySet()) {
				System.out.println(titleIdx++ + ". " + strKey);
				arrTitle.add(strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedTitle = arrTitle.get(Integer.parseInt(inputValue) - 1);
			
			ph.setTitle(seletedTitle);
			System.out.println(seletedTitle + "�� �����ϼ̽��ϴ�.");
			
			return seletedTitle;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@Override
	public void selectActor() {
		try {
			System.out.println("��� ������ �����ϼ���.");

			System.out.println("1. " + titleMap.get(pickTitle).getActor1());
			System.out.println("2. " + titleMap.get(pickTitle).getActor2());

			String inputValue;
			inputValue = br.readLine();
			if(inputValue.equals("1")) {
				ph.setActor(titleMap.get(pickTitle).getActor1());
			}
			else {
				ph.setActor(titleMap.get(pickTitle).getActor2());
			}
			System.out.println(ph.getActor() + "�� �����ϼ̽��ϴ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void selectDate() {
		try {
			System.out.println("��¥�� �����ϼ���.");

			int titleIdx = 1;

			for (String strKey : titleMap.get(pickTitle).getDate()) {
				System.out.println(titleIdx++ + ". " + strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedDate = titleMap.get(pickTitle).getDate()[Integer.parseInt(inputValue) - 1];
			
			System.out.println(seletedDate + "�� �����ϼ̽��ϴ�.");
			ph.setDate(seletedDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void selectTime() {
		try {
			System.out.println("�ð��� �����ϼ���.");

			int titleIdx = 1;
			
			for (String strKey : titleMap.get(pickTitle).getTime()) {
				System.out.println(titleIdx++ + ". " + strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedTime = titleMap.get(pickTitle).getTime()[Integer.parseInt(inputValue) - 1];
			
			System.out.println(seletedTime + "�� �����ϼ̽��ϴ�.");
			
			ph.setTime(seletedTime);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void payMoney() {
		try {
			ph.setCost(titleMap.get(pickTitle).getCost());
			System.out.println("������ " + ph.getCost() + " �� �Դϴ�.");
			System.out.println("���� �ƽ��ϴ�.");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
	//����� �̱��� ����
	@Override
	public void selectSeat(String pTitle) {
		try {

			ArrayList<String> arrTitle = new ArrayList<>();
			System.out.println("������� ��ǰ�� �����ϼ���.");

			int titleIdx = 1;

			for (String strKey : titleMap.keySet()) {
				System.out.println(titleIdx++ + ". " + strKey);
				arrTitle.add(strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedTitle = arrTitle.get(Integer.parseInt(inputValue) - 1);
			
			System.out.println(seletedTitle + "�� �����ϼ̽��ϴ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
