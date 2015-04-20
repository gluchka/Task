package com.epam.akhadova.Task2;

//Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
public class Task2_9_8 {

//	static int[][] mas = { { 1, 3, 0, 2 }, { 5, 1, 0, 8 }, { 9, 10, 11, 12 },
//			{ 0, 14, 15, 0 } };
//	public static void main(String[] args) {
//		zeroEnd(mas);
//	}

	public static void zeroEnd(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			sortZeroToRight(arr[i]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "   ");
			System.out.println();
		}
	}

	private static void sortZeroToRight(int[] row) {
		int step = row.length / 2;
		while (step > 0) {
			int j;
			for (int i = step; i < row.length; i++) {
				int value = row[i];
				for ( j = i - step; (j >= 0) && (row[j] == 0); j -= step) {
					row[j + step] = row[j];
				}
				row[j + step] = value;
			}
			step /= 2;

		}

	}

}
