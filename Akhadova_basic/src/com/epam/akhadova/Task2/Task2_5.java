package com.epam.akhadova.Task2;


//Найти количество чисел, содержащих только четные цифры,
//а среди них количество чисел с равным числом четных и нечетных цифр.

public class Task2_5 {

	
	public static int evenCount(int[] arr) {
		int countEven = 0;
		for (int i = 0; i < arr.length; i++) {
			int evenI = evenNumbers(arr[i]);
			if (evenI > 0)
				countEven++;
		}
		return countEven;
	}

	public static int evenEvenCount(int[] arr) {
		int evenCountEven = 0;
		for (int i = 0; i < arr.length; i++) {
			int evenEven = evenNumbers(arr[i]);
			if (evenEven % 2 == 0 && evenEven != 0)
				evenCountEven++;
		}
		return evenCountEven;
	}

	public static int oddEvenCount(int[] arr) {
		int oddCountEven = 0;
		for (int i = 0; i < arr.length; i++) {
			int evenOdd = evenNumbers(arr[i]);

			if (evenOdd % 2 != 0)
				oddCountEven++;
		}
		return oddCountEven;
	}

	public static int evenNumbers(int qq) {
		int count = 0;
		while (qq != 0) {
			if (qq % 2 != 0) {
				count = 0;
				break;
			} else {
				count++;
			}
			qq = qq / 10;
		}
		return count;

	}
}

