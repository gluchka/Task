package com.epam.akhadova.Task2;



//Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
public class Task2_3 {
	
	static int everLeng = 0;

	public static int averageLengs(int[] arr) {
		String num;
		for (int i = 0; i < arr.length; i++) {
			num = Integer.toString(arr[i]);
			everLeng += num.length();
		}
		everLeng /= arr.length;
		return everLeng;
	}

	public static void minAverage(int[] arr) {
		String number;
		System.out.println("Числа, длина которых меньше или равна средней, а также длина: ");
		for(int i = 0; i < arr.length; i++){
			number = Integer.toString(arr[i]);
			if(number.length()<=everLeng){
				System.out.print("число "+arr[i] +", длина "+ number.length());
				System.out.println();
			}
		}
	}
	public static void maxAverage(int[] arr) {
		String number;
		System.out.println("Числа, длина которых больше средней, а также длина: ");
		for(int i = 0; i < arr.length; i++){
			number = Integer.toString(arr[i]);
			if(number.length() > everLeng){
				System.out.print("число "+arr[i] +", длина "+ number.length());
				System.out.println();
			}
		}
	}
}
