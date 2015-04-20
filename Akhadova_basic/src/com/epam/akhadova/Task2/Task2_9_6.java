package com.epam.akhadova.Task2;

//Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое
public class Task2_9_6 {

	static int[][] mas = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
			{ 13, 14, 15, 16 } };
	public static void main(String[] args) {
		average(mas, 4);
	}

		public static void average(int[][] mas, int n) {
		float aver = 0;
		float[][] masNew = new float [n][n];
		for (int i = 0; i < n; i++, System.out.println()) {
			aver = 0;
			for (int j = 0; j < n; j++) {
				aver += mas[i][j];
			}
			aver /= n;
			for (int j = 0; j < n; j++) {
				float y = (float) (mas[i][j]);
				y -= aver;
				masNew[i][j] = y;
				System.out.print(masNew[i][j] + "    ");
			}
		}
		
	}

}
