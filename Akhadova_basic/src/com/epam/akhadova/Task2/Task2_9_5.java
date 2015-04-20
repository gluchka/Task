package com.epam.akhadova.Task2;

// Повернуть матрицу на 90 градусов 
public class Task2_9_5 {
	
	static int[][] mas = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
		{ 13, 14, 15, 16 } };
public static void main(String[] args) {
	turn(mas);	
}
	
	
	public static int[][] turn(int[][] arr) {
				
	        int[][] arrNew = null;
	        arrNew = new int[arr.length][arr[0].length];
			for (int i = 0, i2 = 0; i < arr.length; i++, i2++) {
				for (int j = arr[i].length - 1, j2 = 0; j >= 0; j--, j2++) {
					arrNew[j2][i2] = arr[i][j];
				}
			}	
			
			for (int i = 0 ; i < arrNew.length; i++, System.out.println()) {
				for (int j = arrNew[i].length - 1 ; j >= 0; j--) {
				System.out.print(arrNew[i][j]+"  ");
				}
				}
		return arrNew;
	}
}
