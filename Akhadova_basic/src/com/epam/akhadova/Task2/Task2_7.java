package com.epam.akhadova.Task2;

import java.util.Hashtable;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class Task2_7 {

//	static int[] mas = { 1223, 12334, 45677, 8765, 22 };
//
//	public static void main(String[] args) {
//		checkDifferent(mas);
//	}

	public static void checkDifferent(int[] arr) {
		int check = 0;

		for (int i = 0; i < arr.length; i++) {
			String str = Integer.toString(arr[i]);

			if (check == 0 && count(arr[i]) == str.length()) {
				System.out.println("Первое число массива, состоящее только из различных цифр: " + arr[i]);
				check++;
			}
		}
	}

	public static int count(int qq) {
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		Integer y;
		while (qq != 0) {
			y = qq % 10;
			hash.put(y.toString(), y);
			qq = qq / 10;
		}
		return hash.size();
	}

}
