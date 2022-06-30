package com.Musical;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		int port = 7777;
//		String host = "192.168.16.4";
		String host = "localhost";
		
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);
		String path;
		
		try {
			System.out.println("������ ���� ��� �� ���ϸ�?");
			
			path = scn.next();
			
			File f = new File(path);
			
			if(!f.exists()) {
				System.out.println("������ �����ϴ�.");
				System.exit(0);
			}
			
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
//			FileInfo info;
//			
//			info = new FileInfo();
//			info.setCode(100);
//			info.setData(f.getName().getBytes());
//			info.setSize((int)f.length());
//			
//			oos.writeObject(info);
//			System.out.println(f.getName() + "���� ���� ����!!!");
//			
//			Thread.sleep(0);
//			FileInputStream fis = new FileInputStream(f);
//			
//			int byteData = 0;
//			
//			byte[] buffer = new byte[1024];
//			
//			while ((byteData = fis.read(buffer, 0, 1024)) != -1) {
//				
//				info = new FileInfo();
//				
//				info.setCode(110);
//				info.setSize(byteData);
//				info.setData(buffer);
//				
//				oos.writeObject(info);
//				
//				System.out.println(byteData + "bytes ������!!!");
//				
//				buffer = new byte[1024];
//					
//				Thread.sleep(0);
//				
//			}
//			
//			fis.close();
//			info = new FileInfo();
//			info.setCode(200);
//			info.setData(f.getName().getBytes());
//			info.setSize((int)f.length());
//			
//			oos.writeObject(info);
//			System.out.println(f.getName() + "���� ���� ��");
//			
//			
//			Thread.sleep(0);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
