package com.Musical;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerImpl implements Customer{
	
	HashMap<String, CustomerVO> customerMap = null;
	HashMap<String, TitleVO> titleMap = null;
	
	
	
	Scanner sc = new Scanner(System.in);
	CustomerVO vo = new CustomerVO(); 

	
	
	
	public CustomerImpl(HashMap<String, CustomerVO> customerMap, HashMap<String, TitleVO> titleMap) {
		this.customerMap = customerMap;
		this.titleMap = titleMap;
	}

	@Override
	public void userUpdate() {
		
		
		System.out.print("�����ϰ� ���� ȸ���� ���̵� �Է��ϼ���");
		String str = sc.next();
		
		
		
	}


	
	
	@Override
	public void reservation() {
	}

	@Override
	public void logout() {
	}

	@Override
	public void userDelete() {
	}




	@Override
	public boolean searchId() {
		
		return false;
	}





	
	
}
