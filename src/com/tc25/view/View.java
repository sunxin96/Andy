package com.tc25.view;

import java.util.Scanner;

import com.tc25.bizImpl.Loginer;
import com.tc25.bizImpl.Register;

public class View {

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("              ��ӭ��½                                         ");
		System.out.println("---------------------------------");

		Loginer l = new Loginer();
		Register r = new Register();

		System.out.println("��ѡ��: 1 ע�� /2 ��½");

		Scanner sc = new Scanner(System.in);
		try {
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				r.regist();
				break;
			case 2:
				l.login();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("��������!");
		}

	}
}

