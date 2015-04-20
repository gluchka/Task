package com.epam.akhadova.Task2;

import java.util.Scanner;

public class Main {
	static int[] mas = null;

	public static void main(String[] args) {
		input();
// 1 задание: Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
		Task2_1.minElement(mas);
		Task2_1.maxElement(mas);
		System.out.println();
		
//2 задание: Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
		Task2_2.increaseOfLength(mas);
		System.out.println();
		Task2_2.decreaseOfLength(mas);
		System.out.println();
		
//3 задание: Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
		System.out.println();
		System.out.println("Средняя длина чисел = "+Task2_3.averageLengs(mas));
		Task2_3.minAverage(mas);
		System.out.println();
		Task2_3.maxAverage(mas);
		System.out.println();
		
	
//4 задание: Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
		System.out.println("Число, в котором число различных цифр минимально");
		Task2_4.col(mas);
		System.out.println();
		
//5 задание: Найти количество чисел, содержащих только четные цифры,
		     //а среди них количество чисел с равным числом четных и нечетных цифр.
System.out.println("Количество чисел, содержащих только четные цифры = " + Task2_5.evenCount(mas));
System.out.println(" Количество чисел с равным числом четных = " + Task2_5.evenEvenCount(mas));
System.out.println(" Количество чисел с равным числом нечетных = " + Task2_5.oddEvenCount(mas));
System.out.println();
	

//6 задание: Найти число, цифры в котором идут в строгом порядке возрастания.
 							//Если таких чисел несколько, найти первое из них.
System.out.println("Число, в котором цыфры идут в строгом порядке возростания: ");
       Task2_6.ascendingOrder(mas);
	
	
//7 задание: Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
	System.out.println();
       Task2_7.checkDifferent(mas);
       
	}	
	public static int[] input() {
		Scanner in = new Scanner(System.in);
		System.out.println("введите размер массива");
		int l = in.nextInt();
		mas = new int[l];
		System.out.println("введите масив");
		for (int i = 0; i < mas.length; i++)
			mas[i] = in.nextInt();
		in.close();
		return mas;
	}

}
