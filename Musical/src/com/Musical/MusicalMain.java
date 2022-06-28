package com.Musical;
//�ÿ�
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class MusicalMain {
	
	static DataImpl di = new DataImpl();

	static ManagerImpl implM = new ManagerImpl(di.getCustomerMap(), di.getTitleMap());
	static CustomerImpl implC = new CustomerImpl(di.getCustomerMap(), di.getTitleMap());


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("1.�α��� \n2.ȸ������ \n3.����");
		System.out.println("---------------------------------\n:");
		String str = br.readLine();

		switch(str) {
		case "1" :
			login(di.getCustomerMap()); break;
		case "2" : 
			signUp(); break;
		case "3" :
			System.exit(0);
		}

	}

	public static void login(HashMap<String, CustomerVO> customerMap) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String id,pw;

		do{
			System.out.println("���̵�?");
			id = br.readLine();

			if(!customerMap.containsKey(id)) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
			}else {break;}				
		}while(true);


		System.out.println("��й�ȣ�� �Է��ϼ���.");
		pw = br.readLine();
		CustomerVO vo = new CustomerVO();
		vo = customerMap.get(id);
		do{
			if(!vo.getPw().equals(pw)) {
				System.out.println("��й�ȣ�� Ȯ�� ���ּ���");
				pw = br.readLine();
			}else {
				if(id.equals("admin") && pw.equals("1111")) {
					implM.menu();
					break;
				}
				else {
					System.out.println("�α��� ����!");
					implC.start(id);
					break;
				}
				
			}				
		}while(true);

	}

	public static void signUp() {
		/*		
		try {
			Iterator<NaverVO> it = lists.iterator();
			
	         System.out.println("���̵� �Է��ϼ���.");
	         String id = sc.next();
	         exp.inputFormat(id);
	         vo.setId(id);
		
	         
	         System.out.println("��й�ȣ�� �Է��ϼ���.");
	         
	         String pw = sc.next();
	         
	         exp.inputFormat(pw);
	         
	         System.out.println("��й�ȣ�� ��Ȯ�����ּ���.");
	         
	         do {
	        	 String pw2 = sc.next();
	         
	        	 if(pw.equals(pw2)) {
	        	 
	        		 vo.setPw(pw2);
	        		 break;
	        	 }
	        	 else {
	        		 System.out.println("��й�ȣ�� �ٸ��ϴ�.�ٽ��Է����ּ���.");
	        	 }
	        	 	      	 
	        }while(true);
	        
	         System.out.println("�̸�?");
	         String name = sc.next();
	         exp.nameInputFormat(name);
	         vo.setName(name);
	         
	         System.out.println("����? [F/M]");
		        String gender= sc.next();
				exp.genderInputFormat(gender);
		        vo.setGender(gender);
		        
		     
		     System.out.println("�������?");
		        String birth = sc.next();
		        exp.birthInputFormat(birth);
		        vo.setBirth(birth);
		        
		        
		     System.out.println("�̸��� �ּ�?");
		      	String mail = sc.next();
		      	exp.mailInputFormat(mail);
		      	vo.setEmail(mail);
		      	
		      	
		     System.out.println("�ڵ��� ��ȣ?");
		     	String tel = sc.next();
		     	
		     	vo.setTel(tel);
	         
		    	lists.add(vo);
	         
	      } catch (Exception e) {
	         
	         System.out.println(e.toString());     
	      }
		
	   }
*/
	}

}
