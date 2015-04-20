package com.epam.akhadova.Task2;


//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class Task2_6 {

//	static int[] mas = {31,3456,78654,238,2345,2};
//
//	public static void main(String[] args) {
//		
//		ascendingOrder(mas);
//	}
	
	public static void ascendingOrder(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (count==0  && count(arr[i])){
				System.out.println(arr[i]);
				count++;
			}
		}
	}

	public static boolean count(int ar) {
		while ((ar / 10) >= 1) {
			if (ar % 10 <= ((ar / 10) % 10)) {
				return false;
			} else
				ar = ar / 10;
		}		
		return true;
	}
}