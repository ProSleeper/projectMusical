package com.Musical;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Server {

	class WorkThread extends Thread{

		private Socket sc = null;

		public WorkThread(Socket pSc) {
			this.sc = pSc;
		}

		@Override
		public void run() {
			try {
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());

				System.out.println(sc.getInetAddress().getAddress() + "����...");

				FileOutputStream fos = null;
				Object ob = null;

				while ((ob = ois.readObject()) != null) {

//					if (ob instanceof FileInfo) {
//						FileInfo info = (FileInfo)ob;
//
//						if (info.getCode() == 100) {
//
//							String str = new String(info.getData());
//
//							fos = new FileOutputStream(str);
//
//							System.out.println(str + "���� ���� ����!!!");
//
//						}
//						else if(info.getCode() == 110) {
//							if(fos == null) {
//								break;
//							}
//							fos.write(info.getData(), 0, info.getSize());
//							System.out.println(info.getSize() + "bytes �޴� ��...");
//
//						}
//						else if(info.getCode() == 200) {
//							if(fos == null) {
//								break;
//							}
//
//							String str = new String(info.getData());
//
//							fos.close();
//
//							System.out.println(str + "���� ���� ��...");
//							break;
//						}
//					}
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void serverStart(){
		try {
			ServerSocket ss = new ServerSocket(7777);

			System.out.println("Ŭ���̾�Ʈ ���� �����...");

			Socket sc = ss.accept();

			WorkThread th = new WorkThread(sc);
			th.start();


		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void createTitle(){
		HashMap<String, TitleVO> titleDB = new HashMap<>();

		//������ ������ �Է�.����
		String[] arrTitle = {"������", "���̴�", "ŷŰ����", "��Ÿ�ϸ�", "���������� �ϴ�", "�����ϰ� �����ϰ�"};
		String [] arrActorPairs = {"�����,�ſ���","�̼���,��ȯ��","�����,�̼���","��ȿ��,���¿�","������,���Ҹ�","���ظ�,����Ǿ�"};
		String [] arrDate = {"8/15(��)","8/16(ȭ)","8/20(��)", "8/21(��)","8/24(��)", "8/27(��)"};	
		String [] arrTime = {"11:30", "13:50", "16:00", "17:50", "20:00", "21:30"};
		int [] arrCost = {20000,220000,300000,220000,180000,250000};


		Random rd = new Random();
		for(int i=0;i<arrTitle.length;i++) {
			ArrayList<DetailsInfo> arrInfo = new ArrayList<>();
			for(int j = 0;  j < 3; j++) {
				DetailsInfo temp = new DetailsInfo();
				temp.setActorPairs(arrActorPairs[rd.nextInt(6)]);
				temp.setDate(arrDate[rd.nextInt(6)]);
				temp.setTime(arrTime[rd.nextInt(6)]);
				temp.setCost(arrCost[rd.nextInt(6)]);

				arrInfo.add(temp);
			}
			titleDB.put(arrTitle[i], new TitleVO(arrTitle[i], arrInfo));
		}
	}

	public void sendTitle(){

	}

	public static void main(String[] args) {
		new Server().serverStart();
	}

}
