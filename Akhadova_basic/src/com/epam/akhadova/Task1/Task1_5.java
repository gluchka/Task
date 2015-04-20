package com.epam.akhadova.Task1;

public class Task1_5 {

	public static void main(String[] args) {
	int sum=0;
	int mult=1;
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
			sum += Integer.parseInt(args[i]);
			mult*=Integer.parseInt(args[i]);
		}
		System.out.println();
		System.out.println("Summ "+sum);
		System.out.println("Multiply "+mult);
	}
}
