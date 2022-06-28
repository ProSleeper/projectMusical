package com.Musical;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookticketImpl implements Bookticket{


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	HashMap<String, CustomerVO> customerMap = null;
	HashMap<String, TitleVO> titleMap = null;
	
	
	ArrayList<String> bookticketInfo = new ArrayList<>();

	
	
	public BookticketImpl(HashMap<String, CustomerVO> customerMap, HashMap<String, TitleVO> titleMap) {
		this.customerMap = customerMap;
		this.titleMap = titleMap;
	}

	public void ViewMenu(){
		//ȸ�������� �޾ƿ;���.
		//�� �޼��尡 ���Ź�ư�� �����ų� ���� ��û�� �޴� �Ŷ�� ��������.

		String pickTitle = selectMusical();
		selectActor(pickTitle);
		selectDate(pickTitle);
		selectTime(pickTitle);
		
		System.out.println();
		System.out.println();
		System.out.println("���� ���� ����");
		bookticketInfo.forEach((info)->{System.out.println(info);});
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
			
			
			bookticketInfo.add(seletedTitle);
			System.out.println(seletedTitle + "�� �����ϼ̽��ϴ�.");
			
			return seletedTitle;
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@Override
	public void selectActor(String pTitle) {
		try {
			System.out.println("��� ������ �����ϼ���.");

			System.out.println("1. " + titleMap.get(pTitle).getActor1());
			System.out.println("2. " + titleMap.get(pTitle).getActor2());

			
			String inputValue;
			inputValue = br.readLine();
			if(inputValue.equals("1")) {
				bookticketInfo.add(titleMap.get(pTitle).getActor1());
			}
			else {
				bookticketInfo.add(titleMap.get(pTitle).getActor2());
			}

			System.out.println(bookticketInfo.get(bookticketInfo.size() - 1) + "�� �����ϼ̽��ϴ�.");
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void selectDate(String pTitle) {
		try {
			System.out.println("��¥�� �����ϼ���.");

			int titleIdx = 1;

			for (String strKey : titleMap.get(pTitle).getDate()) {
				System.out.println(titleIdx++ + ". " + strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedDate = titleMap.get(pTitle).getDate()[Integer.parseInt(inputValue) - 1];
			
			System.out.println(seletedDate + "�� �����ϼ̽��ϴ�.");
			bookticketInfo.add(seletedDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void selectTime(String pTitle) {
		try {
			System.out.println("�ð��� �����ϼ���.");

			int titleIdx = 1;
			
			for (String strKey : titleMap.get(pTitle).getTime()) {
				System.out.println(titleIdx++ + ". " + strKey);
			}
			
			String inputValue;
			inputValue = br.readLine();
			String seletedTime = titleMap.get(pTitle).getTime()[Integer.parseInt(inputValue) - 1];
			
			System.out.println(seletedTime + "�� �����ϼ̽��ϴ�.");
			
			
			bookticketInfo.add(seletedTime);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

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
