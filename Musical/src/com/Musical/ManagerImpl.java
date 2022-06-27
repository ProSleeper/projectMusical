package com.Musical;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class ManagerImpl implements Manager{

	String[] arrID = {"GANA11", "JOKER33", "STARBUCKS07"};
	String[] arrPW = {"11111", "22222", "33333"};
	String[] arrName = {"�迵��", "������", "�Ƚÿ�"};
	String[] arrBirth = {"1988-11-04", "1994-10-22", "1993-08-25"};
	String[] arrGender = {"M", "F", "F"};
	String[] arrMail = {"GANA@NAVER.COM", "JOKSS@GMAIL.COM", "STA@NAVER.COM"};
	String[] arrPhone = {"010-5859-3928", "010-4837-2937", "010-3920-4832"};
	String[] arrPoint = {"10000", "10000", "10000"};


	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	HashMap<String, MusicalVO> hMap = new HashMap<>();

	@Override
	public void userSearch() {	

		for(int i=0;i<arrID.length;i++) {

			MusicalVO vo = new MusicalVO();

			vo.setId(arrID[i]);
			vo.setPw(arrPW[i]);
			vo.setName(arrName[i]);
			vo.setBirth(arrBirth[i]);
			vo.setGender(arrGender[i]);
			vo.setMail(arrMail[i]);
			vo.setPhone(arrPhone[i]);
			vo.setPoint(arrPoint[i]);

			hMap.put(arrID[i], vo);

		}
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String id = it.next();
			MusicalVO vo = hMap.get(id);
	
			System.out.println(vo.toString());
		}
	}
	
	@Override
	public void reservationTicket() {
		
	
	}

	@Override
	public void totalSale() {
		
		
	}

	@Override
	public void logout() {
		
		
	}

}
