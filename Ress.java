package com.te.traininng;

import java.util.Scanner;

public class Ress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menu = { " ", "1: chicken biryani", "2 :motton biryani" ,"3: chicken kanti"};
		int[] price = { 0, 150, 200,100 };

		for (int i = 1; i < price.length; i++) {
			System.out.println(menu[i] + " " + price[i]);
		}
		int bill = 0;

		while (true) {
			System.out.println("Mention how may items you want");
			int n = sc.nextInt();

			String[] str = new String[n];
			int[] arr = new int[n];

			System.out.println("Enter item numbers");/// 1 2

			for (int i = 0; i < n; i++) {
				int item = sc.nextInt();
				bill = bill + price[item];
				str[i] = menu[item];
				arr[i] = price[item];
			}
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i] + ">> " + arr[i]);
			}
			System.out.println("FOR MORE ORDERS PRESS YES");

			String proceed = sc.next();
			if (proceed.equalsIgnoreCase("yes")) {
				continue;
			} else
				break;

		}
		System.out.println("Total Bill " + bill);
		System.out.println("!!!!Order Successfull");
	}

}
