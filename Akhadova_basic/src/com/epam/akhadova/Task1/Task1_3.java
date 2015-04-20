package com.epam.akhadova.Task1;

import java.util.Random;
import java.util.Scanner;

public class Task1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите количество символов");
		int n = scan.nextInt();
		Random rand = new Random();
        int[] mas = new int [n];
		
		for (int i = 0; i <= n-1; i++) {
			mas[i]=rand.nextInt();
//			System.out.println(rand.nextInt());
		}
		System.out.println("с переходом новую строку");
		for (int i = 0; i <= mas.length-1; i++) {
			System.out.println(mas[i] + "  ");
		}
		System.out.print("без перехода на новую строку");
		for (int i = 0; i <= mas.length-1; i++) {
			System.out.print(mas[i] + "  ");
		}
	}
}
