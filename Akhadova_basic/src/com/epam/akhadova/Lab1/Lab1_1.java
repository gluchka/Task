package com.epam.akhadova.Lab1;

public class Lab1_1 {
	static int[] mas = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		invert(mas);
	}

	public static void invert(int[] arr) {

		for (int k = arr.length/2; k > 0; k--) {
			int tmp = arr[k-1];
			int increm = 0;
			arr[k-1] = arr[arr.length - k +increm];
			arr[arr.length - k + increm] = tmp;
			increm =+1;
				}
		for (int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+"   ");
		}
		}
}


