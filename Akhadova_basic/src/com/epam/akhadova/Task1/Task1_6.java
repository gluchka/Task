package com.epam.akhadova.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("введите размер массива");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("введите масив");
		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		scan.close();

		// System.out.println("Четные и нечетные числа.");
		// evenOdd(arr);
		// System.out.println();
		//
		// System.out.println("Максимальное и минимальное значение");
		// maxMin(arr);
		// System.out.println();
		//
		// System.out.println("Числа, которые делятся на 3 или на 9");
		// threeNine(arr);
		// System.out.println();
		//
		// System.out.println("Числа, которые делятся на 5 и 7");
		// fiveSeven(arr);
		// System.out.println();
		//
		// System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр");
		// threeDigit(arr);
		// System.out.println();

//		System.out.println("Счастливые числа");
//		happyNumbers(arr);
//		System.out.println();

		 System.out.println("Элементы, которые равны полусумме соседних элементов");
		 halfSumNeighboringElements(arr);
		 System.out.println();

	}

	// Четные и нечетные числа.
	public static void evenOdd(int[] mas) {
		for (int i = 0; i < mas.length; i++)
			if (mas[i] % 2 == 0) {
				System.out.println("even numbers " + " " + mas[i]);
			} else if (mas[i] % 2 != 0) {
				System.out.println("odd numbers" + " " + mas[i]);
			}
	}

	// Максимальное и минимальное значения
	public static void maxMin(int[] mas) {
		int max = mas[0], min = mas[0];
		for (int i = 0; i < mas.length; i++)
			if (mas[i] > max)
				max = mas[i];
		// else
		// max = max;
		System.out.println("Max value = " + max);
		for (int i = 0; i < mas.length; i++)
			if (mas[i] < min)
				min = mas[i];
		// else
		// min = min;
		System.out.println("Min value = " + min);
	}

	// Числа, которые делятся на 3 или на 9
	public static void threeNine(int[] mas) {
		for (int i = 0; i < mas.length; i++)
			if (mas[i] % 3 == 0 && mas[i] % 9 == 0) {
				System.out.println("number that are divisible by 3 and 9:"
						+ " " + mas[i]);
				break;
			} else if (mas[i] % 3 == 0)
				System.out.println("number that are divisible by 3:" + " "
						+ mas[i]);
			else if (mas[i] % 9 == 0)
				System.out.println("number that are divisible by 9:" + " "
						+ mas[i]);
	}

	// Числа, которые делятся на 5 и 7
	public static void fiveSeven(int[] mas) {

		for (int i = 0; i < mas.length; i++)
			if (mas[i] % 5 == 0 && mas[i] % 7 == 0)
				System.out.println("numbers that are divisible by 3:" + " "
						+ mas[i]);

	}

	// Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
	public static void threeDigit(int[] mas) {

		String num;
		for (int i = 0; i < mas.length; i++) {
			num = mas[i] + "";
			if (num.length() == 3 && num.charAt(0) != num.charAt(1)
					&& num.charAt(1) != num.charAt(2)
					&& num.charAt(0) != num.charAt(2))

				System.out
						.println("Трехзначное число, в десятичной записи которого нет одинаковых цифр: "
								+ mas[i]);
		}
	}

	// «Счастливые» числа.
	public static void happyNumbers(int[] mas) {
		// String[] s = c.trim().split("\\s+");

		ArrayList<String> even = new ArrayList<String>();
		for (int i = 0; i < mas.length; i++) {
			String s = Integer.toString(mas[i]);
			if (s.length() % 2 == 0
					&& count(s.substring(0, s.length() / 2)) == count(s
							.substring(s.length() / 2, s.length()))) {
				even.add(s);
			}
		}
		System.out.println(": " + even);
	}

	public static int count(String ar) {
		int r = Integer.parseInt(ar);
		int count = 0;
		while ((r / 10) >= 1) {
			count += r % 10;
			r = r / 10;
		}
		count += r;
		return count;
	}

	// Элементы, которые равны полусумме соседних элементов
	public static void halfSumNeighboringElements(int[] mas) {

		int[] numbers = mas.clone();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers.length < 3) {
				break;
			}
			if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2) {
				result.add(numbers[i]);
			}
		}
		System.out.println(": " + result);

	}
}
