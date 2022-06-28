package com.Musical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class ManagerImpl implements Manager{


	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	

	HashMap<String, CustomerVO> customerMap = null;
	HashMap<String, TitleVO> titleMap = null;

	public ManagerImpl() throws IOException {

		System.out.println("1.ȸ����ȸ \n2.������Ȳ \n3.������ȸ \n4.����\n:");
		String str = br.readLine();

		switch(str) {
		case "1" :
			userSearch();  break;
		case "2" : 
			reservationTicket(); break;
		case "3" :
			totalSale(); break;
		default : 
			System.exit(0);
		}
		
		
	}	
	
	public ManagerImpl(HashMap<String, CustomerVO> customerMap, HashMap<String, TitleVO> titleMap) {
		this.customerMap = customerMap;
		this.titleMap = titleMap;
	}


	@Override
	public void userSearch() {	
		Iterator<String> it = customerMap.keySet().iterator();
		
		while(it.hasNext()) {
			CustomerVO vo = customerMap.get(it.next());
			System.out.println(it + vo.toString());
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

	//����
	@Override
	public void inputTitle() {



	}



}


