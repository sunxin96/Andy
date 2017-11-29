package com.tc25.view;

import java.util.Scanner;

import com.tc25.bizImpl.Loginer;
import com.tc25.bizImpl.Register;

public class View {

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("              »¶Ó­µÇÂ½                                         ");
		System.out.println("---------------------------------");

		Loginer l = new Loginer();
		Register r = new Register();

		System.out.println("ÇëÑ¡Ôñ: 1 ×¢²á /2 µÇÂ½");

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
			System.out.println("ÊäÈëÓÐÎó!");
		}

	}
}

