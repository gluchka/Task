package com.epam.akhadova.Task2;

//Ќайти самое короткое и самое длинное число. ¬ывести найденные числа и их длину.
public class Task2_1 {
			
	public static void minElement(int[] arr) {
		int minElem=arr[0];
		int minLeng=11;
		for (int i = 0; i < arr.length; i++) {
			String str = Integer.toString(arr[i]);
			if(str.length()<minLeng){
				minLeng=str.length();
				minElem=arr[i];
			}
		}
		System.out.println("Min element: length = " +minLeng+", element = "+minElem);
	}

	public static void maxElement(int[] arr) {
		int maxElem=arr[0];
		int maxLeng=0;
		for (int i = 0; i < arr.length; i++) {
			String str = Integer.toString(arr[i]);
			if(str.length()>maxLeng && arr[i] > maxElem){
				maxLeng=str.length();
				maxElem=arr[i];
			}
		}
		System.out.println("Max element: length = " + maxLeng+", element = "+maxElem);
	}
	
}

